package com.jdc04.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdc04.Entity.Voter;
import com.jdc04.Service.VoterService;

@Controller
public class VoterController {
	@Autowired
	private VoterService voterService;

	@GetMapping("/")
	public String register(Model model) {
		Voter voter = new Voter();
		model.addAttribute(voter);
		return "register";
	}

	@PostMapping("/RegisterVoter")
	public String RegisterVoter(@ModelAttribute("voter") Voter voter) {
		System.out.println(voter);
		voterService.RegisterVoter(voter);
		return "RegisterVoter";
	}
}
