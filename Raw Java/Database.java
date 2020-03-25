package IDGenerate;

/**
 *
 * @author Tanvir
 */
import java.io.*;
import java.util.Scanner;

class Database {

    static String address = "D:\\Data II\\New folder (4)\\NetBeansProjects\\IDGenerators\\src\\IDGenerate\\Student.csv";
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
