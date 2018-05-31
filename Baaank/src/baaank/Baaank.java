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
    
    
    public static void addAccount(String accName)
    {
        //customers[count].name=accNum;
        Account1 a=new Account1();
        a.name=accName;
        customers.add(a);
        System.out.println("Your account number is\n" + count++);
    }
    
    
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
        
        switch(choice)
        {
            case 1:        System.out.println("Enter your name\n");
                           name=s.next();
                           addAccount(name);
                           break;
                           
            case 2:        System.out.println("Enter your Account number\n");
                           accountNumber1=s.nextInt();
                           deposite(accountNumber1);
                           break;
                           
            case 3:        System.out.println("Enter your Account number\n");
                           accountNumber1=s.nextInt();
                           withdraw(accountNumber1);
                           break;
                           
            case 4:        System.out.println("Enter 'from' Account number\n");
                           accountNumber1=s.nextInt();
                           System.out.println("Enter 'to' Account number\n");
                           accountNumber2=s.nextInt();
                           transfer(accountNumber1,accountNumber2);
                           break; 
            case 5:        System.out.println("Enter your Account number\n");
                           accountNumber1=s.nextInt();
                           showBalance(accountNumber1);
                           break; 
            case 6:        showRichestPerson();
                           break;
            case 7:        break;
            default:       System.out.println("You entered an invalid choice\n");
        } 
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
