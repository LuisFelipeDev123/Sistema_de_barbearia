import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Pessoa {

    protected int id;
    protected String nome;
    protected String cpf;
    protected Date dataNascimento;
    protected String telefone;
    protected String email;
    protected String sexo;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(int id, String nome, String cpf, String dataNascimento,
                  String telefone, String email, String sexo) {

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;

        try {
            this.dataNascimento =
                    new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dataNascimento);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }
}