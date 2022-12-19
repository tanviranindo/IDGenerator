package IDGenerate;

/**
 *
 * @author Tanvir Anindo 12:14:39 AM Mar 10, 2020
 */

import java.io.*;
import java.util.Scanner;

class Database {

    static String address = "C:\\Users\\User\\Documents\\GitHub\\IDGenerator\\Raw Java\\Student.csv";
    static int totalCount;

    static void database() throws FileNotFoundException {
        Scanner data = new Scanner(new File(address));
        while (data.hasNextLine()) {
            totalCount++;
            data.nextLine();
        }
        System.out.println(totalCount);
    }

}
