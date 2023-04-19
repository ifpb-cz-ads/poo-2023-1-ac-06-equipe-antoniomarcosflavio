public class Time {
    private String nome;
    private int pontos;
    private int divisão;
    private String campeonato;

    public void vitoria() {
        this.pontos += 3;
    }

    public void empate() {
        this.pontos += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDivisão() {
        return divisão;
    }

    public void setDivisão(int divisão) {
        this.divisão = divisão;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }
}
