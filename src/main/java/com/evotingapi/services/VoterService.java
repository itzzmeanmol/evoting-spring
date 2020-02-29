package com.evotingapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.evotingapi.model.Voter;
import com.evotingapi.repository.VoterRepository;

@Service
public class VoterService {
	
	@Autowired
	private VoterRepository voterRepository;
	public Voter saveVoter(Voter voter) {
		return voterRepository.save(voter);
	}
}
