package com.microservice.write.response;
import org.apache.commons.validator.routines.EmailValidator;
public class Validator {
	
	public static boolean emailValidation(String email) {
	
			return EmailValidator.getInstance().isValid(email);

	}

}
