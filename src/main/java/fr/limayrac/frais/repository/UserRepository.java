package fr.limayrac.frais.repository;

import fr.limayrac.frais.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public abstract class UserRepository implements JpaRepository<User, Long> {

    @Query("SELECT u FROM u User WHERE u.email = ?1")
    public abstract User findByEmail(String email);
}