package pl.battleship.repository;

import org.springframework.data.repository.CrudRepository;
import pl.battleship.model.dao.User;

public interface UserRepository extends CrudRepository<User,String>{

    int countAllByMailOrUsername(String mail, String username);

}
