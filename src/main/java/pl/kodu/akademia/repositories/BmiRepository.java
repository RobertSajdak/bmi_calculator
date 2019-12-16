package pl.kodu.akademia.repositories;

import org.springframework.stereotype.Repository;
import pl.kodu.akademia.command.BmiResults;

import java.util.HashMap;
import java.util.Map;

@Repository
public class BmiRepository {
    private Map<String, BmiResults> data = new HashMap<>();

    public void add(String id, BmiResults bmi) {
        data.put(id, bmi);
        System.out.println(data);
    }

    public BmiResults find(String id) {
        if (data.containsKey(id)) {
            return data.get(id);
        }
        return null;
    }

    public boolean checkIfExists(String id){
        return data.containsKey(id);
    }
}
