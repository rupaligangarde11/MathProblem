public class Probability {
    double probability;
    public Probability(double probability) {
        this.probability=probability;
    }

    public Probability calculateProbabilityOfNoOccurrence(Probability event) {
        return new Probability(1-probability);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        return Double.compare(that.probability, probability) == 0;

    }

}
