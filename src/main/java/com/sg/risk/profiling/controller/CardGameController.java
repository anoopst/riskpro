package com.sg.risk.profiling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sg.risk.profiling.domain.GameData;
import com.sg.risk.profiling.service.CardComputationService;

@RestController
@RequestMapping("/card")
public class CardGameController {
	
	@Autowired
	private CardComputationService cardComputationService;

	@RequestMapping(value="/user/{userId}/get/{level}", method=RequestMethod.GET)
	public GameData fetchGameData(@PathVariable Long userId, @PathVariable int level) {
		return cardComputationService.compute(userId, level);
	}
}
