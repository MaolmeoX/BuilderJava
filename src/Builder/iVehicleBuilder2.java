package Builder;

public interface iVehicleBuilder2 {
    public VehicleBuilder.VehicleBuilder2 ajoutCylindre(String cylindre);

    public VehicleBuilder.VehicleBuilder2 ajoutCarrosserie(String couleur, String forme);

    public VehicleBuilder.VehicleBuilder2 ajoutReservoir();

    public String build();
}
