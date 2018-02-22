package com.company;

public class PhoneValidator extends Validator {

    @Override
    protected boolean validate(String text) {
        boolean containsPlus = containsPlus(text);
        boolean isNotLetters = isNotLetters(text);
        boolean normLenght = normLenght(text);
        return containsPlus && isNotLetters && normLenght;
    }

    private boolean containsPlus(String text) {
        if ('+' != text.charAt(0)) {
            return false;
        }
        return true;
    }

    private boolean isNotLetters(String text) {
        for (int i = 1; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean normLenght(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.length() != 13) {
                return false;
            }
        }
        return true;
    }

}


