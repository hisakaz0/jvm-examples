package main.pattern.proxy;

import java.util.Calendar;

public class Fujiwara implements Teacher {

    private Teacher yamada = new Yamada();

    @Override
    public void question1() {
        System.out.print("fujiwara's answer1");
    }

    @Override
    public void question2() {
        System.out.println("fujiwara's answer2");
    }

    @Override
    public void question3() {
        Calendar cal = Calendar.getInstance();
        if (Calendar.AM == cal.get(Calendar.AM_PM)) {
            yamada.question3();
        } else {
            System.out.println("fujiwara's answer3");
        }
    }
}
