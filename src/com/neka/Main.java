package com.neka;


class A{
    A(){
        System.out.println("working A");
    }

    //step 2: passing parametrised constructor
    A(int i){
        System.out.println("Parametrised constructor of A");
    }
}

class B extends A{
    B(){
        super();  //default one
        System.out.println("working B");
    }

    B(int i){
        super(i);
        System.out.println("Parametrised constructor of B");
    }
}


public class Main {

    public static void main(String[] args) {
	A obj1 = new A();  //working A

    B obj2 = new B(); // working A
                     //  wokring B
//also here A(parent class) is executed first followed by B
//here though we have created obj for B, the constructor of A also gets
//excuted because A is the parent class

        //step 2 :passing parametrised obj

        //A objParamA = new A(5);
            //Parametrised constructor of A
        //B objParamB = new B(10);
            //working A
            //Parametrised constructor of B

/* now here we pass paramterised obj for B but
 ** default constructor of A and
 ** parametrised constructor of B comes
 */
/* every const in sub class, by default has a super method.
by default super is non-parametrised.
hence it calls the non-parametrised/default constructor of A.

to get parameterised of A, we should pass paramter in super
 */

       // A objParamASuper = new A(11);
        B objParamBSuper = new B(07);
    }
}
