package PoliceExample;

public class Vault {

    private int password;

    public Vault(int password)
    {
        this.password=password;
    }

    public boolean isCorrectPassword(int guess)
    {
        return password==guess;
    }
}
