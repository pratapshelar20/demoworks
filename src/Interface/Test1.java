package Interface;

public  class Test1 implements I1,I2,i3 {

	@Override
	public void display() {
		System.out.println(2);
	}

	@Override
	public void show() {
		System.out.println(1);
		
	}
	public static void main(String[] args) {
		Test1 a= new Test1();
		a.show();
		a.display();
		
		a.run();
	}

	@Override
	public void run() {
	System.out.println(3);
		
		
	}

}
