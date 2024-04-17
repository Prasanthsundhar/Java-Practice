public class Test {
    private String dummy;
    private String noValue;
    private Test(String value){
        this.dummy = value;
    }
    private Test(String getValue ,String noValue){
        this.dummy = getValue;
        this.noValue   = noValue;
    }

    public static void main(String[] args) {
        Test data = new Test("Test1");
        System.out.print(data.dummy);
    }
}
