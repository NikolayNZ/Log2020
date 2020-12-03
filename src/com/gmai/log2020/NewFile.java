package com.gmai.log2020;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class NewFile {

    public static void write(Characteristic characteristic) {
        boolean append = true;
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateText = dateFormat.format(date);
        File wr = new File(dateText + ".csv");

            try {
                if (!wr.exists()) {
                    wr.createNewFile();

                }
                PrintWriter out = new PrintWriter(new FileWriter(wr, true));


                try {
                    out.print(characteristic + "\n");
                } finally {
                    out.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
