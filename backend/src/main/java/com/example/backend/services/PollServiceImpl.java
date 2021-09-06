package com.example.backend.services;

import com.example.backend.core.object.IPollResponse;
import com.example.backend.core.object.WrappedPollResponse;
import com.example.backend.enums.ResultCode;
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
	public WrappedPollResponse createPoll(PollRequest pollRequest) {
		// TODO Auto-generated method stub
		PollEntity pollEntity = pollHelper.convertPollRequestToPollEntity(pollRequest);
		PollEntity pollEntityResponse = pollRepository.save(pollEntity);
		return new WrappedPollResponse<>(pollEntityResponse, ResultCode.SUCCESS);
	}
}
