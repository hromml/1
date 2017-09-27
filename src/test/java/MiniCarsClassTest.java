import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class MiniCarsClassTest {
    MiniCarClass minicartest=new MiniCarClass();

    private String model;
    private String repairtool;
    private boolean expected;

    public MiniCarsClassTest(String model, String repairtool, boolean expected) {
        this.model = model;
        this.repairtool = repairtool;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:checking that '{0}' model and '{1}' repairtool is compability = {2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {"mM35234", "3MNK363", true},  //true
                {"mN35234", "3MN33", false},   //false
                {"mN35234", "3363", true},      //true
                {"mP35234", "2GH63", true},     //false
                {"mM35234", "HHDFHHD", false},    //true
                {"m35234", "3MNK363", false},    //true
                {"l35234", "3MNK363", false},    //true
                {"Nl35234", "3MNK363", true},    //false
        });
    }

    /* Proverka MiniCarClass */
    @Test
    public void checkCompability1() {
        minicartest.inputCharacters(model,repairtool);
        assertEquals(expected,minicartest.checkCompability());
    }

}
