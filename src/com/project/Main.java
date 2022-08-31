package com.project;

import java.io.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static int DoseCount;
    public static String phone;

    public static void main(String[] args) throws IOException, SQLException {

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n.....Vaccination System.....");

        while (true) {
                // Taking input for further execution
                System.out.println("Enter 1 for Registration");
                System.out.println("Enter 2 for Searching");
                System.out.println("Enter 9 for exit");
                int c;
                while (true) {
                    c = Integer.parseInt(sc.readLine());
                    //edge case: if input is other than 1,2,9
                    if (!(c == 1 || c == 2 || c == 9)) {
                        System.out.print("Enter the valid option: ");
                    } else {
                        break;
                    }
                }
                if(c==1){
                    //Registration...
                     Registeration.register();
                }
                else if(c==2){
                    //Searching for entered mobile number...
                    System.out.print("\nEnter your Registered Mobile Number:");
                    phone = sc.readLine();
                    SearchingDetails.search();
                }
                else if (c == 9) {
                    //Program exit
                    System.out.println("....Thanks for visiting....");
                    break;
                }

            System.out.println("\n");
        }
    }
}

