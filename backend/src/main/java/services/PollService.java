package services;

import entity.PollEntity;
import models.PollRequest;

public interface PollService{
	PollEntity createPoll(PollRequest pollRequest);
}
