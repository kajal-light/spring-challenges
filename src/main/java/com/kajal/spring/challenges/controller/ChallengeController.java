package com.kajal.spring.challenges.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kajal.spring.challenges.service.ChallengeService;

@RestController
@RequestMapping("/api")
public class ChallengeController {

	private static final Logger logger = LoggerFactory.getLogger(ChallengeController.class);

	@Autowired
	ChallengeService challengeService;

	@PostMapping("/average")
	public ResponseEntity<Double> getAverage(@RequestParam int[] input) {

		logger.info("Inside average function");

		double average = challengeService.getAverage(input);

		return new ResponseEntity<Double>(average, HttpStatus.OK);

	}

	@PostMapping("/sum")
	public ResponseEntity<Double> getSum(@RequestParam int[] input) {

		logger.info("Inside sum function");

		double sum = challengeService.getSum(input);

		return new ResponseEntity<Double>(sum, HttpStatus.OK);

	}
}
