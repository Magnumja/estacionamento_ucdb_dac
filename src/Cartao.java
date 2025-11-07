import java.time.LocalDate;

public class Cartao {
    private int id;
    private Usuario usuario;
    private String tipo; // "Crédito" ou "Débito"
    private String numeroCartao;
    private String cvv;
    private LocalDate dataValidade;

    public Cartao() {}

    public Cartao(int id, Usuario usuario, String tipo, String numeroCartao, String cvv, LocalDate dataValidade) {
        this.id = id;
        this.usuario = usuario;
        this.tipo = tipo;
        this.numeroCartao = numeroCartao;
        this.cvv = cvv;
        this.dataValidade = dataValidade;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
}
