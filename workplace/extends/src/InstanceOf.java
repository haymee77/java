class BoxBasic {
    public void simpleWrap() { System.out.println("simple wrap"); }
}

class PaperBox extends BoxBasic {
    public void paperWrap() { System.out.println("paper wrap"); }
}

class GoldBox extends PaperBox {
    public void goldWrap() { System.out.println("gold wrap"); }
}

public class InstanceOf {
    public static void main(String[] args) {
        BoxBasic box1 = new BoxBasic();
        PaperBox box2 = new PaperBox();
        GoldBox box3 = new GoldBox();
        
        wrapBox(box1);
        wrapBox(box2);
        wrapBox(box3);
    }
    
    public static void wrapBox(Object box) {
        if (box instanceof GoldBox) {
            ((GoldBox)box).goldWrap();
        } else if (box instanceof PaperBox) {
            ((PaperBox)box).paperWrap();
        } else if (box instanceof BoxBasic) {
            ((BoxBasic)box).simpleWrap();
        }
    }
}
