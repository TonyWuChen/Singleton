package per.chenwu.testSingleTon.hunger;

import per.chenwu.lazy.Singleton06;

public class TestSingleTon06 {
    public static void main(String[] args) {
        Singleton06 s = Singleton06.getInstance();
        Singleton06 ss = Singleton06.getInstance();
        System.out.println(s==ss);
    }
}
