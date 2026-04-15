public class Buyer {
    Integer id;
    Integer s;
    Integer t;
    Integer n;
    Integer a = s + t;

    public Buyer(Integer id, Integer s, Integer t, Integer n) {
        this.id = id;
        this.s = s;
        this.t = t;
        this.n = n;
    }

    public void print() {
        System.out.println("Buyer Info:");
        System.out.println("ID: " + id + ", S: " + s + ", T: " + t + ", N: " + n);
    }
}
