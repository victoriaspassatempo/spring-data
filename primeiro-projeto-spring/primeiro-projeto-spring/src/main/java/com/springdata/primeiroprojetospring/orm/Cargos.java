package com.springdata.primeiroprojetospring.orm;

import org.springframework.stereotype.Controller;
import javax.persistence.*;

@Controller
@Entity
@Table(name = "cargos")
public class Cargos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString(){
        return "Cargo [id =" + id + ", descricao =" + descricao + "]";
    }
}
