package com.evotingapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.evotingapi.model.Candidate;

import com.evotingapi.services.CandidateService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class CandidateController {

	@Autowired
	private CandidateService candidateService;
	
	@PostMapping("/candidate")
	public Candidate candidateSave(@RequestBody Candidate candidate){
		return candidateService.saveCandidate(candidate);
	}
}
