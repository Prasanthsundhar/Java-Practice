public class methodOverloading {

    static int add(int a, int b){
        return a+b;
    }
     public static int add (int a, int b, int c)
    {
        return a+ b+ c;
    }
    public static void main(String[] args) {
        System.out.println(methodOverloading.add(10, 20, 50));
    }
    
}
