package datastructure;

public class HashElement<K, V>{
	
	private K key;
	private V value;
	private HashElement <K,V> next;
	private HashElement<K,V> prev;
	
	public HashElement(K key, V value) {
		this.key = key;
		this.value = value;
		next=null;
		prev=null;
	}
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public HashElement <K,V>  getNext() {
		return next;
	}

	public void setNext(HashElement <K,V>  next) {
		this.next = next;
	}

	public HashElement <K,V>  getPrev() {
		return prev;
	}

	public void setPrev(HashElement <K,V>  prev) {
		this.prev = prev;
	}

	@Override
	public int hashCode() {
		return ((key == null) ? 0 : key.hashCode());
	}
}
