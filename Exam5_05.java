package java_B;

public class Exam5_05 {
	public static void main(String[] args){
		int[] ballArr ={1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int x=0;x<20;x++){
			int i =(int)(Math.random()*ballArr.length);
			int j=(int)(Math.random()*ballArr.length);
			int tmp= 0;
			
			tmp=ballArr[i];			//������ �ڸ� ������ �̿��Ͽ� ballArr �迭 �ڸ��� �ٲ�
			ballArr[i]=ballArr[j];
			ballArr[j]=tmp;
			
			
		}
		System.arraycopy(ballArr, 0, ball3, 0, 3);	//ballArr�迭�� ���� 3�ڸ��� ���� ball3�� ����
		
			for(int k=0;k<ball3.length;k++){
				System.out.print(ball3[k]);
			}
		
	}
}