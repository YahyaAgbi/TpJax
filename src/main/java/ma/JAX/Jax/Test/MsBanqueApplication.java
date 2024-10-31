package ma.JAX.Jax.Test;

import ma.JAX.Jax.entity.Compte;
import ma.JAX.Jax.entity.TypeCompte;
import ma.JAX.Jax.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

public class MsBanqueApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsBanqueApplication.class, args);
    }

}
