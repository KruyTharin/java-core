import java.util.Scanner;

public class Example {
    public void temp(){
        String x = "water";
        String y = "milk";
        String temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("Value x: "+x + " Value y :"+y);
    }

    public void scanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = scanner.nextLine();

        System.out.println("My name is:"+ name);
    }
}
