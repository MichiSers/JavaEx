package lambda;

/**
 * Created by Michi on 27.01.2016.
 */
public class RunnableTest {
    int i = 0;

    public void set(int a){
        i = a;
    }

    public int get(){
        return i;
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableTest r = new RunnableTest();
        int i = 0;
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                int a = 100;
                while (a!=0){
                    r.set(r.get()+1);
                    System.out.println(r.get());
                    a--;
                }

            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                int a = 100;
                while (a!=0){
                    r.set(r.get()-1);
                    System.out.println(r.get());
                    a--;
                }

            }
        };

        r1.run();
        r2.run();

        Thread.sleep(3000);

        System.out.println(r.get());
    }
}
