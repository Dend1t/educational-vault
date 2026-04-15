public class Buyer {
    int id;
    int s;
    int t;
    int n;
    int a;
    int q;

    public Buyer(int id, int s, int t, int n) {
        this.id = id;
        this.s = s;
        this.t = t;
        this.n = n;
        this.a = s + t;
    }

    public String toString() {
        return ("Клиент: " + id + " Время входа: " + s + " Время в зале: " + t +
                "\nВремя подхода к кассе: " + a + " Время на кассе: " + n + "  Время выхода : " + q);
    }
}