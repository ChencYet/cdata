public class Chen
{	
	public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in,"gbk");
		/*System.out.print("请输入第一个数字：");
		int a = s.nextInt();
		System.out.print("请输入运算符：");
		String caSign = s.next();
		System.out.print("请输入第二个数字：");
		int b = s.nextInt();
		switch(caSign)
		{
			case "+":System.out.println(a+"+"+b+"="+(a+b));break;
			case "-":System.out.println(a+"-"+b+"="+(a-b));break; 
			case "*":System.out.println(a+"*"+b+"="+(a*b));break;
			case "/":System.out.println(a+"/"+b+"="+(a/b));break;
			case "%":System.out.println(a+"%"+b+"="+(a%b));break;
			default:System.out.println("data error!!!");break;
		}
		String str = s.next();
        System.out.print(str);
		int i,sum = 0;
		for (i = 1;i <= 100;i += 2)
		    sum+=i;
		System.out.println("sum = " + sum);
		for (int i = 0;i < 1 ;i++)
			System.out.print("i = " + i);
        //九九乘法表

	    int i,j;
	    for (i = 1;i <= 9;i++)
	    {
		    for (j = 1;j <= i;j++)		
		        System.out.print(i + "*" + j + "=" + (i*j) + "  ");
        System.out.print("\n");//==System.out.println(); 
		}
		}
		//判断素数 1
		int i,j,num=0;
		for(i=1;i<=100;i++){
		  for (j = 2;j < i;j++)
			if(i % j == 0) 
                break;
		    if(i == j)
		    {
			   System.out.print(" " + i + "  ");
			   num++;
			   if(num == 8)
			   { 
				  System.out.println();
				  num=0;
			   }
		}
		
}	
}
}
        //判断素数 2
        int i,j,num = 0;
		boolean target;
		for (i = 1;i <= 100;i++)
		{
			target = true;//*标记*
	        for (j = 2;j < i;j++)
	        {
				if (i % j == 0)
				{
					target = false;
					break;
				}
	        }
			if(target == true)
			{	
				System.out.print(i + " ");
			    num++;
				if (num % 8 == 0)
                    System.out.println();
			}
		}
	  }
} 
        //*方法
        int a,b,c;
		System.out.print("please input a:");
		a = s.nextInt();
        System.out.print("please input b:");
		b = s.nextInt();
		c = Chen.calint(a,b//实参);//调用形式；调用某个类的方法
		System.out.println("result = " + c);
	}
	public static int calint(int d1,int d2//形参)
	{
		int sum;
		sum = d1 + d2;
		return sum;
		//当返回值为void时，不能写“return 值;”语句
		//但可以写“return;",表示return所在方法结束;
		
	}
}*/