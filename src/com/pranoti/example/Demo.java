package com.pranoti.example;
import java.util.ArrayList;
import java.util.List;
public class Demo {
public static void main(String[]args) {
	Demo demo=new Demo();
	demo.m1();
}

public void m1() {
	List<String>list=new ArrayList<String>();
	list.add("Core java");
	list.add("collection framework");
	list.add("MySql");
	list.add("Git");
	System.out.println(list);
}}