package methods;

class Calculator1{
	int a=50;
	int b=40;
	
	void add() {
		int c=a+b;
		System.out.println(c);
	}
}

public class MethodCallingType1 {
	public static void main(String[] args) {
		Calculator1 calc=new Calculator1();
		calc.add();
	}

}
