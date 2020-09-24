package commandPattern.requestLog;

import java.io.*;
import java.util.ArrayList;

/**
 * 日志工具类
 */
public class LogUtils {
    public static void writeCommands(ArrayList commands) {
        try {
            FileOutputStream file = new FileOutputStream("D:/config.log");
            ObjectOutputStream objout = new ObjectOutputStream(new BufferedOutputStream(file));
            objout.writeObject(commands);
            objout.close();
        } catch (Exception e) {
            System.out.println("命令保存失败");
            e.printStackTrace();
        }
    }

    public static ArrayList readCommands() {
        try {
            FileInputStream file = new FileInputStream("D:/config.log");
            ObjectInputStream objip = new ObjectInputStream(new BufferedInputStream(file));
            ArrayList commands = (ArrayList) objip.readObject();
            objip.close();
            return commands;
        } catch (Exception e) {
            System.out.println("命令读取失败");
            e.printStackTrace();
            return null;
        }
    }
}
