package _modelo;

public class Conductor {
    private Vehiculo IVehiculo;

    public Conductor(Vehiculo vehiculo) {
        this.IVehiculo = vehiculo;
    }

    public void conducir() {
        String resultado = IVehiculo.moverse();
        System.out.println(resultado);
    }
}
