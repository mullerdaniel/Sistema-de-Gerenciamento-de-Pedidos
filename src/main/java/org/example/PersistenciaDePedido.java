package org.example;

public class PersistenciaDePedido {
    public void salvarNoBanco(SRP_VIOLACAO.Pedido pedido, double valorFinal) {
        // Simula a persistência no banco de dados
        System.out.println("Pedido " + pedido.getId() + " finalizado (Valor: R$" + valorFinal + ") e salvo no BD.");
        // Implementação real de persistência no banco de dados (JPA, JDBC, etc)
    }
}
