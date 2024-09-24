import java.util.Random;

public class RandomOpt {
    public void random(){
        Random random = new Random();
//        double y = random.nextDouble(); between 0-1
//        boolean z = random.nextBoolean(); true or false
        // random number will be between 1-6
        int x = random.nextInt(6)+1;

        System.out.println(x);
    }
}
