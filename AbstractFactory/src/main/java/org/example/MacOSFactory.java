package org.example;

public class MacOSFactory implements GUIFactory {
    @Override
    public Botao criarBotao() {
        return new BotaoMacOS();
    }

    @Override
    public CaixaDialogo criarCaixaDialogo() {
        return new CaixaDialogoMacOS();
    }
}
