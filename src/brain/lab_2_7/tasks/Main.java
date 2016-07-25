package brain.lab_2_7.tasks;

import brain.lab_2_7.tasks.devices.Device;
import brain.lab_2_7.tasks.devices.EthernetAdapter;
import brain.lab_2_7.tasks.devices.Monitor;

/**
 * Created by drimcatcher on 30.06.2016.
 */
public class Main {
    public static void main(String[]args){
    demo_2_7_5();
    }

    public static void demo_2_7_5(){
        Device devArr[] = new Device[3];
        devArr[0]= new Monitor(800, 600);
        devArr[1]=new EthernetAdapter(1000, "4A:55:66:9E:55");
        devArr[2]=new EthernetAdapter(1000, "8D:25:32:74:32");
        for (Device device:devArr)
            System.out.println(device+"\n");
    }
}
