package IDGenerate;
//import java.io.*;
//import java.util.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Tanvir Anindo 12:14:39 AM Mar 10, 2020
 */
public class Tester {

    public static void nonmains(String[] passerBy) throws IOException {
        String address = "D:\\Data II\\New folder (4)\\NetBeansProjects\\IDGenerators\\src\\IDGenerate\\Student.csv";

        FileWriter studentInformation = null;

        ArrayList<Student> studentList = new ArrayList<>();

        while (SeatCapacity.counts < SeatCapacity.total) {
            SeatCapacity.SeatCapacityPrint();
            Student student = new Student();
//      student.setInformationManually();
            student.setInformationAutomatically(passerBy);
            student.year();
            student.gender();
            student.catagory();
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
            System.out.println(e);
        }

        for (Student s : studentList) {
            s.printInformation();
            studentInformation.append(s.id + ","
                    + s.name + ","
                    + s.fathername + ","
                    + s.mothername + ","
                    + s.mobile + ","
                    + s.mail + ","
                    + s.gender + ","
                    + s.catagory + ","
                    + s.department + ","
                    + s.semester + ","
                    + s.slot + ","
                    + s.year + ","
                    + s.gsuit + "\n");
        }
        studentInformation.close();

    }
}
