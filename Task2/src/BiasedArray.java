//BiasedArray  behaves like an Array.
//Except that the lower limit is an arbitrary integer (rather than just 0)

public class BiasedArray extends Array{
	private int bias=1;//initialize bias with 1
	
	public BiasedArray() {
		super();
	}
	//set bias with the given value
	public void set(int bias) {
		this.bias=bias;
	}
	//return the element from the given index
	public int At(int index) {
		valid(index%bias);
		return this.elementAt(index%bias);
	}
}
