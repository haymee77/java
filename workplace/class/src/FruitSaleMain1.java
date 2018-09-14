class FruitSeller {
    int numOfApple = 20;	// �����ϰ� �ִ� ��� ����
    int myMoney = 0;		// �����
    final int APPLE_PRICE = 1000;	// ��� ���� - ���
    
    /**
     * ����Ǹ� �޼ҵ�, ���� �ް� ������� ����
     * @param money
     * @return
     */
    public int saleApple(int money) {
	
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

class FruitBuyer {
    int myMoney = 5000;	// ��� ���� ������ �ݾ�
    int numOfApple = 0;	// ������ ��� ����
    
    public void buyApple(FruitSeller seller, int money) {
	
	// ��� ����
	numOfApple += seller.saleApple(money);
	
	myMoney -= seller.APPLE_PRICE * numOfApple;
    }
    
    public void showBuyResult() {
	System.out.println("���� ���: " + numOfApple);
	System.out.println("���� �ܾ�: " + myMoney);
    }
}

class FruitSaleMain1 {
    public static void main(String[] args) {
	FruitSeller seller = new FruitSeller();
	FruitBuyer buyer = new FruitBuyer();
	buyer.buyApple(seller, 2000);
	
	System.out.println("�Ǹ��� ���� ��Ȳ");
	seller.showSaleResult();
	
	System.out.println("������ ���� ��Ȳ");
	buyer.showBuyResult();
    }
}
