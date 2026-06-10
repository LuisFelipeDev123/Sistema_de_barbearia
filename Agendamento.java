import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agendamento {

    private int id;
    private Cliente cliente;
    private Servico servico;
    private float valor;
    private Date data;
    private String observacao;

    public Agendamento(int id,
                       Cliente cliente,
                       Servico servico,
                       float valor,
                       String data) {

        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;

        try {
            this.data =
                    new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public float getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public String getObservacao() {
        return observacao;
    }
}