package Builder;

import Entity.*;

public class VehicleBuilder implements iVehicleBuilder {

    private AbstractVehicle vehicule;
    private Integer roues;
    private TypeRoue typeRoue;
    private String cylindre;
    private TypeCarrosserie typeCarrosserie;
    private Integer reservoir;

    public VehicleBuilder(String type) {
        if (type.toLowerCase().contentEquals("car")) {
            this.vehicule = new Car();
        } else {
            this.vehicule = new Moto();
        }
    }

    @Override
    public VehicleBuilder ajoutRoue(Integer number, String type) {
        this.roues = number;
        this.typeRoue = new TypeRoue(type);
        return this;
    }

    @Override
    public VehicleBuilder ajoutCylindre(String cylindre) {
        this.cylindre = cylindre;
        return this;
    }

    @Override
    public VehicleBuilder ajoutCarrosserie(String couleur, String forme) {
        this.typeCarrosserie = new TypeCarrosserie(couleur, forme);
        return this;
    }

    @Override
    public VehicleBuilder ajoutReservoir() {
        this.reservoir = (int) (Math.random() * ((100) + 1));
        return this;
    }

    public String build() {
        vehicule.setRoues(this.roues);
        vehicule.setTypeRoue(this.typeRoue);
        vehicule.setCarrosserie(this.typeCarrosserie);
        vehicule.setCylindre(this.cylindre);
        vehicule.setReservoir(this.reservoir);

        return vehicule.toString();
    }
}
