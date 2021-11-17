package com.sbg.familytree.exception;

import static java.lang.String.format;

public class ParentNotFoundException extends Exception {

    static final String EXCEPTION_MESSAGE = "No mother and father found with names %s and %s, to be parents for child %s.";

    public ParentNotFoundException(String childName, String motherName, String fatherName) {
        super(format(EXCEPTION_MESSAGE, motherName, fatherName, childName));
    }
}
