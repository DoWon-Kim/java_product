package java_A;

public class Exercise3_1 {
	public static void main(String[] args){
		int x= 2;
		int y= 5;
		char c ='A';	//A의 문자 코드는 65
		System.out.println(1 + x << 33); 	
		System.out.println(y >= 5 || x < 0 && x > 2); //true 출력 논리연산자는 앞에 조건 부터 실행함으로 앞에 조건이 만족 하고, 다음 조건에 만족함으로 true가 출력
		System.out.println(y += 10 - x++); //x의 값의 1더하여 10-3을 하면 7을 y의 값고 더하여 12에서 1증가 시켜 결과값은 13
		System.out.println(x+=2); //위에서 x++로 x의 값이 3이여서 2를 더하면 x는 5가 된다.
		System.out.println( !('A' <= c && c <='Z') ); //'A' <= c && c <='Z의 결과에 만족하여 TRUE지만,!으로 false가 출력
		System.out.println('C'-c);	//C의 문자 코드 값은 67인데 c안에 있는 A의 문자코드의 값은 65이다. 67-65를 빼서 결과 값은 2이다.
		System.out.println('5'-'0'); //문자 코드 간의 차이가 5임으로 5가 출력
		System.out.println(c+1);//A의 문자 코드는 65인데 거기에 1을 더하면 66이 출력
		System.out.println(++c);//A의 문자 코드에 1증가 시키면 그다 음 문자인 B가 출력
		System.out.println(c++);//A의 문자 코드를 1증가시키지만 결과 값을 출력 후 증가시킨다.
		System.out.println(c);// A의 문자 코드를 위에서 1증가 시켜 문자코드가 67이 된다. 67은 C가 출력된다.
	}
	
	
}
/*
결과 값
6
true
13
5
false
2
5
66
B
B
C
*/
