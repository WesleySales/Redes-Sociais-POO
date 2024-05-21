package Apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Messenger");
    }

}
