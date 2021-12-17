package polymorphism;

public class od2 extends od1 {
	public void show() {
		System.out.println("564");
		
	}
public static void main(String[] args) {
	od2 a=new od2();
	a.show();
	od1 b= new od1();
	b.show();
}
}
