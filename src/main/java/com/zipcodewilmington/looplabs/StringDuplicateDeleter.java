package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    String[] strings;
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        this.strings = intArray;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {


        return new String[0];
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {


        return new String[0];
    }
}
