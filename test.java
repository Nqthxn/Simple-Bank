import java.util.Random;


public class test {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt((999999 - 100000) + 1) + 100000;
        System.out.println(num);
    }
}
