package com.oops.linecomparison;
import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Line Coordinates:");
        Point p1 = new Point(sc.nextInt(), sc.nextInt());
        Point p2 = new Point(sc.nextInt(), sc.nextInt());

        System.out.println("Enter Second Line Coordinates:");
        Point p3 = new Point(sc.nextInt(), sc.nextInt());
        Point p4 = new Point(sc.nextInt(), sc.nextInt());

        Line line1 = new Line(p1, p2);
        Line line2 = new Line(p3, p4);

        System.out.println("Length of Line 1 : " + line1.calculateLength());
        System.out.println("Length of Line 2 : " + line2.calculateLength());

        if (line1.equals(line2)) {
            System.out.println("Both Lines are Equal");
        } else {
            System.out.println("Both Lines are Not Equal");
        }

        int comparison = line1.compareTo(line2);

        if (comparison > 0) {
            System.out.println("Line 1 is Greater than Line 2");
        } else if (comparison < 0) {
            System.out.println("Line 1 is Less than Line 2");
        } else {
            System.out.println("Both Lines have Same Length");
        }

        sc.close();
    }
}