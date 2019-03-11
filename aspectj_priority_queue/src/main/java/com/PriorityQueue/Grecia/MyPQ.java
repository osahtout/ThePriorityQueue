import java.util.List;

public abstract class MyPQ<K extends Comparable<K>, E> {

	abstract boolean insert(E ElementType, K KeyType);
	
	abstract E remove();

	abstract E min();

	abstract int getSize();	
	
	abstract List<MyPair<K, E>> getElements();
}
