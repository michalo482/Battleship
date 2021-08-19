package pl.battleship.auth;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.battleship.model.dao.User;
import pl.battleship.service.UserService;

@AllArgsConstructor
//@Service
public class UserDetailsServiceImpl {

//    private UserService userService;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        final User user = userService.getUser(username)
//                .orElseThrow(() -> new UsernameNotFoundException(username));
//
//        return new UserDetailsImplementation(user);
//    }
}
