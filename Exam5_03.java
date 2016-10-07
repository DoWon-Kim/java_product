package java_B;

public class Exam5_03 {
	public static void main(String[] args){
		int[] arr={10,20,30,40,50};
		int sum = 0;
		
		for(int i =0;i<arr.length;i++){		//i가 0부터 arr길이보다 적게 i++한다.
			sum+=arr[i];				//arr배열 0부터 끝까지 sum의 더하여 저장한다.
		}
		
		System.out.println("sum="+sum);
	}
}
