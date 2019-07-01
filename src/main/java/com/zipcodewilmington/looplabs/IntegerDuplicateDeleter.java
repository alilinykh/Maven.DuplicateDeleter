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
    private Integer[] arr;
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.arr = intArray;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        return null;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
//        Integer[] noGood = new Integer[arr.length];
//        Integer counter = 0;
//        for (Integer i : arr
//        ) {
//            long count = Arrays.stream(arr).filter(p -> p.equals(i)).count();
//
//            if (count == exactNumberOfDuplications) {
//                noGood[counter] = i;
//            } else {
//                noGood[counter] = 10000;
//            }
//            counter++;
//        }
//
//        Integer[] valuesToRemove = Arrays.stream(noGood).distinct().filter(p -> !p.equals(10000)).toArray(Integer[]::new);
//
////        Integer[] rslt = new Integer[arr.length - valuesToRemove.length];
//        for (Integer i: valuesToRemove
//             ) {
//            removeValue(i,arr);
//        }

        arr











        return arr;
    }


    public Integer []removeValue(Integer valueToRemove, Integer[] originalArray) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer t: originalArray
        ) {
            if (!t.equals(valueToRemove)) {
                arrayList.add(t);
            }
        }
        for (int i = 0; i < arrayList.size() ; i++) {
            originalArray[i] = arrayList.get(i);
        }
        originalArray = Arrays.copyOf(originalArray,arrayList.size());
        return originalArray;
    }

}
