import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    Time add(Time t) {
        int totalSeconds =
                hours * 3600 + minutes * 60 + seconds
                + t.hours * 3600 + t.minutes * 60 + t.seconds;

        int h = totalSeconds / 3600;
        totalSeconds %= 3600;

        int m = totalSeconds / 60;
        int s = totalSeconds % 60;

        return new Time(h, m, s);
    }

    void display() {
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first time (hours minutes seconds):");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();

        System.out.println("Enter second time (hours minutes seconds):");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);
        Time t2 = new Time(h2, m2, s2);

        Time result = t1.add(t2);

        System.out.print("Total Time: ");
        result.display();
    }
}
