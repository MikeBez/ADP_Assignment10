package za.ac.cput.domain.demograhpy;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.demography.Race;
import za.ac.cput.factory.demography.RaceFactory;
import za.ac.cput.repository.demography.RaceRepository;

import static org.junit.Assert.assertNotNull;

public class RaceTest {

    private RaceRepository RaceRepo;
    private Race race;
    @Before
    public void setUp() throws Exception
    {
        RaceRepo = RaceRepository.getRepository();
        race = RaceFactory.buildRace("217037240", "Coloured");
    }

    @Test
    public void getEmpNumber()
    {
        assertNotNull(race.getEmpNumber());
        System.out.println(race.getEmpNumber());
    }

    @Test
    public void getRace()
    {
        assertNotNull(race.getRace());
        System.out.println(race.getRace());
    }
}
