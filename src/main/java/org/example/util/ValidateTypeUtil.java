package org.example.util;

public class ValidateTypeUtil {

    public static boolean isValidPrimitiveType(Object value){
        if(value instanceof String || value instanceof Number || value instanceof Boolean)
            return true;

        return false;
    }
}
