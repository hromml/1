import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarsClassTest {
    CarClass cartest=new CarClass();
    MiniCarClass minicartest=new MiniCarClass();

    /* Proverka CarClass */
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
        cartest.inputCharacters("M35234","HHDFHHD");
        assertEquals(false,cartest.checkCompability());
    }

    @Test
    void checkCompability6() {
        cartest.inputCharacters("35234","3MNK363");
        assertEquals(false,cartest.checkCompability());
    }


    /* Proverka MiniCarClass */
    @Test
    void checkCompability7() {
        minicartest.inputCharacters("mM35234","3MNK363");
        assertEquals(true,minicartest.checkCompability());
    }

    @Test
    void checkCompability8() {
        minicartest.inputCharacters("mN35234","3MN33");    //upadet test
        assertEquals(false,minicartest.checkCompability());
    }

    @Test
    void checkCompability9() {
        minicartest.inputCharacters("mN35234","3363");
        assertEquals(true,minicartest.checkCompability());
    }

    @Test
    void checkCompability10() {
        minicartest.inputCharacters("mP35234","2GH63");    //upadet test
        assertEquals(true,minicartest.checkCompability());
    }

    @Test
    void checkCompability11() {
        minicartest.inputCharacters("mM35234","HHDFHHD");
        assertEquals(false,minicartest.checkCompability());
    }

    @Test
    void checkCompability12() {
        minicartest.inputCharacters("m35234","3MNK363");
        assertEquals(false,minicartest.checkCompability());
    }

    @Test
    void checkCompability13() {
        minicartest.inputCharacters("l35234","3MNK363");
        assertEquals(false,minicartest.checkCompability());
    }

    @Test
    void checkCompability14() {
        minicartest.inputCharacters("Nl35234","3MNK363");     //upadet test - nachinaetsa ne s m
        assertEquals(true,minicartest.checkCompability());
    }



}