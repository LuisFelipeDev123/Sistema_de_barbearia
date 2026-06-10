public class Usuario extends Pessoa {

    protected String senha;
    protected String nivelAcesso;

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(String senha, String nivelAcesso,
                   int id, String nome,
                   String sexo, String dataNascimento,
                   String telefone, String email,
                   String cpf) {

        super(id, nome, cpf, dataNascimento,
                telefone, email, sexo);

        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }
}