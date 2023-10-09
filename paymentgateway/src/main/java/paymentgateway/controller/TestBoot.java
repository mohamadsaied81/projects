package paymentgateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestBoot {

	@RequestMapping("/test")
	public String TestMethod() {
		return "Hello said";
	}
}
