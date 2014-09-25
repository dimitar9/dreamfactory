package org.giddap.dreamfactory.codeforces;

/**
 * http://codeforces.com/problemset/problem/3/A
 * <p/>
 * The king is left alone on the chessboard. In spite of this loneliness, he
 * doesn't lose heart, because he has business of national importance. For
 * example, he has to pay an official visit to square t. As the king is not in
 * habit of wasting his time, he wants to get from his current position s to
 * square t in the least number of moves. Help him to do this.
 * <p/>
 * In one move the king can get to the square that has a common side or a common
 * vertex with the square the king is currently in (generally there are 8
 * different squares he can move to).
 * <p/>
 * Input The first line contains the chessboard coordinates of square s, the
 * second line — of square t.
 * <p/>
 * Chessboard coordinates consist of two characters, the first one is a lowercase
 * Latin letter (from a to h) (columns), the second one is a digit from 1 to 8
 * (rows).
 * <p/>
 * Output In the first line print n — minimum number of the king's moves. Then in
 * n lines print the moves themselves. Each move is described with one of the 8:
 * L, R, U, D, LU, LD, RU or RD.
 * <p/>
 * L, R, U, D stand respectively for moves left, right, up and down (according to
 * the picture), and 2-letter combinations stand for diagonal moves. If the
 * answer is not unique, print any of them.
 * <p/>
 * <pre>
 * Sample test(s)
 * input
 * a8
 * h1
 *
 * output
 * 7
 * RD
 * RD
 * RD
 * RD
 * RD
 * RD
 * RD
 * </pre>
 */
public class R004aShortestPathOfTheKing implements Runnable {
    public static void main(String[] args) {
        new Thread(new R004aShortestPathOfTheKing()).run();
    }

    @Override
    public void run() {

    }

    String[] calculateKingsMoves(String start, String end) {
        return new String[5];
    }
}
