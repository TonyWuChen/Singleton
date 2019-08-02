package per.chenwu.testSingleTon.hunger;

import per.chenwu.hunger.Singleton03;

public class TestSingleTon03 {
    public static void main(String[] args) {
        Singleton03 s = Singleton03.INSTANT;
        System.out.println(s.getInfo());
    }
}
