package za.ac.cput.repository.demography;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.demography.Race;
import za.ac.cput.factory.demography.RaceFactory;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;

public class RaceRepositoryTest {

    RaceRepository rep;
    Race race;

    @Before
    public void setUp() throws Exception
    {
        rep = RaceRepository.getRepository();
        race = RaceFactory.buildRace("217037240", "Coloured");
    }

    @Test
    public void getRepository()
    {
        assertNotNull(rep);
        System.out.println(rep);
    }

    @Test
    public void getAll() {
        rep.create(race);
        assertNotNull(rep.getAll());
        System.out.println(rep.getAll());
    }

    @Test
    public void create() {
        rep.create(race);
        assertNotNull(rep.read(race.getEmpNumber()));
        System.out.println("Created\n" + rep.read("217037240"));
    }

    @Test
    public void read() {
        assertNotNull(rep.read(race.getEmpNumber()));
        System.out.println("Read\n" + rep.read("217037240"));
    }

    @Test
    public void update() {
        Race raceUpdate =RaceFactory.buildRace("217037240", "Updated");
        rep.update(raceUpdate);
        System.out.println(rep.read("217037240"));
    }

    @Test
    public void delete()
    {
        rep.delete(race.getEmpNumber());
        assertNull(rep.read("217037240"));
        System.out.println("Deleted\n" + rep.read("217037240"));
    }
}
