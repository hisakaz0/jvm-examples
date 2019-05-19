package main.pattern.proxy;


public class Yamada implements Teacher {

    @Override
    public void question1() {
        System.out.println("yamada's answer1");
    }

    @Override
    public void question2() {
        System.out.println("yamada's answer2");
    }

    @Override
    public void question3() {
        System.out.println("yamada's answer3");
    }
}
