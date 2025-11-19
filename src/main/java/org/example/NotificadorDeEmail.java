package org.example;

public class NotificadorDeEmail {
    public void enviarEmailConfirmacao(String email, String idPedido) {
        // Simula o envio de e-mail
        System.out.println("Email de confirmação enviado para: " + email + " | Pedido: " + idPedido);
        // Implementação real de envio de e-mail (SendGrid, Mailgun, etc)
    }
}
