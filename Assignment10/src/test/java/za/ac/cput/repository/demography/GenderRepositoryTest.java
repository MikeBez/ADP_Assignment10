package za.ac.cput.repository.demography;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.demography.Gender;
import za.ac.cput.factory.demography.GenderFactory;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotNull;

public class GenderRepositoryTest {

    GenderRepository repository;
    Gender gender;

    @Before
    public void setUp() throws Exception
    {
        repository = GenderRepository.getRepository();
        gender = GenderFactory.buildGender("217037240", "Male");
    }

    @Test
    public void getRepository()
    {
        assertNotNull(repository);
        System.out.println(repository);
    }

    @Test
    public void getAll()
    {
        repository.create(gender);
        assertNotNull(repository.getAll());
        System.out.println(repository.getAll());
    }

    @Test
    public void create()
    {
        repository.create(gender);
        assertNotNull(repository.read(gender.getEmpNumber()));
        System.out.println("Created\n" + repository.read("217037240"));
    }

    @Test
    public void read()
    {
        assertNotNull(repository.read(gender.getEmpNumber()));
        System.out.println("Read\n" + repository.read("217037240"));
    }

    @Test
    public void update()
    {
        Gender genderUpdate = GenderFactory.buildGender("217037240"
                , "Updated");
        repository.update(genderUpdate);
        System.out.println(repository.read("217037240"));
    }

    @Test
    public void delete()
    {
        repository.delete(gender.getEmpNumber());
        assertNull(repository.read("217037240"));
        System.out.println("Deleted\n" + repository.read("217037240"));
    }
}