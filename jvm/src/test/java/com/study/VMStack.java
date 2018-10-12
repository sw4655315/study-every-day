package com.study;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 虚拟机栈 - 执行栈
 *
 * @author jisong.sun on 2018/10/12.
 */
public class VMStack {
    private String val1;
    private Date val2;
    private BigDecimal val3;
    private int val4;
    protected String val5;
    public String val6;

    public void method1(){
        String mval1 = "mval1";
        Date mval2 = null;
        method2("1","2");
    }

    public String method2(String param1,String param2){
        method1();
        return param1;
    }


    @Test
    public void StackOverflowError(){
        /**
         * 栈深度过长. StackOverflowError 栈溢出异常
         */
        method1();
    }

    /**
     * 虚拟机栈的方法的执行栈 ,
     * 例:
     * md1
     *  |
     * md2
     *  |
     * md3
     *  |
     * md4
     *  |
     * md5
     *
     * 方法md1调用md2,2调用md3,3调用md4,4调用md5 , 方法执行时, 从1到5,依次出栈
     *
     *
     * 栈的最大深度
     *
     * 栈在初始化过后是有一定的大小的。
     *
     * 栈的高度称为栈的深度，栈深度受栈帧大小影响。
     *
     * 设置栈帧的大小为1m : -Xss1m
     *
     */


    private int count = 0;

    public void testStack(){
        count++;
        testStack();
    }

    @Test
    public void test(){
        try {
            testStack();
        } catch (Throwable e) {
            System.out.println(e);
            System.out.println("stack height:"+count);
        }

        /**
         * java.lang.StackOverflowError
         * stack height:17759
         */
    }

    public void testStackWithVal(int a,int b){
        int c =5;
        long d=4L;
        Date time = new Date();
        String str = String.valueOf(123);
        long df=47777777777777777L;
        count++;
        testStack();
    }

    @Test
    public void testWithVal(){
        try {
            testStackWithVal(5,7);
        } catch (Throwable e) {
            System.out.println(e);
            System.out.println("stack height:"+count);
        }

        /**
         * java.lang.StackOverflowError
         * stack height:11360
         *
         * 加了变量和参数后, 栈桢数大量减少
         */
    }

}
