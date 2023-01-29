public class Main {
    public static void main(String[] args) {
        int[] resultsManagers={30, 13, 83, 101, 25, 90};
        SalesManager Petia=new SalesManager(resultsManagers);
        System.out.println(Petia.max());
        System.out.println(Petia.min());
        System.out.println(Petia.average());
    }
}
