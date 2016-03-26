    class Root 
             {
	public static void main(String[] args) 
	{
		int d=0;
		double r1=0,r2=0;
		int a=Integer.parseInt(args[0]);
        		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		d=((b*b)-(4*a*c));
		if(d==0)
		{
            		System.out.println("roots are real and equal");
			r1=(-b)/(2*a);
			r2=(-b)/(2*a);
		    	System.out.println(r1);
			System.out.println(r2);
     		   }
		else if(d>0)
		{
			System.out.println("roots are real and distinct");
			r1=(-b+Math.sqrt(d))/(2*a);
			r2=(-b-Math.sqrt(d))/(2*a);
			System.out.println(r1);
			System.out.println(r2);
		}
		else
       		 {
			System.out.println("no real solutions");
		}

	}
}
