package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.company.GetData.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.print("Hello World\n");
        System.out.println("This is on the same line");

        String user_input = getString("Please enter a number: ");
        Integer num = getInt("Please enter a number: ");
        try {
            num = Integer.parseInt(user_input);
        } catch ( NumberFormatException nfe ) {
            num = 0;
        }
        System.out.print("You entered :");
        System.out.println(num);
        System.out.println();
    }

}
