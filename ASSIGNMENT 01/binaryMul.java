class binaryMul 
{
    public static void main(String args[]) 
	{
		String a = "10";
        String b = "11";
        Integer int1 = Integer.parseInt(a, 2);//(a- variable , 2- redix)
        Integer int2 = Integer.parseInt(b, 2);
        Integer res = int1 * int2;
        System.out.println(Integer.toBinaryString(res));
        // System.out.println(c);
    }
}