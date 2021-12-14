class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("she is smart");
            i++;
        }
    }

}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("She is intelligent");
            i++;
        }
    }
}

public class mtltithreading {
    public static void main(String[] args) {
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        obj1.start();
        obj2.start();

    }

}
