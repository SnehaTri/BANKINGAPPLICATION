/**
 * We are importing the packages of that of class Account1 which is shown in the program Account1.java, 
 * java.util.Scanner in order to scan the inputs from the user and java.util.ArrayList respectively
 */
package Account1;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * The class which holds all the details related to account of a user
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
/**
 * our main class bank
 * @author Inspi
 */
public class Baaank {
    
    
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
        System.out.println("2:Deposit money\n");
        System.out.println("3:Withdraw money\n");
        System.out.println("4:Transfer money\n");
        System.out.println("5:Check balance\n");
        System.out.println("6:Show the richest person:\n");
        System.out.println("7:Exit\n");
        
        choice=s.nextInt();
        
        switch(choice)
        {
            case 1:        System.out.println("Enter your name:\n");
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

    public static void showRichestPerson()
    {
        int maximumBalance=0,accountNumber=-1;
                           for(int h=0; h<count; h++)
                           {
                               if(customers.get(h).balance>maximumBalance)
                               {
                                   maximumBalance=customers.get(h).balance;
                                   accountNumber=h;
                               }
                           }
                           System.out.println("The richest person is:"+ customers.get(accountNumber).name + "\n balance:" +customers.get(accountNumber).balance);
                           
    }
    
    public static void showBalance(int accountNumber)
    {
        if(accountNumber<count && customers.get(accountNumber).name!=null)
                           {
                               System.out.println("balance:"+customers.get(accountNumber).balance);
                           }
                           else
                               System.out.println("Account not found\n");
    }
    
      public static void deposite(int accountNumber)
    {
                int amount;
               if(accountNumber<count && customers.get(accountNumber).name!= null)
               {
                   System.out.println("Enter the amount to deposite\n");
                   Scanner s1=new Scanner(System.in);
                     amount=s1.nextInt(); 
                     customers.get(accountNumber).balance+=amount;
               }
               else
                  System.out.println("Account not found\n");
    }
      
         public static void withdraw(int accountNumber)
    {
                int amount;
               if( accountNumber<count && customers.get(accountNumber).name!= null )
               {
                   System.out.println("Enter the amount to withdraw\n");
                   Scanner s1=new Scanner(System.in);
                     amount=s1.nextInt(); 
                     if(customers.get(accountNumber).balance>=amount)
                     {
                         customers.get(accountNumber).balance-=amount;
                     }
                     else
                         System.out.println("Insufficient funds\n");
               }
               else
                  System.out.println("Account not found\n");
    } 
         
         
                 public static void transfer(int accountNumber1,int accountNumber2)
    {
                int amount;
               if(accountNumber1<count && customers.get(accountNumber1).name!= null )
               {
                   System.out.println("Enter the amount to transfer\n");
                   Scanner s1=new Scanner(System.in);
                     amount=s1.nextInt(); 
                     if(customers.get(accountNumber1).balance>=amount)
                     {
                         if(accountNumber2<count && customers.get(accountNumber2).name!= null )
                         {
                             customers.get(accountNumber1).balance-=amount;
                             customers.get(accountNumber2).balance+=amount;
                         }
                         else
                             System.out.println("Account 2 not found\n");
                     }
                     else
                         System.out.println("Insufficient funds\n");
               }
               else
                  System.out.println("Account not found\n");
    
}
    
    
}
