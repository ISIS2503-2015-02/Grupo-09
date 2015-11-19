package models;

import be.objectify.deadbolt.core.models.Role;

import javax.persistence.*;

/**
 * Created by ryogi on 3/11/15.
 */
@Entity
public class UserRole implements Role {

    public static final String DRIVER = "driver";

    public static final String ADMIN = "admin";

    public static final String USER = "user";

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
    public Long id;

    public UserRole() {

    }

    @Column(nullable = false, unique=true)
    public String roleName;

    @Override
    public String getName() {
        return roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String roleName) {
        this.roleName = roleName;
    }
}
