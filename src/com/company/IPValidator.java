package com.company;

public class IPValidator extends Validator {

    @Override
    protected boolean validate(String text) {
        boolean containsThreePoints = containsThreePoints(text);
        boolean normFormat = normFormat(text);
        return containsThreePoints && normFormat;
    }

    private boolean isNotContainsLetters(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean containsThreePoints(String text) {
        int k = 0;
        for (int i = 0; i < text.length(); i++) {
            if ('.' == text.charAt(i)) {
                k++;
            }
        }
        if (k != 3) {
            return false;
        } else {
            return true;
        }
    }

    private boolean normFormat(String text) {
        String[] chars = text.split("\\.");
        if (chars.length != 4) {
            return false;
        }
        for (int i = 0; i < chars.length ; i++) {
            if (!isNotContainsLetters(chars[i])){
                return false;
            }
        }
        if (chars[0].length() > 3 || chars[1].length() > 3 || chars[2].length() > 3 || chars[3].length() > 3) {
            return false;
        }
        for (int i = 0; i < chars.length ; i++) {
            if (Integer.parseInt(chars[i]) > 255) {
                return false;
            }
        }
        return true;
    }
}
