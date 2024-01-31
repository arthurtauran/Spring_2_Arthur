package fr.limayrac.frais.model;
import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(nullable = false, unique = true, length = 50)
    private Long id;

    @Column(name = "statut", nullable = false, length = 20)
    private String statut;
    @Column(name = "fristname", nullable = false, length = 20)
    private String firstName;
    @Column(name = "last_name", nullable = false, length = 20)

    private String lastName;
    @Column(name = "email", nullable = false, length = 20)

    private String email;
    @Column(name = "password", nullable = false, length = 20)

    private String password;
    }