import java.util.ArrayList;
import java.util.List;

public class Carro {
    private int id;
    private String placa;
    private Usuario usuario; // FK -> Usuario

    private List<Sessao> sessoes; // 1:N

    public Carro(int id, String placa, Usuario usuario) {
        this.id = id;
        this.placa = placa;
        this.usuario = usuario;
        this.sessoes =  new ArrayList<>();
    }

    // getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }
}
