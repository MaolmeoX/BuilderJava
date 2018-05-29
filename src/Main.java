import Builder.VehicleBuilder;
import Builder.VehicleBuilder.*;
import Entity.AbstractVehicle;
import Entity.Car;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new VehicleBuilder("toto").ajoutRoue(2, "ronde")
//                .ajoutCylindre("158")
//                .ajoutCarrosserie("Rose", "Profilé")
//                .ajoutReservoir().build());

        System.out.println(new VehicleBuilder("car").ajoutRoue(3, "carre").ajoutCylindre("125").build());


//        System.out.println(new VehicleBuilder("car").ajoutRoue(3, "ronde")
//                .ajoutCylindre("158")
//                .ajoutCarrosserie("Rose", "Profilé")
//                .ajoutReservoir().build());
    }
}
