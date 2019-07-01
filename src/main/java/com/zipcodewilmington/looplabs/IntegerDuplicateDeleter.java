package com.zipcodewilmington.looplabs;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        return null;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        Integer[] removeValues = new Integer[array.length];
        int counter = 0;
        int a = 0;
        for (int i = 0; i < array.length ; i++) {
            counter = 0;
            for (int j = 0; j < array.length ; j++) {
                if(array[i].equals(array[j])) {
                    counter++;
                    if(counter == exactNumberOfDuplications) {
                        removeValues[a] = array[j];
                        a++;
                        break;
                    }
                }
            }
        }
        removeValues = Arrays.copyOf(array,counter);


        return removeValues;
    }

}
