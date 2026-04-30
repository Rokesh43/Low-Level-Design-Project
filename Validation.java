package com;

public class Validation {
	public boolean isValidUserName(String userName) {
		return userName!=null && !userName.trim().isEmpty();
	}
	public boolean isValidPassword(String password) {
		if(password.length()<6) {
			return false;
		}
		
		boolean hasLetter=false;
		boolean hasDigit=false;
		
		for(char c:password.toCharArray()) {
			if (Character.isLetter(c)) {
				hasLetter=true;
				
			}
			if (Character.isDigit(c)) {
				hasDigit=true;
				
			}
		}
		
		return hasDigit && hasLetter;
	}

}
