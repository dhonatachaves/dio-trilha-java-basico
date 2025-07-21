package Iphone.modelo;


import java.util.List;

import Iphone.interfaces.AparelhoTelefonico;
import Iphone.interfaces.NavegadorInternet;
import Iphone.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Atributos
    private boolean musicaSelecionada;
    private String musicaAselecionar;
    private String musicaAtocar = "";
    private String numero = "";
    private String url;


    // métodos reprodutor musical
    @Override
    public void tocar() {
         if(isMusicaSelecionada()) {
            setMusicaAtocar(this.musicaAselecionar);
            System.out.println("Tocando música " + " '" + getMusicaAtocar().toLowerCase() + "' ");
            return;
        }

        System.out.println("Música não selecionada.");
    }
    
    @Override
    public void pausar() {
         if(isMusicaSelecionada()) {
            System.out.println("Pausando música " + " '" + getMusicaAtocar().toLowerCase() + "' ");
            return;
        }

        System.out.println("não há música sendo reproduzida.");
    }

    @Override
    public void selecionarMusica(List<String> playlist, String musica) {
        for(String music: playlist) {
            if(music.equalsIgnoreCase(musica)) {
                setMusicaAselecionar(musica);
                setMusicaSelecionada(true);
                System.out.println("Música "  + " '" + getMusicaAselecionar().toLowerCase() + "' " + " selecionada.");
                return;
            }   
        }

        System.out.println("Música não encontrada.");
    }
    
    @Override
    public void verPlaylist(List<String> playList) {
        System.out.println("Exibindo músicas da playlist: ");
        for(int i = 0; i < playList.size() - 1; i++) {
            System.out.println((i+1) + " - " + playList.get(i));
        }
        System.out.println();
    }


    //Métodos aparelho telefônico
    @Override
    public void ligar(String numero) {
        setNumero(numero);
        System.out.println("Ligando para o número: " + getNumero());
    }

    @Override
    public void atender() {
        System.out.println("Atendendendo ligação.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }


    // Métodos navegador Internet
    @Override
    public void exibirPagina(String url) {
         setUrl(url);
        System.out.println("Acessando: " + getUrl());
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba criada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }




    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }
    



    public boolean isMusicaSelecionada() {
        return musicaSelecionada;
    }
    
    public void setMusicaSelecionada(boolean musicaSelecionada) {
        this.musicaSelecionada = musicaSelecionada;
    }

    public String getMusicaAselecionar() {
        return musicaAselecionar;
    }

    public void setMusicaAselecionar(String musicaAselecionar) {
        this.musicaAselecionar = musicaAselecionar;
    }

    public String getMusicaAtocar() {
        return musicaAtocar;
    }

    public void setMusicaAtocar(String musicaAtocar) {
        this.musicaAtocar = musicaAtocar;
    }

      
    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    

}
