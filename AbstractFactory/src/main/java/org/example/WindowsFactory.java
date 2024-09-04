package org.example;

public class WindowsFactory implements GUIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }

    @Override
    public CaixaDialogo criarCaixaDialogo() {
        return new CaixaDialogoWindows();
    }
}
