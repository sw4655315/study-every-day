package com.study;

public class WaitMethod {
    A a = new A();
    B b = new B();
    C c = new C();

    public void sa() throws InterruptedException {
        synchronized (a){
            System.out.println("a enter");
            b.wait();
            System.out.println("a wait");
        }
        System.out.println("a over");
    }

    public void sc() throws InterruptedException {
        synchronized (b){
            System.out.println("c enter");
            a.wait();
            System.out.println(" ca wait");
        }
        System.out.println("c over");
    }


    public static void main(String[] args) throws InterruptedException {
        final WaitMethod w = new WaitMethod();
        for( int i = 0;i<5;i++){
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        if( finalI % 2 == 0){
                            w.sa();
                        }else{
                            w.sc();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}

class A{

}

class B{

}

class C{

}
