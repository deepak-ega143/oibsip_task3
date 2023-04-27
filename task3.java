	import java.util.Scanner;

public class task3 {
	
	    public static void main(String args[])
	    { 
	        int balance = 30000, withdraw, deposit;
	        Scanner in = new Scanner(System.in);
	        int pin=8888;
	        System.out.println("Please enter your pin number: ");
	        int passcode=in.nextInt();
	        int i=1;
	        if(passcode!=pin)
	        {
	            while(true)
	            {
	                i++;
	            System.out.println("Wrong pin Number ");
	            System.out.println("Please Re-enter your pin only 3 attempts: ");
	            passcode=in.nextInt();
	            if(passcode==pin)
	            {
	                break;
	            }
	            if(i==3){
	               
	                System.out.println("Retry After some time !");
	            System.exit(0);
	            }
	            }
	        }
	        if(passcode==pin)
	        {
	            System.out.println("Welcome");  
	            while(true)
	            {
	                System.out.println("Enter 1 to Check the Balance amount");
	                System.out.println("Enter 2 to Withdraw the money");
	                System.out.println("Enter 3 to Deposit the money");
	                System.out.println("Enter 4 to QUIT");
	                System.out.print("Choose what you option: ");
	                int choice = in.nextInt();
	                switch(choice)
	                {
	                    case 1:
	                    System.out.println(" Balance is : "+balance);
	                    System.out.println("");
	                    break;
	                    case 2:
	                    	System.out.println("Enter amount want to Withdraw : ");
		                    withdraw=in.nextInt();
		              
		                    if(withdraw>balance||balance==0)
		                    {
		                        System.out.printf("You have insufficient balance!!\n you womt able to withdraw");
		                        break;
		                    }
		                    System.out.println("collect your amount!");
		                    balance=balance-withdraw;
		                    System.out.println("");
		                    break;
	                    case 3:
	                    	
		                    System.out.print("Enter money to be deposited: \n");
		                    deposit = in.nextInt();
		                    balance = balance + deposit;
		                    System.out.println("Your Money is deposited!");
		                    System.out.println(" ");
		                    break;
	                    

	                    case 4:
	                    System.out.println("Thank you for using");
	                    System.exit(0);
	                }
	            }
	       }
	    }
	}

