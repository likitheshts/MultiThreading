package PoliceExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static int MAX_PASSWORD = 9999;
    public static void main(String[] args)
    {

        Random random = new Random();

        Vault vault = new Vault(random.nextInt(MAX_PASSWORD));

        List<Thread> threads = new ArrayList<>();

        threads.add(new AscendingThread(vault));
        threads.add(new DescendingThread(vault));
        threads.add(new PoliceThread());

        for(Thread thread:threads)
        {
            thread.start();
        }
    }
}
