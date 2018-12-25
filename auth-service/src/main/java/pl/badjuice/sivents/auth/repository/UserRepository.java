package pl.badjuice.sivents.auth.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.badjuice.sivents.auth.domain.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {
}
