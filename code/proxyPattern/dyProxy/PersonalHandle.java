package proxyPattern.dyProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonalHandle implements InvocationHandler {
    private Person person;

    public PersonalHandle(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("intro")) {
            System.out.println("你被代理了");
            return method.invoke(person,args);
        }
        return null;
    }
}
