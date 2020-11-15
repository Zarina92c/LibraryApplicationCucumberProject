package com.library.pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException {
        //path to file that we want to read
        String path = "shopping_list.txt";
        //File's constructor
        File file = new File(path);
        System.out.println(file.exists());

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }





    }
}
