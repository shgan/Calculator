//TEST 20161008 PM00604 User B
//TEST 20161008 PM0604 User A

package com.example.calculator;

public class CalcTest {

	public static void main(String[] args) {
		System.out.println("CalcTest");

		CalcClass calc = new CalcClass();
		
		int a = 100;
		int b = 200;
		int sum;
		
		sum = calc.add(a, b);
		System.out.println("a+b= " + sum);
	}

}
