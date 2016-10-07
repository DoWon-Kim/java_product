package java_A;
import java.util.*;
public class Exercise4_08 {
	public static void main(String[] args){
		int x=0;
		int y=0;
		Scanner scanner = new Scanner(System.in);
		x=scanner.nextInt();

		y=(10-(2*x))/4;
		if(0<=x&&x<=10&&y<=10&&0<=y){
		System.out.println("x="+x+",y="+y);
		}
		else{
			System.out.println("범위 초과");
		}
		}
}
