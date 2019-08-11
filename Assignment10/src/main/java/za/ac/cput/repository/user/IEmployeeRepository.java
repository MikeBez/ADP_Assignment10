package za.ac.cput.repository.user;

import za.ac.cput.domain.user.Employee;
import za.ac.cput.repository.IRepository;

import java.util.Set;

public interface IEmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}
