package com.sbg.familytree.exception;

import static java.lang.String.format;

public class DuplicateChildException extends Exception {

    static final String EXCEPTION_MESSAGE = "Child named %s already exists for parent %s";

    public DuplicateChildException(String childName, String parentName) {
        super(format(EXCEPTION_MESSAGE, childName, parentName));
    }
}
