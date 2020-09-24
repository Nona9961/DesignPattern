package proxyPattern;

public class Proxy implements Abstract {
    private RealMatter realMatter = new RealMatter();
    @Override
    public void intro() {
        realMatter.intro();
        System.out.println("但是这个介绍是代理类说的");
    }
}
