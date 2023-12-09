import java.util.ArrayList;

public class Person {

	private String name,country;
	private int age;
	
	
	public Person(String name,String country,int age) {
		this.name = name;
		this.age = age;
		this.country = country;
		
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public void printPersonDetails() {
		System.out.println(this.name+"  "+age+"  "+country);
	}
}
