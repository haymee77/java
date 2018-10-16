package etc;

import java.util.Random;

public class RandomNumberGenerator {
    
    public static void main(String[] args) {
        Random rand = new Random();
        
        System.out.print(rand.nextInt(100));
    }    
}
