public class Usuario {
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();

        System.out.println("Operações com o telefone:");
        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        System.out.println();

        System.out.println("Operações com música:");
        iphone.tocar();
        iphone.selecionarMusica();
        iphone.pausar();

        System.out.println();

        System.out.println("Operações com o navegador web:");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();



    }
}
