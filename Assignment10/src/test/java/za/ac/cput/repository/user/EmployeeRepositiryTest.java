package za.ac.cput.repository.user;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.domain.user.Employee;
import za.ac.cput.factory.user.EmployeeFactory;

import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class EmployeeRepositiryTest {

    EmployeeRepository emp_repository;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        emp_repository = EmployeeRepository.getRepository();
        employee = EmployeeFactory.buildEmployee
                ("217037240"
                        ,"Michael"
                        ,"Bezuidenhout"
                        ,"Male"
                        ,"Coloured");
    }

    @Test
    public void getRepository() {
        assertNotNull(emp_repository);
        System.out.println(emp_repository);
    }

    @Test
    public void getAll() {
        emp_repository.create(employee);
        assertNotNull(emp_repository.getAll());
        System.out.println("Get All\n" + emp_repository.getAll());
    }

    @Test
    public void create() {
        emp_repository.create(employee);
        assertNotNull(emp_repository.read(employee.getEmpNumber()));
        System.out.println("Created\n" + emp_repository.read(employee.getEmpNumber()));
    }

    @Test
    public void read() {
        assertNotNull(emp_repository.read(employee.getEmpNumber()));
        System.out.println("Read\n" + emp_repository.read(employee.getEmpNumber()));
    }

    @Test
    public void update() {
        Employee employeeUpdated = EmployeeFactory.buildEmployee
                ("217037240"
                        ,"Peter"
                        ,"Parker"
                        ,"Male"
                        ,"White");
        emp_repository.update(employeeUpdated);

        Employee em = emp_repository.read("217037240");
        assertNotEquals(employee.getSurname(), em.getSurname());
        System.out.println("Updated\n" + emp_repository.read("217037240"));
    }

    @Test
    public void delete()
    {
        emp_repository.delete("217037240");
        assertNull(emp_repository.read("217037240"));
        System.out.println("Deleted\n" + emp_repository.read("217037240"));

    }
}
