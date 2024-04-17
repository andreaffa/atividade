package tabuleiro;

public class Personagem {
    private int linha;
    private int coluna;
    private String formato;

    public Personagem(int linha, int coluna, String formato) {
        this.linha = linha;
        this.coluna = coluna;
        this.formato = formato;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public String getFormato() {
        return formato;
    }

    public void moverParaCima() {
        linha--;
    }

    public void moverParaBaixo() {
        linha++;
    }

    public void moverParaEsquerda() {
        coluna--;
    }

    public void moverParaDireita() {
        coluna++;
    }
}