package com.mindtree.collections.question2;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Check Number
 * 
 */
public class CheckNumber {

	/**
	 * Checks if the given numbers are valid Integer numbers or decimal numbers
	 * 
	 * @param input, a String array of numbers
	 *            
	 * @return  List, a list of string values such as ‘valid Integer number', 'Valid Decimal number' if the numbers are valid 
	 *          and 'Invalid Integer number', 'Invalid Decimal number' if the numbers are invalid 
	 *     
	 */
	public List<String> isNumberValid(String[] input)
	{
		List<String> arr= new ArrayList<String>();
	    if(input== null){
			arr.add("Invalid");
		}
	    else{
	    	for(String s:input){
	    	int	flag=0;
	    		for(int i=0;i<s.length();i++){
	    			if(Character.isLetter(s.charAt(i))){
	    				flag=-1;
	    				break;
	    				
	    			}
	    			else if(Character.isDigit(s.charAt(i)) || s.charAt(i)=='.'){
	    				if(s.charAt(i)=='.'){
	    					flag++;
	    				}
	    			}  
	    			}
	    			if(flag>=2){
	    				arr.add("Invalid");
	    				
	    			}
	    			if(flag==0){
	    				arr.add("Integer");
	    			}
	    			if(flag==1){
	    				arr.add("Decimal");
	    			}
	    		}
	    }
	  
			   return arr;
		   
	    }
	}
	   
	    
	 

