package org.example;

public class ServicoDePedido {
    private ValidadorDeEstoque validadorDeEstoque;
    private CalculadoraDeFreteImpostos calculadoraDeFreteImpostos;
    private PersistenciaDePedido persistenciaDePedido;
    private NotificadorDeEmail notificadorDeEmail;

    public ServicoDePedido() {
        this.validadorDeEstoque = new ValidadorDeEstoque();
        this.calculadoraDeFreteImpostos = new CalculadoraDeFreteImpostos();
        this.persistenciaDePedido = new PersistenciaDePedido();
        this.notificadorDeEmail = new NotificadorDeEmail();
    }

    public double processarPedido(SRP_VIOLACAO.Pedido pedido) throws Exception {
        validadorDeEstoque.validarEstoque(pedido);

        double valorFinal = calculadoraDeFreteImpostos.calcularFreteImpostos(pedido);

        persistenciaDePedido.salvarNoBanco(pedido, valorFinal);

        notificadorDeEmail.enviarEmailConfirmacao(pedido.getEmailCliente(), pedido.getId());

        return valorFinal;
    }
}
