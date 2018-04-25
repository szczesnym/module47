package com.kodilla.stream;

import java.util.*;
import java.lang.*;
import java.time.*;

public class SupportRandom {
    static int oneDayTimeStamp = 84600000;
    static int nubmerOfAsciiChar = 25;
    static int firstAsciiCharUpper = 65;
    static int firstAsciiCharLower = 97;

    public static char randomCharUppercase() {
        Random charGenerator = new Random();

        return (char) (charGenerator.nextInt(nubmerOfAsciiChar) + firstAsciiCharUpper);
    }

    public static char randomCharLowercase() {
        Random charGenerator = new Random();

        return (char) (charGenerator.nextInt(nubmerOfAsciiChar) + firstAsciiCharLower);
    }

    public static String randomString(int lenghtOfString) {
        String buffer = new String();

        buffer += buffer + SupportRandom.randomCharUppercase();
        for (int i = 1; i < lenghtOfString; i++) {
            buffer += SupportRandom.randomCharLowercase();
        }
        return buffer;
    }

    public static Date randomDate(int randomRangeInDays) {
        Date today = new Date();
        Random generator = new Random();

        long nowStamp = today.getTime();
        return new Date(nowStamp - (generator.nextInt(randomRangeInDays) * oneDayTimeStamp));
    }

    public static int randomYearThisEpoch() {
        Random generator = new Random();

        return generator.nextInt(100) + 2000;
    }

    public static String randomName() {
        String[] listOfNames = {
                "ADA", "ADAM", "ADELA", "ADELAJDA", "ADRIAN", "ADRIANA", "ADRIANNA", "AGATA", "AGNIESZKA", "ALAN", "ALBERT", "ALEKS", "ALEKSANDER", "ALEKSANDRA", "ALEKSY", "ALEX", "ALEXANDER", "ALEXANDRA", "ALICJA",
                "AMADEUSZ", "AMANDA", "AMELIA", "ANASTAZJA", "ANATOL", "ANDRZEJ", "ANETA", "ANGELIKA", "ANIELA", "ANIKA", "ANITA", "ANNA", "ANTONI", "ANTONIA", "ANTONINA", "APOLONIA", "ARIANNA", "ARKADIUSZ", "ARON", "ARTUR",
                "AUGUST", "AURELIA", "BARBARA", "BARTOSZ", "BEATA", "BENEDYKT", "BENIAMIN", "BENJAMIN", "BERNARD", "BIANKA", "BLANKA", "BOGDAN", "BOGNA", "BORYS", "BRAJAN", "BRAYAN", "BRUNO", "BRUNON", "BRYAN", "BRYGIDA",
                "CARMEN", "CECYLIA", "CELINA", "CEZARY", "CYPRIAN", "CYRYL", "DAGMARA", "DALIA", "DAMIAN", "DANIEL", "DANIELA", "DANUTA", "DARIA", "DARIUSZ", "DAVID", "DAWID", "DENIS", "DIANA", "DIEGO", "DOBRAWA",
                "DOBROCHNA", "DOMINIK", "DOMINIKA", "DONATAN", "DORIAN", "DOROTA", "EDWARD", "EDYTA", "ELENA", "ELIZA", "EMANUEL", "EMIL", "EMILIA", "EMILIAN", "EMILY", "EMMA", "ERNEST", "ERYK", "ESTERA", "EWA",
                "EWELINA", "FABIAN", "FAUSTYNA", "FELICJA", "FELIKS", "FILIP", "FLORIAN", "FRANCISZEK", "FRANCISZKA", "FRYDERYK", "GABRIEL", "GABRIELA", "GAJA", "GLORIA", "GNIEWKO", "GNIEWOMIR", "GRACJAN", "GRETA", "GRZEGORZ", "GUSTAW",
                "HALINA", "HANA", "HANNA", "HELENA", "HENRYK", "HONORATA", "HUBERT", "HUGO", "IDA", "IDALIA", "IGA", "IGNACY", "IGOR", "ILONA", "INES", "INEZ", "INGA", "INKA", "IRENA", "IRENEUSZ",
                "IVO", "IWO", "IWONA", "IZABELA", "IZABELLA", "JACEK", "JADWIGA", "JAGNA", "JAGODA", "JAKUB", "JAN", "JANA", "JANINA", "JANUSZ", "JAREMA", "JEREMI", "JEREMIASZ", "JERZY", "JESSICA", "JOACHIM",
                "JOANNA", "JOEL", "JOLANTA", "JONASZ", "JONATAN", "JOWITA", "JUDYTA", "JULIA", "JULIAN", "JULIANNA", "JULITA", "JULIUSZ", "JUSTYNA", "KACPER", "KAI", "KAJA", "KAJETAN", "KALINA", "KAMIL", "KAMILA",
                "KARIM", "KARINA", "KAROL", "KAROLINA", "KASJAN", "KASPIAN", "KATARZYNA", "KATIA", "KAZIMIERZ", "KEVIN", "KEWIN", "KINGA", "KLARA", "KLAUDIA", "KLAUDIUSZ", "KLEMENS", "KLEMENTYNA", "KONRAD", "KONSTANCJA", "KONSTANTY",
                "KORDIAN", "KORNEL", "KORNELIA", "KORNELIUSZ", "KOSMA", "KRYSPIN", "KRYSTIAN", "KRYSTYNA", "KRZYSZTOF", "KSAWERY", "KSAWIER", "KSENIA", "KUBA", "LARA", "LARYSA", "LAURA", "LEA", "LENA", "LEO", "LEON",
                "LEONARD", "LEONARDO", "LEOPOLD", "LESZEK", "LIDIA", "LILA", "LILIA", "LILIANA", "LILIANNA", "LILLA", "LIVIA", "LIWIA", "LUCJAN", "LUCYNA", "LUDWIK", "LUDWIKA", "LUIZA", "MACIEJ", "MAGDA",
                "MAGDALENA", "MAJA", "MAJKA", "MAKS", "MAKSYM", "MAKSYMILIAN", "MALINA", "MALWINA", "MARCEL", "MARCELA", "MARCELI", "MARCELINA", "MARCIN", "MARCJANNA", "MAREK", "MARIA", "MARIANNA", "MARIKA", "MARIUSZ", "MARLENA",
                "MARTA", "MARTIN", "MARTYNA", "MARZENA", "MATEUSZ", "MATYLDA", "MAURYCY", "MAX", "MAXIMILIAN", "MAXYMILIAN", "MAYA", "MELANIA", "MELISA", "MIA", "MICHAEL", "MICHALINA", "MICHAL", "MICHELLE", "MIECZYSĹLAW", "MIESZKO"
        };
        Random generator = new Random();
        return listOfNames[generator.nextInt(listOfNames.length)];
    }

