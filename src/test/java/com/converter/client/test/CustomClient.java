package com.converter.client.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.converter.api.NumberConverter;
import com.converter.british.impl.NumbersToBritishWordsConverter;

/**
 * Custom Client to Test the Execution of the NumberConverter Service for custom Input tests in the test 
 * Challenge interface
 * @param args
 */
public class CustomClient {
	
	static NumberConverter numberConverterService;
	
	public static void main(String[] args) {
		numberConverterService = new NumbersToBritishWordsConverter();
		List<Integer> customInput;  
		if(args.length > 0){
			customInput = new ArrayList<Integer>();
			Stream.of(args).forEach(e -> {customInput.add(Integer.parseInt(e));});
		}
		else{
			customInput = Arrays.asList(0,1,2,25,105,123,1005,1042,1105,56945781,999999999);
		}
		
		customInput.forEach(e->{System.out.printf("%d : %s\n",e,numberConverterService.convert(e));});

	}
	
	

}
