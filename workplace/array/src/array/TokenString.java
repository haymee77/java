package array;

import java.util.StringTokenizer;

public class TokenString {
    public static void main(String[] args) {
        String str = "11:22:33:44:55";
        StringTokenizer st = new StringTokenizer(str, ":");
        
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }        
        
        String[] arr = str.split(":");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
