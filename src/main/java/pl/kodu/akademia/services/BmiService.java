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
        BmiResults saved = repository.save(bmi);
        return saved.getId();
    }

    public BmiResults find(String id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Wrong id"));
    }

    public boolean checkIfExists(String id) {
        return repository.existsById(id);
    }
}
