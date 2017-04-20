package contacts;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ContactController {
		
	private ContactRepository repos;
	@Autowired
	public ContactController(ContactRepository repos){
		this.repos = repos;
	}
	
	//处理Get “/”
	@RequestMapping(method=RequestMethod.GET)
	public String home(Map<String,Object> map){
		List<Contact> contacts = repos.findAll();
		map.put("contacts", contacts);
		return "home";
	}
	
	//处理Post “/”
	@RequestMapping(method=RequestMethod.POST)
	public String submit(Contact contact){
		repos.save(contact);
		return "redirect:/";
	}
}
