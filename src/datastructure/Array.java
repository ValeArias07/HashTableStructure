package datastructure;

public class Array <K, V> {

	private final HashElement <K, V>[] array;
	private final int m;
	private int spaceUsed;
	
	public Array( Class<HashElement> class1,int m ) {
		HashElement <K,V> [] newInstance = (HashElement <K,V> []) java.lang.reflect.Array.newInstance(class1, m);
		this.array = newInstance;
		spaceUsed=0;
		this.m=m;
	}
	
	// get element at objArray[i]
    HashElement<K,V> get(int i) {
        return array[i];
    }
    // assign e to objArray[i]
    void set(int i, HashElement<K,V> e) {
        array[i] = e;
        spaceUsed++;
    }
    
    // delete an e element to array[i]
    boolean delete(int i) {
    	array[i]=null;
    	spaceUsed--;
    	return true;
    }
    
    // return the length of the array
    int length() {
    	return m;
    }
    
    boolean delete(int index, K key) {
    	boolean deleted=false;
    	
    	if(array[index]!=null) {
			if(array[index].getNext()!=null) {
				HashElement <K,V> aux= array[index];
				if(aux.getKey().equals(key)) { ///// First Node to be deleting
					array[index]=(((aux.getNext()!=null)==true) ? aux.getNext(): null);
					/*
					 * if(aux.getNext()!=null) 
						array[index]=aux.getNext();
					else 
						array[index]=null;
					 */
				}else {						///// When the node is not the first
					while(aux.getNext()!=null && !deleted) {
						deleted= (aux.getKey().equals(key)==true?true:false);
						aux=aux.getNext();
					}
				}
					
				}
				
			
    	}	
    	return deleted;
    }
    
    int getSpaceUsed() {
    	return spaceUsed;
    }
}
