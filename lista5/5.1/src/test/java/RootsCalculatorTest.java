import org.example.RootsCalculator;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class RootsCalculatorTest {
    private static final double INF = Double.POSITIVE_INFINITY;

    @Test
    void test1() {
        List<Double> result = RootsCalculator.calculate_roots(1, -5, -6);
        assertEquals(2, result.size());
        assertTrue(result.contains(-1.0));
        assertTrue(result.contains(6.0));
    }

    @Test
    void test2() {
        List<Double> result = RootsCalculator.calculate_roots(1, -4, 4);
        assertEquals(1, result.size());
        assertEquals(2.0, result.get(0));
    }

    @Test
    void test3() {
        List<Double> result = RootsCalculator.calculate_roots(1, 1, 6);
        assertTrue(result.isEmpty());
    }

    @Test
    void test4() {
        List<Double> result = RootsCalculator.calculate_roots(0, 1, 6);
        assertEquals(1, result.size());
        assertEquals(-6.0, result.get(0));
    }

    @Test
    void test5() {
        List<Double> result = RootsCalculator.calculate_roots(0, 0, 7);
        assertTrue(result.isEmpty());
    }

    @Test
    void test6() {
        List<Double> result = RootsCalculator.calculate_roots(0, 0, 0);
        assertEquals(1, result.size());
        assertEquals(INF, result.get(0));
    }
}