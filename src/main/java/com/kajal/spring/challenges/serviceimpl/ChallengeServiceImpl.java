package com.kajal.spring.challenges.serviceimpl;

import org.springframework.stereotype.Component;

import com.kajal.spring.challenges.service.ChallengeService;
@Component
public class ChallengeServiceImpl implements ChallengeService {

	@Override
	public double getAverage(int[] input) {
		double total = 0;
		if (input == null)
			return 0;
		for (int i = 0; i < input.length; i++) {
			total += input[i];
		}

		return total / input.length;
	}

}
