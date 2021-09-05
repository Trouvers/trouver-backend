package com.example.backend.webservices;

import com.example.backend.config.URL;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.backend.entity.PollEntity;
import com.example.backend.enums.ResultCode;
import com.example.backend.models.PollRequest;
import com.example.backend.models.PollResponse;
import com.example.backend.services.PollServiceImpl;
//value=URL.BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE
@RestController
@RequestMapping(value = URL.BASE_URL)
public class PollController {
	
	@Autowired
	private PollServiceImpl pollService;
	
	@PostMapping(value = URL.POLL)
	ResponseEntity<PollResponse> createPoll(@RequestBody PollRequest request){
		PollEntity pollEntity = pollService.createPoll(request);
		PollResponse pollResponse = new PollResponse();
		pollResponse.setPollEntity(pollEntity);
		pollResponse.setResultCode(ResultCode.SUCCESS);
		return new ResponseEntity<>(pollResponse, HttpStatus.OK);
	}
}
