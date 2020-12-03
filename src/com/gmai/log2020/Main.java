package com.gmai.log2020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Characteristic ch = new Characteristic(Parameter.DEBUG, "Save", "21.02.2020");
        Characteristic ch1 = new Characteristic(Parameter.ERROR, "Error", "23.02.2020");
        Characteristic ch2 = new Characteristic(Parameter.WARNING, "Warning!", "25.02.2020");


        //Запись в файл
        NewFile.write(ch);
        NewFile.write(ch1);
        NewFile.write(ch2);

        //Данные с файла
          ReadFile.main();

    }
}