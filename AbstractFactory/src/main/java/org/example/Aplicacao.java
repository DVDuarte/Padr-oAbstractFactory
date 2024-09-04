package org.example;

public class Aplicacao {
    private Botao botao;
    private CaixaDialogo caixaDialogo;

    public Aplicacao(GUIFactory factory) {
        setBotao(factory.criarBotao());
        setCaixaDialogo(factory.criarCaixaDialogo());
    }

    public void renderizarInterface() {
        getBotao().render();
        getCaixaDialogo().exibir();
    }

    public Botao getBotao() {
        return botao;
    }

    public void setBotao(Botao botao) {
        this.botao = botao;
    }

    public CaixaDialogo getCaixaDialogo() {
        return caixaDialogo;
    }

    public void setCaixaDialogo(CaixaDialogo caixaDialogo) {
        this.caixaDialogo = caixaDialogo;
    }
}
