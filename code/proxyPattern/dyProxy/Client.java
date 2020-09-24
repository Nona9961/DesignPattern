package proxyPattern.dyProxy;

        import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Person person = new PersonImpl("任博");
        Person personProxy = (Person)Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(), new PersonalHandle(person));
        boolean intro = personProxy.intro();
        System.out.println(intro);
    }
}
