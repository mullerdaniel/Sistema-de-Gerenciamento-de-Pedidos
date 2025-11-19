package org.example;

public class ProcessadorDePedido {
    public double processar(SRP_VIOLACAO.Pedido pedido) throws Exception {
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }

        double frete = 0.0;
        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00;
        } else {
            frete = 0.0;
        }

        double impostos = pedido.getValorTotal() * 0.15;
        double valorFinal = pedido.getValorTotal() + frete + impostos;

        pedido.setPago(true);

        salvarNoBancoDeDados(pedido, valorFinal);

        enviarConfirmacaoPorEmail(pedido.getEmailCliente(), pedido.getId());

        return valorFinal;
    }

    private void salvarNoBancoDeDados(SRP_VIOLACAO.Pedido pedido, double valorFinal) {
        System.out.println("Pedido " + pedido.getId() + " finalizado (Valor: R$" + valorFinal + ") e salvo no BD.");
    }

    private void enviarConfirmacaoPorEmail(String email, String idPedido) {
        System.out.println("Email de confirmação enviado para: " + email + " | Pedido: " + idPedido);
    }
}
