package PoliceExample;

public class PoliceThread extends Thread{

    @Override
    public void run() {
        for(int i=10;i>0;i--)
        {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

        System.out.println("Game over for you hackers");
        System.exit(0);
    }
}
