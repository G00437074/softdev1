public class Methods{
    public static void main(String[] args) {
        Methods m = new Methods();
        m.method1();
        m.method2(100);
        m.method3(10, 2.5);
        System.out.println(m.method4());
        System.out.println(m.method(5));
    }
    public void method1(){
        System.out.println("method1");
    }
    public void method2(int x){
        System.out.println("method2: " + x);
    }
    public void method3(int x, double y){
        System.out.println("method3: " + x + " " + y);
    }
    public String method4(){
        return "Hello from method4";
    }
    public double method5(int x){
        return x * 0.25;
    }
}