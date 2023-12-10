package com.rayen.boissona.repos;

import com.rayen.boissona.entities.Boisson;
import com.rayen.boissona.entities.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path = "rest")
public interface BoissonRepository extends JpaRepository<Boisson, Long> {
    List<Boisson> findByNomBoisson(String nom);
    List<Boisson> findByNomBoissonContains(String nom);
    @Query("select b from Boisson b where b.nomBoisson like %?1 and b.prixBoisson >?2")
    List<Boisson> findByNomPrix (String nom, Double prix);

    @Query("select b from Boisson b where b.type = ?1")
    List<Boisson> findByType(Type type);
    List<Boisson> findByTypeIdType(Long id);
    List<Boisson> findByOrderByNomBoissonAsc();
    @Query("select b from Boisson b order by b.nomBoisson ASC, b.prixBoisson DESC")
    List<Boisson> trierBoissonsNomsPrix ();


}
