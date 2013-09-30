package Homework1;

import java.io.File;
import java.io.IOException;

import Helpers.IOHelper;

public class Into {
	public static void init(String[] args) throws IOException{
		String fileName = null;
		if(args.length > 0){
			fileName = args[args.length-1];
		}
		int flag[]= argsDeal(args);
		if(!IOHelper.init(new File(fileName), IOHelper.readMode.NUMBER))
			return;
		int row = IOHelper.readNextInt();
		int column = IOHelper.readNextInt();
		int array[][] = new int[row][column];
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				array[i][j] = IOHelper.readNextInt();
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
//		if(compare(flag, new int[]{1,0,0}))
//			System.out.println(Maxsum.max2_a(array));

		if(compare(flag, new int[]{0,1,0}))
			System.out.println("Matrix /v :" + Maxsum.max2_v(array));
		else if(compare(flag, new int[]{0,0,1}))
			System.out.println("Matrix /h :" + Maxsum.max2_h(array));
		else if(compare(flag, new int[]{0,1,1}))
			System.out.println("Matrix /v/h :" + Maxsum.max2_v_h(array));
		
		System.in.read();
	}
	
	public static int[] argsDeal(String args[]){
		int flag[] = new int[3];
		for(String s:args){
			if(s.equals("/a"))
				flag[0] = 1;
			if(s.equals("/v"))
				flag[1] = 1;
			if(s.equals("/h"))
				flag[2] = 1;
		}
		return flag;
	}
	
	public static boolean compare(int a[], int b[]){
		if(a.length != b.length)
			return false;
		for(int i=0; i<a.length; i++){
			if(a[i] != b[i])
				return false;
		}
		return true;
	}
}
