package prototype;

import lombok.Data;

import java.io.*;

/**
 * 具体原型
 */
@Data
public class DeepPrototype implements AbstractDeepPrototype {
    private String name;
    private int age;
    private Student student;

    @Override
    public DeepPrototype deepClone() throws IOException, ClassNotFoundException {
        return (DeepPrototype)(AbstractDeepPrototype.super.deepClone());
    }
}
