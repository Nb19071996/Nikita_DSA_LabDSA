package com.gl.dsa.lab3.session;

import java.util.Stack;

public class BalancingBracketsQueston1 {
	
	public static boolean isBalanced(String brackets) {
		 Stack stack = new Stack(); 
		 char[] charArray = brackets.toCharArray();   
		 
		 for (int i = 0; i < charArray.length; i++) {   
             
	            char current = charArray[i];   
	              
	            if (current == '{' || current == '[' || current == '(') {   
	                stack.push(current);   
	                continue;   
	            }   
	            if (stack.isEmpty()) {    
	                return false;   
	            } 
				 	 
				 char popChar;   
		         switch (current) {   
		             case ')': 
		            	 
			             popChar = (char) stack.pop();   
			             if (popChar == '{' || popChar == '[')   
			                 return false;   
			             break;   
			             
		             case '}':
		            	 
			             popChar = (char) stack.pop();   
			             if (popChar == '(' || popChar == '[')   
			                 return false;   
			             break; 
			             
		             case ']':   
		            	 
			             popChar = (char) stack.pop();   
			             if (popChar == '(' || popChar == '{')   
			                 return false;   
			             break;   
		         	}   
		 		}
        
         return (stack.isEmpty());   
		
	}

	public static void main(String[] args) {
		String bracketExpression1 = "([[{}]])";
		String bracketExpression2 = "([[{}]]))";
		
		if(isBalanced(bracketExpression1) != false) {
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}

	}

}
