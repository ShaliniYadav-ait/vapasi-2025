package entity;

public class Processor {
    private int generation;
    private double GHz;

    Processor(int gen, double GHz) {
        this.generation = gen;
        this.GHz = GHz;
    }

    public int getGeneration() {
        return this.generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public double getGHz() {
        return this.GHz;
    }

    public void setGHz(double GHz) {
        this.GHz = GHz;
    }
}
