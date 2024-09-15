package PoliceExample;

public class DescendingThread extends HackerThread{


    public int MAX_PASSWORD = 9999;
    public DescendingThread(Vault vault) {
        super(vault);
    }

    @Override
    public void run() {
        for(int i=MAX_PASSWORD;i>=0;i--) {
            if(vault.isCorrectPassword(i))
            {
                System.out.println(this.getName() +  "guessed the password" + i);
                System.exit(0);
            }
        }
    }
}
