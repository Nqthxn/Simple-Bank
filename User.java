public class User{
    private String name;
    private float bal;
    private int id;


    //Constructor
    public User(String name, int id){
        this.name = name;
        this.bal = 0.0f;
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public float getBal(){
        return bal;
    }
    public String toString(){
        return "Your account number is : " + id;
    }
    public void deposit(float amount){
        this.bal += amount;
    }
    public void newBal(){
        System.out.println("New balance : $" + String.format("%.2f", bal));
    }
    public void currBal(){
        System.out.println("Current Balance : $" + String.format("%.2f", bal));
    }
    public void withdraw(float amount){
        this.bal -= amount;
        System.out.println("Withdrawal Successful!");
        newBal();
    }
}