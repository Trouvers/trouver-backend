package helper;

import org.springframework.stereotype.Component;

import entity.PollEntity;
import models.PollRequest;

@Component
public class pollHelper {
	
	public PollEntity convertPollRequestToPollEntity(PollRequest pollRequest) {
		PollEntity pollEntity = new PollEntity();
		pollEntity.setQuestion(pollRequest.getQuestion());
		pollEntity.setOptions(pollRequest.getOptions());
		return pollEntity;
		
	}

}
