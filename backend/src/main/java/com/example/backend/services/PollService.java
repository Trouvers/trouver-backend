package com.example.backend.services;

import com.example.backend.entity.PollEntity;
import com.example.backend.models.PollRequest;

public interface PollService{
	PollEntity createPoll(PollRequest pollRequest);
}
