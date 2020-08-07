package com.gura.spring02;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FriendsController {

	@RequestMapping("/friends")
	public String friend(HttpServletRequest request) {
		List<String> list = new ArrayList<String>();
		list.add("돼지");
		list.add("소");
		list.add("닭");
		list.add("양");
		//request 영역에 담아놓고 (요청처리 완료)
		request.setAttribute("friendsList", list);
		//결과를 출력할 view의 이름을 리턴
		return "friends";
	}
}
