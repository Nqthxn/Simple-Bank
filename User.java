public class User{
    private String name;
    private double bal;
    private int id;


    //Constructor
    public User(String name, int id){
        this.name = name;
        this.bal = 0.0;
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public double getBal(){
        return bal;
    }
    public String toString(){
        return "Your account number is : " + id;
    }
}