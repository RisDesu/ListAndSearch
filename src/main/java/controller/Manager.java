/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;
import model.ListAndSearch;
import view.Menu;

/**
 *
 * @author HP
 */
public class Manager extends Menu<String>{
     private static final Scanner in = new Scanner(System.in);

    ListAndSearch list= new ListAndSearch();
    public Manager(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
           
            case 1:
               list.countWordInFile();
                break;
            case 2:
                list.getFileNameContainsWordInDirectory();
               break;
            case 3:
                System.exit(0);        
        }
    }
}
