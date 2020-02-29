package com.evotingapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evotingapi.model.Voter;
import com.evotingapi.services.VoterService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
//@RequestMapping("/voter")
public class VoterController {
	
	@Autowired
	private VoterService voterService;
	
	@PostMapping("/voter")
	public Voter voterProducts(@RequestBody Voter voter){
		return voterService.saveVoter(voter);
	}
}
