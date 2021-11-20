package com.sophossolutions.utilities;

import java.util.Random;

public class GenericEmail {
	
	public static String genericEmail(String email) {
		
			String[] part= email.split("@");
			
			Random random=new Random();
			String setOfCharacters ="abdefghijkmnk1234567890";
			for(int i=0;i<5;i++) {
				int randomInt= random.nextInt(setOfCharacters.length());
				char randomChar = setOfCharacters.charAt(randomInt);
				part[0]+=randomChar;
			}
			
			return part[0].concat("@").concat(part[1]);
		}
		
	}

