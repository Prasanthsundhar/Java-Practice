public class coupling {
    public static void main(String[] args) {
        Printer pp = new Printer();
        pp.print(5);
    }
}
 interface Innercoupling {
    void print(int a);
    
}
class Printer implements Innercoupling{
     public void print(int a){
        System.out.println(a);
    }
      
}
