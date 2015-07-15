package dzirom_at_gmail_com.dbrman;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String test(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("testvalue", name);
 
		//return to jsp page, configured in mvc-dispatcher-servlet.xml, view resolver
		return "list";
 
	}
}
