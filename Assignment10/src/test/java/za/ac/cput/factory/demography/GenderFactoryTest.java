package za.ac.cput.factory.demography;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.demography.Gender;

import static org.junit.Assert.assertNotNull;

public class GenderFactoryTest {
    Gender gender;
    @Before
    public void setUp() throws Exception {
        gender = GenderFactory.buildGender
                ("216022002", "Male");
    }

    @Test
    public void buildGender()
    {
        assertNotNull(gender);
        System.out.println(gender);
    }
}
