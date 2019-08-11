package za.ac.cput.factory.user;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.user.Employee;

import static org.junit.Assert.assertNotNull;

public class EmployeeFactoryTest {

    Employee emp;

    @Before
    public void setUp() throws Exception {
        emp = EmployeeFactory.buildEmployee
                ("217037240"
                ,"Michael"
                ,"Bezuidenhout"
                , "Male"
                ,"Coloured");
    }

    @Test
    public void buildEmployee() {
        assertNotNull(emp);
        System.out.println(emp);
    }
}
