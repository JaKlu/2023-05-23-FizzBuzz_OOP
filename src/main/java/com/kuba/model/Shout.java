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

    public String generate(int n) {
        StringBuilder sb = new StringBuilder();
        generate(sb, n);
        return sb.length() == 0 ? String.valueOf(n) : sb.toString();
    }

    private void generate(StringBuilder sb, int n) {
        if (n % divisor == 0) {
            sb.append(textForDivisor);
        }
        if (next != null) {
            next.generate(sb, n);
        }
    }
}