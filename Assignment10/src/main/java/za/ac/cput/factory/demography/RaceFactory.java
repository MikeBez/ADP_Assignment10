package za.ac.cput.factory.demography;

import za.ac.cput.domain.demography.Race;

public class RaceFactory {

    public static Race buildRace(String empNumber, String race)
    {
        return new Race.Builder()
                .empNumber(empNumber)
                .race(race)
                .Build();

    }
}
