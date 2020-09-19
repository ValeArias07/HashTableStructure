package datastructure;

public interface IHashTable <K, V> {
	
	int hashFunction(int hashCode);
	void add (K key, V value);
	V get(K key);
	boolean remove(K key);
	boolean contains(K key);
	int count();
	
}



