package com.example.backend.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.backend.entity.PollEntity;
import com.example.backend.models.PollRequest;
import com.example.backend.repository.PollRepository;
import com.example.backend.helper.PollHelper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PollServiceImpl implements PollService{

	@Autowired
	private PollHelper pollHelper;
	
	@Autowired
	private PollRepository pollRepository;
	
	@Override
	public PollEntity createPoll(PollRequest pollRequest) {
		// TODO Auto-generated method stub
		PollEntity pollEntity = pollHelper.convertPollRequestToPollEntity(pollRequest);
		return pollRepository.save(pollEntity);
	}
}
