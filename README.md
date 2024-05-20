## Redes sociais com POO

Projeto simples proposto no bootcamp para melhor entendimento dos fundamentos da Programação Orientada a Objetos. 
##

Resumo: O projeto foi dividido em 5 classes: 
- 3 para os apps (Telegram, MSNMessenger e Whatsapp);
- 1 classe mãe para passar os métodos que todos os apps devem herdar (ServicoMensagemInstantanea);
- 1 classe chamada MeuComputador para demonstração.

## Usando os Pilares da POO: 
### Herança:
Sabendo que todos os aplicativos partem do mesmo principio de enviar mensagens, existem métodos em comum que eu pude aproveitar a partir da Herança.
Criei uma "Classe mãe", na qual trabalhei os métodos comuns para funcionamento de uma aplicativo do gênero. 
      
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


  Nele pude explorar os 4 pilares do POO:
    Abstração: 
    Encapsulamento: Nem todos elementos precisam estar visíveis em todas as camadas. Neste projeto temos os exemp
    Herança: 
    Polimorfismo: 
