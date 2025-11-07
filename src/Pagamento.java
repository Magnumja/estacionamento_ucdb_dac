import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pagamento {
    private int id;
    private Usuario usuario;
    private Sessao sessao; // referência à sessão relacionada
    private BigDecimal valor;
    private LocalDateTime dataPagamento;
    private String tipo; // PIX, Débito, etc.

    public Pagamento() {}

    public Pagamento(int id, Usuario usuario, Sessao sessao, BigDecimal valor, LocalDateTime dataPagamento, String tipo) {
        this.id = id;
        this.usuario = usuario;
        this.sessao = sessao;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.tipo = tipo;
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

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDateTime dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // metodos
    public void confirmarPagamento(Sessao sessao) {
        sessao.encerrarSessao();
        sessao.getStatus();
        System.out.println("Pagamento confirmado via " + tipo + " no valor de R$" + valor);
    }
}
