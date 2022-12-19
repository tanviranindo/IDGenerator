package IDGenerate;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;

/**
 * @author Tanvir Anindo 12:14:39 AM Mar 10, 2020
 */
public class Student {

    Scanner input = new Scanner(System.in);

    public String id, year, gSuit, name, fatherName, motherName, mail, mobile, gender, category, slot, semester, department, zero = "0";

    private int categoryInput, semesterInput, departmentInput, slotInput, genderInput, rollInput, yearInput;

    private static int count = 1, checks = 1;

    //    public void setInformationManually(){
//        System.out.print("Enter Your Name:  ");
//        name = input.nextLine().toUpperCase();
//        System.out.print("Year: (1) 2020 | (2) 2019 | (3) 2018 | (4) 2017\nEnter Year:  ");
//        yearInput = input.nextInt();
//        System.out.print("Semester: (1) SPRING | (2) SUMMER | (3) FALL\nEnter semester:  ");
//        semesterInput = input.nextInt();
//        System.out.print("Slots Available: 1 | 2 | 3\nEnter slot:  ");
//        slotInput = input.nextInt();
//        System.out.print("Department: (1)CSE (2)CS (3)EEE (4)ECE (5)BBA (6)ARC (7)PHR (8)ANT\nEnter department:  ");
//        departmentInput = input.nextInt();
//        rollInput = checks++;
//    }

    public void setInformationAutomatically(String[] s) {
        name = s[0].toUpperCase();
        fatherName = s[1].toUpperCase();
        motherName = s[2].toUpperCase();
        mobile = s[3];
        mail = s[4].toLowerCase();
        genderInput = Integer.parseInt(s[5]);
        categoryInput = Integer.parseInt(s[6]);
        departmentInput = Integer.parseInt(s[7]);
        semesterInput = Integer.parseInt(s[8]);
        slotInput = Integer.parseInt(s[9]);
        yearInput = Integer.parseInt(s[10]);

        rollInput = checks++;
    }

    public void category() {
        switch (categoryInput) {
            case 1:
                category = "National";
                break;
            case 2:
                category = "International";
                break;
        }
    }

    public void gender() {
        switch (genderInput) {
            case 1:
                gender = "Male";
                break;
            case 2:
                gender = "Female";
                break;
            case 3:
                gender = "Others";
                break;
        }
    }

    public void year() {
        switch (yearInput) {
            case 1:
                year = Integer.toString((Calendar.getInstance().get(Calendar.YEAR) % 100) - 1);
                break;
            case 2:
                year = Integer.toString(Calendar.getInstance().get(Calendar.YEAR) % 100);
                break;
            case 3:
                year = Integer.toString((Calendar.getInstance().get(Calendar.YEAR) % 100) + 1);
                break;
//            case 4:
//                year = Integer.toString((Calendar.getInstance().get(Calendar.YEAR) % 100) + 2);
//                break;
        }
    }

    public void semester() {
        switch (semesterInput) {
            case 1:
                semester = "SPRING";
                break;
            case 2:
                semester = "SUMMER";
                break;
            case 3:
                semester = "FALL";
                break;
        }
    }

    //    public void roll(String [] args){
//        SearchFromCSV.main(year);
//    }
    public void setID() {
//        Integer.toString(semesterInput);
//        Integer.toString(slotInput);
//        Integer.toString(departmentInput);
//        Integer.toString(rollInput);
        id = year + semesterInput + slotInput + departmentInput + rollInput;
        if (id.length() == 6) {
            id = year + semesterInput + slotInput + departmentInput + zero + zero + rollInput;
        } else if (id.length() == 7) {
            id = year + semesterInput + slotInput + departmentInput + zero + rollInput;
        }

    }

    public void mail() {
        gSuit = name.replace(" ", ".").toLowerCase() + "@g.bracu.ac.bd";
    }

    public void slot() {
        switch (slotInput) {
            case 1:
                slot = "1";
                break;
            case 2:
                slot = "2";
                break;
            case 3:
                slot = "3";
                break;
        }
    }

    public void department() {
        switch (departmentInput) {
            case 1:
                department = "CSE";
                break;
            case 2:
                department = "CS";
                break;
            case 3:
                department = "EEE";
                break;
            case 4:
                department = "ECE";
                break;
            case 5:
                department = "BBA";
                break;
            case 6:
                department = "ARC";
                break;
            case 7:
                department = "PHR";
                break;
            case 8:
                department = "ANT";
                break;
        }
    }

    public String[] Search(String searchTerm) throws IOException {
        Scanner db = new Scanner(new File("C:\\Users\\User\\Documents\\GitHub\\IDGenerator\\Raw Java\\Student.csv"));
        String[] data = new String[12];
        while (db.hasNextLine()) {
            String line = db.nextLine();
            if (line.contains(searchTerm)) {
                data = line.split(",");
                break;
            }
        }
        return data;
    }

    public void printInformation() {
        System.out.println("\n(" + count + ")");
        System.out.println("Name: " + name);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Contact: " + mobile);
        System.out.println("Mail: " + mail);
        System.out.println("Gender: " + gender);
        System.out.println("Student ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester + " " + year);
        System.out.println("Slot: " + slotInput);
        System.out.println("G-SUIT: " + gSuit);
        count++;
    }
}
