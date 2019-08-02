package per.chenwu.hunger;

import java.io.IOException;
import java.util.Properties;

/**
 * 通过静态代码块创建单例
 * Static静态代码块适合读取文件数据
 */
public class Singleton03 {

    public static  Singleton03 INSTANT;

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    static {
        Properties properties = new Properties();
        try {
            properties.load(Singleton03.class.getClassLoader().getResourceAsStream("single.properties"));
            INSTANT = new Singleton03(properties.getProperty("info"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Singleton03(String info){
        this.info = info;
    }
}
