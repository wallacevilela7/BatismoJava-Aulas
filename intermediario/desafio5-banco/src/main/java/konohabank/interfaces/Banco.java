package konohabank.interfaces;

import konohabank.entities.ContaBancaria;

public interface Banco {
    void transferenciaEntreContas(ContaBancaria sender, ContaBancaria receiver, Double transferValue);
}
