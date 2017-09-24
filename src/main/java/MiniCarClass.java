public class MiniCarClass extends CarClass {   //nazvanie modeli vsegda nachinaetsa c m (ot slova mini)

    public boolean checkCompability(){

        if (this.model.substring(0,1).equals("m")) {
            String mod = this.model.substring(1, 2);
            if (chekingRep(this.repairtool)) {
                int rep = Integer.parseInt(this.repairtool.substring(0, 1));
                if (((mod.equals("M")) || (mod.equals("N")) || (mod.equals("O"))) && (rep > 2)) {
                    compatibility = true;
                } else if ((mod.equals("P")) && (rep == 1)) {
                    compatibility = true;
                } else {
                    compatibility = false;
                }
            } else {
                return false;
            }
        } else {
           return false;
        }
        return compatibility;

    }
}
