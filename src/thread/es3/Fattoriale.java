package thread.es3;

public class Fattoriale extends Thread{
    private long Val;

    public Fattoriale(String name, long val) {
        super(name);
        Val = val;
    }

    @Override
    public void run() {
        long result = 1;

        for (int i = 1; i <= this.getVal(); i++){
            result = i * result;
        }
        Val = result;
    }

    public void setVal(long val) {
        Val = val;
    }

    public long getVal() {
        return Val;
    }
}