package StringBufferandBuilder;

public class Buffer {

	public static void main(String[] args) {
		StringBuilder b=new StringBuilder("hello Ram");
		b.capacity();
	b.delete(3,7 );
	b.replace(2, 4, "full to dhamal");
		b.insert(1, "redon");
		b.append(" How are you");
		System.out.println(b.capacity());
		System.out.println(b.length());
		System.out.println(b.delete(4, 6));
		System.out.println(b.insert(2, "how many students in the class"));
		
System.out.println(b.append(" Java is coding language"));
		System.out.println(b.reverse());
		System.out.println(b.delete(0, 10));
	}

}
