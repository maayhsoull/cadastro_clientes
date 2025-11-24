package br.com.may.cadastro.model;

import java.time.LocalDate;

public class Cliente {

    public int id;
    public String nome;
    public String email;
    public LocalDate dataNascimento;
    public double salario;

    public void exibirCliente() {
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Salário: " + salario);


    }
}
