package com.amrita;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        while(true) {

            System.out.println(" STUDENT CRUD ");
            System.out.println("1. Register");
            System.out.println("2. Get Name By ID");
            System.out.println("3. Get All Students");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            switch(choice) {
                case 1:

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email : ");
                    String email = sc.nextLine();

                    System.out.print("Enter Course : ");
                    String course = sc.nextLine();

                    Student s = new Student(name,email,course);
                    dao.register(s);
                    break;

                case 2:
                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();
                    dao.getNameById(id);
                    break;

                case 3:
                    dao.getAllStudents();
                    break;

                case 4:
                    System.out.print("Enter ID : ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name : ");
                    String uname = sc.nextLine();

                    System.out.print("Enter New Email : ");
                    String uemail = sc.nextLine();

                    System.out.print("Enter New Course : ");
                    String ucourse = sc.nextLine();
                    Student us = new Student(uid,uname,uemail,ucourse);
                    dao.updateStudent(us);
                    break;

                case 5:
                    System.out.print("Enter ID : ");
                    int did = sc.nextInt();
                    dao.deleteStudent(did);
                    break;

                case 6:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}