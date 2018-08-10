package CollectionNEW;

import java.util.ArrayList;

/**
 * Created by vishnu on 04/07/18.
 */
public class ParkingEx {
    int type;
    int time;
    String id;

    public ParkingEx(int type,int time,String id){


        this.type=type;
        this.id=id;
        this.time=time;
    }


    static void addVehicle(ParkingEx p,ArrayList<ParkingEx> parkings){
        if(parkings.size()<3){
            parkings.add(p);
            System.out.println("Added "+p.id);
        }
        else{
            System.out.println("Slot is flled");
        }
    }

    static void removeVehicle(ArrayList<ParkingEx> parkings,String num){
        for (int i = 0; i < parkings.size(); i++) {
            ParkingEx p;
            p= parkings.get(i);
            if (p.id.equals(num)) {
                parkings.remove(p);
                System.out.println("Removed vehicle ID" + num);
                System.out.println("amount to be paid = " + p.time*150);
                break;
            }
        }
    }
    public static void main(String[] args) {

        ParkingEx p=new ParkingEx(2,1,"9875");
        ParkingEx p1=new ParkingEx(2,2,"5468");
        ParkingEx p2=new ParkingEx(2,1,"3465");
        ParkingEx p3=new ParkingEx(4,4,"9898");
        ArrayList<ParkingEx> park2=new ArrayList<>();
        ArrayList<ParkingEx> park4=new ArrayList<>();
        addVehicle(p,park2);
        addVehicle(p1,park2);
        addVehicle(p2,park2);
        addVehicle(p3,park4);
        removeVehicle(park2,"5468");


    }
}
