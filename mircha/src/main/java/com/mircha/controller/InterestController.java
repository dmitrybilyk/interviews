package com.mircha.controller;

import com.mircha.model.Interest;
import com.mircha.service.InterestService;
import com.mircha.spring.model.Person;
import com.mircha.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class InterestController {
	
	private InterestService interestService;
	
	@Autowired(required=true)
//	@Qualifier(value="interestService")
	public void setInterestService(InterestService interestService){
		this.interestService = interestService;
	}

	@RequestMapping(value = "/interests", method = RequestMethod.GET)
	public String goHome(Model model) {
		model.addAttribute("interests", this.interestService.getAllInterests());
		return "interests";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String goEmptyHome(Model model) {
		model.addAttribute("interests", this.interestService.getAllInterests());
		return "interests";
	}


	@ResponseBody
	@RequestMapping(value= "/load/interests", method = RequestMethod.GET, produces = "application/json")
	public List<Interest> loadInterests() {
		return interestService.getAllInterests();
	}

//	@RequestMapping(value = "/persons", method = RequestMethod.GET)
//	public String listPersons(Model model) {
//		model.addAttribute("person", new Person());
//		model.addAttribute("listPersons", this.personService.listPersons());
//		return "person";
//	}
	
	//For add and update person both

	@ResponseBody
	@RequestMapping(value= "/add/interest", method = RequestMethod.POST
					, consumes = "application/json", produces = "application/json")
	public List<Interest> addInterest(@RequestBody Interest interest) {
		interestService.addInterest(interest);
		return interestService.getAllInterests();
	}

	@ResponseBody
	@RequestMapping(value= "/delete/interest", method = RequestMethod.DELETE
					, consumes = "application/json", produces = "application/json")
	public List<Interest> deleteInterest(@RequestBody Interest interest) {
		interestService.deleteInterest(interest);
		return interestService.getAllInterests();
	}

	@ResponseBody
	@RequestMapping(value= "/update/interest", method = RequestMethod.PUT
					, consumes = "application/json", produces = "application/json")
	public List<Interest> updateInterest(@RequestBody Interest interest) {
		interestService.updateInterest(interest);
		return interestService.getAllInterests();
	}
//
//		return "redirect:/mvc/persons";
//
//	}
	
//	@RequestMapping("/remove/{id}")
//    public String removePerson(@PathVariable("id") int id){
//
//        this.personService.removePerson(id);
//        return "redirect:/persons";
//    }
//
//    @RequestMapping("/edit/{id}")
//    public String editPerson(@PathVariable("id") int id, Model model){
//        model.addAttribute("person", this.personService.getPersonById(id));
//        model.addAttribute("listPersons", this.personService.listPersons());
//        return "person";
//    }
//
}
