package Main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import Main.Model.Log;

public interface LogRepository extends JpaRepository<Log, Integer> {

}
