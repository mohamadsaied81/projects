package Instagram.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Instagram.Dto.RegisterDto;

@Controller
public class RegisterController {

	@PostMapping(value="/register")
	public String register_handler(@ModelAttribute RegisterDto registerDto)
	{
		return "home";
	}

	@RequestMapping(value="/register",method=RequestMethod.GET)
public String home_handler()
{
return "register";	
}
}
