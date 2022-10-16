class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		if(x==0||x==1){
		    return x;
		}
		int i=1,res=1;
		while(res<=x){
		    i++;
		    res=i*i;
		    
		}
		return i-1;
	 }
}