    public static String randomSurname() {
        String[] listOfSurname = {
                "Nowak", "Kowalski", "Wisniewski", "Wojcik", "Kowalczyk", "Kaminski", "Lewandowski", "Dabrowski", "Zielinski", "Szymanski", "Wozniak", "Kozlowski", "Jankowski", "Mazur", "Wojciechowski", "Kwiatkowski", "Krawczyk", "Kaczmarek", "Piotrowski", "Grabowski",
                "Pawlowski", "Michalski", "Zajac", "Krol", "Nowakowski", "Wieczorek", "Jablonski", "Wrobel", "Adamczyk", "Majewski", "Dudek", "Nowicki", "Olszewski", "Jaworski", "Stepien", "Malinowski", "Pawlak", "Gorski", "Witkowski", "Walczak",
                "Sikora", "Rutkowski", "Michalak", "Baran", "Szewczyk", "Ostrowski", "Tomaszewski", "Pietrzak", "Zalewski", "Wroblewski", "Jasinski", "Duda", "Marciniak", "Zawadzki", "Jakubowski", "Sadowski", "Bak", "Wlodarczyk", "Chmielewski", "Wilk",
                "Borkowski", "Sokolowski", "Szczepanski", "Sawicki", "Kucharski", "Lis", "Maciejewski", "Kubiak", "Czarnecki", "Kalinowski", "Mazurek", "Wysocki", "Kolodziej", "Urbanski", "Kazmierczak", "Sobczak", "Glowacki", "Zakrzewski", "Krajewski", "Sikorski",
                "Wasilewski", "Adamski", "Krupa", "Gajewski", "Laskowski", "Ziolkowski", "Szulc", "Makowski", "Mroz", "Czerwinski", "Baranowski", "Brzezinski", "Szymczak", "Przybylski", "Blaszczyk", "Borowski", "Andrzejewski", "Kaczmarczyk", "Cieslak"
        };
        Random generator = new Random();
        return listOfSurname[generator.nextInt(listOfSurname.length)];
    }
}
