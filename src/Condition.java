public class Condition {
    public void ifStatement(){
        int age = 18;

        if(age > 18){
            System.out.println("Hi man...");
        }

        if(age < 18){
            System.out.println("Hi kid...");
        }else System.out.println("Hi man...");

        String result = age > 18 ? "Should be date" : "Bye";
    }

    public void switchStatement() {
        String gender = "Male";

        switch (gender) {
            case "Male":
                System.out.println("Hi bro");
                break;
            case y:
                System.out.println("Hi sis");
                break;
            default:
                System.out.println("None");
                break;
        }
    }

    public void whileLoop(){
        int number = 0;

        while (number < 5){
            System.out.println(number);
            number++;
        }

    }

    public void doWhileLoop(){
        int number = 1;

        do {
            System.out.println(number);
            number++;
        }
        while (number==1);
    }

    public void forLoop(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
