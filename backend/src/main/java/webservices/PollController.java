package webservices;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import config.URL;
import entity.PollEntity;
import enums.ResultCode;
import models.PollRequest;
import models.PollResponse;
import services.PollServiceImpl;

@RestController
@RequestMapping(value=URL.BASE_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class PollController {
	
	@Autowired
	private PollServiceImpl pollService;
	
	@PostMapping(value=URL.POLL)
	ResponseEntity<PollResponse> createPoll(@RequestBody PollRequest request){
		
		PollEntity pollEntity = pollService.createPoll(request);
		PollResponse pollResponse = new PollResponse();
		pollResponse.setResultCode(ResultCode.SUCCESS);
		return new ResponseEntity<>(pollResponse, HttpStatus.OK);
	}
}
