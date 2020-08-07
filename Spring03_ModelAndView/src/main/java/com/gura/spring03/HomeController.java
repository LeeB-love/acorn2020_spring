package com.gura.spring03;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//Controller 어노테이션 : component scan을 했을 때 HomeController 객체가 생성이 되고 spring 이 관리한다.
//spring 이 관리한다는 의미는 spring bean 컨테이너에서 관리되는 객체가 된다는 의미.
@Controller
public class HomeController {
	// "/home.do"요청이 왔을 때 이 메소드로 요청을 처리하게 된다.

	@RequestMapping("/home")
	public String home(HttpServletRequest request) {

		//공지사항 목록이라고 가정
		List<String> noticeList = new ArrayList<String>();
		noticeList.add("장마철이네요");
		noticeList.add("어쩌구...");
		noticeList.add("저쩌구...");
		
		request.setAttribute("noticeList", noticeList);
		
		//view page로 forward 이동해서 응답하기
		//redirect 이동하면 request 영역에 담은 내용은 삭제된다.
		//리턴하는 문자열은 view 페이지의 위치를 알려주는 것이다.
		//"/WEB-INF/views/"+"home"+".jsp"
		
		return "home";
	}
	
}
