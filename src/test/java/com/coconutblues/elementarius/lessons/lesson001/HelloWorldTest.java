package com.coconutblues.elementarius.lessons.lesson001;

import static org.junit.Assert.*;

import org.junit.Test;
import com.coconutblues.elementarius.lessons.lesson001.HelloWorld;

/**
 * {@link HelloWorld} unit tests.
 *
 */
public class HelloWorldTest {

	private HelloWorld helloWorld  = new HelloWorld();
	@Test
	public void testSayHello() {
		assertEquals("Hello!",helloWorld.sayHello());
	}

	@Test
	public void testSayHelloString() {
		assertEquals("Hello father!",helloWorld.sayHello("father"));
		assertEquals("Hello!",helloWorld.sayHello(""));
		assertEquals("Hello!",helloWorld.sayHello(null));
	}

	@Test
	public void testSayHelloTenTimes() {
		String result = getHelloNTimes(10,null);
		assertEquals(result,helloWorld.sayHelloTenTimes());		
	}

	@Test
	public void testSayHelloNTimes() {
		String five = getHelloNTimes(5,null);
		assertEquals(five,helloWorld.sayHelloNTimes(5));

		String hundred = getHelloNTimes(100,null);
		assertEquals(hundred,helloWorld.sayHelloNTimes(100));

	}
	
	
	@Test
	public void testSayHelloNTimeString() {
		String five = getHelloNTimes(5,"Mother");
		assertEquals(five,helloWorld.sayHelloNTimes("Mother", 5));

		String hundred = getHelloNTimes(100,"Father");
		assertEquals(hundred,helloWorld.sayHelloNTimes("Father", 100));

	}

	private String getHelloNTimes(int times, String name) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<times;++i){
			if(name == null || "".equalsIgnoreCase(name)) {
				sb.append("Hello!");
			} else {
				sb.append("Hello " + name + "!");						
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
