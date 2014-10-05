package org.giddap.dreamfactory.codeforces;

/**
 * http://codeforces.com/problemset/problem/3/B
 * <p/>
 * A group of tourists is going to kayak and catamaran tour. A rented lorry has
 * arrived to the boat depot to take kayaks and catamarans to the point of
 * departure. It's known that all kayaks are of the same size (and each of them
 * occupies the space of 1 cubic metre), and all catamarans are of the same size,
 * but two times bigger than kayaks (and occupy the space of 2 cubic metres).
 * <p/>
 * Each waterborne vehicle has a particular carrying capacity, and it should be
 * noted that waterborne vehicles that look the same can have different carrying
 * capacities. Knowing the truck body volume and the list of waterborne vehicles
 * in the boat depot (for each one its type and carrying capacity are known),
 * find out such set of vehicles that can be taken in the lorry, and that has the
 * maximum total carrying capacity. The truck body volume of the lorry can be
 * used effectively, that is to say you can always put into the lorry a
 * waterborne vehicle that occupies the space not exceeding the free space left
 * in the truck body.
 * <p/>
 * Input The first line contains a pair of integer numbers n and v (1 ≤ n ≤ 10^5;
 * 1 ≤ v ≤ 10^9), where n is the number of waterborne vehicles in the boat depot,
 * and v is the truck body volume of the lorry in cubic metres. The following n
 * lines contain the information about the waterborne vehicles, that is a pair of
 * numbers ti, pi (1 ≤ ti ≤ 2; 1 ≤ pi ≤ 10^4), where ti is the vehicle type (1 – a
 * kayak, 2 – a catamaran), and pi is its carrying capacity. The waterborne
 * vehicles are enumerated in order of their appearance in the input file.
 * <p/>
 * Output In the first line print the maximum possible carrying capacity of the
 * set. In the second line print a string consisting of the numbers of the
 * vehicles that make the optimal set. If the answer is not unique, print any of
 * them.
 * <p/>
 * <pre>
 * Sample test(s)
 *
 * input
 * 3 2
 * 1 2
 * 2 7
 * 1 3
 *
 * output
 * 7
 * 2
 * </pre>
 */
public class R003bLorry implements Runnable {
    @Override
    public void run() {

    }
}
