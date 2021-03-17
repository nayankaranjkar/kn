class logicgates{
	int or_gate(int in1,int in2){
		
		int a,b;
		a=in1;
		b=in2;
		int ans;
		int or_ans;
		
		or_ans=a|b;
		return or_ans;
		
	}
	int nor_gate(int in1,int in2){
		int nor_ans;
		int a=in1;
		int b=in2;
		if(a==0 && b==0)
			nor_ans=1;
		else nor_ans=0;
		return nor_ans;
	}
	public static void main(String []args){
	int p=0;
	int q=0;
    logicgates lg=new logicgates();
    int or_ans = lg.or_gate(p,q);	
	int nor_ans = lg.nor_gate(p,q);	
	System.out.println("or: "+or_ans+"\nnor: "+nor_ans);
	}
	
}
	
	
	
	