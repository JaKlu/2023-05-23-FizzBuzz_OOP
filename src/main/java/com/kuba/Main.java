package com.kuba;

import com.kuba.model.Shout;

public class Main {
    public static void main(String[] args) {
        Shout shout = new Shout(3, "Trzy!",
                new Shout(5, "Pięć!",
                        new Shout(7, "Siedem!")));
        for (int i = 1; i <= 105; i++) {
            System.out.println(shout.generate(i));
        }
    }
}