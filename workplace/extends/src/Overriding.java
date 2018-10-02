class Speaker {
    private int volumeRate;
    
    public void showCurrentState() {
        System.out.println("º¼·ý Å©±â : " + volumeRate);
    }
    
    public void setVolume(int vol) {
        volumeRate = vol;
    }    
}

class BaseSpeaker extends Speaker {
    private int baseRate;
    
    public void showCurrentState() {
        super.showCurrentState();
        System.out.println("Base rate: " + baseRate);
    }
    
    public void setBaseRate(int base) {
        baseRate = base;
    }
}

public class Overriding {
    public static void main(String[] args) {
        BaseSpeaker bs = new BaseSpeaker();
        bs.setVolume(10);
        bs.setBaseRate(20);
        bs.showCurrentState();
    }
}
