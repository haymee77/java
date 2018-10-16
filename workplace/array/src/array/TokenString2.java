package array;

import java.util.StringTokenizer;

public class TokenString2 {
    public static void main(String[] args) {
        String str = "1+2-3*4/5-4*5-6+7";
        StringTokenizer st1 = new StringTokenizer(str, "+-*/");
        
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }        
        
        str = "abc def ghi jkl mno";
        StringTokenizer st2 = new StringTokenizer(str);
        
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
        
        str = "ab:def;ghi=jkl";
        StringTokenizer st3 = new StringTokenizer(str, ":;=", true);
        
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
    }
}
