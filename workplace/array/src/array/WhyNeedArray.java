package array;

import java.util.Scanner;

public class WhyNeedArray {
    public static void main(String[] args) {
        int fstScore = 0;
        int sndScore = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Score 1: ");
        int score1 = sc.nextInt();
        
        if (score1 >= fstScore) {
            sndScore = fstScore;
            fstScore = score1;
        } else if (score1 < fstScore && score1 > sndScore) {
            sndScore = score1;
        }
        
        System.out.print("Score 2: ");
        int score2 = sc.nextInt();
        
        if (score2 >= fstScore) {
            sndScore = fstScore;
            fstScore = score2;
        } else if (score2 < fstScore && score2 > sndScore) {
            sndScore = score2;
        }
        
        System.out.print("Score 3: ");
        int score3 = sc.nextInt();
        
        if (score3 >= fstScore) {
            sndScore = fstScore;
            fstScore = score3;
        } else if (score3 < fstScore && score3 > sndScore) {
            sndScore = score3;
        }
        
        System.out.printf("A학점은 %d점 이상입니다.", sndScore);
    }
}
