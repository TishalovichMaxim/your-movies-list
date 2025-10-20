package by.tishalovichm.yourmovieslist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "users-roles")
public class UserRole {

    public static long USER_ID = 1;
    public static long ADMIN_ID = 2;

    @Id
    private Long id;

    private String name;
}
