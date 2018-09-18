class InstCnt {
    static int instNum = 0;
    int i = 0;
    
    public InstCnt() {
	instNum++;
	i++;
	System.out.println("create Instance: " + instNum + ", i: " + i);
    }
}
public class ClassVar {
    public static void main(String[] args) {
	InstCnt cnt1 = new InstCnt();
	InstCnt cnt2 = new InstCnt();
	InstCnt cnt3 = new InstCnt();
    }
}
