
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kdenhartog
 */
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String temp;
        int c, c1;
        boolean t = true;
        BST b = new BST();
        LinkedList l = new LinkedList();
        AQueue q = new AQueue();
        System.out.println("Welcome to Data Visualizer");
        System.out.println("Please select a data structure");
        System.out.println("1. Binary Search Tree");
        System.out.println("2. List as a LinkedList");
        System.out.println("3. Queue using an array");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Type 1 to add a word or 2 to delete a word "
                        + "or 3 to close.");
                c = scan.nextInt();
                while (t) {
                    switch (c) {
                        case 1:
                            System.out.println("Please type a word...");
                            temp = scan.next();
                            b.add(temp);
                            System.out.println("\nType 1 to add a word or 2 "
                                    + "to delete a word or 3 to close.");
                            c = scan.nextInt();
                            break;
                        case 2:
                            System.out.println("Enter the word you wish to "
                                    + "remove...");
                            temp = scan.next();
                            b.remove(temp);
                            System.out.println("\nType 1 to add a word or 2 "
                                    + "to delete a word or 3 to close.");
                            c = scan.nextInt();
                            break;
                        case 3:
                            System.exit(0);
                        default:
                            System.out.println("input incorrect... closing");
                            t = false;
                    }
                }
            case 2:
                System.out.println("Type 1 to add a word, 2 to insert a word,"
                        + " 3 to delete a word, or 4 to close.");
                c = scan.nextInt();
                while (t) {
                    switch (c) {
                        case 1:
                            System.out.println("Please type a word...");
                            temp = scan.next();
                            l.add(temp);
                            System.out.println("\nType 1 to add a word, "
                            + "2 to insert a word, 3 to delete a word, "
                                    + "or 4 to close.");
                            c = scan.nextInt();
                            break;
                        case 2:
                            System.out.println("Enter the word you wish "
                                    + "to insert...");
                            temp = scan.next();
                            System.out.println("Enter an index to insert the "
                                    + "word at...");
                            c1 = scan.nextInt();
                            l.add(c1, temp);
                            System.out.println("\nType 1 to add a word, "
                            + "2 to insert a word, 3 to delete a word, "
                                    + "or 4 to close.");
                            c = scan.nextInt();
                            break;
                        case 3:
                            System.out.println("Enter an index you wish "
                                    + "to remove...");
                            c1 = scan.nextInt();
                            l.remove(c1);
                            System.out.println("\nType 1 to add a word, "
                            + "2 to insert a word, 3 to delete a word, "
                                    + "or 4 to close.");
                            c = scan.nextInt();
                            break;
                        case 4:
                            System.exit(0);
                        default:
                            System.out.println("input incorrect... closing");
                            t = false;    
                    }
                }
            case 3:
                System.out.println("Select 1 to enqueue, 2 to dequeue, "
                        + "or 3 to close");
                c = scan.nextInt();
                while(t){
                    switch(c){
                        case 1:
                            System.out.println("Please type a word...");
                            temp = scan.next();
                            q.enqueue(temp);
                            System.out.println("Select 1 to enqueue, "
                                    + "2 to dequeue, or 3 to close");
                            c = scan.nextInt();
                            break;
                        case 2:
                            String removed = q.dequeue();
                            System.out.println(removed + " was removed.");
                            System.out.println("Select 1 to enqueue, "
                                    + "2 to dequeue, or 3 to close");
                            c = scan.nextInt();
                            break;
                        case 3:
                            System.exit(0);
                        default:
                            System.out.println("input incorrect... closing");
                            t = false; 
                    }
                }
            default:
                System.out.println("This is not an option... "
                        + "application closing.");
                System.exit(0);
        }
    }
}
