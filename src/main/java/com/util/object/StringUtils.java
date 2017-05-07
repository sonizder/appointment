package com.util.object;

/**
 * Created by soner.ustel on 07/05/2017.
 */
public class StringUtils {

    public static boolean isEmpty(String value){
        return value == null || "".equals(value);
    }

    public static boolean isNotEmpty(String value){
        return !isEmpty(value);
    }
}
