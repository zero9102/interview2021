package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 *  泛型类型转换.
 */
public class TypeCastInterview {

    public static void main(String[] args) {
        List<?> myGenericList;
        List<Object> myObjectList;
        List<String> myStringList = new ArrayList<>();
//        myStringList.add("hello");
        myGenericList = myStringList;

        // 不兼容的类型: java.util.List<java.lang.String>无法转换为java.util.List<java.lang.Object>
//        myObjectList = myStringList;

        myGenericList = (List<?>) myStringList;
        // 不兼容的类型: java.util.List<java.lang.String>无法转换为java.util.List<java.lang.Object>
//        myObjectList = (List<Object>) myStringList;
    }
}
