class MyThr extends Thread{
    MyThr(String name){
        super(name);
    }
    public void run(){
        int a = 12;
        System.out.println("hello i am thread function.......!");
    }
}
public class Main{
    public static void main(String[] args){
        MyThr t1 = new MyThr("suraj");
        t1.start();
        System.out.println("id of thread is : " + t1.getId());
    }
}
