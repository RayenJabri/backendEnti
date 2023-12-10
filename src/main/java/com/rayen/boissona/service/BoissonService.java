package com.rayen.boissona.service;
import java.util.List;
import com.rayen.boissona.entities.Boisson;
import com.rayen.boissona.entities.Type;

public interface BoissonService {

        Boisson saveBoisson(Boisson b);
    Boisson updateBoisson(Boisson b);
    void deleteBoisson(Boisson b);
    void deleteBoissonById(Long id);
    Boisson getBoisson(Long id);
    List<Boisson> getAllBoisson();
    List<Boisson> findByNomBoisson(String nom);
    List<Boisson> findByNomBoissonContains(String nom);
    List<Boisson> findByNomPrix (String nom, Double prix);
    List<Boisson> findByType (Type type);
    List<Boisson> findByTypeIdType(Long id);
    List<Boisson> findByOrderByNomBoissonAsc();
    List<Boisson> trierBoissonsNomsPrix();

}
