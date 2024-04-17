public class TightCoupling {
    private Printer printer;
    public void TightCouplings(){
        this.printer = new Printer();
    }
    public void printMessage(String message) {
            printer.print(message);
    }

    public static void main(String[] args) {
        TightCoupling tt = new TightCoupling();
        tt.printMessage("Hi today is friday");
    }
    
}

class Printer {
    public void print(String message){
        System.out.println(message);
    }
}
