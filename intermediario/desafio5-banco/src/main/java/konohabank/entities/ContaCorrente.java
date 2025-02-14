package konohabank.entities;

import konohabank.enums.TipoConta;

public class ContaCorrente extends ContaBancaria {

    private TipoConta tipoConta = TipoConta.CORRENTE;

    public ContaCorrente() {
    }

    public ContaCorrente(String name, String cpf, Double balance) {
        super(name, cpf, balance);
    }

    @Override
    public void depositar(Double valor) {
        this.balance += valor;
    }
}
