import java.util.*;
import java.lang.*;
import java.io.*;


class Arithmetic{
    void add(int a,int b){
        System.out.println(a+b);
    }
}

class Adder extends Arithmetic{
    Adder(int a,int b){
        super.add(a,b);
    }
}

public class javaInheritance2 {
	public static void main(String[] args){
        Adder add = new Adder(5,5);
   }
}
