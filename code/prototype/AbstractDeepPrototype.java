package prototype;

import java.io.*;
// 抽象原型类
public interface AbstractDeepPrototype extends Serializable {
    default Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();    // 输出流
        ObjectOutputStream oos = new ObjectOutputStream(bao);       // 序列化流，写入到上面的输出流里面
        oos.writeObject(this);                                      // 向序列化流里面写入对象
        // 下面是反序列化
        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return  ois.readObject();
    }
}
