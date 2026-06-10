public class Cliente extends Pessoa {

    private String endereco;
    private String cep;

    public Cliente(int id, String nome, String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome, String cpf, String dataNascimento,
                   String telefone, String email, String sexo,
                   String cep, String endereco) {

        super(id, nome, cpf, dataNascimento, telefone, email, sexo);

        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }
}