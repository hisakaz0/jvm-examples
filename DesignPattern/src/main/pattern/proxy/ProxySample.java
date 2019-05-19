package main.pattern.proxy;

public class ProxySample implements Runnable {

    @Override
    public void run() {
        Teacher fujiwara = new Fujiwara();
        fujiwara.question1();
        fujiwara.question2();
        fujiwara.question3();
    }
}

