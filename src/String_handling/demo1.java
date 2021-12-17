package String_handling;

public class demo1 {

	public static void main(String[] args) {
		
		String mytool = "Selenium";
		String mytools[] = {"UFT","Selenium","RFT"};
		System.out.println(mytool);//Selenium
		for(String tools:mytools) {
		System.out.println(tools);
		}}
	//}//3)Using compareTo() method
	public static void main2(String[] args) {
	String str1 = "SELENIUM";
	String str2 = "Selenium";
	String str3 = "SELENIUM";
	String str4 = "ZSelenium";
	 System.out.println(str1==str3); //true
	System.out.println(str1==str2); //false
	System.out.println(str1==str4);//false
	 System.out.println(str1!=str4);//true
	}

//public static void main1(String[] args) {
	public void chaeAt() {
		String str1 = "Selenium";
		System.out.println(str1.charAt(3));//e
}
		
		
public void equalIgnoreCase() {
	String str1 = "Selenium";
	String str2 = "SELENIUM";
	System.out.println(str1.equalsIgnoreCase(str2));//true
}

//public static void main3(String[] args) {
	
// }
//length()
public static void main5(String[] args) {
	String str1 = "Selenium";
	System.out.println(str1.length());//8
	}
//endsWith()
public static void main6(String[] args) {
	String str1 = "Welcome to the Selenium Testing";
	System.out.println(str1.endsWith(" to the Selenium Testing"));//true

	
}
//subString()
public static void main7(String[] args) {
	String str1 = "Welcome to the Selenium Testing";
	System.out.println(str1.substring(2));//lcome to the Selenium Testing
}
//trim()
public static void main8(String[] args) {
	String str1 = " Selenium ";
	System.out.println(str1.trim());//Selenium
}
//toLowercase()
public static void main9(String[] args) {
	String str1 = "SELENIUM";
	System.out.println(str1.toLowerCase());//selenium
}
//toUppercase()
public static void main10(String[] args) {
	String str1 = "selenium";
	System.out.println(str1.toUpperCase());//SELENIUM

}
//equalIgnoreCase()
public static void main11(String[] args) {
	String str1 = "Selenium";
	String str2 = "SELENIUM";
	System.out.println(str1.equalsIgnoreCase(str2));//true
}
//charAt()
public static void main12(String[] args) {
	String str1 = "Selenium";
	System.out.println(str1.charAt(3));//e
}
//concats()
public static void main13(String[] args) {
	String str1 = "Selenium";
	String str2 = "Testing";
	System.out.println(str1.concat(str2));//SeleniumTesting
}
//2)Using equals() method
public static void main14(String[] args) {
	String str1 = "SELENIUM";
	String str2 = "Selenium";
	String str3 = "SELENIUM";
	String str4 = "ZSelenium";
	 System.out.println(str1.equals(str2));//false
	 System.out.println(str1.equals(str3));//true

	
}
//1)String +String = Concatenation
public static void main15(String[] args) {
	String str1 = "Selenium";
	String str2 = "Testing";
	System.out.println(str1+str2);//SeleniumTesting
}
}
