class FruitSeller5 {
    private int numOfApple;
    private int myMoney;
    final int APPLE_PRICE;
    
    public FruitSeller5(int money, int appleNum, int price) {
	System.out.println("init price: " + price);
	myMoney = money;
	numOfApple = appleNum;
	APPLE_PRICE = price;
    }
    
    /**
     * ����Ǹ� �޼ҵ�, ���� �ް� ������� ����
     * @param money
     * @return
     */
    public int saleApple(int money) {
	
	System.out.println("��� ����: " + APPLE_PRICE);
	
	// ���ž׿� ���� �Ǹ��� �������
	int num = money / APPLE_PRICE;
	
	// �����ϰ� �ִ� ������� �Ǹŵ� ������� ��
	numOfApple -= num;	
	
	// ���űݾ��� ����׿� �߰�
	myMoney += money;
	
	// �Ǹ��� ������� ����
	return num;
    }
    
    public void showSaleResult() {
	System.out.println("���� ���: " + numOfApple);
	System.out.println("�Ǹ� ����: " + myMoney);
    }
}

class FruitBuyer5 {
    private int myMoney;	// ��� ���� ������ �ݾ�
    private int numOfApple;	// ������ ��� ����
    
    public FruitBuyer5(int money) {
	myMoney = money;
	numOfApple = 0;
    }
    
    public void buyApple(FruitSeller5 seller, int money) {
	
	// ��� ����
	numOfApple += seller.saleApple(money);
	
	myMoney -= seller.APPLE_PRICE * numOfApple;
    }
    
    public void showBuyResult() {
	System.out.println("���� ���: " + numOfApple);
	System.out.println("���� �ܾ�: " + myMoney);
    }
}

class FruitSaleMain5 {
    public static void main(String[] args) {
	FruitSeller5 seller1 = new FruitSeller5(0, 30, 1500);
	FruitBuyer5 buyer = new FruitBuyer5(10000);
	
	buyer.buyApple(seller1, 4500);
	
	System.out.println("�Ǹ���1 ���� ��Ȳ");
	seller1.showSaleResult();
	
	System.out.println("������ ���� ��Ȳ");
	buyer.showBuyResult();
    }
}
