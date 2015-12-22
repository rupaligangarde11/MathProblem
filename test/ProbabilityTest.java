import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProbabilityTest {

    @Test
    public void shouldCalculateProbabilityOfNotGettingTails() {
        Probability flipCoin = new Probability();
        assertEquals(0.5,flipCoin.calculateProbability("head"),0);
    }



}
