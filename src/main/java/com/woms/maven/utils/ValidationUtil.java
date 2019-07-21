package com.woms.maven.utils;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.xml.bind.ValidationException;




/**
 * 校验工具类
 * @author wms
 *
 * @date Jul 10, 2019
 */
public class ValidationUtil {  
	  
    private static Validator validator;  
      
    static {  
        ValidatorFactory vf = Validation.buildDefaultValidatorFactory();  
        validator = vf.getValidator();
        vf.close();
    }  
      
  

    public static <T> void validate(T t, Class<?>... groups) throws ValidationException{  
        Set<ConstraintViolation<T>> set =  validator.validate(t, groups);  
        if(set.size()>0){  
            StringBuilder validateError = new StringBuilder();  
            for(ConstraintViolation<T> val : set){  
                validateError.append(val.getMessage() + " ;");  
            }  
            throw new ValidationException(validateError.toString());              
        }  
    }  
      
}  
