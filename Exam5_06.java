	package java_B;
	public class Exam5_06 {
		public static void main(String[] args){
			
			int[] coinUnit={500,100,50,10};
			
			int money =2680;
			System.out.println("money="+money);
			
			for(int i=0;i<coinUnit.length;i++){
				System.out.println(coinUnit[i]+"원:"+money/coinUnit[i]);
				money= money%coinUnit[i];	//첫번쨰 동전을 교환하고 남은 나머지 돈의 값을 다시 저장
				
				
			}
			
		}
	}
