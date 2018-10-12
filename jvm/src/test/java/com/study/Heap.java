package com.study;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * 堆
 * @author jisong.sun on 2018/10/11.
 */
public class Heap {

    public void notion(){
        /**
         * "123" 在 heap 中
         * a 在 方法区中 (元数据) (metaspace)
         */
        String a = "123";

        /**
         * "new Heap()" 创建的对象在heap中
         * heap 在方法区中
         */
        Heap heap = new Heap();
    }

    @Test
    public void OOMHeapSpace(){
        //设置heap 1M
        // -Xmx1m ,设置1m,小一点 ,方便测试
        //大量生成对象 , 写入heap ,直到撑爆
        List<Heap> list = new ArrayList<>();
        while (true){
            list.add(new Heap());
            System.out.println(list.size());
        }

        /**

         21075
         21076
         21077
         21078
         21079

         java.lang.OutOfMemoryError: Java heap space

             at java.util.Arrays.copyOf(Arrays.java:3210)
             at java.util.Arrays.copyOf(Arrays.java:3181)
             at java.util.ArrayList.grow(ArrayList.java:261)


         1M的heap ,纯写入对象,写了2万多,也是不少 .
         */
    }


    @Test
    public void shareHeap() {
        //证明heap是共享的 .用两个线程写对象

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<Heap> list = new ArrayList<>();
                try{
                    while (true){
                        list.add(new Heap());
                    }
                }catch (Throwable t){
                    System.out.println("1 : " + t);
                    System.out.println("1 : " + list.size());
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                List<Heap> list = new ArrayList<>();
                try{
                    while (true){
                        list.add(new Heap());
                    }
                }catch (Throwable t){
                    System.out.println("2 : " + t);
                    System.out.println("2 : " + list.size());
                }
            }
        });

        t1.start();
        t2.start();
        try {
            TimeUnit.SECONDS.sleep(60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        /**
         * 结果效果不明显,两个线程, 还是有一个线程, 能执行到2W+,一个线程执行到1.8W
         * 有些不解.
         *
         *
         * 但是得到了另一个异常:  GC overhead limit exceeded
         * ```
         * 程序基本上耗尽了所有的可用内存, GC也清理不了。
         * ```
         *
         */
    }
}
