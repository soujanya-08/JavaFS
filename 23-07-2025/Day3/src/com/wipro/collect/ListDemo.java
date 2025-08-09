package com.wipro.collect;

import java.util.ArrayList;
import java.util.Collections;

public class ListDemo
{
public static void main(String[] args)
{
ArrayList<Integer> ls=new ArrayList<Integer>();
ls.add(Integer.valueOf(10));//it will convert Object to primative datatype
ls.add(Integer.valueOf(40));
ls.add(30);//it internally convert object to primative datatype
ls.add(20);
ls.add(50);
Collections.sort(ls,Collections.reverseOrder());
ls.forEach((x)->System.out.println(x));

}

}