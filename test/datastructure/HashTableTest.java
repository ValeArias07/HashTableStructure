package datastructure;

import org.junit.Test;

public class HashTableTest {
	
	HashTable <String, String> hashTable;
	
	void setUp1(){
		hashTable= new HashTable<String, String>(200); 
	}
	
	@Test
	public void add() {
		setUp1();
		HashElement <String, String> aux= new HashElement<String,String>("Hola", "Saludo");
		
		hashTable.add(aux.getKey(), aux.getValue());
		
		hashTable.add("Hey", "Arnold");
		hashTable.add("Fuck", "World");
		hashTable.add("Sagitarious", "This");
		
		System.out.println(hashTable.count());
		System.out.println(hashTable.remove("Sagitarious"));
		System.out.println(hashTable.contains("Hola"));
		System.out.println(hashTable.remove("Fuck"));
		System.out.println(hashTable.get("Sagitarious"));
		System.out.println(hashTable.contains("Sabotage"));
		System.out.println(hashTable.get("Hola"));
		System.out.println(hashTable.count());
	}
	
	

}
