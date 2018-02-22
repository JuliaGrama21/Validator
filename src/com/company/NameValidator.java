package com.company;

public class NameValidator extends Validator {

    @Override
    protected boolean validate(String text) {
        boolean nameNotContainsDigits = isNameNotContainsDigits(text);
        boolean firstLetterInUpperCase = isFirstLetterInUpperCase(text);
//        if (nameNotContainsDigits && firstLetterInUpperCase) {
//            return true;
//        } else {
//            return false;
//        }
        return nameNotContainsDigits && firstLetterInUpperCase;
    }

    private boolean isNameNotContainsDigits(String text) {
        for (int i = 0; i < text.length() ; i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }

    private boolean isFirstLetterInUpperCase(String text) {
        char c = text.charAt(0);
        if (Character.isUpperCase(c)){
            return true;
        } else {
            return false;
        }
    }
}
