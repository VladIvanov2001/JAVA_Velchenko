package com.trees;

import java.util.Scanner;


public class CaseMenu {
    private final Scanner in;

    public CaseMenu(Scanner scanner) {
        this.in = scanner;
    }
    public void printMenu(){
        System.out.println("Методы:\n 1) зацвести; \n 2) опасть листьям; \n 3) покрыться инеем; \n 4) пожелтеть листьям \n 5) выход");
    }
    public void start(Tree tree, Leaves leave) {
        if(this.in != null) {
            int choice;
            do {
                printMenu();
                choice = this.in.nextInt();
                switch (choice) {
                    case 1:
                        tree.bloom();
                        break;
                    case 2:
                        tree.shankOff(leave);
                        break;
                    case 3:
                        tree.frost();
                        break;
                    case 4:
                        tree.growYellow(leave);
                        break;
                }
            } while (choice != 5);
        }
    }
    }

