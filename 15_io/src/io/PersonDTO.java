/* 1/14 (화) 5-2 */
package io;

import java.io.Serializable;

public class PersonDTO implements Serializable{ //Serializable는 추상메소드가 없음, Serializable해주면 알아서 직렬화
	private String name;
	private int age;
	private double height;
	
	public PersonDTO(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}

}
