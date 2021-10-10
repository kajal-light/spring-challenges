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

	@Override
	public double getSum(int[] input) {
		double total = 0;
		if (input == null)
			return 0;
		for (int i = 0; i < input.length; i++) {
			total += input[i];
		}

		return total;
	}

	@Override
	public char[] getDuplicates(String arg) {

		char[] a = arg.toCharArray();

		int c = arg.length();
		char[] ans = new char[c];
		for (Character t : a) {
			for (int i = 0; i < c; i++) {
				for (int j = i + 1; j < i + 1; j++) {
					if (a[i] == a[j]) {
						char s = a[j];
						ans[i] = s;

					}

				}

			}
		}
		System.out.println(ans);
		System.out.println(ans.toString());
		return ans;

	}

	@Override
	public String encrypt(String rawPassword) {
		String secretKey = "sPqfyksRN2fEB9S";
		char[] rawPasswordCharArray = rawPassword.toCharArray();
		char[] secretKeyChar = secretKey.toCharArray();
		char[] encryptArray = new char[rawPassword.length()];
		for (int i = 0; i < rawPasswordCharArray.length; i++) {

			int a = ((int) (secretKeyChar[i]));
			int b = ((int) (rawPasswordCharArray[i]));
			char c = (char)(a+b);
			encryptArray[i] = c;

		}
		String encryptPass = String.valueOf(encryptArray);
		System.out.println("Encrypted pass: " + encryptPass);
		//decrypt(encryptPass);
		return encryptPass;

	}

	@Override
	public String decrypt(String encryptPassword) {
		String secretKey = "sPqfyksRN2fEB9S";
		char[] encryptArray = encryptPassword.toCharArray();
		char[] secretKeyCharArray = secretKey.toCharArray();
		char[] decryptArray = new char[encryptArray.length];
		for (int i = 0; i < encryptArray.length; i++) {
			int c = ((int) (encryptArray[i]));
			int a = ((int) (secretKeyCharArray[i]));
			char b = (char) (c-a) ; 
			decryptArray[i] = b;

		}
		System.out.println("Decrypted pass: " + String.valueOf(decryptArray));
		return String.valueOf(decryptArray);
	}

}
