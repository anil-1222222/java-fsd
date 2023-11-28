package methods;

class Calculator2{
	int a=50;
	int b=40;
	
	int add() {
		int c=a+b;
		return c;
	}
}

public class MethodCallingType2{
	public static void main(String[] args) {
		Calculator2 calc=new Calculator2();
		int res=calc.add();
		System.out.println(res);
	}

}
