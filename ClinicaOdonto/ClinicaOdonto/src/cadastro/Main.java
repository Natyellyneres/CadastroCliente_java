package cadastro;

import java.util.Scanner;
import java.util.ArrayList;



public class Main {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSistema de Gestão da Clínica Odontológica");
            System.out.println("1. Cadastrar Paciente");
            System.out.println("2. Cadastrar Dentista");
            System.out.println("3. Adicionar Consultas");
            System.out.println("4. Listar Pacientes");
            System.out.println("5. Listar Dentistas");
            System.out.println("6. Listar Consultas");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    gerenciarPacientes(scanner);
                    break;
                case 2:
                    gerenciarDentistas(scanner);
                    break;
                case 3:
                    gerenciarConsultas(scanner);
                    break;
                case 4:
                	listarPacientes();
                    break;
                case 5:
                	listarDentistas();
                    break;
                case 6 :
                	listarConsultas();
                	break;
                case 7:
                    System.out.println("Saindo...");
                    return;
                
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void gerenciarPacientes(Scanner scanner) {
        System.out.println("\nGerenciamento de Pacientes");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();
        System.out.print("Digite o endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Digite a data de nascimento (DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();

        Paciente paciente = new Paciente(nome, cpf, telefone, email, endereco, dataNascimento);
        Paciente.listaPacientes.add(paciente);
        System.out.println("Paciente cadastrado com sucesso!");
        
        
    }

    private static void gerenciarDentistas(Scanner scanner) {
        System.out.println("\nGerenciamento de Dentistas");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        Dentista dentista = new Dentista(nome, telefone, email);
        Dentista.listaDentistas.add(dentista);
        System.out.println("Dentista cadastrado com sucesso!");
    }

    private static void gerenciarConsultas(Scanner scanner) {
        System.out.println("\nGerenciamento de Consultas");
        System.out.print("Digite a data da consulta (DD/MM/AAAA): ");
        String dataConsulta = scanner.nextLine();
        System.out.print("Digite a descrição: ");
        String descricao = scanner.nextLine();
        Consulta consulta = new Consulta(dataConsulta,descricao);
        Consulta.listaConsultas.add(consulta);

        System.out.println("Consulta cadastrada com sucesso!");
    }

    
    private static void listarPacientes() {
    	System.out.println("\nLista de pacientes:");
    	for(Paciente paciente : Paciente.listaPacientes) {
    		System.out.println(paciente);
    	}	
    }
    
    private static void listarDentistas() {
    	System.out.println("\nLista de dentistas:");
    	for(Dentista dentista : Dentista.listaDentistas) {
    		System.out.println(dentista);
    	}	
    }


    private static void listarConsultas() {
        System.out.println("\nLista de consultas:");
        if (Consulta.listaConsultas.isEmpty()) {
            System.out.println("Não há consultas registradas.");
        } else {
           
            for (Consulta consulta : Consulta.listaConsultas) {
                System.out.println(consulta);
            }
        }
    }

    	}
	
