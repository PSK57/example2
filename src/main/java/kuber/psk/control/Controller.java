package kuber.psk.control;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ex2")
public class Controller {

	@GetMapping("/home")
	public String home() {
		return "This is example 2's home page";
	}
}