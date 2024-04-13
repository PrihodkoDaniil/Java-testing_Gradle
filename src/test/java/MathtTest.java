import org.example.Matht;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MathtTest {

    @Test
    public void testSum(){
        Matht matht = new Matht();
        assertEquals(12,matht.sum(5,7), "bruh");

    }
    @Test
    public void testSetArray(){
        Matht matht = new Matht();
        int[] arr= matht.setArray(4, 6, 8, 10, 0);
        int[] expected ={4,6,8,10,0};
        assertArrayEquals(arr,expected);
    }
    @Test
    public void testDivide(){
        Matht matht = new Matht();
        assertEquals(5, matht.divide(10,2),"Деление не работает");
        assertThrows(ArithmeticException.class, () -> matht.divide(5,0));
    }
}
