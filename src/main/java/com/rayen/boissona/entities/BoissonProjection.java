package com.rayen.boissona.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomBois", types = { Boisson.class })
public interface BoissonProjection {
    public String getNomBoisson();
}
