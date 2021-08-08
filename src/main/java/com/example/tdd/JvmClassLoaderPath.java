package com.example.tdd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.Launcher;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

/**
 * @ClassName JvmClassLoaderPath
 * @Description JVM类加载器路径
 * @Author 10932
 * @Date 8/8/2021 8:29 AM
 **/
public class JvmClassLoaderPath {
    private static final Logger logger = LoggerFactory.getLogger(JvmClassLoaderPath.class);

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        logger.info("启动类加载器");
        for (URL url : urLs) {
            if (logger.isDebugEnabled()) {
                logger.debug("==={}", url.toExternalForm());
            }
        }

        //扩展类加载器
        printClassLoader("扩展类加载器", JvmClassLoaderPath.class.getClassLoader().getParent());
        //应用类加载器
        printClassLoader("应用类加载器", JvmClassLoaderPath.class.getClassLoader());
    }

    private static void printClassLoader(String name, ClassLoader parent) throws NoSuchFieldException, IllegalAccessException {
        if (null != parent) {
            logger.info("{}CLassLoader==>{}", name, parent);
            printURlForClassLoader(parent);
        }
        if (null == parent) {
            logger.info("{}CLassLoader==> null", name);
        }
    }

    private static void printURlForClassLoader(ClassLoader classLoader) throws NoSuchFieldException, IllegalAccessException {
        Object ucp = insightField(classLoader, "ucp");
        Object path = insightField(ucp, "path");
        List<Object> pathList = (List) path;
        pathList.forEach(p -> logger.info("======:{}", p));
    }

    private static Object insightField(Object obj, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field declaredField;
        if (obj instanceof URLClassLoader) {
            declaredField = URLClassLoader.class.getDeclaredField(fieldName);
        } else {
            declaredField = obj.getClass().getDeclaredField(fieldName);
        }
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }
}
