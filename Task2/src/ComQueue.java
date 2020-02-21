//this program will implement circular array technique using Queue
//with help of the class Array using composition

public class ComQueue {
	private Array Queue=new Array();
	
	//this method will add an element to a specific index
	public void Add(int index ,int element) {
		Queue.Add(index, element);
	}
	//this will print the element of the Queue using circular array technique
	//an array is called circular if we consider first element as next of last element
	public void Circulr(int index) {
		for(int i=index;i<index+Queue.size();i++) {
			System.out.print(Queue.elementAt(i%Queue.size())+" ");
		}
	}
	
	//to insert an element in the Queue
	public void insert(int element) {
		Queue.insert(element);
	}
	public int size() {
		return Queue.size();
	}
	//to return element from a specific index
	public int elementAt(int index) {
		return Queue.elementAt(index);
	}
}
