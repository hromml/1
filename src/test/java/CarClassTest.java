import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarClassTest {
    CarClass cartest=new CarClass();

    @Test
    void checkCompability1() {
        cartest.inputCharacters("M35234","3MNK363");
        assertEquals(true,cartest.checkCompability());
    }

    @Test
    void checkCompability2() {
        cartest.inputCharacters("N35234","3MN33");    //upadet test
        assertEquals(false,cartest.checkCompability());
    }

    @Test
    void checkCompability3() {
        cartest.inputCharacters("N35234","3363");
        assertEquals(true,cartest.checkCompability());
    }

    @Test
    void checkCompability4() {
        cartest.inputCharacters("P35234","2GH63");
        assertEquals(true,cartest.checkCompability());
    }

    @Test
    void checkCompability5() {
        cartest.inputCharacters("M35234","HHDFHHD");  //upadet test - H ne preobrazovat' v chislo
        assertEquals(false,cartest.checkCompability());
    }

    @Test
    void checkCompability6() {
        cartest.inputCharacters("35234","3MNK363");
        assertEquals(false,cartest.checkCompability());
    }

}