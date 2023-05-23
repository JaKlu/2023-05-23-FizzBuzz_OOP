package com.kuba.model;

public class Shout {
    private final int divisor;
    private final String textForDivisor;
    private final Shout next;

    public Shout(int divisor, String textForDivisor, Shout next) {
        this.divisor = divisor;
        this.textForDivisor = textForDivisor;
        this.next = next;
    }

    public Shout(int divisor, String textForDivisor) {
        this(divisor, textForDivisor, null);
    }

    public String generate(int number) {
        StringBuilder numberDescription = new StringBuilder();
        generate(numberDescription, number);
        return numberDescription.length() == 0 ? String.valueOf(number) : numberDescription.toString();
    }

    private void generate(StringBuilder numberDescription, int number) {
        if (number % divisor == 0) {
            numberDescription.append(textForDivisor);
        }
        if (next != null) {
            next.generate(numberDescription, number);
        }
    }
}