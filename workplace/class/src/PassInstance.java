class NumberEx {
    int num = 0; // �������(�ν��Ͻ�����)

    public void addNum(int n) {
	num += n;
    }

    public int getNumber() {
	return num;
    }
}

class PassInstance {
    public static void main(String[] args) {
	NumberEx ne = new NumberEx();

	System.out.println("Before Call:" + ne.getNumber());

	simpleMethod(ne);
	System.out.println("After Call:" + ne.getNumber());

    }

    public static void simpleMethod(NumberEx numb) {
	numb.addNum(12);
    }
}
