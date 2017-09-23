public class CarClass {
    private String model;
    private String repairtool;
    private boolean compatibility;

    /*public CarClass(String model, String repairtool) {
        this.model = model;
        this.repairtool = repairtool;
    }
    */

    public void inputCharacters(String inputmodel, String inputrepair){
        this.model=inputmodel;
        this.repairtool=inputrepair;
    }

    public boolean checkCompability(){
        String mod=this.model.substring(0,1);
        int rep=Integer.parseInt(this.repairtool.substring(0,1));
        if (((mod.equals("M"))||(mod.equals("N"))||(mod.equals("O")))&&(rep>2)){
            compatibility=true;
        } else if ((mod.equals("P"))&&(rep==1)){
            compatibility=true;
        } else {
            compatibility=false;
        }
        return compatibility;
    }
}
