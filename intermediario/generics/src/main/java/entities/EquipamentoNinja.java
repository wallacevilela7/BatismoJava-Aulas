package entities;

public class EquipamentoNinja {
    private String name;

    public EquipamentoNinja(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Equipamento: " + name;
    }
}
