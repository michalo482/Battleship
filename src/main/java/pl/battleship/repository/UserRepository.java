package pl.battleship.repository;

import org.springframework.data.repository.CrudRepository;
import pl.battleship.model.dao.User;

public interface UserRepository extends CrudRepository<User,Long>{

    User findUserByUsername(String username);
}
