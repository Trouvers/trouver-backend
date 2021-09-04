package helper;

import java.sql.Timestamp;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import entity.PollEntity;
import entity.User;
import models.PollRequest;
import services.UserServiceImpl;

@Component
public class PollHelper {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	public PollEntity convertPollRequestToPollEntity(PollRequest pollRequest) {
		User user = userServiceImpl.getUserById(pollRequest.getUserId());
		PollEntity pollEntity = new PollEntity();
		pollEntity.setQuestion(pollRequest.getQuestion());
		pollEntity.setOptions(pollRequest.getOptions());
		pollEntity.setUrl(pollRequest.getUrl());
		pollEntity.setCreatedAt(Timestamp.from(Instant.now()));
		pollEntity.setActive(true);
		pollEntity.setModifiedAt(null);
		pollEntity.setCustomExpiry(pollRequest.getCustomExpiry());
		pollEntity.setPollType(pollRequest.getPollType());
		pollEntity.setTags(pollRequest.getTags());
		pollEntity.setUser(user);
		return pollEntity;
	}

}
