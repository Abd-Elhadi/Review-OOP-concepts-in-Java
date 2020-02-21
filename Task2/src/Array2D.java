public class Array2D {
	private int row,col;
	private Array container=new Array();

	//constructor to initialize the row&column of the 2D array
	Array2D(int r,int c) {
		this.row=r;
		this.col=c;
		container.create2D(r, c);
	}
	//this method will add an element at a specific row&column
	public void Add2D(int row,int col,int element) {
		container.Add(this.col*row+col, element);
	}
	//this will display the element of the 2D array
	public void Display() {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(container.elementAt(i*col+j)+" ");
			}
			System.out.println();
		}
	}
	//this method will return an element from a specific row&column
	public int get(int row,int col) {
		return container.elementAt(this.col*row+col);
	}
}
