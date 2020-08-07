package com.gura.spring03;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FriendsController {
	//비즈니스 로직 수행 결과 모델
	@RequestMapping("/friends")
	public String friedns(HttpServletRequest request) {
		
		List<String> list = new ArrayList<String>();
		list.add("김구라");
		list.add("해골");
		list.add("원숭이");
		
		//view 페이지에 전달할 모델을 request 영역에 담는다.
		request.setAttribute("list", list);
		
		return "friends";
	}
	
	@RequestMapping("/friends2")
	public ModelAndView friends2() {
		
		List<String> list = new ArrayList<String>();
		list.add("김구라");
		list.add("해골");
		list.add("원숭이");
		
		//Model 과 view 페이지 정보를 함  께 담을 수 있는 ModelAndView 객체 생성
		ModelAndView mView = new ModelAndView();
		//request 영역에 담을 내용을 .addObject() 메소드를 이용해서담는다.
		mView.addObject("list", list); //모델도 담을 수 있고
		//view 페이지 정보를 .setViewName() 메소드를 이요해서 전달한다.
		mView.setViewName("friends"); //뷰페이지 정보도 담을 수 있다.
		
		//Model 과 view 페이지 정보를 모두 가지고 있는 ModelAndView 객체를 리턴한다.
		return mView;
	}
	
	
	// ModelAndView 객체가 필요하면 메소드의 인자로 선언하면 객체의 참조값이 전달된다.
	@RequestMapping("/friends3")
	public ModelAndView friends3(ModelAndView mView) { 
		
		List<String> list = new ArrayList<String>();
		list.add("김구라");
		list.add("해골");
		list.add("원숭이");
		
		//request 영역에 담을 내용을 .addObject() 메소드를 이용해서담는다.
		mView.addObject("list", list); //모델도 담을 수 있고
		//view 페이지 정보를 .setViewName() 메소드를 이요해서 전달한다.
		mView.setViewName("friends"); //뷰페이지 정보도 담을 수 있다.
		
		//Model 과 view 페이지 정보를 모두 가지고 있는 ModelAndView 객체를 리턴한다.
		return mView;
	}
	
	@RequestMapping("/delete")
	public String delete() {
		//가상의 삭제 비즈니스 로직 수행
		System.out.println("친구 정보를 삭제합니다.");
		//삭제 후 친구 목록 보기로 리다이렉트 이동 (redirect: 붙이기)
		return "redirect:/friends.do";
	}
	
	@RequestMapping("/delete2")
	public ModelAndView delete2(ModelAndView mView) {
		//가상의 삭제 비즈니스 로직 수행
		System.out.println("친구 정보를 삭제합니다.");
		//ModelAndView 객체에 리다이렉트 이동 정보를 담아서
		mView.setViewName("redirect:/friends.do");
		return mView;
	}
}
