package com.gura.spring02;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //controller 역할 시키려면 이거 붙여야함
public class FortuneController {
	
	/*
	 * HttpServletRequest or HttpServletResponse or HttpSession
	 * 객체가 필요하면 메소드 인자에 선언해 놓으면 자동으로 실행시점에 참조값이 전달된다.
	 */
	
	@RequestMapping("/fortune")
	public String fortune(HttpServletRequest request) {
		//1. 오늘의 운세를 얻어오는 비즈니스 로직을 처리한다.
		String fortuneToday = "동쪽으로 가면 귀인을 만나요";
		//2. 로직 처리결과 데이터(model)을 request 영역에 담는다. 리퀘스트 필요하면 선언하면 그만~
		request.setAttribute("fortuneToday", fortuneToday);
		//3. view 페이지(jsp) 페이지로 forward 이동해서 응답한다.
		return "fortune";  //WEB-INF/views/fortune.jsp 로 이동시키겠다는 의미
	}
}
// 어노테이션 붙여놓으면 스프링이 가져가서 맘대로 사용한다.