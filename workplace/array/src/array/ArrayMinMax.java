package array;

import java.util.*;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrInt = new int[5];
        
        for (int i = 0; i < arrInt.length; i++) {
            System.out.print("i" + i + ": ");
            arrInt[i] = sc.nextInt();
        }
        
        System.out.println("Min: " + minValue(arrInt));
        System.out.println("Max: " + maxValue(arrInt));
    }
    
    public static int maxValue(int[] arr) {
        int max = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }
        
        return max;
    }
    
    public static int minValue(int[] arr) {
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        
        return min;
    }
}
