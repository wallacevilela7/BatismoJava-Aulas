package konohabank.entities;

import konohabank.interfaces.Conta;

public abstract class ContaBancaria implements Conta {

    protected String name;
    protected String cpf;
    protected Double balance;

    public ContaBancaria() {
    }

    public ContaBancaria(String name, String cpf, Double balance) {
        this.name = name;
        this.cpf = cpf;
        this.balance = balance;
    }

    @Override
    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f ", balance);
    }

    public abstract void depositar(Double valor);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Titular: ").append(name).append('\n');
        sb.append("CPF: ").append(cpf).append('\n');
        sb.append("Saldo: ").append(balance);
        return sb.toString();
    }
}
