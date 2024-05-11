import Navegador.NavegadorInternet;
import ReprodutorMusica.ReprodutorMusical;
import Telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página com navegador Safari");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba com navegador Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página com navegador Safari");

    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo o telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausa na música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolha música");
    }
    
}
