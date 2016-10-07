package java_B;

public class Exam5_04 {
	public static void main(String[] args){
	int[] [] arr={
			{5,5,5,5,5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
	};
	
	int total = 0;
	float average =0;
	
	for(int i=0;i<arr.length;i++){		//total ±¸ÇÏ±â
		for(int j=0;j<arr[i].length;j++){
			total+=arr[i][j];
		}
	}
		average =total/(float)(arr.length*arr[0].length);//Æò±Õ 

	System.out.println("total="+total);
	System.out.println("average="+average);
	}
}
