package com.gura.spring03.users;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gura.spring03.UsersDto;

@Controller
public class UsersController {
	
	@RequestMapping("/users/signup_form")
	public String signForm() {
		//수행할 비즈니스 로직은 현재 없다.
		
		//view 페이지의 정보만 리턴해준다.
		return "users/signip_form";  //여기엔 앞에 / 붙이면 안됨
	}
	
	@RequestMapping("/users/signup")
	public String signup(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println(id+ " | "+pwd);
		return "users/signup";
	}
	
	@RequestMapping("/users/signup2")//그냥 해도 되긴하는데 그냥 넣으면 노뜬금이라 RequestParam 붙이기
	public String signup2(@RequestParam String id, @RequestParam String pwd) {
		/*
		* @RequestParam 어노테이션과 함께 메소드의 인자를 선언하면
		* 요청 파라미터가 자동 추출되어서 전달된다.
		* @RequestParam 은 생략가능
		* form 요소의 name 속성의 value와 지역변수의 이름이 같아야한다.
		* name="id" : String id
		* name="pwd" : String pwd
		* 
		* GET방식 파라미터라면 
		* ?name=xxx : String name
		* ?addr=xxx : String addr
		* ?pageNum=xxx : String pageNum
		* ?pageNum=xxx : int pageNum
		*/
		System.out.println(id+" | "+pwd);
		return "users/signup";
	}
	
	@RequestMapping("/users/signup3")//그냥 해도 되긴하는데 그냥 넣으면 노뜬금이라 RequestParam 붙이기
	public String signup3(@ModelAttribute UsersDto dto) {
		/*
		* @ModelAttribute 어노테이션과 함께 dto 를 선언해놓으면
		* 전송된 파라미터가 추출되고 dto에 담겨서 전달된다.
		* @ModelAttribute는 생략가능
		* form 요소의 name 속성의 value와 dto 의 필드명이 같아야한다. 
		*/
		System.out.println(dto.getid()+" | "+dto.getPwd());
		return "users/signup";
	}
	
}
