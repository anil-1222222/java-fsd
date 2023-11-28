package methods;

class Calculator4{
	int add(int a,int b) {
		int c=a+b;
		return c;
	}
}

public class MethodCallingType4{
	public static void main(String[] args) {
		Calculator4 calc=new Calculator4();
		int a=50;
		int b=40;
		int res=calc.add(a,b);
		System.out.println(res);
		
	}

}
