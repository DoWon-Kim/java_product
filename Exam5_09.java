package java_B;

class Exam5_09 {
	public static void main(String[] args) {
		char[][] star = {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		char[][] result = new char[star[0].length][star.length];
		for(int i=0; i < star.length;i++) {		//star 배열 출력
			for(int j=0; j < star[i].length;j++) {
				System.out.print(star[i][j]);
			} System.out.println();
		}
		System.out.println();			//출 띄움
		for(int i=0; i < star.length;i++) {	//
			for(int j=0; j < star[i].length;j++) {
				int a =j;
				int b = star.length-1-i;
				result[a][b]=star[i][j];

			}
		}
		for(int i=0; i < result.length;i++) {
			for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}
}