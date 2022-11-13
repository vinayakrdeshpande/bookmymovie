/**
 * 
 */
package com.obook.bookmymovie.validation;

import java.util.Map;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.obook.bookmymovie.model.Theatre;

import lombok.extern.slf4j.Slf4j;

/**
 * @author vishr
 *
 */
@Slf4j
public class TheatreValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Map.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Theatre theatre = (Theatre) target;

		if (theatre == null) {
			errors.reject("field.mandatory_fields_must_be_provided",
					new Object[] { "name", "address", "seats", "state", "city", "pincode" }, null);
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "seats", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "state", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "city", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pincode", "field.required");
	}

}
