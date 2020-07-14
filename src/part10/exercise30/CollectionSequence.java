package part10.exercise30;

import typeinfo.pets.*;
import java.util.*;

/**
 * Exercise 30:   (5) Modify CollectionSequence.java so that it does not inherit 
 * from AbstractCollection, but instead implements Collection. 
 * @author kopan.dmytro
 *
 */
class CollectionSequence
implements Collection<Pet> {
  private Pet[] pets = Pets.createArray(8);
  public int size() { return pets.length; }
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }	
  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }
@Override
public boolean isEmpty() {
	return pets.length == 0;
}
@Override
public boolean contains(Object var1) {
	boolean contains = false;
	for (int i = 0; i < pets.length; i++) {
		if (pets[i].equals(var1)) {
			contains = true;
		}
	}
	return contains;
}
@Override
public Object[] toArray() {
	return pets;
}
@Override
public <T> T[] toArray(T[] var1) {
	return null;
}
@Override
public boolean add(Pet var1) {
	pets = Arrays.copyOf(pets, pets.length+1);
	pets[pets.length-1] = var1;
	
	return true;
}
@Override
public boolean remove(Object var1) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean containsAll(Collection<?> var1) {
	return Arrays.asList(pets).containsAll(var1); // >_<
}
@Override
public boolean addAll(Collection<? extends Pet> var1) {
	pets = Arrays.copyOf(pets, pets.length + var1.size());
	for (Pet pet : var1) {
		this.add(pet);
	}
	return true;
}
@Override
public boolean removeAll(Collection<?> var1) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public boolean retainAll(Collection<?> var1) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public void clear() {
	this.pets = null;
}
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
