package com.iit.oop;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter an integer: ");
            arr[i] = scan.nextInt();

        }
        scan.close();
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }

        int below = 0,pass=0,two=0,one=0,first=0;
        for (int i = 0; i < 6; i++) {
            if (arr[i]<40){
                below+=1;
            } else if (arr[i]>40 && arr[i]<50) {d
                pass+=1;
            }else if (arr[i]>49 && arr[i]<60) {
                two+=1;
            }else if (arr[i]>59 && arr[i]<70) {
                one+=1;
            }else{
                first+=1;
            }
        }
        System.out.printf("""
                below: %d
                Pass: %d
                2-2: %d
                2-1: %d
                First: %d
                """,below,pass,two,one,first);
        System.out.println("Average :"+average(arr));
        System.out.println("Maximum :"+findMax(arr));
        System.out.println("Minimum :"+findMin(arr));
        int[] sortedarr=bubbleSort(arr);
        System.out.print("Sorted Array : ");
        for(int i=0;i<sortedarr.length;i++){
            System.out.print(sortedarr[i]+" ");
        }


    }
    public static double average(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    */

        /*Student s1=new Student("Agzy",19,92);
        Student s2=new Student("Sarah",20,42);
        s1.displayDetails();
        s2.displayDetails();
        System.out.println("Student 1 has "+s1.hasPassed()+" the module");
        System.out.println("Student 2 has "+s2.hasPassed()+" the module");*/

        /*Ticket t1=new Ticket();
        Ticket t2=new Ticket();
        Ticket t3=new Ticket();
        System.out.println(t3.getInfo());
        System.out.println(Ticket.getNumTicketSold());*/


       /* Director director = new Director("James", "Cameron");
        Date dob = new Date(16, 8, 1954);
        director.setDob(dob);
        director.setNumDirectedMovie(23);
        System.out.println(director); // toString()
        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurname());
        System.out.println("dob is: " + director.getDob().getDate());
        System.out.println("number of directed movies is: " +
                director.getNumDirectedMovie());

        IdentifyVariables a = new IdentifyVariables ();
        IdentifyVariables b = new IdentifyVariables ();
        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyVariables.x = " + IdentifyVariables.x);*/


    }


}
