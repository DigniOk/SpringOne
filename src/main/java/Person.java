import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return new EqualsBuilder().append(firstName, person.firstName).append(lastName, person.lastName).append(age, person.age).isEquals();
    }
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(firstName).append(lastName).append(age).toHashCode();
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("age", age)
                .toString();
    }
}
