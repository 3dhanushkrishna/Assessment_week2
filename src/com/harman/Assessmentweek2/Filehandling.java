package com.harman.Assessmentweek2;

import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {
    public static void main(String[] args) {
        try {
            FileWriter writer=new FileWriter("text.txt");
            writer.write("HAPPY NEW YEAR");
            writer.close();
            System.out.println("file created successful");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
