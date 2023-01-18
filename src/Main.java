public class Main {
    public static void main(String[] args) {
        long[] resultsManagers={30, 13, 83, 101, 25, 90};
        SalesManager Petia=new SalesManager(resultsManagers);
        System.out.println(Petia.max());
    }
}
