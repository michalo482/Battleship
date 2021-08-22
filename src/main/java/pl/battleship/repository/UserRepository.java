package pl.battleship.repository;

import org.springframework.data.repository.CrudRepository;
import pl.battleship.model.dao.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User,String>{

    int countAllByMailOrUsername(String mail, String username);

    List<User> findAll();

}
