package Java;

import java.util.Scanner;
import Banking.BankingClass;

public class Activity_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int attemp = 3;
        
        switch(choice){
            case 1:
       
                BankingClass bc = new BankingClass();
               
                
                
                System.out.print("Enter your Account No: ");
                int accountNo = sc.nextInt();

                System.out.print("Enter your Pin: ");
                int pin = sc.nextInt();
              
                while(attemp == 0){
                    if (bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                    } 
                }
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
    }    
    
    
}
