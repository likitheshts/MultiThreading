public class NewThread extends Thread {
    @Override
    public void run(){
        System.out.println("Inside thread "+ this.getName());
    }
}
