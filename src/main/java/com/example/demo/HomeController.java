package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@Autowired UserRepo repo;

	@RequestMapping("/")
	public String home()
	{
		System.out.println(" home page");
		return "index";
		
	}
	@RequestMapping("putuser")
	public void putUser(User user)
	{
		System.out.println(user.getPassword()+"   "+user.getSid());

		System.out.println(repo.insertdata(user));
		
		
	}
	
	@RequestMapping("findall")
	public void getall()
	{
		List<User> userlist=repo.findAll();
		for(User a:userlist)
		{
			System.out.println(a.getSid()+"    "+a.getPassword());
		}
	}
	
}
