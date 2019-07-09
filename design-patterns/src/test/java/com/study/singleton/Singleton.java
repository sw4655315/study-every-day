package com.study.singleton;

public class Singleton {
    private static Singleton ins = new Singleton();
    private Singleton(){}
    public static Singleton getIns(){
        return ins;
    }
}

class Singleton_lazy{
    private static Singleton_lazy ins;
    private Singleton_lazy(){}
    public static Singleton_lazy getIns(){
        if(null == ins){
            ins = new Singleton_lazy();
        }
        return ins;
    }
}


class Singleton_lazy_safe{
    private volatile static Singleton_lazy_safe ins;
    private Singleton_lazy_safe(){}
    public static Singleton_lazy_safe getIns(){
        if(null == ins){
            synchronized (Singleton_lazy_safe.class){
                if(null == ins){
                    ins = new Singleton_lazy_safe();
                }
            }
        }
        return ins;
    }


}

class Run{
    public static void main(String[] args) throws ClassNotFoundException {
        Singleton_lazy ins = Singleton_lazy.getIns();
        System.out.println(ins.toString());

    }
}
