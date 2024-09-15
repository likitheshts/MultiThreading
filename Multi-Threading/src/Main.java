public class Main {
    public static void main(String[] args) {

        //Method1
//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Inside thread "+ Thread.currentThread().getName());
//            }
//        });
//        t1.setName("Sample thread");
//        System.out.println("Before executing thread"+ Thread.currentThread().getName());
//        t1.start();
//        System.out.println("after executing thread"+ Thread.currentThread().getName());

        Thread t1 = new NewThread();
        t1.setName("Sample thread");
        System.out.println("Before executing thread"+ Thread.currentThread().getName());
        t1.start();
        System.out.println("after executing thread"+ Thread.currentThread().getName());

    }
}

