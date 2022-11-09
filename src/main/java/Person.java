import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(PersonBuilder personBuilder) {
        name = personBuilder.name;
        surname = personBuilder.surname;
        age = personBuilder.age;
        address = personBuilder.address;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        OptionalInt ageEm = getAge();
        if (ageEm.isEmpty()) {
            return ageEm;
        }
        return OptionalInt.empty();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return " " + name + " " + surname + " (" + age + ", " + address + ")";
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(this.getSurname());
    }
}