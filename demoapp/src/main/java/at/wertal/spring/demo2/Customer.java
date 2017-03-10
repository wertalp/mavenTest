package at.wertal.spring.demo2;

import javax.persistence.Entity;

@Entity
public class Customer {
	

	int id;
	String vorName;
	String nachName;
	int age;
	float monthIncome;
	String city;
	String plz;
	
	
	
	public Customer(int id, String vorName, String nachName, int age, float monthIncome, String city, String plz) {
		super();
		this.id = id;
		this.vorName = vorName;
		this.nachName = nachName;
		this.age = age;
		this.monthIncome = monthIncome;
		this.city = city;
		this.plz = plz;
	}

	public int getId() {
		System.out.println("yeahh test 1");
		System.out.println("yeahh test2");
		return id;
	}

	public void setId(int id) {
		System.out.println();
		this.id = id;
	}

	public String getVorName() {
		
		System.out.println("Finished work on testbranch");
		System.out.println("stage2");
		System.out.println("stage2");
		System.out.println("stage2");
		System.out.println("stage2");
		System.out.println("stage2");
		System.out.println("stage2");
		System.out.println("stage2");
		System.out.println("stage2");
		System.out.println("stage2");
		System.out.println("Test me again");
		return vorName;
	}

	public void setVorName(String vorName) {
		this.vorName = vorName;
	}

	public String getNachName() {
		return nachName;
	}

	public void setNachName(String nachName) {
		this.nachName = nachName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMonthIncome() {
		return monthIncome;
	}

	public void setMonthIncome(float monthIncome) {
		this.monthIncome = monthIncome;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}
	
	

}
