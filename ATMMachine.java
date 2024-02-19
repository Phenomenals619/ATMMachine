package Projects;
import java.util.*;
class ATM{
    double balance;
    int password=1234;
    public void checkpin()
    {
        System.out.println("Enter your password");
        Scanner sc=new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==password){
           menu();
        }
        else{
           System.out.println("Enter a valid password");
           menu();
        }

    }
    public void menu()
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for Balance Checking");
        System.out.println("Press 2 for Deposit");
        System.out.println("Press 3 for Withdraw");
        System.out.println("Press 4 for Exit");
        int opt=sc.nextInt();
        if(opt==1)
        {
         checkBalance();
        }
        else if(opt==2)
        {
            Deposit();
        }
        else if(opt==3)
        {
            Withdaw();
        }
        else if(opt==4)
        {
         return;
        }
        else
        {
         System.out.println("Enter valid Option");
        }
    }
          public void checkBalance()
          {
               System.out.println("Balance is: " + balance);
               menu();
          }
          public void Deposit()
          {
               System.out.println("Enter Amount");
               Scanner sc=new Scanner(System.in);
               double amount=sc.nextDouble();
               balance=balance+amount;
               System.out.println("Add Balance Succesfully");
               menu();
          }
          public void Withdaw()
          {
            System.out.println("Enter Withdaw");
                Scanner sc=new Scanner(System.in);
               double amount=sc.nextDouble();
               if(amount>balance)
               {
                  System.out.println("Insufficient Balance ");
               }
               else
               {
                  balance=balance-amount;
                  System.out.println("Withdraw Succesfully");
                 
               }
                menu();
          }
          
}
class ATMMachine {
   public static void main(String [] args)
   {
      ATM obj=new ATM();
      obj.checkpin();
   }

    
}
