package com.study;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 本地方法栈 - 方法区 - 元数据
 * @author jisong.sun on 2018/10/12.
 */
public class MethodStack {

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
    public void method3(){
        System.out.println("方法3");
    }


    /**
     Classfile /E:/work_space/future/song/framework-learning/study-every-day/jvm/targ
     et/test-classes/com/study/MethodStack.class
     Last modified 2018-10-12; size 1058 bytes
     MD5 checksum aafdf16def9fef568b645e373567768a
     Compiled from "MethodStack.java"
     public class com.study.MethodStack
     minor version: 0
     major version: 51
     flags: ACC_PUBLIC, ACC_SUPER
     Constant pool:
     #1 = Methodref          #11.#41        // java/lang/Object."<init>":()V
     #2 = String             #30            // mval1
     #3 = String             #42            // 1
     #4 = String             #43            // 2
     #5 = Methodref          #10.#44        // com/study/MethodStack.method2:(Ljav
     a/lang/String;Ljava/lang/String;)Ljava/lang/String;
     #6 = Methodref          #10.#45        // com/study/MethodStack.method1:()V
     #7 = Fieldref           #46.#47        // java/lang/System.out:Ljava/io/Print
     Stream;
     #8 = String             #48            // 方法3
     #9 = Methodref          #49.#50        // java/io/PrintStream.println:(Ljava/
     lang/String;)V
     #10 = Class              #51            // com/study/MethodStack
     #11 = Class              #52            // java/lang/Object
     #12 = Utf8               val1
     #13 = Utf8               Ljava/lang/String;
     #14 = Utf8               val2
     #15 = Utf8               Ljava/util/Date;
     #16 = Utf8               val3
     #17 = Utf8               Ljava/math/BigDecimal;
     #18 = Utf8               val4
     #19 = Utf8               I
     #20 = Utf8               val5
     #21 = Utf8               val6
     #22 = Utf8               <init>
     #23 = Utf8               ()V
     #24 = Utf8               Code
     #25 = Utf8               LineNumberTable
     #26 = Utf8               LocalVariableTable
     #27 = Utf8               this
     #28 = Utf8               Lcom/study/MethodStack;
     #29 = Utf8               method1
     #30 = Utf8               mval1
     #31 = Utf8               mval2
     #32 = Utf8               method2
     #33 = Utf8               (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Stri
     ng;
     #34 = Utf8               param1
     #35 = Utf8               param2
     #36 = Utf8               method3
     #37 = Utf8               RuntimeVisibleAnnotations
     #38 = Utf8               Lorg/junit/Test;
     #39 = Utf8               SourceFile
     #40 = Utf8               MethodStack.java
     #41 = NameAndType        #22:#23        // "<init>":()V
     #42 = Utf8               1
     #43 = Utf8               2
     #44 = NameAndType        #32:#33        // method2:(Ljava/lang/String;Ljava/la
     ng/String;)Ljava/lang/String;
     #45 = NameAndType        #29:#23        // method1:()V
     #46 = Class              #53            // java/lang/System
     #47 = NameAndType        #54:#55        // out:Ljava/io/PrintStream;
     #48 = Utf8               方法3
     #49 = Class              #56            // java/io/PrintStream
     #50 = NameAndType        #57:#58        // println:(Ljava/lang/String;)V
     #51 = Utf8               com/study/MethodStack
     #52 = Utf8               java/lang/Object
     #53 = Utf8               java/lang/System
     #54 = Utf8               out
     #55 = Utf8               Ljava/io/PrintStream;
     #56 = Utf8               java/io/PrintStream
     #57 = Utf8               println
     #58 = Utf8               (Ljava/lang/String;)V
     {
     protected java.lang.String val5;
     descriptor: Ljava/lang/String;
     flags: ACC_PROTECTED

     public java.lang.String val6;
     descriptor: Ljava/lang/String;
     flags: ACC_PUBLIC

     public com.study.MethodStack();
     descriptor: ()V
     flags: ACC_PUBLIC
     Code:
     stack=1, locals=1, args_size=1
     0: aload_0
     1: invokespecial #1                  // Method java/lang/Object."<init>
     ":()V
     4: return
     LineNumberTable:
     line 12: 0
     LocalVariableTable:
     Start  Length  Slot  Name   Signature
     0       5     0  this   Lcom/study/MethodStack;

     public void method1();
     descriptor: ()V
     flags: ACC_PUBLIC
     Code:
     stack=3, locals=3, args_size=1
     0: ldc           #2                  // String mval1
     2: astore_1
     3: aconst_null
     4: astore_2
     5: aload_0
     6: ldc           #3                  // String 1
     8: ldc           #4                  // String 2
     10: invokevirtual #5                  // Method method2:(Ljava/lang/Stri
     ng;Ljava/lang/String;)Ljava/lang/String;
     13: pop
     14: return
     LineNumberTable:
     line 22: 0
     line 23: 3
     line 24: 5
     line 25: 14
     LocalVariableTable:
     Start  Length  Slot  Name   Signature
     0      15     0  this   Lcom/study/MethodStack;
     3      12     1 mval1   Ljava/lang/String;
     5      10     2 mval2   Ljava/util/Date;

     public java.lang.String method2(java.lang.String, java.lang.String);
     descriptor: (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
     flags: ACC_PUBLIC
     Code:
     stack=1, locals=3, args_size=3
     0: aload_0
     1: invokevirtual #6                  // Method method1:()V
     4: aload_1
     5: areturn
     LineNumberTable:
     line 28: 0
     line 29: 4
     LocalVariableTable:
     Start  Length  Slot  Name   Signature
     0       6     0  this   Lcom/study/MethodStack;
     0       6     1 param1   Ljava/lang/String;
     0       6     2 param2   Ljava/lang/String;

     public void method3();
     descriptor: ()V
     flags: ACC_PUBLIC
     Code:
     stack=2, locals=1, args_size=1
     0: getstatic     #7                  // Field java/lang/System.out:Ljav
     a/io/PrintStream;
     3: ldc           #8                  // String 方法3
     5: invokevirtual #9                  // Method java/io/PrintStream.prin
     tln:(Ljava/lang/String;)V
     8: return
     LineNumberTable:
     line 35: 0
     line 36: 8
     LocalVariableTable:
     Start  Length  Slot  Name   Signature
     0       9     0  this   Lcom/study/MethodStack;
     RuntimeVisibleAnnotations:
     0: #38()
     }
     SourceFile: "MethodStack.java"




     -------------------
     以上类 ,方法 , 属性的描述性信息, 都存储在本地方法栈中(元数据区)(MetaSpace)


     */


}
