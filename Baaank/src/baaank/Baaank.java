/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baaank;
package Account1;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Inspi
 */
 class Account1 {
    
        
    int balance;
    String name;
    
    /**
     * Constructor to initialize the account name and balance
     */
   public Account1()
    {
        this.name=null;
        this.balance=0;
    }


    
}
public class Baaank {
    
    public class BANK {
    
        static ArrayList<Account1> customers=new ArrayList();
    static int count=0;
    
    /**
     * This method creates a new account by asking for the name of the account holder and add it to the array list holding all customers' account objects.
     * Thereby a single customer can have multiple accounts each time it asks for a new account it simply declares with the same name.
     * @param accName Name of the account holder
     */
    public static void addAccount(String accName)
    {
        //customers[count].name=accNum;
        Account1 a=new Account1();
        a.name=accName;
        customers.add(a);
        System.out.println("Your account number is\n" + count++);
    }
    
    /**
     * The following method displays a menu for the user and takes the control to the respective fuction which is opted by the user.  
    */
    public static void main(String[] args) {
       
        int choice=-1;
        String name;
        int accountNumber1,accountNumber2;
        
        while(choice!=7)
        {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your choice\n");
        System.out.println("1:Add account\n");
        System.out.println("2:Deposite Money\n");
        System.out.println("3:Withdraw Money\n");
        System.out.println("4:Transfer Money\n");
        System.out.println("5:Show balance\n");
        System.out.println("6:Show Richest person\n");
        System.out.println("7:Exit\n");
        
        choice=s.nextInt();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
