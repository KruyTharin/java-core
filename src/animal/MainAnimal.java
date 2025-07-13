package animal;

import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Would you like the Dog or Cat: ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }

    }
}
