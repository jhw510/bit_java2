package com.jse.game;



public class Calculator {
	private int num1;
	private int num2;
	private int num3;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	
	
	}
		public int getNum1(int num1) {
	return num1;
	}
	public void setNum2(int num2) {
		 this.num2=num2;
	}
		public int getNum2 (int num2) {
			return num2;
		}
	public void  setNum3(int num3) {
		this.num3=num3;
	}
	public int getNum3(int num3) {
		return num3;
	}
	
		public int calculator(int a, int b,int c) {
		int num1 = a;
		int num2 = b;
		int num3 = c;
	

	int d= num1+num2+num3;	
	System.out.println("두 수의 합은?" + d); // 또는 System.out.println("두수의 합은?" + (a + b));  꼭 () 로 묶어줘야한다.
		return d;
		//첫번째 수 입력
		//두번째 수 입력
		//두 수의 합은 ?
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하시오");
		int a = scanner.nextInt(); 
		System.out.println("두번째 수를 입력하시오");
		int b = scanner.nextInt();
		System.out.println("세번째 수를 입력하시오");
		int c = scanner.nextInt();
		System.out.println("네번째 수를 입력하시오");
		int d = scanner.nextInt();
		int e = (a+b+c+d);
		System.out.println("네 수의 합은? " + e); */
		
		
}
}




