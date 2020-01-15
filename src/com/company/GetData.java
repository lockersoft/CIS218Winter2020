package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetData {

    public static String getString(String prompt) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // a = gets
        String user_input = null;
        System.out.println(prompt);
        try {
            user_input = br.readLine();
        } catch ( IOException ioe ) {
            System.out.println("IO Error trying to read!");
            System.exit(1);
        }
        return user_input;
    }

    public static Integer getInt(String prompt) {
        return Integer.parseInt(getString(prompt));
    }
}
