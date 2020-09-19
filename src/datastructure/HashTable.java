package datastructure;

public class HashTable <K,V> implements  IHashTable <K, V>  {

	private Array <K,V> hashMap; 
	public int m;  
	
	public HashTable(int size) {
		hashMap = new Array<K, V>(HashElement.class, size);
		m=size;
	}

	@Override
	public void add(K key, V value) {
		HashElement<K, V> element  = new HashElement <K,V> (key, value);

		int hash=hashFunction(key.hashCode());
		if(!keyRepetead(hash,key)) {
			if(hashMap.get(hash)!=null) {
				HashElement<K, V> aux=  hashMap.get(hash);
				while(aux.getNext()!=null) {
					aux=aux.getNext();
				}
				aux.setNext(element);
				element.setPrev(aux);
			}else{
				hashMap.set(hash, element);
			}
		}
	}
	
	public int hashFunction(int hashCode) {
		return hashCode%m;
	}

	@Override
	public V get(K key) {
		int hash=hashFunction(key.hashCode());
		
		if(hashMap.get(hash)!=null) {
			HashElement <K,V> aux= hashMap.get(hash);
			if(aux.getKey().equals(key)) {
				return aux.getValue();
			}else {
				while(aux.getNext()!=null) { 						/// A little while to search the other HashElements in the slot
					if(aux.getKey().equals(key)) {  				/// Verifies if the HashElement contains the key.
						return aux.getValue();
					}else{
					aux=aux.getNext();  
					}
				}
			}
		}
		return null;
	}

	@Override
	public boolean remove(K key) {
		int hash=hashFunction(key.hashCode());
		return hashMap.delete(hash,key);
	}
	
	@Override
	public boolean contains(K key) {
		int hash=hashFunction(key.hashCode());
		boolean found=false;
		
		if(hashMap.get(hash)!=null){  /// This verifies if the position in the array is null
			if(!(hashMap.get(hash).getKey().equals(key))) { /// This verifies if the first element in the slot contains the key
				if(hashMap.get(hash).getNext()!=null) {  /// This verifies if the slot has several HashElements
					
					HashElement <K,V> aux= hashMap.get(hash);
						while(aux.getNext()!=null && !found) { /// A little while to search the other HashElements in the slot
							found=(aux.getKey().equals(key) ? true:false);  /// Verifies if the HashElement contains the key.
							aux=aux.getNext();  
						}
						
					return found; /// If this is false, it means that none of the HashElements in the slot contains the key.
				}
			}else
				return true; /// This means that the first element contains the key
		}
		return false; /// This means that the slot doesn't contain any HashElement
	}

	@Override
	public int count() {
		return 	hashMap.getSpaceUsed();
	}
	
	private boolean keyRepetead(int hash, K key) {
		boolean isRepetead=false;
		
		if(hashMap.get(hash)!=null) {
			HashElement<K, V> aux =hashMap.get(hash);	
			while(aux.getNext()!=null && !isRepetead) {
				isRepetead=((aux.getKey().equals(key)==true)?true:false);
				aux=aux.getNext();
			}
		}
		return isRepetead;
	}
}
