package com.tistory.johnmark;

import java.util.Scanner;

public class Load {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("CPU Load Simulcast......");
		System.out.print("NumberOfCore: ");
		int numberOfCore = scanner.nextInt();
		System.out.print("NumberOfThreadPerCore: ");
		int numberOfThreadPerCore = scanner.nextInt();
		System.out.print("Load Percent: ");
		double load = scanner.nextDouble();
		System.out.print("Load Simulcast Duration: ");
		long duration = scanner.nextLong();

		System.out.println("======================================================================");
		System.out.println("LOAD TEST SETTING INFO");
		System.out.println("======================================================================");
		System.out.println("numberOfCore = " + numberOfCore);
		System.out.println("numberOfThreadPerCore = " + numberOfThreadPerCore);
		System.out.println("load = " + load);
		System.out.println("duration = " + duration);
		System.out.println("======================================================================");

		for (int thread = 0; thread < numberOfCore * numberOfThreadPerCore; thread++) {
			new CPULoadThread("Thread - [" + thread + "]", load, duration).start();
		}

	}
}
