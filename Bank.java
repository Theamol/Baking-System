import java.util.Scanner;

class Transactions {
    int amount = 1000;  
    int deposit = 0;    
    int withdraw = 0;   
   
    public void deposit(int depositAmount) {
        this.deposit = depositAmount; 
        amount =amount+depositAmount;     
    }

  
    public void withdraw(int withdrawAmount) {
        if (withdrawAmount <= amount) {
            this.withdraw = withdrawAmount;  
            amount =amount- withdrawAmount;        
        } else {
            System.out.println("Insufficient balance!");
        }
    }

   
    public void checkBalance() {
        System.out.println("Your current balance is: " + amount);
    }
}

public class Bank extends Transactions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Transactions t = new Transactions();  

        while(true){
            System.out.println("1. Check balance \n2. Deposit money \n3. Withdraw money\n4. Exit");
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    t.checkBalance();  
                    break;

                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    t.deposit(depositAmount); 
                    System.out.println("Deposited: " + depositAmount);
                    break;

                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    t.withdraw(withdrawAmount);  
                    System.out.println("Withdrawn: " + withdrawAmount);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();  
                    return;  

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}

