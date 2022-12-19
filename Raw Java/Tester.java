package IDGenerate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Tanvir Anindo 12:14:39 AM Mar 10, 2020
 */
public class Tester {

    public static void nonMain(String[] passerBy) throws IOException {
        String address = "C:\\Users\\User\\Documents\\GitHub\\IDGenerator\\Raw Java\\Student.csv";

        FileWriter studentInformation = null;

        ArrayList<Student> studentList = new ArrayList<>();

        while (SeatCapacity.counts < SeatCapacity.total) {
            SeatCapacity.SeatCapacityPrint();
            Student student = new Student();
//      student.setInformationManually();
            student.setInformationAutomatically(passerBy);
            student.year();
            student.gender();
            student.category();
            student.semester();
            student.slot();
            student.department();
            student.setID();
            student.mail();
            studentList.add(student);
        }

        try {
            studentInformation = new FileWriter(address, true);
            System.out.println("Successfully saved!");
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        for (Student s : studentList) {
            s.printInformation();
            assert studentInformation != null;
            studentInformation.append(s.id).append(",").append(s.name).append(",").append(s.fatherName).append(",").append(s.motherName).append(",").append(s.mobile).append(",").append(s.mail).append(",").append(s.gender).append(",").append(s.category).append(",").append(s.department).append(",").append(s.semester).append(",").append(s.slot).append(",").append(s.year).append(",").append(s.gSuit).append("\n");
        }
        assert studentInformation != null;
        studentInformation.close();

    }
}
