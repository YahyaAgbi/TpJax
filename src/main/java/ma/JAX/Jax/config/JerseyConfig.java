package ma.JAX.Jax.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.moxy.xml.MoxyXmlFeature;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("ma.JAX.Jax.rest");
        register(MoxyXmlFeature.class);
        register(CompteListMessageBodyWriter.class);
    }
}