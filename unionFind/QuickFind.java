package unionFind;

public class QuickFind {
    private int[] id;

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
    }

    public boolean Connected(int p, int q) {
        return id[p] == id[q];
    }

    public void Union(int p, int q) {
        int p_id = id[p];
        int q_id = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == p_id)
                id[i] = q_id;
        }
    }

    public static void testQuickFind() {
        QuickFind qf = new QuickFind(10);
        qf.Union(4, 3);
        System.out.println(qf.Connected(4, 3));
        qf.Union(3, 8);
        System.out.println(qf.Connected(4, 8));
        qf.Union(6, 5); 
        qf.Union(9, 4); 
        qf.Union(2, 1); 
        System.out.println(qf.Connected(7, 2));
    }
}



