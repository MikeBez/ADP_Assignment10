package za.ac.cput.service.user;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.user.Employee;
import za.ac.cput.factory.user.EmployeeFactory;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class EmployeeServiceTest {
    EmployeeService emp_service;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        emp_service = EmployeeService.getService();
        employee = EmployeeFactory.buildEmployee
                ("217037240"
                , "Michael"
                , "Bezuidenhout"
                , "Male"
                ,"Coloured");
    }

    @Test
    public void getService() {
        assertNotNull(emp_service);
        System.out.println(emp_service);
    }

    @Test
    public void getAll() {
    }

    @Test
    public void create() {
        emp_service.create(employee);
        assertNotNull(emp_service.read("217037240"));
        System.out.println("Created\n" + emp_service.read("217037240"));
    }

    @Test
    public void read() {
        assertNotNull(emp_service.read("217037240"));
        System.out.println("Read\n"+ emp_service.read("217037240"));
    }

    @Test
    public void update() {
        emp_service.create(employee);
        System.out.println(emp_service.read("217037240"));

        Employee employeeUpdated = EmployeeFactory.buildEmployee
                (
                        "217037240",
                        "John",
                        "Wick",
                        "Updated",
                        "Coloured"
                );
        emp_service.update(employeeUpdated);
        Employee em = emp_service.read("217037240");
        assertNotEquals(employee.getSurname(), em.getSurname());
        System.out.println("Updated\n"+emp_service.read("217037240"));
    }

    @Test
    public void delete() {
        emp_service.delete("217037240");
        assertNull(emp_service.read(employee.getEmpNumber()));
        System.out.println("Delete\n"+emp_service.read(employee.getEmpNumber()));
    }
}