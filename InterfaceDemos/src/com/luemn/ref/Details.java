package com.luemn.ref;

import com.lumen.extend.CalculatorMain;

public class Details {
	String myname="venkatesh";

	    String showName(String name) {
	    	if(name.equals(myname))
	    		return "hello"+myname;
	    	else
	    		return "not registered";
	    }
	    public class ClassMain{
	    	public static void main(String[] args) {
	    		Details details=new Details();
				NameChecker nameChecker=details::showName;
				nameChecker.checkName("venkatesh");
			}
	    }
			
	}