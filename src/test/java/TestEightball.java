import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class TestEightball {

    EightBall eightBall;

    @Before
    public void before() {
        eightBall = new EightBall();
    }

    @Test
    public void hasAnswers(){
        eightBall.add("Yes");
        eightBall.add("Perhaps");
        eightBall.add("No way");
        assertEquals(3, eightBall.getNumberOfAnswers());
    }

    @Test
    public void hasRandomAnswers(){
        eightBall.add("Yes");
        eightBall.add("Perhaps");
        eightBall.add("No way");
        System.out.println(eightBall.go());
        assertNotNull(eightBall.go());
    }

    @Test
    public void removeAnswers(){
        eightBall.remove("Yes");
        assertEquals(2, eightBall.getNumberOfAnswers());
    }


}
