package java_B;

public class Exam5_03 {
	public static void main(String[] args){
		int[] arr={10,20,30,40,50};
		int sum = 0;
		
		for(int i =0;i<arr.length;i++){		//i�� 0���� arr���̺��� ���� i++�Ѵ�.
			sum+=arr[i];				//arr�迭 0���� ������ sum�� ���Ͽ� �����Ѵ�.
		}
		
		System.out.println("sum="+sum);
	}
}
