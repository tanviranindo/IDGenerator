package IDGenerate;

/**
 *
 * @author Tanvir
 */
import java.util.Scanner;
import java.io.*;

public class SearchFromCSV {

    public static String[] SearchbyID(String searchTerm) throws IOException {
        Scanner db = new Scanner(new File("D:\\Data II\\New folder (4)\\"
                + "NetBeansProjects\\IDGenerators\\src\\IDGenerate\\Student.csv"));
        String data[] = new String[13];
        while (db.hasNextLine()) {
            String line = db.nextLine();
            if (line.contains(searchTerm)) {
                data = line.split(",");
                break;
            }
        }
        return data;
    }
}

//    public static String[] main(String search) throws IOException {
//        String id = search, data[] = Search(id);
//        System.out.printf("ID: %s\n"
//                + "Name: %s\n"
//                + "Father's Name: %s\n"
//                + "Mother's Name: %s\n"
//                + "Contact: %s\n"
//                + "Mail: %s\n"
//                + "Gender: %s\n"
//                + "Catagory: %s\n"
//                + "Department: %s\n"
//                + "Semester: %s\n"
//                + "Slot: %s\n"
//                + "Year: %s\n"
//                + "GSUIT: %s\n", data[0], data[1], data[2], data[3], data[4], data[5]
//                , data[6], data[7], data[8], data[9], data[10], data[11], data[12]);
//        return data;
//    }
//}
