package com.example.calculator;


/**
 * Java 클래스 샘플
 * 본 클래스는 덧셈, 뺄셈, 곱셈, 나눗셈 총 4개의 기능을 제공한다.
 *
 * @author 홍길동 (GDHong@naver.com)
 * @version 1.50, 13 Sep 2015
 */
public class CalcClass {
    /**
     *
     * 두 숫자를 입력 받아  더하고 그 값을  리턴 한다.
     *
     * @param a 첫번 째 정수
     * @param b 두번 째 정수
     * @see CalcClass
     * @since version 1.00
     */
    public int add(int a, int b)
    {
        return a + b;
    }
 
    /**
     *
     * 두 숫자를 입력 받아  빼고 그  값을  리턴 한다.
     *
     * @param a 첫번 째 정수
     * @param b 두번 째 정수
     * @see CalcClass
     * @since version 1.00
     */
    public int subtract(int a, int b)
    {
        return a - b;
    }
 
    /**
     *
     * 두 숫자를 입력 받아  곱하고 그 값을  리턴 한다.
     *
     * @param a 첫번 째 정수
     * @param b 두번 째 정수
     * @see CalcClass
     * @since version 1.00
     */
    public int multiply(int a, int b)
    {
        return a * b;
    }
 
    /**
     *
     * 두 숫자를 입력 받아  나누고 그 값을  리턴 한다.
     *
     * @param a 첫번 째 정수
     * @param b 두번 째 정수
     * @see CalcClass
     * @since version 1.00
     */
    public double divide(int a, int b)
    {
        return a / b;
    }
}
