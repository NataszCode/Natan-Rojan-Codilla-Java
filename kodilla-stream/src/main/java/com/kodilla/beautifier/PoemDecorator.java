package com.kodilla.beautifier;
/*
7.1. Wstęp do programowania funkcyjnego, czyli wyrażenia lambda
Zadanie: upiększacz tekstów
Przygotowanie:

Stwórz klasę PoemBeautifier posaidającą metodę beautify, której jako parametry będzie można przekazać tekst do upiększenia oraz wyrażenie lambda upiększające tekst.
Wykonanie zadania:

W metodzie main(String[] args) klasy StreamMain, utwórz obiekt klasy PoemBeautifier i wywołaj kilka razy metodę beautify z różnymi tekstami i różnymi upiększaczami tekstu (wyrażenia lambda).
Przykładowymi upiększaczami tekstu mogą być na przykład kody dopisujące znaki "ABC" na początku i na końcu otrzymanego tekstu lub kody zmieniające cały otrzymany tekst na duże litery (skorzystaj z metody toUpperCase() klasy String).
Wymyśl również dwa własne upiększacze.
Kod zadania prześlij do GitHub.
 */
public interface PoemDecorator {

    String decorate(String str);

}
