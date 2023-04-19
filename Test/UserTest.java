package Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    void deveRetornarMidiaAudioLivro() {
        User user = new User();
        user.setMidia("Livro digital");

        assertEquals("audio livro - mp3", user.getNome());
    }

    @Test
    void deveRetornarMidiaLivro() {
        User user = new User();
        user.setMidia("Livro impresso");

        assertEquals("livro - impresso", user.getNome());
    }
}
