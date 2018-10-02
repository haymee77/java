class BoxBasic2 {
    public void simpleWrap() { System.out.println("simple wrap"); }
    public void wrap() { simpleWrap(); }
    
}

class PaperBox2 extends BoxBasic2 {
    public void paperWrap() { System.out.println("paper wrap"); }
    public void wrap() { paperWrap(); }
}

class GoldBox2 extends PaperBox2 {
    public void goldWrap() { System.out.println("gold wrap"); }
    public void wrap() { goldWrap(); }
}

public class NoInstanceOf {
    public static void main(String[] args) {
        BoxBasic2 box1 = new BoxBasic2();
        PaperBox2 box2 = new PaperBox2();
        GoldBox2 box3 = new GoldBox2();
        
        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }
    
    public static void wrapBox(BoxBasic2 box) {
        box.wrap();
    }
}