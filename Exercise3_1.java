package java_A;

public class Exercise3_1 {
	public static void main(String[] args){
		int x= 2;
		int y= 5;
		char c ='A';	//A�� ���� �ڵ�� 65
		System.out.println(1 + x << 33); 	
		System.out.println(y >= 5 || x < 0 && x > 2); //true ��� �������ڴ� �տ� ���� ���� ���������� �տ� ������ ���� �ϰ�, ���� ���ǿ� ���������� true�� ���
		System.out.println(y += 10 - x++); //x�� ���� 1���Ͽ� 10-3�� �ϸ� 7�� y�� ���� ���Ͽ� 12���� 1���� ���� ������� 13
		System.out.println(x+=2); //������ x++�� x�� ���� 3�̿��� 2�� ���ϸ� x�� 5�� �ȴ�.
		System.out.println( !('A' <= c && c <='Z') ); //'A' <= c && c <='Z�� ����� �����Ͽ� TRUE����,!���� false�� ���
		System.out.println('C'-c);	//C�� ���� �ڵ� ���� 67�ε� c�ȿ� �ִ� A�� �����ڵ��� ���� 65�̴�. 67-65�� ���� ��� ���� 2�̴�.
		System.out.println('5'-'0'); //���� �ڵ� ���� ���̰� 5������ 5�� ���
		System.out.println(c+1);//A�� ���� �ڵ�� 65�ε� �ű⿡ 1�� ���ϸ� 66�� ���
		System.out.println(++c);//A�� ���� �ڵ忡 1���� ��Ű�� �״� �� ������ B�� ���
		System.out.println(c++);//A�� ���� �ڵ带 1������Ű���� ��� ���� ��� �� ������Ų��.
		System.out.println(c);// A�� ���� �ڵ带 ������ 1���� ���� �����ڵ尡 67�� �ȴ�. 67�� C�� ��µȴ�.
	}
	
	
}
/*
��� ��
6
true
13
5
false
2
5
66
B
B
C
*/
