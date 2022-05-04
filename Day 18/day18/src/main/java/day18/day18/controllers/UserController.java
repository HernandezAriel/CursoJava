package day18.day18.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import day18.day18.models.User;
import day18.day18.services.UserService;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public String getAllUsers(Model model){
        model.addAttribute("user", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/create")
    public String showFormUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "create_user";
    }

    @PostMapping("/create")
    public String createUser(@ModelAttribute("user") User user){
        if(user.getId()== 0) userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
	public String updateUser(@PathVariable("id") int id, Model model) {
		User user = userService.getOneUser(id);
		model.addAttribute("user", user);
		return "update_user";
	}
	
	@PostMapping("/update/{id}")
	public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") long id) {
		user.setId(id);
		userService.saveUser(user);
		return "redirect:/";
	}

    
}
