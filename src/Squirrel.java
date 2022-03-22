public class Squirrel {
    private final int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts.clone();
    }

    public int getNuts(int index) {
        return nuts[index];
    }

    public int maxNuts() {
        return Math.max(maxNuts(nuts.length - 1),  maxNuts(nuts.length - 2));
    }

    private int maxNuts(int index) {
        if (index <= 0) return Math.max(nuts[0], 0);
        if (index > 1) {
            return Math.max(nuts[index] + Math.max(maxNuts(index - 1), maxNuts(index -2)), 0);
        } else {
            return Math.max(nuts[index] + maxNuts(0), 0);
        }
    }
}
