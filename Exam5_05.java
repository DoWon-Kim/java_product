package java_B;

public class Exam5_05 {
	public static void main(String[] args){
		int[] ballArr ={1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int x=0;x<20;x++){
			int i =(int)(Math.random()*ballArr.length);
			int j=(int)(Math.random()*ballArr.length);
			int tmp= 0;
			
			tmp=ballArr[i];			//변수의 자리 빠굼을 이용하여 ballArr 배열 자리를 바꿈
			ballArr[i]=ballArr[j];
			ballArr[j]=tmp;
			
			
		}
		System.arraycopy(ballArr, 0, ball3, 0, 3);	//ballArr배열의 앞의 3자리의 값을 ball3의 저장
		
			for(int k=0;k<ball3.length;k++){
				System.out.print(ball3[k]);
			}
		
	}
}
