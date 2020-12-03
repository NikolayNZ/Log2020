package com.gmai.log2020;

import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static void main() {
        String csvFile = "C:\\Users\\Log2020\\03.12.2020.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {
                String[] type = line.split(cvsSplitBy);
                System.out.println(type[0] + type[1] + type[2]);

                }

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


