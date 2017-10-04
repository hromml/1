public class MiniCarClass extends CarClass {   //nazvanie modeli vsegda nachinaetsa c m (ot slova mini)

    public boolean checkCompability() {

        if ((this.model.returnModel().substring(0, 1).equals("m")) && (chekingRep(this.repairtool))) {
            String mod = this.model.returnModel().substring(1, 2);
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
        return compatibility;

    }
}
