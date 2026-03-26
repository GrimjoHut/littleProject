package ru.noxly;

public class App {

	public static void main(String[] args) {
		String name = args.length > 0 ? args[0] : "World";
		System.out.println(greet(name));
	}

	public static String greet(String name) {
		return "Hello, " + name + "!";
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}