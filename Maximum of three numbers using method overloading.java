class Maximum {

    int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    double max(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Maximum obj = new Maximum();

        System.out.println("Maximum of integers: " +
                           obj.max(10, 25, 15));

        System.out.println("Maximum of floating numbers: " +
                           obj.max(10.5, 25.7, 15.2));
    }
}
