import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ProbabilityTest {

    @Test
    public void shouldReturnProbabilityOfNotGettingTails(){
        Probability probabilityOfTails = new Probability(0.2);
        assertEquals(new Probability(0.8),probabilityOfTails.calculateProbabilityOfNoOccurrence());
    }

    @Test
    public void shouldReturnProbabilityOfGettingTailsOnBothTheCoin() {
        Probability probabilityOfTailsInFirstCoin = new Probability(0.2);
        Probability probabilityOfTailsInSecondCoin = new Probability(0.6);
        assertEquals(new Probability(0.12), probabilityOfTailsInFirstCoin.
                calculateAndProbabilityOfTwoMutuallyExclusiveEvents(probabilityOfTailsInSecondCoin));
    }

    @Test
    public void shouldReturnProbabilityOfGettingTailsOnEitherOfTheCoin() {
        Probability probabilityOfTailsInFirstCoin = new Probability(0.2d);
        Probability probabilityOfTailsInSecondCoin = new Probability(0.6d);
        assertEquals(new Probability(0.68), probabilityOfTailsInFirstCoin
                .calculateOrProbabilityOfTwoMutuallyExclusiveEvents(probabilityOfTailsInSecondCoin));
    }
}
