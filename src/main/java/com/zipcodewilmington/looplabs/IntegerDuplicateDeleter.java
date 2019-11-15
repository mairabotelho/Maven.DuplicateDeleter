package com.zipcodewilmington.looplabs;

import java.lang.reflect.Array;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    private Integer[] result;

    public IntegerDuplicateDeleter(Integer[] intArray) {

        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        int duplicates = 0;
        int indexNewArray = 0;

        for(Integer index : array){

            if(countOccurences(index) >= maxNumberOfDuplications)
                duplicates++;
        }

        result = new Integer[array.length - duplicates];

        for(Integer index : array){

            if(countOccurences(index) < maxNumberOfDuplications) {
                result[indexNewArray] = index;
                indexNewArray++;
            }
        }

        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int duplicates = 0;
        int indexNewArray = 0;

        for(Integer index : array){

            if(countOccurences(index) == exactNumberOfDuplications)
                duplicates++;
        }

        result = new Integer[array.length - duplicates];

        for(Integer index : array){

            if(countOccurences(index) != exactNumberOfDuplications) {
                result[indexNewArray] = index;
                indexNewArray++;
            }
        }

        return result;
    }

    public int countOccurences(int index){
        int counter = 0;

        for(Integer number : array) {
            if (index == number)
                counter++;
        }
        return counter;
    }
}
