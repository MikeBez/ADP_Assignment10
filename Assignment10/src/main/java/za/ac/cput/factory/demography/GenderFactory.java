package za.ac.cput.factory.demography;


import za.ac.cput.domain.demography.Gender;

public class GenderFactory {

    public static Gender buildGender(String empNumber, String gender)
    {
        return new Gender.Builder()
                .empNumber(empNumber)
                .gender(gender)
                .Build();
    }
}
