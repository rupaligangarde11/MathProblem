import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProbabilityTest {


    @Test
    public void shouldReturnProbabilityOfNotGettingTails(){
        Probability probabilityOfTails = new Probability(0.2);
        assertEquals(new Probability(0.8),probabilityOfTails.calculateProbabilityOfNoOccurrence(probabilityOfTails));
    }
}
