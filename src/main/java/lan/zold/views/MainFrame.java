/*
* File: MainFrame.java
* Author: Sallai András
* Copyright: 2023, Sallai András
* Group: Szoft V
* Date: 2023-12-03
* Github: https://github.com/oktatas/
* Refaktorálva: Vámosi László Ádám, 2026-02-10
* Licenc: GNU GPL
*/

package lan.zold.views;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import lan.zold.models.Product;

public class MainFrame extends JFrame {

    DefaultTableModel model;
    JScrollPane pane;
    JTable table;
    ArrayList<Product> productList;

    public MainFrame() {
        initComponent();
    }

    private void initComponent() {
        instanceVisualComponent();
        initTableComponent();
        initFrame();
    }

    private void initFrame() {
        this.add(pane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    private void instanceVisualComponent() {
        model = new DefaultTableModel();
        table = new JTable();
        pane = new JScrollPane(table);
    }

    private void initTableComponent() {
        String[] columNames = {
            "Azonosító",
            "Név",
            "Cikkszám",
            "Egységár",
            "Darab"
        };

        this.model.setColumnIdentifiers(columNames);
        table.setModel(model);
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }
}
