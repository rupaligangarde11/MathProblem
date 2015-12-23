public class Probability {
    double probability;
    public Probability(double probability) {
        this.probability=probability;
    }

    public Probability calculateProbabilityOfNoOccurrence() {
        return new Probability(1d-probability);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        that.probability= Math.round(that.probability*100.0)/100.0;
        return Double.compare(that.probability, probability) == 0;

    }

    public Probability calculateAndProbabilityOfTwoMutuallyExclusiveEvents(Probability that) {
        return new Probability(this.probability * that.probability);
    }

    public Probability calculateOrProbabilityOfTwoMutuallyExclusiveEvents(Probability that) {

        Probability thisComplementProbability = this.calculateProbabilityOfNoOccurrence();
        Probability thatComplementProbability = that.calculateProbabilityOfNoOccurrence();
        return new Probability(1d-(thisComplementProbability.calculateAndProbabilityOfTwoMutuallyExclusiveEvents
                (thatComplementProbability)).probability);
    }
}
