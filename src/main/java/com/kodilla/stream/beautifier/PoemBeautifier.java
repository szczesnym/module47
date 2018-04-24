package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String stringToBuety, PoemDecorator poemDecorator) {
        System.out.format("Original text %s, changed text: %s\n", stringToBuety, poemDecorator.decorate(stringToBuety));
    }
}
