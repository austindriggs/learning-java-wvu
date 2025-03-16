public interface SortedListInterface<S extends Comparable<S>> {
	public boolean isEmpty();

	public boolean isFull();

	public int getMaxSize();

	public int size();

	public int indexOf(S value);

	public int indexOf(S value, int index);

	public S get(int index);

	public boolean contains(S value);

	public void add(S value);

	public boolean removeAll(SortedListInterface<? extends S> list);

	public S remove(int index);

	public boolean remove(S value);

	public void clear();

	public String toString();
}