package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    private String[] result;

    public StringDuplicateDeleter(String[] intArray) {

        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        int duplicates = 0;
        int indexNewAray = 0;

        for(String s : array){

            if(countOccurences(s) >= maxNumberOfDuplications)
                duplicates++;
        }

        result = new String[array.length - duplicates];

        for(String s: array){

            if(countOccurences(s) < maxNumberOfDuplications) {
                result[indexNewAray] = s;
                indexNewAray++;
            }
        }

        return result;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        int duplicates = 0;
        int indexNewAray = 0;

        for(String s : array){

            if(countOccurences(s) == exactNumberOfDuplications)
                duplicates++;
        }

        result = new String[array.length - duplicates];

        for(String s: array){

            if(countOccurences(s) != exactNumberOfDuplications) {
                result[indexNewAray] = s;
                indexNewAray++;
            }
        }

        return result;
    }

    public int countOccurences(String string){
        int counter = 0;

        for(String s : array) {
            if (s.equals(string))
                counter++;
        }
        return counter;
    }
}
