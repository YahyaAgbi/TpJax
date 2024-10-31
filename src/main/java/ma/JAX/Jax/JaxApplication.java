package ma.JAX.Jax;

import ma.JAX.Jax.entity.Compte;
import ma.JAX.Jax.entity.TypeCompte;
import ma.JAX.Jax.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class JaxApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository
	){
		return args -> {
			compteRepository.save(new Compte(null, 9000, new Date(), TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 6000, new Date(), TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 3000, new Date(), TypeCompte.COURANT));
			compteRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});
		};
	}
}
