package Builder;

import Entity.*;

public class VehicleBuilder implements iVehicleBuilder {

    private AbstractVehicle vehicule;
    private Integer roues;
    private TypeRoue typeRoue;


    public VehicleBuilder(String type) {
        if (type.toLowerCase().contentEquals("car")) {
            this.vehicule = new Car();
        } else {
            this.vehicule = new Moto();
        }
    }

    @Override
    public VehicleBuilder2 ajoutRoue(Integer number, String type) {
        this.roues = number;
        this.typeRoue = new TypeRoue(type);
        return new VehicleBuilder2();
    }

    public class VehicleBuilder2 implements iVehicleBuilder2 {

        private String cylindre;
        private TypeCarrosserie typeCarrosserie;
        private Integer reservoir;
        @Override
        public VehicleBuilder2 ajoutCylindre(String cylindre) {
            this.cylindre = cylindre;
            return this;
        }

        @Override
        public VehicleBuilder2 ajoutCarrosserie(String couleur, String forme) {
            this.typeCarrosserie = new TypeCarrosserie(couleur, forme);
            return this;
        }

        @Override
        public VehicleBuilder2 ajoutReservoir() {
            this.reservoir = (int) (Math.random() * ((100) + 1));
            return this;
        }

        @Override
        public String build() {
            VehicleBuilder.this.vehicule.setRoues(VehicleBuilder.this.roues);
            VehicleBuilder.this.vehicule.setTypeRoue(VehicleBuilder.this.typeRoue);
            VehicleBuilder.this.vehicule.setCarrosserie(this.typeCarrosserie);
            VehicleBuilder.this.vehicule.setCylindre(this.cylindre);
            VehicleBuilder.this.vehicule.setReservoir(this.reservoir);

            return VehicleBuilder.this.vehicule.toString();
        }
    }
}
