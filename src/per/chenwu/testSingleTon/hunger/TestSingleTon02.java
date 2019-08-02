package per.chenwu.testSingleTon.hunger;

import per.chenwu.hunger.Singleton02;

/**
 * 枚举法单例测试
 */
public class TestSingleTon02 {
    public static void main(String[] args) {
        Singleton02 s = Singleton02.INSTANT;
        System.out.println(s);
    }


}
