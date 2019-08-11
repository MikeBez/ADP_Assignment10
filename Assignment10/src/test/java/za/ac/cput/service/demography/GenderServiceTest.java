package za.ac.cput.service.demography;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.demography.Gender;
import za.ac.cput.factory.demography.GenderFactory;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GenderServiceTest {

    GenderService service;
    Gender gender;

    @Before
    public void setUp() throws Exception {
        service = GenderService.getService();
        gender = GenderFactory.buildGender("217037240", "Male");
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
        service.create(gender);
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
        service.create(gender);
        System.out.println(service.read("217037240"));

        Gender genderUpdated = GenderFactory.buildGender("217037240", "Updated");
        service.update(genderUpdated);
        Gender g = service.read("217037240");
        assertNotEquals(gender.getGender(), g.getGender());
        System.out.println("Updated\n"+service.read("217037240"));
    }

    @Test
    public void delete() {
        service.delete("217037240");
        assertNull(service.read(gender.getEmpNumber()));
        System.out.println("Delete\n"+service.read(gender.getEmpNumber()));
    }
}
