package methods;

class Calculator3{
	void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
}

public class MethodCallingType3{
	public static void main(String[] args) {
		Calculator3 calc=new Calculator3();
		int a=50;
		int b=40;
		calc.add(a,b);
		
	}

}
