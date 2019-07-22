package com.github.wumingsheng.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.ArrayUtils;

public class AllowedIntValuesValidator implements ConstraintValidator<AllowedIntValues,Integer>  {
	
	private int[] allowedValues;

	@Override
	public void initialize(AllowedIntValues constraintAnnotation) {
		this.allowedValues = constraintAnnotation.allowedValues();
		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if(ArrayUtils.contains(allowedValues, value)) {
			return true;
		}
		return false;
	}

	

}
