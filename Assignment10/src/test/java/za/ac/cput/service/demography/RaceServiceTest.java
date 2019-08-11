package za.ac.cput.service.demography;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.demography.Race;
import za.ac.cput.factory.demography.RaceFactory;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class RaceServiceTest {

    RaceService service;
    Race race;

    @Before
    public void setUp() throws Exception {
        service = RaceService.getService();
        race = RaceFactory.buildRace("217037240", "Coloured");
    }

    @Test
    public void getService() {
        assertNotNull(service);
        System.out.println(service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        service.create(race);
        assertNotNull(service.read("217037240"));
        System.out.println("Created\n" + service.read("217037240"));
    }

    @Test
    public void read() {
        assertNotNull(service.read("217037240"));
        System.out.println("Read\n"+ service.read("217037240"));
    }

    @Test
    public void update() {
        service.create(race);
        System.out.println(service.read("217037240"));

        Race genderUpdated = RaceFactory.buildRace("217037240", "Updated");
        service.update(genderUpdated);
        Race g = service.read("217037240");
        assertNotEquals(race.getRace(), g.getRace());
        System.out.println("Updated\n"+service.read("217037240"));
    }

    @Test
    public void delete() {
        service.delete("217037240");
        assertNull(service.read(race.getEmpNumber()));
        System.out.println("Delete\n"+service.read(race.getEmpNumber()));
    }
}
