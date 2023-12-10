package com.rayen.boissona;
import java.util.Date;
import java.util.List;

import com.rayen.boissona.entities.Type;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.rayen.boissona.entities.Boisson;
import com.rayen.boissona.repos.BoissonRepository;
@SpringBootTest
class BoissonAApplicationTests {

    @Autowired
    private BoissonRepository boissonRepository;

    @Test
    public void testCreateBoisson() {
        Boisson b = new Boisson("express", 2.0, new Date());
        boissonRepository.save(b);
    }

    @Test
    public void testFindBoisson() {
        Boisson b = boissonRepository.findById(1L).get();
        System.out.println(b);
    }

    @Test
    public void testUpdateBoisson() {
        Boisson b = boissonRepository.findById(1L).get();
        b.setPrixBoisson(9.0);
        boissonRepository.save(b);
    }

    @Test
    public void testDeleteBoisson() {
        boissonRepository.deleteById(1L);
        ;
    }

    @Test
    public void testListerTousBoisson() {
        List<Boisson> bois = boissonRepository.findAll();
        for (Boisson b : bois) {
            System.out.println(b);
        }
    }
    @Test
    public void testFindByNomBoisson()
    {
        List<Boisson> bois = boissonRepository.findByNomBoisson("jus fraise");
        for (Boisson b : bois)
        {
            System.out.println(b);
        }
    }
    @Test
    public void testFindByNomBoissonContains ()
    {
        List<Boisson> bois=boissonRepository.findByNomBoissonContains("jus");
        for (Boisson b : bois)
        {
            System.out.println(b);
        } }
    @Test
    public void testfindByNomPrix()
    {
        List<Boisson> bois = boissonRepository.findByNomPrix("express", 2.0);
        for (Boisson b : bois)
        {
            System.out.println(b);
        }
    }
    @Test
    public void testfindByType()
    {
        Type t = new Type();
        t.setIdType(1L);
        List<Boisson> bois = boissonRepository.findByType(t);
        for (Boisson b : bois)
        {
            System.out.println(b);
        }
    }
    @Test
    public void testfindByTypeIdType()
    {
            List<Boisson> bois = boissonRepository.findByTypeIdType(1L);
            for (Boisson b  :bois)
        {
            System.out.println(b);
        }
    }
    @Test
    public void testfindByOrderByNomBoissonAsc()
    {
        List<Boisson> bois = boissonRepository.findByOrderByNomBoissonAsc();
        for (Boisson b : bois)
        {
            System.out.println(b);
        }
    }
    @Test
    public void testTrierBoissonsNomsPrix()
    {
        List<Boisson> bois = boissonRepository.trierBoissonsNomsPrix();
        for (Boisson b : bois)
        {
            System.out.println(b);
        }
    }
}


