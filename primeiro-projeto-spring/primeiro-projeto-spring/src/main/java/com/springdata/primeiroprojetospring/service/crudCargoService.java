package com.springdata.primeiroprojetospring.service;

import com.springdata.primeiroprojetospring.orm.Cargos;
import com.springdata.primeiroprojetospring.repository.CargoRepository;
import org.springframework.stereotype.Service;


import java.util.Scanner;
@Service
public class crudCargoService {
    private Boolean system = true;
    final CargoRepository cargoRepository;

    public crudCargoService(CargoRepository cargoRepository){
        this.cargoRepository = cargoRepository;
    }

    public void inicial(Scanner in ){
        while (system){
            System.out.println("Qual ação de cargo deseja executar? ");
            System.out.println("0 - Sair");
            System.out.println("1 - Salvar");
            System.out.println("2 - Atualizar");
        }
        int action = in.nextInt();

        switch (action){
            case 1:
                salvar(in);
                break;
            case 2:
                atualizar(in);
                break;
            case 3:
                visualizar();
                break;
            case 4:
                deletar(in);
                break;
            default:
                system = false;
                System.out.println("Digite um valor válido");
                break;
        }

    }
    private void salvar(Scanner in){
        System.out.println("Descrição do cargo: ");
        String descricao = in.next();
        Cargos cargo = new Cargos();
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);
        System.out.println("Salvo");

    }
    private void
    atualizar(Scanner in){
        System.out.println("Id");
        int id = in.nextInt();
        System.out.println("Descrição do Cargo: ");
        String descricao = in.next();

        Cargos cargo = new Cargos();
        cargo.setId(id);
        cargo.setDescricao(descricao);
        cargoRepository.save(cargo);
        System.out.println("Atualizado");
    }
    private void visualizar(){
        Iterable <Cargos> cargos = cargoRepository.findAll();
        cargos.forEach(cargo -> System.out.println("cargo"));
    }
    private void deletar(Scanner in){
        System.out.println("Id");
        int id = in.nextInt();
        cargoRepository.deleteById(id);
        System.out.println("Deletado");
    }
}
