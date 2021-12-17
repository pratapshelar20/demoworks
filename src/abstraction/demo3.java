package abstraction;

public class demo3 extends demo1 {

	@Override
	void start() {
		System.out.println("Starts with the kick");
		
	}
	public static void main(String[] args) {
		demo2 a= new demo2();
		a.start();
		demo3 b =new demo3 ();
		b.start();
	}

}
