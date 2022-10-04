public class Test {
    public static void main(String [] args) {
        new Test().go(args);
    }
    void makeNoise() {assert true;}
    void go(String[] args){
        if (args.length > 0) makeNoise();
        if (args[0].equals("x")) System.out.println("x");
        if (args[0] == "x") System.out.println("x2");
    }
}
