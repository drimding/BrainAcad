package brain.lab_2_1.task05;

/**
 * Created by drimcatcher on 22.06.2016.
 */
public class main {
    public static void main(String[] argn){

        Computer[] computers = createArrayComputers();

        addPriceTenPercent(computers);
        showAllComputers(computers);
    }
    public static void addPriceTenPercent(Computer[] computers){
        for (int i=0; i<computers.length; i++)
        {
           float price = (float) (computers[i].getPrice()/100 * 10 + computers[i].getPrice());
             computers[i].setPrice(price);

        }

    }
    public static void showAllComputers(Computer[] computers)
    {
        for (Computer computer: computers) {
            computer.view();
            System.out.println("------------------------------------");
        }
    }

    public static Computer[] createArrayComputers(){
        Computer[] computers = new Computer[5];
        String[] manufacturer = {"IBM","INTEL","AMD","INTEL","AMD" };
        int[] serialNumber ={45132,65451,5645132,65312,687415};
        float[] price = {20,40,66,100,120};
        int[] quantityCPU = {25, 21, 2,55,2};
        int[] frequencyCPU ={400,1200,2000,3000,3200};
        for (int i=0; i<computers.length;i++)
        {
            computers[i]=initialize(manufacturer[i], serialNumber[i], price[i], quantityCPU[i], frequencyCPU[i]);
        }
        return computers;
    }
    public static Computer initialize(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU){
        Computer computer =new Computer();
        computer.setManufacturer(manufacturer);
        computer.setSerialNumber(serialNumber);
        computer.setPrice(price);
        computer.setQuantityCPU(quantityCPU);
        computer.setFrequencyCPU(frequencyCPU);
        return computer;
    }
}
