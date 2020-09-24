package haha.xixi;

import java.io.*;
import java.net.URL;
import java.nio.file.Path;

public class MyTest {
    public static void main(String[] args) throws IOException {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton);
        singleton = Singleton.getSingleton();
        System.out.println(singleton);

    }
}
