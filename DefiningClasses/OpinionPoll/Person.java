package DefiningClasses.OpinionPoll;
//created by J.M.

public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String output() {
        return String.format("%s - %s", getName(), getAge());
    }
}