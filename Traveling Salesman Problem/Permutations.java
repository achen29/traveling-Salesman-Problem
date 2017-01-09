import java.util.Arrays;

public class Permutations {
public static void printP(int[] c){
	Arrays.sort(c);
	System.out.println(Arrays.toString(c));
	  while ( ( c = nextP( c ) ) != null ) {
          System.out.println( Arrays.toString( c ) );
  }
}
public static int[] nextP(final int[] c){
	int first = getFirst(c);
	if(first == -1){
		return null;
	}
	int swap = c.length -1;
	while(c[first] >= c[swap]){
		swap--;
	}
	swap(c, first++, swap);
	swap = c.length -1;
	while(first <swap){
		swap(c, first++, swap--);
	}
	return c;
}
private static int getFirst( int[] c ) {
    for ( int i = c.length - 2; i >= 1; i-- )
            if (  c[ i ]  < c[ i + 1 ] )
                    return i;
    return -1;
}
private static void swap(int[] c,int i, int j ) {
    int temp = c[ i ];
    c[ i ] = c[ j ];
    c[ j ] = temp;
}
}
