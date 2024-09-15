package PoliceExample;

public class AscendingThread extends HackerThread {

    public int MAX_PASSWORD = 9999;
    public AscendingThread(Vault vault) {
        super(vault);
    }

    @Override
    public void run() {
        for(int i=0;i<MAX_PASSWORD;i++) {
            if(vault.isCorrectPassword(i))
            {
                System.out.println(this.getName() +  "guessed the password" + i);
                System.exit(0);
            }
        }
    }
}
