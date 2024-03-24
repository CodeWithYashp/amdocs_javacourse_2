import java.util.Random;

public class Random_number {
    public static long generateRandom(){
        Random random = new Random();
        long min = 1000000000L;
        long max = 9999999999L;

        long randomNum = min + ((long) (random.nextDouble() * (max - min + 1)));
        return randomNum;
    }
    public static void main(String[] args){
        long randomNum = generateRandom();
        System.out.println("The number is: " + randomNum);
    }
}
