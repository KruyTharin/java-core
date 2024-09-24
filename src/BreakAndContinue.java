public class BreakAndContinue {
    public void breakOpt(){
//        This example stops the loop when i is equal to 4
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }

    public void continueOpt(){
//        This example skips the value of 4
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
