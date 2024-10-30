package IteratorAndComparator.exercises.ComparingObjects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private String town;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }


    @Override
    public int compareTo(Person person) {
        // first you should compare their names,
        if (this.name.equals(person.name)) {
            // after that - their age
            if (this.age == person.age) {
                // and last but not least - compare their town.
                if (this.town.equals(person.town)) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
