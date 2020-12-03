package com.gmai.log2020;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

class SearchFile {

    public static void main(String[] args) {
        File dir = new File( "C:\\Users\\Log2020\\");
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept (File dir, String name) {
                return name.startsWith("20.12.2020");
            }
        };
        String[] name = dir.list(filter);
        if (name == null) {
            System.out.println("");
        } else {
            for (int i = 0; i< name.length; i++) {
                String filename = name[i];
                System.out.println(filename);
            }
        }
    }
}

