import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("=== SIMULAÇÃO DO SISTEMA DE ESTACIONAMENTO UCDB ===\n");

        // Criar plano e usuário
        Plano planoMensal = new Plano(1, "Mensal", BigDecimal.valueOf(165));
        Usuario usuario = new Usuario(1, "neto@ucdb.br", "1234", "12345678900");
        usuario.setPlano(planoMensal);

        // Criar carro e cartão
        Carro carro = new Carro(1, "ABC-1234", usuario);
        Cartao cartao = new Cartao(1, usuario, "Débito", "1111222233334444", "123", LocalDate.of(2030, 1, 1));

        // Registrar no sistema
        usuario.registrarCarro(carro);
        usuario.registrarCartao(cartao);

        // Iniciar sessão
        // Criar sessão manualmente
        Sessao sessao = new Sessao(1, carro);
        sessao.setHoraEntrada(LocalDateTime.of(2025, 11, 7, 14, 0)); // 14:00
        sessao.setHoraSaida(LocalDateTime.of(2025, 11, 7, 14, 25));  // 14:25 → 25 min

        sessao.encerrarSessao();

        // Efetuar pagamento
        usuario.realizarPagamento(sessao, "PIX");

        System.out.println("\n Pagamento realizado com sucesso ");
    }
}
