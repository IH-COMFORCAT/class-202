import com.ironhack.MathLibrary;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathLibraryTest {

    MathLibrary mathLibrary = new MathLibrary();
    List<Integer> numbers = List.of(5, 10, 15);



    //Suma de números positivos
    @Test
    @DisplayName("Suma de números positivos funciona")
    void sum_positiveNumbers_resultOK() {
        assertEquals(5, mathLibrary.add(2, 3));
    }

    @Test
    @DisplayName("Suma de un números negativos")
    void sum_negativeNumbers_resultOK() {
        assertEquals(-9, mathLibrary.add(-2, -7));
    }

    @Test
    void sum_negativeAndPositive_resultOK() {
        assertEquals(-5, mathLibrary.add(-10, 5));
    }

    // Suma funciona correctamente
    //La lista es nula
    // Suma numeros negativos y positivos
    //

    @Test
    void sumList_positiveNumbers_resultOK() {
        assertEquals(30, mathLibrary.sumList(numbers));
    }

    @Test
    void sumList_listIsNull_resultNotOK() {

        //Lo veremos más adelante
        //assertThrows()
    }





}
