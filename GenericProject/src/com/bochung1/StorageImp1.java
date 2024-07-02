package com.bochung1;

public class StorageImp1<T> implements Storage<T> {
	// 필드
	private T[] array;
	
	// 생성자
	public StorageImp1(int size) {
		this.array = (T[])new Object[size];	// 객체 배열 초기화
	}
	
	//메소드
	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
	

}