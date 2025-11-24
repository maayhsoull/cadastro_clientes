package br.com.may.cadastro.repository;

import br.com.may.cadastro.model.Cliente;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ClienteRepository {

    private Cliente cliente;

    public void cadastrar(){
        //obter o caminho para o arquivo
        Path arquivo = Path.of("C:\\Users\\25203738\\ds1m\\clientes\\clientes.csv");

        try { // tentar executar o comando
            Files.writeString(arquivo, "Senai Jandira\n",StandardOpenOption.APPEND);
        } catch (IOException e) { //se dar erro vou pegar esse erro e tratar
            System.out.println("Erro ao abrir o arquivo");
            System.out.println(e.getMessage()); // informa que foi pego um erro
        }

    }
    public void excluir(){

    }
    public void listar(){

    }
    public void exibirPorId(){
    }
    public void atualizar(){

    }



}
