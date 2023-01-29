package Matrix;

public class Main1 {

	public static void main(String[] args) {
		Matrix a1;
		a1=new Matrix();
		a1.print();
		System.out.println("Biggest element in the first Row     :"+a1.rbig(0));
		System.out.println("Smallest Element in the first row    :"+a1.rsmall(0));
		System.out.println("Sum of the element in the first row  :"+a1.rsum(0));
		System.out.println("Biggest element in the second Row    :"+a1.rbig(1));
		System.out.println("Smallest Element in the second row   :"+a1.rsmall(1));
		System.out.println("Sum of the element in the second row :"+a1.rsum(1));
		System.out.println("Biggest element in the Third Row     :"+a1.rbig(2));
		System.out.println("Smallest Element in the Third row|   :"+a1.rsmall(2));
		System.out.println("Sum of the element in the third row  :"+a1.rsum(2));
		System.out.println("Biggest element in the matrix        :"+a1.big());
		System.out.println("smallest element in the matrix       :"+a1.small());
		System.out.println("sum of the element in the matrix     :"+a1.sum());
		
	}

}
