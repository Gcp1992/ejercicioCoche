package _modelo;

public class Coche implements Vehiculo {

    private int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {
        if (deposito > 0) {
            return "El coche se está moviendo.";
        } else {
            return "El coche no puede moverse. No hay gasolina en el depósito.";
        }
    }
}

