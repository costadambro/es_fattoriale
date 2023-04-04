package thread.es3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Fattoriale f1 = new Fattoriale("Fattoriale primo", 4);
        Fattoriale f2 = new Fattoriale("Fattoriale secondo", 3);
        Fattoriale f3 = new Fattoriale("Fattoriale terzo", 4-3);
        f1.start();
        f2.start();
        f3.start();
        f1.join();
        f2.join();
        f3.join();
        System.out.println("Combinazioni (n,k) = " + f1.getVal() / (f2.getVal() * f3.getVal()));
    }
}
