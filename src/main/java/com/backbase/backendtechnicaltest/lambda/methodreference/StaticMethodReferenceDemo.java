package com.backbase.backendtechnicaltest.lambda.methodreference;

interface MethodReference {
	void helloMethodReference();
}

public class StaticMethodReferenceDemo {
	static int helloMethodReference() {
		System.out.println("From helloMethodReference!");
		return 100;

	}

	public static void main(String args[]) {
		MethodReference methodReference = StaticMethodReferenceDemo::helloMethodReference;
		methodReference.helloMethodReference();
	}
}
