package com.vloditech.control.common.exceptions.exception;

import java.util.Objects;

public class DomainException extends RuntimeException {

    public DomainException(String message) {
        super(message);
    }

    public static void whenObjectIsNull(Object someObject, String message) {
        if (Objects.isNull(someObject)) {
            throwsException(message);
        }
    }

    private static void throwsException(String message) {
        throw new DomainException(message);
    }
}