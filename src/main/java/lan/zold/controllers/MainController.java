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

    MainFrame mainFrame;
    ArrayList<Product> productList;

    public MainController() {
        initComponents();
    }

    public void initComponents() {
        this.mainFrame = new MainFrame();
        productList = new FileSource().readFile();
        printProductName();
        initTable();
    }

    private void printProductName() {
        for(Product prod : productList) {
            System.out.println(prod.getName());
        }
    }

    private void initTable() {
        for(Product prod:productList) {
            Vector<String> row = new Vector<>();
            row.add(prod.getId().toString());
            row.add(prod.getName());
            row.add(prod.getArticleNumber());
            row.add(prod.getUnitPrice().toString());
            row.add(prod.getPiece().toString());
            this.mainFrame.getModel().addRow(row);
        }
    }
}
