package br.com.may.cadastro.ui;

import br.com.may.cadastro.model.Cliente;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

public class CadastroUi {

    public int opcao;

    public void criarMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de clientes");
        System.out.println("------------------------");
        System.out.println();
        System.out.println("1 - Cadastrar cliente");
        System.out.println("2 - Listar todos");
        System.out.println("3 - Exibir cliente");
        System.out.println("4 - Excluir cliente");
        System.out.println("5 - Atualizar cliente");
        System.out.println("6 - Sair");
        System.out.println("-----------------------");
        System.out.println();
        System.out.print("Escolha uma opção(1-6): ");

        opcao = sc.nextInt(); //coleta a escolha do usuário

        switch (opcao) {
            case 1:
                cadastrarCliente();
                break;
            case 2:
                System.out.println("Listar Todos");
                break;
            case 3:
                System.out.println("Exibir Cliente");
                break;
            case 4:
                System.out.println("Excluir Cliente");
                break;
            case 5:
                System.out.println("Atualizar Cliente");
                break;
            case 6:
                System.out.println("Sair");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida, escolha entre 1 e 6 somente!");
                criarMenu();
                break;

        }

    }

    private void cadastrarCliente() {
        //Identificador universal
        Scanner sc = new Scanner(System.in);

        UUID id = UUID.randomUUID(); //gera um id unico para cada cliente

        Cliente cliente = new Cliente();

        cliente.id = id.toString();

        System.out.println("");
        System.out.print("Nome do cliente: ");
        cliente.nome = sc.nextLine();

        System.out.print("E-mail do cliente: ");
        cliente.email = sc.nextLine();

        System.out.print("Data de nascimento do cliente: ");
        String dataNascimento = sc.nextLine();

        dataNascimento = dataNascimento.replace("-", "/"); // o replace é utilizado para substituir um caractere

        String[] dataNascimentoSplit = dataNascimento.split("/"); // .split == informa qual é o marcador de corte

        cliente.dataNascimento = LocalDate.of(  //converte a data em inteiro e salva em formato de data
                Integer.parseInt(dataNascimentoSplit[2]),
                Integer.parseInt(dataNascimentoSplit[1]),
                Integer.parseInt(dataNascimentoSplit[0])
        );

        cliente.exibirCliente();

//        System.out.println("Salario do cliente: ");
//        cliente.salario = sc.nextDouble();




    }

}
