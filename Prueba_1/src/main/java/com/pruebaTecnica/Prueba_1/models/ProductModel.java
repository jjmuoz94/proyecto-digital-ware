
package com.pruebaTecnica.Prueba_1.models;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class ProductModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private long id;

    private String code;
    private String name;
    private String description;
    private float valor;


    


    


    /**
     * return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * return float return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

}
