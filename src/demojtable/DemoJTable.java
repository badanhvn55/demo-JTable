/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demojtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


/**
 *
 * @author ueda
 */
public class DemoJTable extends JFrame{

    public DemoJTable(){
        super("List Student");
        this.setSize(600, 400);
        
        String[] title=new String[]{"ID","Name","Email","Birthday","Class Name"};
        
        Object[][] listPeople=new Object[][]{
            {"1","Danh","vodanh@master.top.co","30/06/1997","C1702G"},  
            {"2","Danh","vodanh@master.top.co","30/06/1997","C1702G"},  
            {"3","Danh","vodanh@master.top.co","30/06/1997","C1702G"},  
            {"4","Danh","vodanh@master.top.co","30/06/1997","C1702G"},  
            {"5","Danh","vodanh@master.top.co","30/06/1997","C1702G"}  
        };
        
        JTable jTable=new JTable(listPeople,title);
        jTable.setName("List Table");
        
        this.add(new JScrollPane(jTable));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    
    
    public static void main(String[] args) {
        DemoJTable demo=new DemoJTable();
    }
    
}
