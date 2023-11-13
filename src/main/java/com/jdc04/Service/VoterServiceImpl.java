package com.jdc04.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc04.Entity.Voter;
import com.jdc04.Repo.VoterRepository;
@Service
public class VoterServiceImpl implements VoterService {

	@Autowired
	private VoterRepository voterRepository;

	@Override
	public void RegisterVoter(Voter voter) {

		voterRepository.save(voter);
	}

}
