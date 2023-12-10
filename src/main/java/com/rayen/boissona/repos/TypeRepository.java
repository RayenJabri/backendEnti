package com.rayen.boissona.repos;
import com.rayen.boissona.entities.Boisson;
import com.rayen.boissona.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(path = "type")
@CrossOrigin("http://localhost:4200/")

public interface TypeRepository extends JpaRepository<Type, Long>{
}
