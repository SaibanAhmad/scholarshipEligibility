package com.loveablejerk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String studentName;

        int studentInfo[] = new  int[4];

	System.out.println("IUB is Currently offering three types of Scholarships\n");

	System.out.println("1) Need based scholarship\n" + "2) Hafiz-e-Quran scholarship\n" + "3) Position holder scholarship\n" );

	    System.out.println("Enter Your Name: ");
	    studentName = new Scanner(System.in).next();

        System.out.println("Enter Your Father's Monthly income: ");
        studentInfo[0] = new Scanner(System.in).nextInt();

	    System.out.println("Are you Currently Enrolled in Any of IUB's Programs? Type 1 for YES and 0 for NO");
        studentInfo[1] = new Scanner(System.in).nextInt();

	    System.out.println("Are you a Hafiz-e-Quran? Type 1 for YES and 0 for NO ");
        studentInfo[2] = new Scanner(System.in).nextInt();

        System.out.println("Are You a Position Holder? Type 1 for YES and 0 for NO");
        studentInfo[3] = new Scanner(System.in).nextInt();

        Eligibility eligibilityChecker = new Eligibility();
        eligibilityChecker.isEligible(studentName,studentInfo[0],studentInfo[1],studentInfo[2],studentInfo[3]);


    }


}
