class Addition {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition obj = new Addition();

        System.out.println("Integer addition: " +
                           obj.add(10, 20));

        System.out.println("Floating-point addition: " +
                           obj.add(10.5, 20.5));
    }
}
