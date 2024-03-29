package unionFind;

public class QuickUnion {
    private int[] id;
    private int[] size;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean Connected(int p, int q) {
        return root(p) == root(q);
    }

    public void Union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j)
            return;

        if (size[i] < size[j]) {
            id[i] = j;
            size[j] += size[i];
        } else {
            id[j] = i;
            size[i] += size[j];
        }
    }
}
