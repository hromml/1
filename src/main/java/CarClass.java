

public class CarClass{

    protected CarModelClass model;
    protected CarEngineClass carengine;
    //protected String model;
    protected String repairtool;
    protected boolean compatibility;

    /*public CarClass(String model, String repairtool) {
        this.model = model;
        this.repairtool = repairtool;
    }
    */

    public void inputModel(String inputmodel){
        this.model= new CarModelClass(inputmodel);
    }

    public void inputPower(int power){
        this.carengine= new CarEngineClass(power);
    }

    /*public void inputCarEngine(int powercarengine){
        CarEngineClass engineforcar= new CarEngineClass(powercarengine);
    }
*/
    public boolean checkCompability(){
        String mod=this.model.returnModel().substring(0,1);
        if (chekingRep(this.repairtool)) {
            int rep = Integer.parseInt(this.repairtool.substring(0, 1));
            if (((mod.equals("M")) || (mod.equals("N")) || (mod.equals("O"))) && (rep > 2)) {
                compatibility = true;
            } else if ((mod.equals("P")) && (rep == 1)) {
                compatibility = true;
            } else {
                compatibility = false;
            }
            return compatibility;
        } else {
            return false;
        }
    }


    public boolean chekingRep(String repa){
        try {
           int repair=Integer.parseInt(repa.substring(0, 1));
           return true;
        } catch (java.lang.NumberFormatException e){
            return false;
        }
    }

    public CarModelClass getModel() {
        return model;
    }

    public CarEngineClass getCarengine() {
        return carengine;
    }
}
