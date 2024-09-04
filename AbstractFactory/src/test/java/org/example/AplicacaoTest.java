package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicacaoTest {

    @Test
    void testWindowsFactory() {
        GUIFactory factory = new WindowsFactory();
        Aplicacao app = new Aplicacao(factory);

        assertTrue(app.getBotao() instanceof BotaoWindows, "O botão deveria ser do tipo BotaoWindows");
        assertTrue(app.getCaixaDialogo() instanceof CaixaDialogoWindows, "A caixa de diálogo deveria ser do tipo CaixaDialogoWindows");
    }

    @Test
    void testMacOSFactory() {
        GUIFactory factory = new MacOSFactory();
        Aplicacao app = new Aplicacao(factory);

        assertTrue(app.getBotao() instanceof BotaoMacOS, "O botão deveria ser do tipo BotaoMacOS");
        assertTrue(app.getCaixaDialogo() instanceof CaixaDialogoMacOS, "A caixa de diálogo deveria ser do tipo CaixaDialogoMacOS");
    }
}
