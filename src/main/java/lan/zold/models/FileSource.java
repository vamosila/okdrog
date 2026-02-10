/*
* File: FileSource.java
* Author: Sallai András
* Copyright: 2023, Sallai András
* Group: Szoft V
* Date: 2023-12-03
* Github: https://github.com/oktatas/
* Refaktorálva: Vámosi László Ádám, 2026-02-10
* Licenc: GNU GPL
*/

package lan.zold.models;

import java.util.ArrayList;
import java.util.Scanner;

public class FileSource {
    String fileName;
    Scanner scanner;

    public FileSource() {
        fileName = "data.txt";
    }

    public ArrayList<Product> readFile() {
        ArrayList<Product> productList = new ArrayList<>();
        scanner = new Filehandler(fileName).getScanner();
        scanner.nextLine();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            String[] lineArray = line.split(":");
            Product product = convertArrayToProduct(lineArray);
            productList.add(product);
        }
        return productList;
    }

    private Product convertArrayToProduct(String[] lineArray) {
        Product product = new Product(
            Integer.parseInt(lineArray[0]),
            lineArray[1],
            lineArray[2],
            Double.parseDouble(lineArray[3]),
            Integer.parseInt(lineArray[4]));
        return product;
    }
}
