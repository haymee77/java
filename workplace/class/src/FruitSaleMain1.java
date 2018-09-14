class FruitSeller {
    int numOfApple = 20;	// 보유하고 있는 사과 개수
    int myMoney = 0;		// 매출액
    final int APPLE_PRICE = 1000;	// 사과 가격 - 상수
    
    /**
     * 사과판매 메소드, 돈을 받고 사과개수 리턴
     * @param money
     * @return
     */
    public int saleApple(int money) {
	
	// 구매액에 따른 판매할 사과개수
	int num = money / APPLE_PRICE;
	
	// 보유하고 있는 사과에서 판매된 사과개수 뺌
	numOfApple -= num;	
	
	// 구매금액을 매출액에 추가
	myMoney += money;
	
	// 판매한 사과개수 리턴
	return num;
    }
    
    public void showSaleResult() {
	System.out.println("남은 사과: " + numOfApple);
	System.out.println("판매 수익: " + myMoney);
    }
}

class FruitBuyer {
    int myMoney = 5000;	// 사과 구매 가능한 금액
    int numOfApple = 0;	// 구매한 사과 개수
    
    public void buyApple(FruitSeller seller, int money) {
	
	// 사과 구매
	numOfApple += seller.saleApple(money);
	
	myMoney -= seller.APPLE_PRICE * numOfApple;
    }
    
    public void showBuyResult() {
	System.out.println("보유 사과: " + numOfApple);
	System.out.println("현재 잔액: " + myMoney);
    }
}

class FruitSaleMain1 {
    public static void main(String[] args) {
	FruitSeller seller = new FruitSeller();
	FruitBuyer buyer = new FruitBuyer();
	buyer.buyApple(seller, 2000);
	
	System.out.println("판매자 현재 상황");
	seller.showSaleResult();
	
	System.out.println("구매자 현재 상황");
	buyer.showBuyResult();
    }
}
