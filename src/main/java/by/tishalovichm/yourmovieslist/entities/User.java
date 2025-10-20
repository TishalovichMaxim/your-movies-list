package by.tishalovichm.yourmovieslist.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    private Long id;

    private String login;

    @Column(name = "passwords-hash")
    private String passwordHash;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role-id")
    private UserRole role;
}
