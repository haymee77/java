package exception;

import java.util.*;

class ExceptionHandleTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];

        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("������ ���� �� : ");
                int num1 = sc.nextInt();

                System.out.print("������ �� : ");
                int num2 = sc.nextInt();

                System.out.print("�������� ������ �迭�� �ε��� ��ȣ : ");
                int idx = sc.nextInt();

                arr[idx] = num1 / num2;
                System.out.println("������ ����� " + arr[idx]);
                System.out.println("����� ��ġ�� �ε����� " + idx);
            } catch (ArithmeticException e) {
                System.out.println("������ ���� 0�� �� �� �����ϴ�.");
                i -= 1;
                continue;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("��ȿ���� ���� �ε����Դϴ�.");
                i -= 1;
                continue;
            } catch (Exception e) {
                System.out.println("���ܰ� �߻��߽��ϴ�.");
                i -= 1;
                continue;
            }
        }
    }
}
