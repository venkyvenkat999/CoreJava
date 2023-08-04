package com.lumen.fun;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
public class FuncDemo {

	public static void main(String[] args) {
		Function<String,Integer> fun=(str)->str.length();
		//call apply method
		System.out.println(fun.apply("hiii"));
		
		Function<String,String> fun1=(str)->str.toUpperCase();
		System.out.println(fun1.apply("hiii"));
		
		Function<Book,String> fun2=(book)->book.getTitle();
		System.out.println(fun2.apply(new Book()));
		
		Function<String,Book>fun3=(author)->{
			if(author.equals("kathy")) {
				return new Book();
			}
			else
				return null;
			
		};
		System.out.println(fun3.apply("kathy"));
//		
		Function<Integer,List<String>> fun4=(num)->{
			if(num==2)
				return Arrays.asList("venkat","suresh");
			else if(num==4)
				return Arrays.asList("venkat","tivari");
			else
				return null;

		};
		System.out.println(fun4.apply(1));

      Predicate<String> fun5=(str)->{
    	  if(str.length()>5)
    		  return true;
		return false;
    		  
      };
      System.out.println(fun5.test("venkatesh"));
      
      BiPredicate<String,Integer> biPredicate=(str1,num1)->{
    	  if(str1.length()>num1)
    		  return true;
    	  else
    		  return false;
      };
      System.out.println(biPredicate.test("hii amma   ",9));
	}

}
