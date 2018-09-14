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
     * 사과판매 메소드, 돈을 받고 사과개수 리턴
     * @param money
     * @return
     */
    public int saleApple(int money) {
	
	System.out.println("사과 가격: " + APPLE_PRICE);
	
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

class FruitBuyer2 {
    int myMoney;	// 사과 구매 가능한 금액
    int numOfApple;	// 구매한 사과 개수
    
    public FruitBuyer2(int money) {
	myMoney = money;
	numOfApple = 0;
    }
    
    public void buyApple(FruitSeller2 seller, int money) {
	
	// 사과 구매
	numOfApple += seller.saleApple(money);
	
	myMoney -= seller.APPLE_PRICE * numOfApple;
    }
    
    public void showBuyResult() {
	System.out.println("보유 사과: " + numOfApple);
	System.out.println("현재 잔액: " + myMoney);
    }
}

class FruitSaleMain2 {
    public static void main(String[] args) {
	FruitSeller2 seller1 = new FruitSeller2(0, 30, 1500);
	FruitSeller2 seller2 = new FruitSeller2(0, 20, 1000);
	
	FruitBuyer2 buyer = new FruitBuyer2(10000);
	buyer.buyApple(seller1, 4500);
	buyer.buyApple(seller2, 2000);
	
	System.out.println("판매자1 현재 상황");
	seller1.showSaleResult();
	
	System.out.println("판매자2 현재 상황");
	seller2.showSaleResult();
	
	System.out.println("구매자 현재 상황");
	buyer.showBuyResult();
    }
}
