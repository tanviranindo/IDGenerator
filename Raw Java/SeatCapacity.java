package IDGenerate;

/**
 *
 * @author Tanvir Anindo 12:14:39 AM Mar 10, 2020
 */
public class SeatCapacity {

    static int counts = Database.totalCount, total = 1;

    static void SeatCapacityPrint() {
        System.out.println("Total seats: " + total + " | Seats remain: " + (total - counts));
        counts++;
    }
}
