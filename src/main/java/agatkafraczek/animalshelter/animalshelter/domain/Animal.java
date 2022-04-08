package agatkafraczek.animalshelter.animalshelter.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long animalId;

    private String species;
    private String name;
    private int age;

    @ManyToOne
    private Person person;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public Long getId() {
        return animalId;
    }

    public void setId(Long animalId) {
        this.animalId = animalId;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        return Objects.equals(animalId, animal.animalId);
    }

    @Override
    public int hashCode() {
        return animalId != null ? animalId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalId=" + animalId +
                ", species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
