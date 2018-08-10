package CollectionNEW;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by vishnu on 04/07/18.
 */
public class Parking{
    int no,vno,t;
    public Parking(int no,int vno,int t) {
     this.no=no;
     this.vno=vno;
     this.t=t;
    }

    public static void main(String[] args){
        int no=0,vno=0,t=0;

        System.out.println("Enter 1 to park vehicle and 2 to exit vehicle from parking lot");
        Scanner s=new Scanner(System.in);
        int temp=s.nextInt();
        ArrayList<Parking> p=new ArrayList<>();

        switch(temp){
            case 1 : {
                System.out.println("Enter type of vehicle (2-2 wheeler & 4-4 wheeler");
                int temp1=s.nextInt();
                if(temp1==2){
                    System.out.println("Enter vehicle nummber, num plate no and time");
                    for(int i=0;i<5;i++){

                        Parking obj=new Parking(no,vno,t);



                }
            }
        }
    }
}




}
