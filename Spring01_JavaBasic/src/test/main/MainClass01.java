package test.main;

import test.mypac.Weapon;
import test.mypac.WeaponImpl;

public class MainClass01 {
	public static void main(String[] args) {
		//Application의 목적이 무언가를 공격하는게 목적이라면?
		
		//1. 목적을 당성하기 위해 필요한 핵심 의존 객체를 직접 생성해서 
		Weapon w = new WeaponImpl();
		
		//2. 메소드를 호출해서 목적을 달성한다.
		w.attack();
		
		/*
		 * 지금까지의 방법 : 객체 new해서 객체 생성한 뒤 객체에 속해있는 메소드를 불러온다.
		 * 자바의 클래스들 끼리 의존관계 - (Weapon과 WeaponImpl과 같이)
		 * 만약 의존관계가 복잡하다면? 하나 수정하면 의존관계에 있는 모든 class를 전부 수정해야한다 유지보수 극혐!
		 * 
		 * 그래서 의존관계를 느슨하게 해야함
		 * -인터페이스를 적극활용하고 필요한 핵심객체를 직접 생성하지 않는 것.
		 * 이런 부분을 해결해주는 라이브러리가 스프링프레임워크
		 */
		
	}
}
