package com.rayen.boissona.entities;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Boisson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idBoisson;
    private String nomBoisson;
    private Double prixBoisson;
    private Date dateServir;
    @ManyToOne
     private Type type;




    public Boisson() {
        super();
    }


    public Boisson(String nomBoisson, Double prixBoisson, Date dateServir) {
        super();
        this.nomBoisson = nomBoisson;
        this.prixBoisson = prixBoisson;
        this.dateServir = dateServir;
    }

    public Long getIdBoisson() {
        return idBoisson;
    }

    public void setIdBoisson(Long idBoisson) {
        this.idBoisson = idBoisson;
    }

    public String getNomBoisson() {
        return nomBoisson;
    }

    public void setNomBoisson(String nomBoisson) {
        this.nomBoisson = nomBoisson;
    }

    public Double getPrixBoisson() {
        return prixBoisson;
    }

    public void setPrixBoisson(Double prixBoisson) {
        this.prixBoisson = prixBoisson;
    }

    public Date getDateServir() {
        return dateServir;
    }

    public void setDateServir(Date dateServir) {
        this.dateServir = dateServir;
    }

    @Override
    public String toString() {
        return "Boisson[idBoisson=" + idBoisson + ",nomBoisson=" + nomBoisson + ", prixBoisson=" + prixBoisson + ",dateServir=" + dateServir + "]";
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

































