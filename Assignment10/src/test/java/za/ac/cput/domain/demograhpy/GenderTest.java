package za.ac.cput.domain.demograhpy;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.demography.Gender;
import za.ac.cput.factory.demography.GenderFactory;
import za.ac.cput.repository.demography.GenderRepository;

import static org.junit.Assert.assertNotNull;

public class GenderTest {

    private GenderRepository genderRepo;
    private Gender gender;

    @Before
    public void setUp() throws Exception
    {
        genderRepo = GenderRepository.getRepository();
        gender = GenderFactory.buildGender
                ("217037240",
                        "Male"
                );
    }

    @Test
    public void getEmpNumber()
    {
        assertNotNull(gender.getEmpNumber());
        System.out.println(gender.getEmpNumber());
    }

    @Test
    public void getGender() {
        assertNotNull(gender.getGender());
        System.out.println(gender.getGender());
    }
}
