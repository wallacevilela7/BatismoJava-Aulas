package konohabank.entities;

import konohabank.interfaces.Banco;

public class BancoKonoha implements Banco {
    public BancoKonoha() {
    }

    @Override
    public void transferenciaEntreContas(ContaBancaria sender, ContaBancaria receiver, Double transferValue) {
        if (sender.balance < transferValue) {
            System.out.printf("Saldo insuficiente.\nSaldo Atual: R$ %2.f\nValor da transferencia: R$ %.2f", sender.balance, transferValue);
        } else {
            sender.balance -= transferValue;
            receiver.balance += transferValue;
            System.out.println("Transferencia realizada com sucesso");
        }
    }
}
