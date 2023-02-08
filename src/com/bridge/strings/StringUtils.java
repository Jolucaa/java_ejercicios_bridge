package com.bridge.strings;
public class StringUtils {
    public int getLength(String stringToCount){
        return stringToCount.length();
    }

    public String repeatMe(String stringToRepeat,int howManyTimeRepeatString){
        return stringToRepeat.repeat(howManyTimeRepeatString);
    }

    public int numberOfVocals(String stringOnSearchVocals) {
        String vocales = "a,e,i,o,u";
        int lengthWithVocasls = getLength(stringOnSearchVocals);
        return lengthWithVocasls - stringOnSearchVocals.toLowerCase().replace(vocales, "").length();
    }

    public String Capitalize(String stringToTransform){
        if(!stringToTransform.isEmpty()) {
            return stringToTransform.substring(0, 1).toUpperCase() + stringToTransform.substring(1);
        }
        return "";
    }

}
