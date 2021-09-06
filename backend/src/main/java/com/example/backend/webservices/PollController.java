package com.example.backend.webservices;

import com.example.backend.config.URL;
import com.example.backend.core.object.WrappedPollResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.backend.entity.PollEntity;
import com.example.backend.enums.ResultCode;
import com.example.backend.models.PollRequest;
import com.example.backend.models.PollResponse;
import com.example.backend.services.PollServiceImpl;

import java.util.List;

//value=URL.BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE
@RestController
@RequestMapping(value = URL.BASE_URL)
public class PollController {
	
	@Autowired
	private PollServiceImpl pollService;
	
	@PostMapping(value = URL.POLL)
	ResponseEntity<PollResponse> createPoll(@RequestBody PollRequest request){
		WrappedPollResponse wrappedPollResponse = pollService.createPoll(request);
		PollResponse pollResponse = new PollResponse();
		pollResponse.setIPollResponse(wrappedPollResponse.getResponse());
		pollResponse.setResultCode(wrappedPollResponse.getResultCode());
		return new ResponseEntity<>(pollResponse, HttpStatus.OK);
	}

	@GetMapping(value = URL.POLL_GET)
	ResponseEntity<PollResponse> getPollById(@PathVariable("id") long id){
		WrappedPollResponse wrappedPollResponse = pollService.getPollById(id);
		PollResponse pollResponse = new PollResponse();
		pollResponse.setIPollResponse(wrappedPollResponse.getResponse());
		pollResponse.setResultCode(wrappedPollResponse.getResultCode());
		return new ResponseEntity<>(pollResponse, HttpStatus.OK);
	}
		@DeleteMapping(value = URL.POLL_DELETE)
		ResponseEntity<PollResponse> deletePoll ( @PathVariable("id") long id){
			WrappedPollResponse wrappedPollResponse = pollService.deletePoll(id);
			PollResponse pollResponse = new PollResponse();
			pollResponse.setIPollResponse(wrappedPollResponse.getResponse());
			pollResponse.setResultCode(wrappedPollResponse.getResultCode());
			return new ResponseEntity<>(pollResponse, HttpStatus.OK);
		}

		@GetMapping(value = URL.POLL_GET_ALL)
		ResponseEntity<PollResponse> getAllPoll() {
			WrappedPollResponse wrappedPollResponse = pollService.getAllPoll();
			PollResponse pollResponse = new PollResponse(wrappedPollResponse.getResponses(), wrappedPollResponse.getResultCode());
			return new ResponseEntity<>(pollResponse, HttpStatus.OK);
		}
	}
