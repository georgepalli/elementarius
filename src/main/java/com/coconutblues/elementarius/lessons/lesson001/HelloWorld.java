package com.coconutblues.elementarius.lessons.lesson001;

/**
 * Lesson 001 - Hello World.
 * 
 * This lesson is designed to introduce you to Java.
 * Implement all the methods below and run the unit tests in {@link HelloWorldTest}
 * 
 *
 */
public class HelloWorld {


	/**
	 * Returns <em>Hello!</em>.
	 * 
	 * @return a {@link String}
	 */
	public String sayHello() {
		
		// Replace the return null statement with your solution.
		return "Hello!";
	}
	
	/**
	 * Returns <em> Hello name!</em> where name can be any value.
	 * <br>
	 * E.g.
	 * <ol>
	 *  <li>sayHello("Father") should return <em>Hello Father!</em></li>
	 *  <li>sayHello("") should return <em>Hello!</em></li>
	 *  <li>sayHello(null) should return <em>Hello!</em></li>
	 * </ol> 
	 * 
	 * @param name
	 * @return
	 */
	public String sayHello(String name) {
		if(name == null || "".equals(name)) {
			return "Hello!";
		}
		return "Hello " + name + "!";
	}
	
	/**
	 * Returns <em>Hello!</em> 10 times, one on each line.
	 * @return
	 */
	public String sayHelloTenTimes(){
		String hello = "";
		for(int i=0; i<10; ++i) {
			hello = hello + "Hello!\n";
		}
		return hello;
	}
	
	/**
	 * Returns <em>Hello!</em> a number of times where the count 
	 * is determined by the parameter numberOfTimes.
	 * <br>
	 * E.g.
	 * <ol>
	 * 	<li>sayHelloNTimes(15) should return <em>Hello!</em> 15 times, one on each line</li>
	 * </ol>
	 * @param numberOfTimes
	 * @return
	 */
	public String sayHelloNTimes(int numberOfTimes) {
		String hello = "";
		for(int i = 0; i< numberOfTimes; ++i) {
			hello = hello + "Hello!\n";
		}
		return hello;
	}	
	
	
	/**
	 * Returns <em>Hello name!</em> a number of times where the count 
	 * is determined by the parameter numberOfTimes and name is any String.
	 * <br>
	 * E.g.
	 * <ol>
	 * 	<li>sayHelloNTimes(15, "Father") should return <em>Hello Father!</em> 15 times, one on each line</li>
	 * </ol>
	 * @param numberOfTimes
	 * @return
	 */
	public String sayHelloNTimes(String name, int numberOfTimes){
		String hello = "";
		for(int i = 0; i< numberOfTimes; ++i) {
			if(name == null || "".equals(name)) {
				hello = hello + "Hello!\n";
			} else {
				hello = hello + "Hello " + name + "!\n";
			}
		}
		return hello;
	
	}

}
