package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo{

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		zoo.tiger();
		zoo.giraffe(); //--ERROR. 부모(Zoo)만 메모리에 생성, 자식클래스에 누가있는지 모름
		zoo.elephant();
		zoo.lion();
		
		Safari safari = new Safari();
		safari.tiger();
		safari.giraffe();
		zoo.elephant();
		zoo.lion();

	}

}
