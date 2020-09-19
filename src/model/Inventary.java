package model;

import datastructure.HashTable;
import datastructure.IHashTable;

public class Inventary implements IHashTable <String, Integer>{

	private HashTable <String, Integer> hashMap;
	
	public Inventary(int size) {
		hashMap= new HashTable <String, Integer>(size);
	}

	@Override
	public int hashFunction(int hashCode) {
		return hashMap.hashFunction(hashCode);
	}

	@Override
	public void add(String key, Integer value) {
		hashMap.add(key, value);
	}

	@Override
	public Integer get(String key) {
		return hashMap.get(key);
	}

	@Override
	public boolean remove(String key) {
		return hashMap.remove(key);
	}

	@Override
	public boolean contains(String key) {
		return hashMap.contains(key);
	}

	@Override
	public int count() {
		return hashMap.count();
	}
	
}
