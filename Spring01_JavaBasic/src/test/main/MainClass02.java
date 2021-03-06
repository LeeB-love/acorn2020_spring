package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//init.xml 문서를 로딩해서 Spring 이 생성할 객체는 생성해서 관리하도록 한다.
		ApplicationContext context = new ClassPathXmlApplicationContext("test/main/init.xml");
		
		//관리하고 있는 객체중에서 id가 myWeapon 인 객체의 참조값을 얻어와서 인터페이스 type으로 casting 한다.
		Weapon w=(Weapon)context.getBean("myWeapon");
		//필요한 기능 사용하기
		w.attack();
		
		
		
		//코드는 좀 들었지만, WeaponImpl을 import 하지 않았다. WeaponImpl 클래스에 의존하지 않음.
	}
}
