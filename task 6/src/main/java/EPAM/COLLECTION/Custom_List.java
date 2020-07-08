package EPAM.COLLECTION;

import java.util.Arrays;
public class Custom_List<E> {
	private int size=0;
	private static final int min_elements=10;
	private Object elements[];
	public Custom_List()
	{
		elements=new Object[min_elements];
	}
	public void add(E ele) {
		if (size==elements.length) {
			increaseCapacity();
		}
		elements[size++]=ele;
	}
	public E get(int i) {
		if(i>=size||i<0){
			throw new IndexOutOfBoundsException("Index: " +i);
		}
		return (E)elements[i];
	}
	public E remove(int i) {
		if (i>=size||i<0) {
			throw new IndexOutOfBoundsException("Index: " +i);
		}
		Object obj=elements[i];
		int num=size-(i+1) ;
		System.arraycopy(elements,i+1,elements,i,num) ;
		size--;
		return (E)obj;
	}
	public int size() {
		return size;
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		for(int i=0;i<size;i++) {
			sb.append(elements[i].toString());
			if(i<size-1){
				sb.append(",");
			}
		}
		sb.append(']');
		return sb.toString();
	}
	private void increaseCapacity(){
		int newSize =elements.length*2;
		elements=Arrays.copyOf(elements,newSize);
	}
}