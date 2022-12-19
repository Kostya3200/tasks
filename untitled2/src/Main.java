import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float friend, score, result;
        System.out.println("number of friends:");
        friend = s.nextFloat();
        {
            if (friend > 0) {
                System.out.println("enter the score");
                score = s.nextFloat();
                if (score > 0) {
                    result = (float) (((score) / friend)*1.1);
                    System.out.println("everyone pays " + result);
                } else {
                    System.out.println("Bill total amount cannot be negative.");
                }
            } else {
                System.out.println("Number of friends cannot be negative or zero");
            }
        }
    }
}