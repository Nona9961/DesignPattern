package prototype;

import java.io.IOException;

public class DeepClient {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DeepPrototype prototype = new DeepPrototype();
        prototype.setAge(18);
        prototype.setName("1111");
        prototype.setStudent(new Student("胡"));
        DeepPrototype o = prototype.deepClone();
        System.out.println(o);
        System.out.println(o.getStudent() == prototype.getStudent());
    }
}
