package com.bankapp.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Storage {
    
    public Scanner reader(String fileName){
        try {
            File data = new File(fileName);
            return new Scanner(data);
        } 
            catch (FileNotFoundException e) {
            }
        return null;
    }
}
