/*
* File: MainController.java
* Author: Sallai András
* Copyright: 2023, Sallai András
* Group: Szoft V
* Date: 2023-12-03
* Github: https://github.com/oktatas/
* Refaktorálva: Vámosi László Ádám, 2026-02-10
* Licenc: GNU GPL
*/

package lan.zold.controllers;

import java.util.ArrayList;
import java.util.Vector;

import lan.zold.models.FileSource;
import lan.zold.models.Product;
import lan.zold.views.MainFrame;

public class MainController {
    // Az a objektum a MainFrame egy példánya
    MainFrame a;
    public MainController() {
        this.a = new MainFrame();
        ArrayList<Product> productList = new FileSource().readFile();
        for(Product prod : productList) {
            System.out.println(prod.getName());
        }

        for(Product prod:productList) {
            Vector<String> row = new Vector<>();
            row.add(prod.getId().toString());
            row.add(prod.getName());
            row.add(prod.getArticleNumber());
            row.add(prod.getUnitPrice().toString());
            row.add(prod.getPiece().toString());
            this.a.getModel().addRow(row);
        }


    }
}
