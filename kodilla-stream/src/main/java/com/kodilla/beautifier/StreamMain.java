package com.kodilla.beautifier;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ORIGINAL CAPITAL TEXT", String::toLowerCase);
        poemBeautifier.beautify("original small text", str -> str.toUpperCase());
        poemBeautifier.beautify("original small text", str -> str + "end");
        poemBeautifier.beautify("original small text", str -> str + ":D");
    }
}