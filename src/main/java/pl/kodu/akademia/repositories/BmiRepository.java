package pl.kodu.akademia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.kodu.akademia.command.BmiResults;

@Repository
public interface BmiRepository extends CrudRepository<BmiResults, String> {

}
