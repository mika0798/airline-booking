package com.project.airline_booking.enums;

public enum City {
    HOCHIMINH(Country.VIETNAM),
    HANOI(Country.VIETNAM),

    NEWYORK(Country.USA),
    WASHINGTON(Country.USA),

    BEIJING(Country.CHINA),
    SHANGHAI(Country.CHINA),

    SINGAPORE(Country.SINGAPORE),

    TORONTO(Country.CANADA),
    MONTREAL(Country.CANADA),

    MELBOURNE(Country.AUSTRALIA),
    SYDNEY(Country.AUSTRALIA),

    YOKOHAMA(Country.JAPAN),
    TOKYO(Country.JAPAN),

    MARSEILLE(Country.FRANCE),
    PARIS(Country.FRANCE),

    BARCELONA(Country.SPAIN),
    MADRID(Country.SPAIN);


    private final Country country;
    City(Country country) {
        this.country = country;
    }




}
