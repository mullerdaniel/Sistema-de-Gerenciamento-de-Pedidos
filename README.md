# Sistema-de-Gerenciamento-de-Pedidos

❌ O Problema

Antes da refatoração, o sistema tinha uma classe (ProcessadorDePedido) que acumulava várias funções ao mesmo tempo:

- Validava estoque
- Calculava frete e impostos
- Salvava no banco
- Enviava e-mail
- Finalizava o pedido


Isso violava o SRP, gerando:

• Acoplamento alto
• Código difícil de testar
• Baixa manutenção e clareza

✅ A Solução (Refatoração com SRP)

O código foi reorganizado separando cada responsabilidade em sua própria classe:<BR>

ValidadorDeEstoque          → verifica quantidade
CalculadoraDeFreteImpostos  → cálculos financeiros
PersistenciaDePedido        → salvar no banco
NotificadorDeEmail          → envio de e-mail
ServicoDePedido             → coordena tudo


Agora cada classe tem uma única responsabilidade clara.

🎯 Benefícios Obtidos<BR>
✓ Código modular<BR>
✓ Manutenção muito mais simples<bR>
✓ Testes isolados e fáceis<BR>
✓ Baixo acoplamento<BR>
✓ Reutilização das classes

🔁 Fluxo Final do Processamento<BR>
Pedido → Validação → Cálculo → Salvar → Notificar → Retorno do total