import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Duration;

public class Sessao {
    private int id;
    private Carro carro;
    private Pagamento pagamento; // relação 1:1 opcional
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private BigDecimal valor;
    private String status; // pendente, concluída...

    public Sessao(int id, Carro carro, LocalDateTime horaEntrada, LocalDateTime horaSaida, BigDecimal valor, String status) {
        this.id = id;
        this.carro = carro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.valor = valor;
        this.status = status;
    }

    public Sessao(int id, Carro carro) {
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // metodos
    public void encerrarSessao() {
        if (horaEntrada == null) {
            System.out.println("Erro: hora de entrada não definida.");
            return;
        }

        if (horaSaida == null)
            this.horaSaida = LocalDateTime.now();

        long minutos = Duration.between(horaEntrada, horaSaida).toMinutes();

        double valorFinal = minutos <= 15 ? 0 : 9.00; // condicao, se, se não
        this.valor = BigDecimal.valueOf(valorFinal);
        this.status = "pendente";

        System.out.println("Sessão encerrada. Tempo: " + minutos + " minutos. Valor: R$" + valor);
    }
}
