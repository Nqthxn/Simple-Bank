import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String[] options = {"Create Account", "Deposit Money", "Withdraw Money", "Check Balance", "Exit"};
        Scanner input = new Scanner(System.in);
        int userInput;


        System.out.println("----------[ WELCOME TO SIMPLE BANK ]----------\n");
        for(int i = 0; i < options.length; i++){
            System.out.println((i + 1) + ". " + options[i]);
        }

        System.out.print("\nPlease select an option (1-5) : ");
        userInput = input.nextInt();

    }
}