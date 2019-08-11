package za.ac.cput.factory.demography;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.demography.Race;

import static org.junit.Assert.assertNotNull;

public class RaceFactoryTest {

    Race race;
    @Before
    public void setUp() throws Exception
    {
        race  = RaceFactory.buildRace("217037240", "Coloured");
    }

    @Test
    public void buildRace()
    {
        assertNotNull(race);
        System.out.println(race);
    }
}
