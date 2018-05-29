package Builder;

public interface iVehicleBuilder {

    public VehicleBuilder ajoutRoue(Integer number, String type);
    public VehicleBuilder ajoutCylindre(String cylindre);
    public VehicleBuilder ajoutCarrosserie(String couleur, String forme);
    public VehicleBuilder ajoutReservoir();
}
