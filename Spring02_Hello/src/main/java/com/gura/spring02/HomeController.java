package com.gura.spring02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//컨트롤러를 만들 때 사용하는 어노테이션
@Controller
public class HomeController {
	//메소드는 상황에 맞게 내가 정의하면 됨
	
	//해당 메소드가 어디에서 들어오는 요청을 처리할지 결정하는 어노테이션
	@RequestMapping("/home.nhn") //.nhn 생략 가능
	public String home() {
		
		//forward 이동될 jsp 페이지의 위치를 리턴해준다
		//"/WEB-INF/views" + "home" + ".jsp" 앞과 뒤는 자동으로 붙어서 중간 home 만 작성해주면 된다.
		return "home";
	}
	
}
