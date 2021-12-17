package polymorphism;

public class demo1 {
void show() {
	System.out.println('1');
}
void show(char b) {
	System.out.println('2');
}
void show(int a) {
	System.out.println('3');
}
void show(int a,char b) {
	System.out.println('4');
}
public static void main(String[] args) {
	demo1 d= new demo1();
	d.show();
	d.show('t');
	d.show(5);
	d.show(7,'g');
}
}



