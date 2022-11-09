
public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age = 0;
    protected String address = "-";

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int a) {
        age = a;
        if (age <= 0 || age > 120) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        return this;
    }

    public PersonBuilder setAddress(String a) {
        address = a;
        return this;
    }

    public Person build() {
        if (this.name == null || this.surname == null) {
            throw new IllegalStateException("Не хватает обязательных полей");
        } else {
            return new Person(this);
        }
    }
}