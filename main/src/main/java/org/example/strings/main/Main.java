package org.example.strings.main;

import org.example.strings.tools.MyStrings;

public class Main {
    public static void main(String[] args) {
        MyStrings myStrings = new MyStrings();

        System.out.println("\nТекст инициилизируется в виде большой строки.\n\n"+myStrings.createMonsterString());
        String text = myStrings.createMonsterString();
        myStrings.blankspace();
        myStrings.printSymbolsMap(myStrings.countSymbolOccurrencies(text));
        myStrings.blankspace();
        myStrings.printWordsMap(myStrings.countWordsOccurrencies(text));
    }
}
