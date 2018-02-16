package prasad.algorithms;

public class Person extends Object{

    public Person(String name, byte age, String address, String city,
                  String state, short zip) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (int) age;
        result = 31 * result + address.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + (int) zip;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        if (age != that.age) return false;
        if (zip != that.zip) return false;
        if (!name.equals(that.name)) return false;
        if (!address.equals(that.address)) return false;
        if (!city.equals(that.city)) return false;
        return state.equals(that.state);

    }

    String name;
    byte age;
    String address;
    String city;
    String state;
    short zip;
}




