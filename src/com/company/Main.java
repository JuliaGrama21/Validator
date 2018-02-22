package com.company;

public class Main {

    public static void main(String[] args) {
//        NameValidator nameValidator = new NameValidator();
//        System.out.println(nameValidator.validate("Julia"));
//        DateValidator dateValidator = new DateValidator();
//        System.out.println(dateValidator.validate("23/04/2035"));
        PhoneValidator phoneValidator = new PhoneValidator();
        System.out.println(phoneValidator.validate("+979798765430"));
//        IPValidator ipValidator = new IPValidator();
//        System.out.println(ipValidator.validate("0.255.78.45"));
//        int mas[]  = {2, 4, 6, 3, 20 };
//        System.out.println(getMin(mas));
    }

    private static int getMin(int[] mas) {
        int k = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (k > mas[i]) {
                k = mas[i];
            }
        }
        return k;
    }

}
