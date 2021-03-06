package com.kajal.spring.challenges.service;

import org.springframework.stereotype.Service;

@Service
public interface ChallengeService {

	double getAverage(int[] input);

	double getSum(int[] input);

	char[] getDuplicates(String arg);

	String encrypt(String rawPassword);

	String decrypt(String encryptPassword);

}
