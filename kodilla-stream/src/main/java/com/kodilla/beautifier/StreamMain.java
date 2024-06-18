package com.kodilla.beautifier;


import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ORIGINAL CAPITAL TEXT", String::toLowerCase);
        poemBeautifier.beautify("original small text", str -> str.toUpperCase());
        poemBeautifier.beautify("original small text", str -> str + "end");
        poemBeautifier.beautify("original small text", str -> str + ":D");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}