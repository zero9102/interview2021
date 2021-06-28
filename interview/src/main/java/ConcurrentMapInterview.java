package main.java;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapInterview {

    public static void main(String[] args) {
        // jdk 1.8
        ConcurrentMap<String, String> map = new ConcurrentHashMap();
        map.put("h", "s");
        map.put(null, "hhh");
        // ConcurrentMap, if (key == null || value == null) throw new NullPointerException();
        // concurrent map key, 和value 不能为null.
    }
}
