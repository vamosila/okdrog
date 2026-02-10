package lan.zold.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Filehandler {
    String fileName;
    File file;
    Scanner scanner;
    
    public Filehandler(String fileName) {
        this.fileName = fileName;
        initFile();
    }

    private void initFile() {
        try {
            tryInitFile();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }

    private void tryInitFile() throws FileNotFoundException {
        file = new File(fileName);
        scanner = new Scanner(file, "utf-8");
    }

    public Scanner getScanner() {
        return scanner;
    }

}
