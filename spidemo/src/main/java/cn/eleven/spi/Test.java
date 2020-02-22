package cn.eleven.spi;

import com.sun.tools.javac.util.ServiceLoader;

import java.util.Iterator;

/**
 * @description: 测试
 * @date: 2020-02-22 23:37
 * @author: 十一
 */
public class Test {

    public static void main(String[] args) {
        ServiceLoader<SomeService> load = ServiceLoader.load(SomeService.class);

        Iterator<SomeService> iterator = load.iterator();

        while (iterator.hasNext()) {
            SomeService service = iterator.next();
            service.say();
        }
    }
}
