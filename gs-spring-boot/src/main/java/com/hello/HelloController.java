package com.hello;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.entity.Person;
import com.hello.utils.PersonRepository;

@RestController
//@Controller
@RequestMapping("/rest/")
public class HelloController {
	
	
	@Autowired
	private PersonRepository personRepository;
	
	 //@RequestMapping(value = "/index", method = RequestMethod.GET)
	@GetMapping("/index")
	public String indexPage() {
		return "Hello this is index page";
	}
	
	@GetMapping("/id/{pid}")
	public ResponseEntity<Person> pid(@PathVariable("pid")long pid) {
		Optional<Person> opt=personRepository.findById((int) pid);
		Person p=null;
		if(opt.isPresent()) {
			p=opt.get();
		}
		return ResponseEntity.ok().body(p);
	}

	private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }
	
}
