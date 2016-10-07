package java_A;

public class Exercise3_7 {

	public static void main(String[] args) {
		int fahrenheit =100;
		float celcius=(float)((int)(((float)5/9*((float)fahrenheit-32)+(float)0.005)*100))/100;
		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}

}
/*결과 화면
Fahrenheit:100
Celcius:37.78
*/