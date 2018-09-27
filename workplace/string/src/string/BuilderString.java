package string;

public class BuilderString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("AB");
        
        sb.append(25);
        sb.append('Y').append(true);
        
        System.out.println(sb);
        
        sb.insert(2, false);
        sb.insert(sb.length(), 'Z');
        
        System.out.println(sb);
    }
}
