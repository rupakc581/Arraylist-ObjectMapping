/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Rupa.Arraylist;

/**
 *
 * @author ACER
 */
import com.Rupa.Arraylist.entity.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        

        while (true) {
            System.out.println("1.Add student");
            System.out.println("2.Show all Student");
            System.out.println("Delete");
            System.out.println("Exit");
            System.out.println("Enter your choice from[]1-4]");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    Student s = new Student();
                    System.out.println("Enter ID");
                    s.setId(input.nextInt());
                    System.out.println("Enter FirstName");
                    s.setFirstname(input.next());
                    System.out.println("Enter Lastname");
                    s.setLastname(input.next());
                    System.out.println("Enter Address");
                    s.setAddress(input.next());
                    System.out.println("Enter Email");
                    s.setEmail(input.next());
                    studentList.add(s);
                    break;
                case 2:
                    System.out.println("Showing all Studentlist");
                    System.out.println(studentList);

                    break;
                case 3:
     
                    break;
                case 4:
                    System.exit(0);
                    break;

            }
        }
    }

}
