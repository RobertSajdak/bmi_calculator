package pl.kodu.akademia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kodu.akademia.command.BmiResults;

import java.util.HashMap;
import java.util.Map;

@Repository
public interface BmiRepository extends CrudRepository<BmiResults, String> {
}