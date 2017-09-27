import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CarsClassTest {
    CarClass cartest=new CarClass();



    private String model;
    private String repairtool;
    private boolean expected;

    public CarsClassTest(String model, String repairtool, boolean expected) {
        this.model = model;
        this.repairtool = repairtool;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}:checking that '{0}' model and '{1}' repairtool is compability = {2}")
    public static Iterable<Object[]> dataForTest() {
        return Arrays.asList(new Object[][]{
                {"M35234", "3MNK363", true},  //true
                {"N35234", "3MN33", false},   //false
                {"N35234", "3363", true},      //true
                {"P35234", "2GH63", true},     //false
                {"M35234", "HHDFHHD", false},    //true
                {"35234", "3MNK363", false},    //true
        });
    }



    /* Proverka CarClass */
    @Test
    public void checkCompability1() {
        cartest.inputCharacters(model,repairtool);
        assertEquals(expected,cartest.checkCompability());
    }

}