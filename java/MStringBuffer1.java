class  MStringBuffer1
{
	public static void main(String args[ ])
	{
		StringBuffer sb = new StringBuffer("Java");		
		System.out.println(" sb = " + sb );
	
		sb = sb.append(" Programming");
		System.out.println(" sb = " + sb );
		
		sb = sb.append(" Examples.");
		System.out.println(" sb = " + sb );	
	}
}
