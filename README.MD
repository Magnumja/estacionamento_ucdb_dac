
--- Trabalho acadêmico com foco na matéria de Paradigmas de Programação para o DAC (Desenvolvimento e Análise de Competências)

## Descrição das Classes

### Classe `Usuario`
Representa o cliente cadastrado no sistema.  
Um usuário pode possuir **vários carros, cartões e notificações**, além de **realizar pagamentos** e possuir **um plano ativo**.

**Principais atributos:**
- `id`, `email`, `senha`, `cpf`
- `plano` – associação 1:1 com `Plano`
- `carros`, `cartoes`, `pagamentos`, `notificacoes` – listas compostas

**Métodos principais:**
- `registrarCarro(Carro carro)`
- `registrarCartao(Cartao cartao)`
- `realizarPagamento(Sessao sessao, String tipo)`
- `receberNotificacao(Notificacao notificacao)`

---

### Classe `Carro`
Vinculada diretamente a um `Usuario`, representa o veículo cadastrado.

**Atributos:**
- `id`, `placa`
- `usuario` (referência 1:N)
- `sessoes` – lista de sessões do veículo

---

### Classe `Cartao`
Modela o cartão cadastrado para pagamentos automáticos.

**Atributos:**
- `id`, `tipo`, `numeroCartao`, `cvv`, `dataValidade`
- `usuario` (relação N:1 com `Usuario`)

---

### Classe `Pagamento`
Registra os pagamentos efetuados pelo usuário.

**Atributos:**
- `id`, `valor`, `dataPagamento`, `tipo`
- `usuario` e `sessao` (associações)

**Métodos:**
- `confirmarPagamento(Sessao sessao)` → encerra sessão e marca pagamento como concluído.

---

### Classe `Plano`
Define os tipos de planos disponíveis (mensal, semestral, anual).

**Atributos:**
- `id`, `tipo`, `valor`

---

### Classe `Sessao`
Controla o **tempo de permanência** de um veículo no estacionamento.

**Atributos:**
- `id`, `horaEntrada`, `horaSaida`, `valor`, `status`
- `carro` (referência N:1)

**Métodos:**
- `encerrarSessao()` – calcula o valor da sessão com base no tempo:
  ```java
  double valorFinal = minutos <= 15 ? 0 : (minutos - 15) * 0.5;
  this.valor = BigDecimal.valueOf(valorFinal);

