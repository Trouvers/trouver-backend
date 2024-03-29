package com.example.backend.services;

import com.example.backend.core.object.IPollResponse;
import com.example.backend.core.object.WrappedPollResponse;
import com.example.backend.entity.PollEntity;
import com.example.backend.models.PollRequest;

public interface PollService{
	WrappedPollResponse createPoll(PollRequest pollRequest);

	WrappedPollResponse getPollById(long id);
	WrappedPollResponse getAllPoll();

	WrappedPollResponse deletePoll(long id);
}
