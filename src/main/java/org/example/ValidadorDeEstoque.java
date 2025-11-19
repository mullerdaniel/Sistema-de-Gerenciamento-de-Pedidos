package org.example;

public class ValidadorDeEstoque {
    public void validarEstoque(SRP_VIOLACAO.Pedido pedido) throws Exception {
        if (pedido.getQuantidadeItens() > 100) {
            throw new Exception("Estoque insuficiente para a quantidade solicitada.");
        }
    }
}
