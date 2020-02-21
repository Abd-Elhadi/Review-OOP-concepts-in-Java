//this program will implement circular array technique
//with help of the class Array using inheritance

public class InQueue extends Array{
	InQueue(){
		super(5);
	}
	public void Circulr(int index) {
		for(int i=index;i<index+size();i++) {
			System.out.print(elementAt(i%size())+" ");
		}
	}
}
