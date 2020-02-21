public class Array {
	private int increment;
	private int array[];
	private int numofelement=0;
	Array(int limit){
		this.increment = limit;
		this.array= new int [limit];
	}
	//empty constructor 
	Array() {}

	//this method will create a 2D Array using the Array class we created
	public void create2D(int r,int c) {
		this.increment=r*c;
		this.array=new int [r*c];
	}

	//this will check if the size is less than the desired size, it will increase is to double
	void ensure(int desiredSize ) {
		if(desiredSize>array.length) {
			int newArray[]=new int[desiredSize];
			for(int i=0;i<array.length;i++)
				newArray[i]=array[i];
			array=newArray;
		}
	}

	//this method will throw an error if out of range index occurred
	private String ErrorMsg(int index) {
		return "Index "+index+" out of range";
	}

	//this method will check if an index is valid or not
	public void valid(int index) {
		if(index<0||index>increment)
			throw new IndexOutOfBoundsException(ErrorMsg(index));
	}

	//this method will add an element to a specific index
	public void Add(int index,int element) {
		valid(index);
		if(numofelement==increment)
			//double the size before inserting the new element
			ensure(2*array.length); 
		for(int i=numofelement;i>index;i--) {
			array[i]=array[i-1];
		}
		array[index]=element;
		numofelement++;
	}

	//this will will return from a specific index
	public int elementAt(int index) {
		valid(index);
		return array[index];
	}

	//this will insert an element to the array
	public void insert(int element) {
		array[numofelement++]=element;
	}

	//this method will return the array
	public int[] getArray() {
		return array;
	}

	//this method will display the element of the array
	public void Display(){
		for(int i=0;i<array.length;i++)System.out.print(array[i]+" ");
	}

	//this method will return the number of current element in the array
	public int size() {
		return numofelement;
	}
}
