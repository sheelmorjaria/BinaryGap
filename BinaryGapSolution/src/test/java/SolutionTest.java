import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void testSolution() {
        assertEquals(0, (new Solution()).solution(1));
        assertEquals(0, (new Solution()).solution(2));

        assertEquals(15, (new Solution()).solution(65537));
        assertEquals(5, (new Solution()).solution(2147483));

    }
}

