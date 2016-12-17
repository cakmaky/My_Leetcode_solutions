package leetcode;

import java.util.Arrays;

public class Q223 {
	
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		
		int area = (C-A)*(D-B) + (G-E)*(H-F);
		int[] x = {A,C,E,G};
		int[] y = {B,D,F,H};
		Arrays.sort(x);
		Arrays.sort(y);
		if(((E>A && E<C) || (G>A && G<C) || (E<A && G>C)) && ((F>B && F<D) || (H>B && H<D) || (F<B && H>D))){
			area -= (x[2] - x[1]) * (y[2] - y[1]);
		}
		
		return area;    
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
