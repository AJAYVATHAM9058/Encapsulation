/*  Write a Java program to create a class called Person with private 
 * instance variables name, age. and country. Provide public getter and setter methods
 *  to access and modify these variables. */

import java.util.*;
public class main1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Aravind","India",25);
		Person p2 = new Person("Abhiash","Pakisthan",22);
		Person p3 = new Person("Thomas","America",24);
		
		ArrayList<Person> arr =  new ArrayList<Person>();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		
		p1.printPersonDetails();
		p2.printPersonDetails();
		p3.printPersonDetails();
		
		p1.setAge(32);
		System.out.println("The details are ");
		
		for(Person ar: arr) {
			System.out.println(ar.getName()+"  "+ar.getAge()+"  "+ar.getCountry());
		}
		
		
	}

}
