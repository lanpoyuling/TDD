package com.example.tdd;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @ClassName JvmAppClassLoaderAddUrl
 * @Description TODO
 * @Author 10932
 * @Date 8/8/2021 10:47 AM
 **/
public class JvmAppClassLoaderAddUrl {
    public static void main(String[] args) throws NoSuchMethodException, MalformedURLException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        String appPath = "file:/D:/idea-project/TDD/src/main/java/com/example/tdd/";
        ClassLoader classLoader = JvmAppClassLoaderAddUrl.class.getClassLoader();
        URLClassLoader urlClassLoader = (URLClassLoader) classLoader;
        Method addURL = URLClassLoader.class.getDeclaredMethod("addURL", URL.class);
        addURL.setAccessible(true);
        URL url = new URL(appPath);
        addURL.invoke(urlClassLoader, url);
        Class<?> aClass = Class.forName("com.example.tdd.Hello");
        //实例化 D:/idea-project/TDD/src/main/java/com/example/tdd/Hello.class
        Object o = aClass.newInstance();
    }
}
