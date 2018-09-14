class FruitSeller2 {
    int numOfApple;
    int myMoney;
    final int APPLE_PRICE;
    
    public FruitSeller2(int money, int appleNum, int price) {
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

class FruitBuyer2 {
    int myMoney;	// ��� ���� ������ �ݾ�
    int numOfApple;	// ������ ��� ����
    
    public FruitBuyer2(int money) {
	myMoney = money;
	numOfApple = 0;
    }
    
    public void buyApple(FruitSeller2 seller, int money) {
	
	// ��� ����
	numOfApple += seller.saleApple(money);
	
	myMoney -= seller.APPLE_PRICE * numOfApple;
    }
    
    public void showBuyResult() {
	System.out.println("���� ���: " + numOfApple);
	System.out.println("���� �ܾ�: " + myMoney);
    }
}

class FruitSaleMain2 {
    public static void main(String[] args) {
	FruitSeller2 seller1 = new FruitSeller2(0, 30, 1500);
	FruitSeller2 seller2 = new FruitSeller2(0, 20, 1000);
	
	FruitBuyer2 buyer = new FruitBuyer2(10000);
	buyer.buyApple(seller1, 4500);
	buyer.buyApple(seller2, 2000);
	
	System.out.println("�Ǹ���1 ���� ��Ȳ");
	seller1.showSaleResult();
	
	System.out.println("�Ǹ���2 ���� ��Ȳ");
	seller2.showSaleResult();
	
	System.out.println("������ ���� ��Ȳ");
	buyer.showBuyResult();
    }
}
