package pl.kodu.akademia.services;

import org.springframework.stereotype.Service;
import pl.kodu.akademia.command.BmiResults;
import pl.kodu.akademia.repositories.BmiRepository;

import java.util.Random;

@Service
public class BmiService {
    private BmiRepository repository;

    public BmiService(BmiRepository repository) {
        this.repository = repository;
    }

    public String add(BmiResults bmi) {
        String id = generateId();
        while (repository.checkIfExists(id)) {
            id = generateId();
        }
        repository.add(id, bmi);
        return id;
    }

    private String generateId() {
        Random random = new Random();
        int generatedNumber = random.nextInt(100000);
        return String.valueOf(generatedNumber);
    }

    public BmiResults find(String id) {
        return repository.find(id);
    }

    public boolean checkIfExists(String id) {
        return repository.checkIfExists(id);
    }
}
