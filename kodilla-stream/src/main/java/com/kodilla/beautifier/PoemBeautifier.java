package com.kodilla.beautifier;

public class PoemBeautifier {

    /**
     * @param text
     * @param decorator
     * @return
     */
    String beautify(String text, PoemDecorator decorator) {
        String decorated = decorator.decorate(text);
        System.out.printf("Decoration of: %s is %s%n", text, decorated);
        return decorated;
    }
}
