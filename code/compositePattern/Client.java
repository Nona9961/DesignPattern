package compositePattern;

public class Client {
    public static void main(String[] args) {
        AbstractFiles file1, file2, file3, folder1, folder2;
        // 初始化
        file1 = new MyFiles("建筑大全.pdf");
        file2 = new MyFiles("电影.avi");
        file3 = new MyFiles("touhou music best.mp3");
        folder1 = new MyFolder("书籍");
        folder2 = new MyFolder("影音作品");
        try {
            file1.add(file1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        folder1.add(file1);
        folder2.add(file2);
        folder2.add(file3);
        folder2.add(folder1);
        // 调用方法
        folder2.operation();
    }
}
