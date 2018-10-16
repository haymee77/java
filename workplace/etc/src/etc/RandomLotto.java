package etc;

import java.util.Arrays;
import java.util.Random;

public class RandomLotto {

    public static void main(String[] args) {
        // 1~45 중 6개의 숫자 출력
        Random rand = new Random();
        int[] list = new int[6];
        
        for (int i = 0; i < 6; i++) {
            list[i] = rand.nextInt(45) + 1;
            
            for (int j = 0; j < i; j++) {
                if (list[j] == list[i]) {
                    i--;                    
                }
            }
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.println(list[i]);
        }
    }
}
