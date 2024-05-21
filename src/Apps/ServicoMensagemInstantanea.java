package Apps;

public class ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();


    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");

    }
    protected void validarConexaoInternet() {
        System.out.println("Verificando conexão");

    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico");
    }
}


