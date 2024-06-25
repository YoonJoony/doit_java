package sec03_genericmethod.EX01_GenericMethod;

import javax.crypto.KEM;

import basic05.MethodsOfString_1;

public class GenericMethods {
	public <T> T method1(T t) {
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3(K k, V v) {
		System.out.println(k + ":" + v);
	}
}
