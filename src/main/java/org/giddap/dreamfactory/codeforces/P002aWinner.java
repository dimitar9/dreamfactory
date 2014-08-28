package org.giddap.dreamfactory.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

/**
 * http://codeforces.com/problemset/problem/2/A
 * <p/>
 * time limit per test1 second
 * memory limit per test64 megabytes
 * input: standard input
 * output: standard output
 * <p/>
 * The winner of the card game popular in Berland "Berlogging" is determined
 * according to the following rules. If at the end of the game there is only
 * one player with the maximum number of points, he is the winner. The situation
 * becomes more difficult if the number of such players is more than one. During
 * each round a player gains or loses a particular number of points. In the
 * course of the game the number of points is registered in the line
 * "name score", where name is a player's name, and score is the number of
 * points gained in this round, which is an integer number. If score is
 * negative, this means that the player has lost in the round. So, if two or
 * more players have the maximum number of points (say, it equals to m) at the
 * end of the game, than wins the one of them who scored at least m points
 * first. Initially each player has 0 points. It's guaranteed that at the end
 * of the game at least one player has a positive number of points.
 * <p/>
 * Input
 * The first line contains an integer number n (1  ≤  n  ≤  1000), n is the
 * number of rounds played. Then follow n lines, containing the information
 * about the rounds in "name score" format in chronological order, where name
 * is a string of lower-case Latin letters with the length from 1 to 32, and
 * score is an integer number between -1000 and 1000, inclusive.
 * <p/>
 * Output
 * Print the name of the winner.
 * <p/>
 * Sample test(s)
 * <pre>
 * Sample 1
 *
 * input
 * 3
 * mike 3
 * andrew 5
 * mike 2
 *
 * output
 * andrew
 *
 * ========
 *
 * Sample 2
 *
 * input
 * 3
 * andrew 3
 * andrew 2
 * mike 5
 *
 * output
 * andrew
 * </pre>
 *
 * 因为数据规模很小，直接用map存分数，然后便利两次，第一次模拟，并且先求最高分；
 * 第二次再模拟，输出并列第一中第一个达到最高分的即可。
 */
public class P002aWinner implements Runnable {

    public static void main(String[] args) {
        new Thread(new P002aWinner()).start();
    }

    String solve(List<String> lines) {

        Map<String, Player> players = new HashMap<String, Player>();
        int lineNumber = 1;
        for (String line : lines) {
            String[] contents = line.split(" ");
            String name = contents[0].trim();
            final int score = Integer.parseInt(contents[1].trim());
            Player player = null;
            if (players.containsKey(name)) {
                player = players.get(name);
                player.addScore(score, lineNumber);
            } else {
                player = new Player(name);
                player.addScore(score, lineNumber);
                players.put(name, player);
            }
            lineNumber++;
        }

        // Find Players with Max Score
        Set<Player> winners = new HashSet<Player>();
        int maxScore = 0;
        for (Map.Entry<String, Player> nameToPlayer : players.entrySet()) {
            Player player = nameToPlayer.getValue();
            if (player.getTotalScore() > maxScore) {
                maxScore = player.getTotalScore();
                winners.clear();
                winners.add(player);
            } else if (player.getTotalScore() == maxScore) {
                winners.add(player);
            }
        }

        if (winners.size() == 1) {
            return winners.iterator().next().getName();
        }

        // Find winner
        int minimumSteps = Integer.MAX_VALUE;
        Player winner = null;
        for (Player player : winners) {
            ScoreWithLineNumber firstStepScore = null;
            for (ScoreWithLineNumber stepScore : player.getScoresByStep()) {
                if (stepScore.score >= maxScore) {
                    firstStepScore = stepScore;
                    break;
                }
            }
            if (firstStepScore.lineNumber < minimumSteps) {
                winner = player;
                minimumSteps = firstStepScore.lineNumber;
            }
        }
        return winner.getName();
    }

    @Override
    public void run() {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int i = 0;

            final int numberOfLines = Integer.parseInt(br.readLine().trim());
            List<String> lines = new ArrayList<String>();

            String line = null;
            while ((line = br.readLine()) != null) {
                lines.add(line.trim());
            }

            out.println(solve(lines));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
            br = null;
            out.close();
        }
    }

    private static class ScoreWithLineNumber {
        private Integer score;
        private Integer lineNumber;

        private ScoreWithLineNumber(Integer score, Integer lineNumber) {
            this.score = score;
            this.lineNumber = lineNumber;
        }
    }

    private static class Player {
        final String name;
        int totalScore;
        private List<ScoreWithLineNumber> scoresByStep =
                new ArrayList<ScoreWithLineNumber>();

        private Player(String name) {
            this.name = name;
            scoresByStep.add(new ScoreWithLineNumber(0, 0));
        }

        public void addScore(int delta, int lineNumber) {
            this.totalScore = this.totalScore + delta;
            scoresByStep.add(new ScoreWithLineNumber(totalScore, lineNumber));
        }

        public String getName() {
            return name;
        }

        public int getTotalScore() {
            return totalScore;
        }

        public List<ScoreWithLineNumber> getScoresByStep() {
            return scoresByStep;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Player player = (Player) o;

            if (!name.equals(player.name)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }
}
