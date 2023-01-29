package Matrix;

public class Matrix {
  private int a[][];
  public Matrix() {
	  a=new int[][]{{1,2,3},
		         {4,5,6},
		         {7,8,9} };}
  public void print() {
	  int i,j;
	  for(i=0;i<a.length;i++) {	
		  for (j=0;j<a[i].length;j++) {
			  System.out.println(a[i][j]);	}  
	  }
  }
  public void printeach() {
	  for(int i[]:a) {
		  for(int j:i) {
			  System.out.println(j);
		  }
	  }
  }
  public int sum() {
	  int s;
	  s=0;
	  for(int i[]:a) {
		  for (int j:i) {
			  s=s+j;
		  }
	  }
	  return s;
  }
  public int big() {
	  int b;
	  b=0;
	  for(int i[]:a) {
		  for (int j:i) {
			b=j>b?j:b; 
		  }
	  }
	  return b;
  }
  public int small() {
	  int s;
	  s=99;
	  for(int i[]:a) {
		  for (int j:i) {
			s=j<s?j:s; 
		  }
	  }
	  return s;
  }
  public int rsum(int r) {
	  int s,i;
	  s=0;
	  for(i=0;i<a[r].length;i++) {
		  s+=a[r][i];
		  }
	  return s;
	  }
  public int rbig(int r) {
	  int b,i;
	  b=0;
	  for(i=0;i<a[r].length;i++) {
		  b=a[r][i]>b?a[r][i]:b;
		  }
	  return b;
  }
  public int rsmall(int r) {
	  int s,i;
	  s=99;
	  for(i=0;i<a[r].length;i++) {
		  s=a[r][i]<s?a[r][i]:s;
		  }
	  return s;
  }
}
