package java_A;

public class Exercise3_10 {
	public static void main(String[] args){
		char ch ='A';
		
		char lowerCase = ch>='A'&&ch<='z'?(char)(ch+32):ch;
		
		System.out.println("ch:"+ch); 
		System.out.println("ch to lowerCase:"+lowerCase);

	}
}
