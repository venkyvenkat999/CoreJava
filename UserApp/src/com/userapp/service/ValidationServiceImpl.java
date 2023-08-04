package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[ ]usernames= {"venkatesh","ganesh","lokesh"};
		for(String name:usernames) {
			if(username.equals(name)) {
				throw new NameExistsException("name is already there");
			}
		}
		return true;
	}

	@Override
	public boolean validatePassword(String password) throws TooShortException, TooLongException {
		if(password.length()<6) {
			throw new TooShortException("this is too short");
		}
		else if(password.length()>15) {
			throw new TooLongException("this is too long password");
		}
		else
			return true;
	}

}
