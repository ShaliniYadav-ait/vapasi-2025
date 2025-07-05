package entity;

public class RAM {
    private int size, generation;

    RAM(int size, int gen) {
        this.size = size;
        generation = gen;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getGeneration() {
        return this.generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
}

