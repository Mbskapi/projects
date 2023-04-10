package Data.Repository;

import Data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntriesRepository extends JpaRepository<User, Integer> {
}
