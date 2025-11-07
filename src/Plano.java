import java.math.BigDecimal;

public class Plano {
    private int id;
    private String tipo;
    private BigDecimal valor;

    public Plano() {}

    public Plano(int id, String tipo, BigDecimal valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
