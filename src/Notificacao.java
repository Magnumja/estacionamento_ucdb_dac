import java.time.LocalDateTime;

public class Notificacao {
    private int id;
    private Usuario usuario;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataEnvio;

    public Notificacao() {}

    public Notificacao(int id, Usuario usuario, String titulo, String mensagem, LocalDateTime dataEnvio) {
        this.id = id;
        this.usuario = usuario;
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.dataEnvio = dataEnvio;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(LocalDateTime dataEnvio) {
        this.dataEnvio = dataEnvio;
    }
}
