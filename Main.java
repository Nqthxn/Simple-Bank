import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String[] options = {"Create Account", "Deposit Money", "Withdraw Money", "Check Balance", "Exit"};
        Scanner input = new Scanner(System.in);
        int userInput;


        System.out.println("----------[ WELCOME TO SIMPLE BANK ]----------\n");


        while(true){
            for(int i = 0; i < options.length; i++){
                System.out.println((i + 1) + ". " + options[i]);
            }
    
            System.out.print("\nPlease select an option (1-5) : ");
            userInput = input.nextInt();
            System.out.print("\n");
    
    
            switch(userInput){
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBal();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option. Please select a valid option (1 - 5)");
    
            }

        }
    }
    public static void createAccount(){
        System.out.println("Created");
    }
    public static void deposit(){
        System.out.println("deposit");
    }
    public static void withdraw(){
        System.out.println("withdraw");
    }
    public static void checkBal(){
        System.out.print("balance");
    }
}