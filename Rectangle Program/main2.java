/*  Write a Java program to create a class called Rectangle 
 * with private instance variables length and width. Provide public 
 * getter and setter methods to access and modify these variables. */

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle re1 = new Rectangle();
		re1.setLength(15);
		re1.setWidth(13);
		
		System.out.println("Length : "+re1.getLength());
		System.out.println("Width : "+re1.getWidth());
	}

}
