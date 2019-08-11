package za.ac.cput.domain.demography;

public class Race {

    private String empNumber;
    private String race;

    public Race(Builder Build){
        this.empNumber = Build.empNumber;
        this.race = Build.race;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    public String getRace() {
        return race;
    }

    @Override
    public String toString() {
        return
                "Employee Number:" + getEmpNumber() +
                        "\nRace           :" + getRace() ;
    }

    public static class Builder{

        private String empNumber;
        private String race;

        public Builder empNumber(String empNumber){
            this.empNumber = empNumber;
            return this;
        }
        public Builder race(String race){
            this.race = race;
            return this;
        }

        public Race Build(){
            return new Race(this);
        }
    }
}
