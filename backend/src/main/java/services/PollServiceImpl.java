package services;

import org.springframework.beans.factory.annotation.Autowired;

import entity.PollEntity;
import models.PollRequest;
import repository.PollRepository;
import helper.PollHelper;

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
