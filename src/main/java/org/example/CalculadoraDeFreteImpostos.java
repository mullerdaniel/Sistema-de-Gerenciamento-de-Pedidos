package org.example;

public class CalculadoraDeFreteImpostos {
    public double calcularFreteImpostos(SRP_VIOLACAO.Pedido pedido) {
        double frete = 0.0;
        if (pedido.getValorTotal() < 500.00) {
            frete = 50.00; // Frete para pedidos abaixo de R$500
        } else {
            frete = 0.0; // Frete grátis
        }

        double impostos = pedido.getValorTotal() * 0.15; // 15% de imposto fixo
        return pedido.getValorTotal() + frete + impostos;
    }
}
