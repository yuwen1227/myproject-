package com.java2.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Tree set  不重複 依大小排序
//Hash set  不重複 不照順序  is faster than Tree set
//ArrayList
//LinkedList

public class Main {
	  public static void main(String[] args) {
		  List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		  list.remove(0);
		  list.remove(1);
		  list.remove(2);
		  list.remove(3);
		  System.out.println(list);
}
} 