package entities;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    private List<T> equipamentos;

    public BolsaNinja(){
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    //Adiciona equipamentos genericos
    public void addEquipamento(T equip){
        equipamentos.add(equip);
    }

    @Override
    public String toString(){
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}