package java_A;

public class Exercise4_10 {
	public static void main(String[] args){
		int num = 12345;
		int sum = 0;
		
		while(num>0){
			sum+=num%10;	// num의 첫째자리를 sum에 더하여 저장한다.
			num/=10; //num을 10으로 나눈다.
		}
		System.out.println("sum="+sum);
	}
}
