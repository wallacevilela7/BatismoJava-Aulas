package konohabank.entities;

import konohabank.enums.TipoConta;

public class ContaPoupanca extends ContaBancaria{

    private TipoConta tipoConta = TipoConta.POUPANCA;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String name, String cpf, Double balance) {
        super(name, cpf, balance);
    }

    @Override
    public void depositar(Double valor) {
        this.balance += (valor - (valor * 0.01));
    }
}
