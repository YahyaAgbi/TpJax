package ma.JAX.Jax.config;

import ma.JAX.Jax.rest.CompteRestJaxRSapi;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jerseyServlet = new ResourceConfig();
        jerseyServlet.register(CompteRestJaxRSapi.class);
        return jerseyServlet;
    }
}