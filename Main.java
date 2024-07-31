import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main{
    private static ArrayList<User> people = new ArrayList<>();

    public static void main(String[] args){
        System.out.println("----------[ WELCOME TO SIMPLE BANK ]----------\n");
        displayOptions();

    }


    public static void displayOptions(){
        String[] options = {"Create Account", "Deposit Money", "Withdraw Money", "Check Balance", "Exit"};
        Scanner input = new Scanner(System.in);
        int userInput;

        for(int i = 0; i < options.length; i++){
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("\nPlease select an option (1-5) : ");
        userInput = input.nextInt();
        input.nextLine();
        System.out.print("\n");

        switch(userInput){
            case 1:
                createAccount(input);
                break;
            case 2:
                deposit(input);
                break;
            case 3:
                withdraw(input);
                break;
            case 4:
                checkBal(input);
                break;
            case 5:
                System.out.println("Exiting....");
                input.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Option. Please select a valid option (1 - 5)");
                displayOptions();
                break;
        }
    }


    public static void createAccount(Scanner input){
        System.out.print("Enter your name : ");
        String name = input.nextLine();

        int accountId = randomAccNum();

        User newUser = new User(name, accountId);
        people.add(newUser);

        System.out.println("Account created successfully");
        System.out.println(newUser);
        

        System.out.println("----------------------------------------------");
        System.out.println("\n");
        displayOptions();
    }
    public static void deposit(Scanner input){
        System.out.print("Enter account number : ");
        int accountNum = input.nextInt();
        input.nextLine();

        for(User user : people){
            if(user.getId() == accountNum){
                System.out.println("yes");
            }
        }


        System.out.println("----------------------------------------------");
        System.out.println("\n");
        displayOptions();
    }
    public static void withdraw(Scanner input){
        System.out.println("----------------------------------------------");
        System.out.println("\n");
        displayOptions();
    }
    public static void checkBal(Scanner input){




        System.out.println("----------------------------------------------");
        System.out.println("\n");
        displayOptions();
    }

    public static int randomAccNum(){
        Random rand = new Random();
        return rand.nextInt((999999 - 100000) + 1) + 100000;
    }
}