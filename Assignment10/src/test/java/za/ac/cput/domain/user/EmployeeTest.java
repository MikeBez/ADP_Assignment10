package za.ac.cput.domain.user;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.user.Employee;
import za.ac.cput.factory.user.EmployeeFactory;
import za.ac.cput.repository.user.EmployeeRepository;

import static org.junit.Assert.assertNotNull;

public class EmployeeTest {

    private EmployeeRepository employeeRep;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        employeeRep = EmployeeRepository.getRepository();
        employee = EmployeeFactory.buildEmployee
                (
                        "217037240",
                        "Michael",
                        "Bezuidenhout",
                        "Male",
                        "Coloured"
                );
    }

    @Test
    public void getEmpNumber()
    {
        assertNotNull(employee.getEmpNumber());
        System.out.println(employee.getEmpNumber());
    }

    @Test
    public void getFirstName()
    {
        assertNotNull(employee.getFirstName());
        System.out.println(employee.getFirstName());
    }

    @Test
    public void getSurname()
    {
        assertNotNull(employee.getSurname());
        System.out.println(employee.getSurname());
    }

    @Test
    public void getGender()
    {
        assertNotNull(employee.getGender().getEmpNumber());
        System.out.println(employee.getGender().getGender());
    }

    @Test
    public void getRace()
    {
        assertNotNull(employee.getRace().getEmpNumber());
        System.out.println(employee.getRace().getRace());
    }
}