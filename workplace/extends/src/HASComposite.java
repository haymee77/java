class Gun2 {
    int bullet;
    
    public Gun2(int bnum) {
        bullet = bnum;
    }
    
    public void shot() {
        System.out.println("BBANG!!");
        bullet--;
    }
}

class Police2 {
    int handcuffs;
    Gun2 pistol;
    
    public Police2(int bnum, int bcuff) {
        handcuffs = bcuff;
        
        if (bnum != 0) {
            pistol = new Gun2(bnum);
        } else {
            pistol = null;
        }
    }
    
    public void putHandCuff() {
        System.out.println("SANP!");
        handcuffs--;
    }
    
    public void shot() {
        if (pistol == null) {
            System.out.println("No Gus!");
        } else {
            pistol.shot();
        }
    }
}

public class HASComposite {
    public static void main(String[] args) {
        Police2 haveGun = new Police2(5, 3);
        Police2 noGun = new Police2(0, 3);
        
        haveGun.shot();
        haveGun.putHandCuff();
        
        noGun.shot();
        noGun.putHandCuff();
    }
}
