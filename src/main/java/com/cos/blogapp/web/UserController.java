	package com.cos.blogapp.web;
	
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;

import com.cos.blogapp.domain.user.User;
import com.cos.blogapp.domain.user.UserRepository;
	import com.cos.blogapp.web.dto.LoginReqDto;
	
	@Controller
	public class UserController {
		
		private UserRepository userRepository;
	
		//DI
		 public UserController(UserRepository userRepository) {
			 this.userRepository = userRepository;
		 }
		 
		 
		@GetMapping("/test/join")
		public void testJoin() {
			User user = new User();
			user.setUsername("ssar");
			user.setPassword("1234");
			user.setEmail("ssar@nate.com");
			
			
			// insert into user ( Username, password, email) values('saar', '1234' , 'ssar@nate.com');
			userRepository.save(user);
		}
		
		
		
		@GetMapping("/home")
		public String home() {
			return "home";
		}
		
		//http://localhost:8080/login -> login.jsp
		//views/user/login.jsp
		
		// /WEB-INF/views/user/login.jsp/
		@GetMapping("/loginForm")
		public String login() {
			return"user/loginForm";
		}
		
		@GetMapping("joinForm")
		public String join() {
			return "user/joinForm";
		}
		
		@PostMapping("/login")
		public String login(LoginReqDto dto) {
			
			
			
			// 1. username, password 받기
		    System.out.println(dto.getUsername());
			System.out.println(dto.getPassword());
			// 2. DB -> 조회
			// 3. 있으면 
			// 4. session에 저장  
			// 5. 메인페이지를 돌려주기 
			return "home";
		}
	}
