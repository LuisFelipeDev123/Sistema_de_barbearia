Sistema de Gerenciamento de Barbearia
Este é um sistema simples desenvolvido em Java para gerenciar as operações básicas de uma barbearia. 
O projeto funciona via Interface de Linha de Comando (CLI) e utiliza armazenamento em memória (coleções do Java) para registrar clientes, serviços e agendamentos.

Funcionalidades
O sistema possui um menu interativo que permite ao usuário realizar as seguintes operações:

Gestão de Clientes:

Cadastrar novos clientes (Nome, Endereço, CEP).

Listar todos os clientes cadastrados.

Buscar um cliente específico pelo seu ID.

Gestão de Serviços:

Cadastrar novos serviços prestados pela barbearia (Descrição, Valor).

Listar todos os serviços disponíveis.

Gestão de Agendamentos:

Vincular um cliente a um serviço em uma data e horário específicos.

Listar todo o histórico de agendamentos realizados.

Estrutura e Arquitetura
O projeto utiliza conceitos de Programação Orientada a Objetos (POO), como herança e encapsulamento. A estrutura de classes está dividida da seguinte forma:

Nota de Desenvolvimento: Como este projeto utiliza ArrayList para persistência de dados, todas as informações cadastradas serão perdidas ao encerrar o programa. 
Para um ambiente de produção, seria necessário integrar um banco de dados (como MySQL ou PostgreSQL).

Pré-requisitos
Java Development Kit (JDK): Certifique-se de ter o Java instalado em sua máquina (versão 8 ou superior)

Passos para compilação e execução
Abra o terminal e navegue até a pasta onde os arquivos .java estão salvos.

Compile todos os arquivos Java utilizando o comando:

javac *.java

Após a compilação, execute o programa com o comando:


java Main

Formato de Data
Ao realizar um agendamento (opção 6 do menu), o sistema solicitará a data e o horário. É estritamente necessário utilizar o formato dd/MM/yyyy HH:mm para evitar erros de leitura.
Exemplo válido: 10/06/2026 14:30
