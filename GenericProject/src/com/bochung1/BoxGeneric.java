package com.bochung1;

// <T>는 제너릭(generic)
public class BoxGeneric<T> {
	private T t;
	
	public T get() {
		return this.t;
	}
	
	public void set(T t) {
		this.t = t;
	}

}
