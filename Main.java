import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Servico> servicos = new ArrayList<>();
        ArrayList<Agendamento> agendamentos = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== BARBEARIA =====");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Buscar Cliente");
            System.out.println("4 - Cadastrar Serviço");
            System.out.println("5 - Listar Serviços");
            System.out.println("6 - Realizar Agendamento");
            System.out.println("7 - Listar Agendamentos");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Endereço: ");
                    String endereco = sc.nextLine();

                    System.out.print("CEP: ");
                    String cep = sc.nextLine();

                    int idAutomatico = clientes.size() + 1;

                    Cliente cliente = new Cliente(
                            idAutomatico,
                            nome,
                            endereco,
                            cep
                    );

                    clientes.add(cliente);

                    System.out.println("Cliente cadastrado com sucesso!");
                    System.out.println("ID gerado: " + cliente.getId());

                    break;

                case 2:

                    if (clientes.isEmpty()) {

                        System.out.println("Nenhum cliente cadastrado.");

                    } else {

                        System.out.println("\n=== CLIENTES ===");

                        for (Cliente c : clientes) {

                            System.out.println(
                                    "ID: " + c.getId()
                                    + " | Nome: " + c.getNome()
                                    + " | CEP: " + c.getCep());
                        }
                    }

                    break;

                case 3:

                    System.out.print("Digite o ID do cliente: ");
                    int idBusca = sc.nextInt();
                    sc.nextLine();

                    Cliente clienteEncontrado = null;

                    for (Cliente c : clientes) {

                        if (c.getId() == idBusca) {
                            clienteEncontrado = c;
                            break;
                        }
                    }

                    if (clienteEncontrado != null) {

                        System.out.println("\nCliente encontrado:");
                        System.out.println("ID: " + clienteEncontrado.getId());
                        System.out.println("Nome: " + clienteEncontrado.getNome());
                        System.out.println("CEP: " + clienteEncontrado.getCep());

                    } else {

                        System.out.println("Cliente não encontrado.");
                    }

                    break;

                case 4:

                    System.out.print("Descrição do serviço: ");
                    String descricao = sc.nextLine();

                    System.out.print("Valor: ");
                    float valor = sc.nextFloat();
                    sc.nextLine();

                    Servico servico = new Servico(
                            servicos.size() + 1,
                            descricao,
                            valor
                    );

                    servicos.add(servico);

                    System.out.println("Serviço cadastrado com sucesso!");

                    break;

                case 5:

                    if (servicos.isEmpty()) {

                        System.out.println("Nenhum serviço cadastrado.");

                    } else {

                        System.out.println("\n=== SERVIÇOS ===");

                        for (Servico s : servicos) {

                            System.out.println(
                                    "ID: " + s.getId()
                                    + " | Serviço: " + s.getDescricao()
                                    + " | Valor: R$ " + s.getValor());
                        }
                    }

                    break;

                case 6:

                    if (clientes.isEmpty()) {

                        System.out.println("Cadastre ao menos um cliente.");
                        break;
                    }

                    if (servicos.isEmpty()) {

                        System.out.println("Cadastre ao menos um serviço.");
                        break;
                    }

                    System.out.println("\n=== CLIENTES ===");

                    for (Cliente c : clientes) {

                        System.out.println(
                                c.getId() + " - " + c.getNome());
                    }

                    System.out.print("Escolha o ID do cliente: ");
                    int idCliente = sc.nextInt();
                    sc.nextLine();

                    Cliente clienteAgendamento = null;

                    for (Cliente c : clientes) {

                        if (c.getId() == idCliente) {
                            clienteAgendamento = c;
                            break;
                        }
                    }

                    if (clienteAgendamento == null) {

                        System.out.println("Cliente não encontrado.");
                        break;
                    }

                    System.out.println("\n=== SERVIÇOS ===");

                    for (Servico s : servicos) {

                        System.out.println(
                                s.getId()
                                + " - "
                                + s.getDescricao()
                                + " - R$ "
                                + s.getValor());
                    }

                    System.out.print("Escolha o ID do serviço: ");
                    int idServico = sc.nextInt();

                    sc.nextLine();

                    Servico servicoAgendamento = null;

                    for (Servico s : servicos) {

                        if (s.getId() == idServico) {
                            servicoAgendamento = s;
                            break;
                        }
                    }

                    if (servicoAgendamento == null) {

                        System.out.println("Serviço não encontrado.");
                        break;
                    }

                    System.out.print("Data do agendamento (EX: 09/06/2026 19:23): ");
                    String data = sc.nextLine();

                    Agendamento agendamento = new Agendamento(
                            agendamentos.size() + 1,
                            clienteAgendamento,
                            servicoAgendamento,
                            servicoAgendamento.getValor(),
                            data
                    );

                    agendamentos.add(agendamento);

                    System.out.println("Agendamento realizado com sucesso!");

                    break;

                case 7:

                    if (agendamentos.isEmpty()) {

                        System.out.println("Nenhum agendamento cadastrado.");

                    } else {

                        System.out.println("\n=== AGENDAMENTOS ===");

                        for (Agendamento a : agendamentos) {

                            System.out.println(
                                    "ID: " + a.getId()
                                    + " | Cliente: " + a.getCliente().getNome()
                                    + " | Serviço: " + a.getServico().getDescricao()
                                    + " | Valor: R$ " + a.getValor()
                                    + " | Data: " + a.getData());
                        }
                    }

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");
                    break;

                default:

                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}