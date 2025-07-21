package Iphone.interfaces;

import java.util.List;

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(List<String> playlist, String musica);
    void verPlaylist(List<String> playList);
}
