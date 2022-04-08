package agatkafraczek.animalshelter.animalshelter.bootstrap;

import agatkafraczek.animalshelter.animalshelter.domain.Animal;
import agatkafraczek.animalshelter.animalshelter.domain.Person;
import agatkafraczek.animalshelter.animalshelter.repositories.AnimalRepository;
import agatkafraczek.animalshelter.animalshelter.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AnimalRepository animalRepository;
    private final PersonRepository personRepository;

    public BootStrapData(AnimalRepository animalRepository, PersonRepository personRepository) {
        this.animalRepository = animalRepository;
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Animal dog = new Animal("dog", "Burek", 2);
        Animal cat = new Animal("cat", "Kiara", 3);

        Person dave = new Person("Dave","Johnson", "New York");
        Person anna = new Person("Anna", "White", "New Jersey");

        dave.getAnimals().add(dog);
        anna.getAnimals().add(cat);
        animalRepository.save(dog);
        animalRepository.save(cat);
        personRepository.save(dave);
        personRepository.save(anna);
    }
}
