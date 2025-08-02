package kr.or.ddit.main.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@Value("${app.front-url}")
    private String frontUrl;

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("frontUrl", frontUrl);
		return "content/main";
	}
}
