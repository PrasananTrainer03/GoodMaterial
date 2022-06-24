public class StaticEx {
    static int score;
    public void increment() {
        score++;
    }
    public void show() {
        System.out.println("Score is   " +score);
    }
    public static void main(String[] args) {
        StaticEx obj1 = new StaticEx();
        StaticEx obj2 = new StaticEx();
        StaticEx obj3 = new StaticEx();

        obj1.increment();
        obj2.increment();
        obj3.increment();

        obj1.show();
    }
}
