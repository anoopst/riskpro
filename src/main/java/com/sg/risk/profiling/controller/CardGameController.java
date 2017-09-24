package com.sg.risk.profiling.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sg.risk.profiling.domain.GameData;

@RestController
@RequestMapping("/card")
public class CardGameController {

	@RequestMapping(value="/user/{id}/get/{level}", method=RequestMethod.GET)
	public GameData fetchGameData(@PathVariable int id, @PathVariable int level) {
		return null;
	}
}
