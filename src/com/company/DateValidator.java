package com.company;

public class DateValidator extends Validator {

    @Override
    protected boolean validate(String text) {
        boolean containsTwoSlashes = containsTwoSlashes(text);
        boolean validLength = isValidFormat(text);
        return containsTwoSlashes && validLength;
    }

    private boolean containsTwoSlashes(String text) {
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            if ('/' == text.charAt(i)) {
                k++;
            }
        }
        if (k != 2) {
            return false;
        } else {
            return true;
        }

        //return k != 2;
    }

    private boolean isValidFormat(String text) {
        String[] chars = text.split("/");
        if (chars.length != 3){
            return false;
        }
        if (chars[0].length() != 2 || chars[1].length() != 2 || chars[2].length() != 4){
            return false;
        }
        for (int i = 0; i < chars.length ; i++) {
            for (int j = 0; j < chars[i].length() ; j++) {
              if (!Character.isDigit(chars[i].charAt(j))) {
                 return false;
              }
            }
        }
        int[] numbers = new int[3];
        for (int i = 0; i <chars.length ; i++) {
            numbers[i] = Integer.parseInt(chars[i]);
        }
        if (numbers[0] > 31 || numbers[1] > 12) {
            return false;
        }
        return true;
    }
}

