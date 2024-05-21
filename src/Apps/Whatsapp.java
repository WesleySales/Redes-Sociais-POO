package Apps;

public class Whatsapp extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo Whatsapp");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Whatsapp");
    }

}
