package pl.battleship.model.dao;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_name", unique = true, nullable = false)
    private String username;
    @Column(name = "mail", unique = true, nullable = false)
    private String mail;
    @Column(name = "password", nullable = false)
    private String password;

    private String role;

    public User(String username, String mail, String password) {
        this.username = username;
        this.mail = mail;
        this.password = password;
    }
}
