import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String args[]) {
        int i;
        int j=0;
        int lineengine;
        String linemodel;
        ArrayList<CarClass> cars = new ArrayList<CarClass>();
        Scanner inmodel = new Scanner(System.in);
        Scanner inengine = new Scanner(System.in);
        for (i = 0; i >= 0;i++) {
            CarClass car = new CarClass();
            System.out.println("Vvedite model. Dlya prekrashenia vvoda dannih ostavte model pustoyu i nazhmite enter");
            linemodel=inmodel.nextLine();
            if (!linemodel.equals("")) {
                car.inputModel(linemodel);
                System.out.println("Vvedite moshnost");
                lineengine=inengine.nextInt();
                car.inputPower(lineengine);
                cars.add(car);
                System.out.println("Vi vveli model "+car.getModel().returnModel()+" s moshnost'u "+car.getCarengine().returnPower());
            } else {
                i=-2;
            }
        }

        System.out.println("Dlya vivoda characteristik nuzhnogo avto vvedite model");
        linemodel=inmodel.nextLine();
        for (i = 0; i < cars.size();i++) {
            CarClass car;
            car = cars.get(i);
            if (linemodel.equals(car.getModel().returnModel())){
                System.out.println("Moshnost dannoy modeli ravna "+car.getCarengine().returnPower());
            } else {
                j++;
            }
            if (j==cars.size()){
                System.out.println("Takaya model ne naidena, poprobuite eche raz. Dlya vihoda nazhmite enter");
                linemodel=inmodel.nextLine();
                if (linemodel.equals("")){
                    i=cars.size()+1;
                } else {
                    i=-1;
                    j=0;
                }
            }
        }
    }
}
