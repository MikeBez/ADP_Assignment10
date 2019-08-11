package za.ac.cput.factory.user;


import za.ac.cput.domain.demography.Gender;
import za.ac.cput.domain.demography.Race;
import za.ac.cput.domain.user.Employee;
import za.ac.cput.factory.demography.GenderFactory;
import za.ac.cput.factory.demography.RaceFactory;


public class EmployeeFactory {

    public static Employee buildEmployee(String empNumber, String firstName, String lastName, String gender, String race){

        Gender genderBuild = GenderFactory.buildGender(empNumber, gender);
        Race raceBuild = RaceFactory.buildRace(empNumber, race);
        return new Employee.Builder()
                .empNumber(empNumber)
                .firstName(firstName)
                .lastName(lastName)
                .gender(genderBuild)
                .race(raceBuild).Build();
    }
}
