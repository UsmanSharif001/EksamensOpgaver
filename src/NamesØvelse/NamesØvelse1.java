package NamesØvelse;

public class NamesØvelse1 {

    private String firstName;
    private String middleName;
    private String lastName;
    private String fullName;



    public NamesØvelse1(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

    }

    public NamesØvelse1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "NamesØvelse1{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'';
    }
}
