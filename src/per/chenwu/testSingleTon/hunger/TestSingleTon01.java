package per.chenwu.testSingleTon.hunger;

import per.chenwu.hunger.Singleton01;

public class TestSingleTon01 {
    public static void main(String[] args) {
        Singleton01 s = Singleton01.INSTANCE;
        System.out.println(s.getString());
    }
}
