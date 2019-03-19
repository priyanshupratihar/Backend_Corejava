package com.example.core.java;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		//Data types=>primitive=>byte=1,short=2, int=4,long=8  float=4,double=8 byte,char=2 byte,boolean=1 bit
		//            Non-primitive=>Array,String,Object
		
		//Even Odd Checking
		int a=10;
		int b = 30;
		for(int i=a;i<b;i++) {
			if(i%2==0) {
				System.out.println("Even number:"+i);
			}
			else {
				System.out.println("Odd number:"+i);
			}
		}
		
		//prime number
		int flag=0;
		for(int i = a; i <= b; i++)
        {
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1)
            {
                System.out.println(i+" is prime number");
            }
        }
		
		
		//swaping
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("after swapping,a="+a+",b="+b);
	}

}
