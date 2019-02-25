package naxxhi.com.vss.sudoku;

class f1 extends f_xj//Gold stein f(x)=3.0 @x=(0,-1) -2<x[i]<2 i=1,2
{
    @Override
    double func(double x[])
    {
        double first;
        double second=0.0;
        
        first=(1.0+(x[0]+x[1]+1.0)*(x[0]+x[1]+1.0)*(19.0-14.0*x[0]+3.0*x[0]*x[0]-14.0*x[1]+6.0*x[0]*x[1]+3.0*x[1]*x[1]));	
        second=30.0+(2.0*x[0]-3.0*x[1])*(2.0*x[0]-3.0*x[1])*(18.0-32.0*x[0]+12.0*x[0]*x[0]+48.0*x[1]-36.0*x[0]*x[1]+27*x[1]*x[1]);	
        
        return first*second;	
    }	
}

class f2 extends f_xj// Beale f(x)=0    @x=(3,0.5)   -4.5<x[i]<4.5, i = 1, 2.
{
    @Override
    double func(double x[])
    {
        double first;	
        first=((1.5-x[0]+x[0]*x[1])*(1.5-x[0]+x[0]*x[1]))+((2.25-x[0]+x[0]*x[1]*x[1])*(2.25-x[0]+x[0]*x[1]*x[1]))+((2.625-x[0]+x[0]*x[1]*x[1]*x[1])*(2.625-x[0]+x[0]*x[1]*x[1]*x[1]));
        
        return first;	
    }	
}

class f3 extends f_xj// Bohachecsky 1 f(x)=0  @x=(0.0,0.0)   -5.0<x[i]<5.0, i = 1, 2.
{
    @Override
    double func(double x[])
    {
        double first;	
        first=x[0]*x[0]+2.0*x[1]*x[1]-0.3*(Math.cos(Math.PI*3.0*x[0]))-0.4* Math.cos(4.0* Math.PI*x[1])+0.7;
        
        return first;	
    }	
}

class f4 extends f_xj// Bohachecsky 2 f(x)=0  @x=(0.0,0.0)   -5.0<x[i]<5.0, i = 1, 2.
{
    @Override
    double func(double x[])
    {        
        return x[0]*x[0]+2.0*x[1]*x[1]-(0.3*(Math.cos(Math.PI*3.0*x[0]))* Math.cos(4.0* Math.PI*x[1]))+0.3;
    }	
}

class f5 extends f_xj// Bohachecsky 3 f(x)=0  @x=(0.0,0.0)   -5.0<x[i]<5.0, i = 1, 2.
{
    @Override
    double func(double x[])
    {
        return x[0]*x[0]+2.0*x[1]*x[1]-(0.3*(Math.cos(Math.PI*3.0*x[0]+ Math.PI*4.0*x[1])))+0.3;
    }	
}

class f6 extends f_xj// Booth  f(x)=0  @x=(1.0,3.0)   -10.0<x[i]<10.0, i = 1, 2.
{
    @Override
    double func(double x[])
    {
        return (x[0]+2.0*x[1]-7.0)*(x[0]+2.0*x[1]-7.0)+(2.0*x[0]+x[1]-5.0)*(2.0*x[0]+x[1]-5.0);	
    }	
}

class f7 extends f_xj// Branin  f(x)=0.397887  @x=(-pi,12.275),(pi,2.275),(9.42478,2.475)   -5.0<=x[0]<=10.0, 0.0<=x[1]<=15.0
{
    @Override
    double func(double x[])
    {
        return ((x[1]-(5.1*x[0]*x[0]/(4.0* Math.PI* Math.PI))+(5.0*x[0]/ Math.PI)-6.0)*(x[1]-(5.1*x[0]*x[0]/(4.0* Math.PI* Math.PI))+(5.0*x[0]/ Math.PI)-6.0))+(10.0*(1.0-(1.0/(8.0*3.1415)))* Math.cos(x[0]))+10.0;
    }	
}

class f8 extends f_xj// Colville  f(x)=0.0  @x=(1,1,1,1)   -10.0<=x[i]<=10.0 i=0,1,2,3
{
    @Override
    double func(double x[])
    {	
        return (100.0*(x[0]-x[1]*x[1])*(x[0]-x[1]*x[1]))+((1.0-x[0])*(1.0-x[0]))+(90.0*(x[3]-x[2]*x[2])*(x[3]-x[2]*x[2]))+((1.0-x[2])*(1.0-x[2]))+(10.1*((x[1]-1.0)*(x[1]-1.0)+(x[3]-1.0)*(x[3]-1.0)))+(19.8*(x[1]-1.0)*(x[3]-1.0));
    }           
}

class f9 extends f_xj// Easom  f(x)=-1.0  @x=(pi,pi)   -100.0<=x[i]<=100.0 i=0,1
{
    @Override
    double func(double x[])
    {
        return -Math.cos(x[0])* Math.cos(x[1])* Math.exp(-(x[0]- Math.PI)*(x[0]- Math.PI)-(x[1]- Math.PI)*(x[1]- Math.PI));
    }	
}

class f10 extends f_xj// Himmelblau f(x)=0.0  @x=(3.0,2.0),(-2.8051,3.1313),(-3.7793,-3.2831),(3.5844,-1.8481)   -6.0<=x[i]<=6.0 i=0,1
{
    @Override
    double func(double x[])
    {
        return (((x[0]*x[0]+x[1]-11.0)*(x[0]*x[0]+x[1]-11.0))+(x[0]+x[1]*x[1]-7.0)*(x[0]+x[1]*x[1]-7.0));
    }	
}

class f11 extends f_xj// Griewank f(x)=0.0  @x=(0,0)<---global minima     several local minimas      -600<x[i]<600 i=1,2,.. x.length 
{
    @Override
    double func(double x[])
    {
        double s=0.0;
        double fact=1.0;
        int m=x.length;
        for(int i=0;i<m;i++)
        {
            s+=x[i]*x[i];}	
            for(int i=0;i<m;i++)
            {
                fact*= Math.cos(x[i]/ Math.sqrt(i+1));
            }
        return (s/4000.0)+1.0+(-fact);	
     }	
}

class f12 extends f_xj// Hartman3 f(x)=-3.86  @x=(0.114,0.556,0.852)   0.0<x[i]<1.0 for n=3 variable 
{
    @Override
    double func(double x[])
    {
        double[][] A={{3.0,10.0,30.0},{0.1,10.0,35.0},{3.0,10.0,30.0},{0.1,10.0,35.0}};
        double c[]={1.0,1.2,3.0,3.2};
        double p[][]={{0.3689,0.1170,0.2673},{0.4699,0.4387,0.7470},{0.1091,0.8732,0.5547},{0.03815,0.5743,0.8828}}   ;
        double sin;
        double sout=0.0;
        for(int i=0;i<=3;i++)	
        {  
            sin=0.0;
            for(int j=0;j<=3;)
            {
                sin+=A[i][j]*(x[j]-p[i][j])*(x[j]-p[i][j]);
            } 
            sout+=c[i]* Math.exp(-sin);
        }	

        return -sout;	
    }	
}

class f13 extends f_xj// Matyas function f(x)=0.0 @x(0,0)  -10.0<=x[i]<=10.0
{
    @Override
    double func(double x[])
    {
        return 0.26*(x[0]*x[0]+x[1]*x[1])-0.48*x[0]*x[1];
    }	
}

class f14 extends f_xj //Michalewicz n=x.length=2 f(x)=-1.8013    0<=x[i]<=pi
{                                        //    =5 f(x)=-4.687658        
    @Override
    double func(double x[])               //   =10 f(x)=-9.66015  
    {
	int n=x.length;   
	double m=10.0;
	double s=0.0;
	for(int i=0;i<n;i++)
	{s+= Math.sin(x[i])* Math.pow(Math.sin(((double)i+1.0)*x[i]*x[i]/3.1415),2.0*m);}
	return -s;   
    }	
}

class f15 extends f_xj //Perm function!!!!!! error  
{                                               
    @Override
    double func(double x[])                
    {
	int n=x.length;   
	double b=0.5;

	double sin;
	double sout=0.0;
	for(int k=0;k<n;k++)
	{sin=0.0;
	 for(int i=0;i<n;i++)
	 {sin+=(Math.pow((double)i,(double)k)+b)*(Math.pow((x[i]/(double)i),(double)k)-1.0);}
	 sout+=sin*sin;	
	}
	return sout;   
    }	
}

class f16 extends f_xj //Powell function !!Error     Must--->mod(x.length,4)==0 
{                                               
   @Override
   double func(double x[])                
   {
	int n=x.length;
	int m=n/4;double s=0.0;
	for(int j=1;j<=m;j++)
	{s+=((x[4*j-4]+10.0*x[4*j-3])*(x[4*j-4]+10.0*x[4*j-3]))+(Math.sqrt(5.0)*(x[4*j-2]-x[4*j-1])*(x[4*j-2]-x[4*j-1]))+(Math.pow((x[4*j-3]-2.0*x[4*j-2]),4.0))+(Math.sqrt(10.0)* Math.pow(x[4*j-4]-x[4*j-1],4.0));}
	return s;
	   
   }
}

class f17 extends f_xj //Shekel function     f(x)=-10.1532 m=5; @x=(4,4,4,4) 0<=x[i]<=10.0   
{                                          //f(x)=-10.4029 m=7;     
   @Override
   double func(double x[])                 //f(x)=-10.5364 m=10;
   {
	int n=x.length;
	double A[][]={{4.0,4.0,4.0,4.0},{1.0,1.0,1.0,1.0},{8.0,8.0,8.0,8.0},{6.0,6.0,6.0,6.0},{3.0,7.0,3.0,7.0},{2.0,9.0,2.0,9.0},{5.0,5.0,3.0,3.0},{8.0,1.0,8.0,1.0},{6.0,2.0,6.0,2.0},{7.0,3.6,7.0,3.6}};
	double c[]={0.1,0.2,0.2,0.4,0.4,0.6,0.3,0.7,0.5,0.5};
	double sin;
	double sout=0.0;
	for(int i=0;i<10;i++)
	{ 
            sin=c[i];
            for(int j=0;j<n;j++)	
            {
                sin+=(x[j]-A[i][j])*(x[j]-A[i][j]);
            }
            sout+=(1.0/sin);	
	}
	return -sout;
    }
}

class f18 extends f_xj //Trid function     f(x)=-50.0 x.length=6;  -x.length^2<=x[i]<=x.length^2   
{                                              
   @Override
   double func(double x[])                 
   {
	int n=x.length;
	double s1=0.0;double s2=0.0;
	for(int i=0;i<n;i++)
	{
            s1+= Math.pow(x[i]-1.0,2.0);
        }
        
	for(int i=1;i<n;i++)
	{
            s2+=x[i]*x[i-1];
        }
	return s1-s2;
    }
}

class f19 extends f_xj //Zakharov function     f(x)=0.0 @x=(0,0,..)   -5<=x[i]<=10   
{                                              
   @Override
   double func(double x[])                 
   {
	int n=x.length;
	double s1=0.0;double s2=0.0;double s3=0.0;
	for(int i=0;i<n;i++)
	{
            s1+=x[i]*x[i];
        }
        
	for(int i=0;i<n;i++)
	{
            s2+=0.5*(double)i*x[i];
        }
	return s1+ Math.pow(s2,2.0)+ Math.pow(s2,4.0);
	
    }
}

class f20 extends f_xj //Levy function         f(x)=0   @x=(1,1,1...) -10<x[i]<10 
{                                              
    @Override
    double func(double x[])                 
    {
        int n=x.length;
        double z[]=new double[n];
        for(int i=0;i<n;i++)
        {
            z[i]=1.0+((x[i]-1.0)/4.0);
        }
        
        double s= Math.pow(Math.sin(3.1415*z[0]),2.0);
        for(int i=0;i<n-1;i++)
        {
            s+= Math.pow((z[i]-1.0),2.0)*(1.0+10.0* Math.pow(Math.sin(3.1415*z[i]+1.0),2.0));
        }
        return s+ Math.pow(z[n-1]-1.0,2.0)*(Math.pow(Math.sin(2.0*3.1415*z[n-1]),2.0)+1.0);
    }
}


class f21 extends f_xj //Dixon price function         f(x)=0    -10<x[i]<10 
{                                              
   @Override
   double func(double x[])                 
   {
	int n=x.length;
	double s1=0.0;
	for(int i=1;i<n;i++)
	{
            s1+=((double)i+1.0)*(2.0*x[i]*x[i]-x[i-1])*(2.0*x[i]*x[i]-x[i-1]);
        }
	return s1+(x[0]-1.0)*(x[0]-1.0);
    }
}

class f22 extends f_xj //Salomon's function         f(x)=0      @x=(0,0,0...) -10<x[i]<10 
{                                              
    @Override
    double func(double x[])                 
    {
	int n=x.length;
	double s1=0.0;
        for(int i=0;i<n;i++)
        {
            s1+=x[i]*x[i];
        }
        
        s1= Math.sqrt(s1);
	return -Math.cos(2.0*3.1415*s1)+0.1*s1+1.0;
    }
}

class f23 extends f_xj //Whitley's function         f(x)=0      @x=(0,0,0...) -10<x[i]<10 
{                                              
   @Override
   double func(double x[])                 
   {
	int n=x.length;
	double s1=0.0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                s1+=(Math.pow((100.0*(x[i]*x[i]-x[j])*(x[i]*x[i]-x[j])+(1.0-x[j])*(1.0-x[j])),2.0)/4000.0)- Math.cos((100.0*(x[i]*x[i]-x[j])*(x[i]*x[i]-x[j])+(1.0-x[j])*(1.0-x[j])))+1.0;
            }
        }
	return s1;
    }
}

class f24 extends f_xj //quartic function         f(x)=0      @x=(0,0,0...) -10<x[i]<10 
{                                              
   @Override
   double func(double x[])                 
   {
	int n=x.length;
	double s1=0.0;
        for(int i=0;i<n;i++)
        {
            s1+=((double)i+1.0)* Math.pow(x[i],4.0);
        }
            
        s1+= Math.random();
	return s1;
  }
}

class f25 extends f_xj //quartic function         f(x)=0      @x=(0,0,0...) -10<x[i]<10 
{                                              
   @Override
   double func(double x[])                 
   {
	int n=x.length;
	double s1=0.0;
        for(int i=0;i<n;i++)
        {
            s1+=((double)i+1.0)* Math.pow(x[i],4.0);
        }
        
        s1+= Math.random();
        return s1;
  }
}

class f26 extends f_xj //Camel Back -6 Hump function         f(x)=-1.0316285       -5<x[i]<5 
{                                              
   @Override
   double func(double x[])                 
   {
	int n=x.length;
        double s1=4.0*x[0]*x[0]-2.1*x[0]*x[0]*x[0]*x[0]+(x[0]*x[0]*x[0]*x[0]*x[0]*x[0]/3.0)+(x[0]*x[1])-4.0*x[1]*x[1]+4.0*x[1]*x[1]*x[1]*x[1];
        return s1;
   }
}

class f27 extends f_xj //Schwefel 2.22         f(x)=0    @x=(0,0,...)  -100<x[i]<100  
{                                              
   @Override
   double func(double x[])                 
   {
	int n=x.length;
	double s1=0.0;
	double f1=1.0;
        for(int i=0;i<n;i++)
        {
            s1+= Math.abs(x[i]);
            f1*= Math.abs(x[i]);
        }
        return s1+f1;
   }
}

class f28 extends f_xj //Kowalik         f(x)=3.0748e-4    @x=(0,0,...)  -5<x[i]<5  
{                                              
   @Override
   double func(double x[])                 
   {
	int n=x.length;
	double a[]={0.1957,0.1947,0.1735,0.16,0.0844,0.0627,0.0456,0.0342,0.0323,0.0235,0.0246};
        double b[]={0.25, 0.5, 1.0, 2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0};
        double s1=0.0;
        for(int i=0;i<11;i++)
        {
            s1+= Math.pow((a[i]-((x[0]*(1.0+x[1]*b[i]))/(1.0+x[2]*b[i]+x[3]*b[i]*b[i]))),2.0);
        }
        return s1;
   }
}

class f29 extends f_xj //Schaffer function         f(x)=0    @x=(0,0,...)  -100<x[i]<100  
{                                              
   @Override
   double func(double x[])                 
   {
        int n=x.length;
        double s1=0.0;
        for(int i=0;i<n;i++)
        {s1+=x[i]*x[i];}
        double s2= Math.sqrt(s1);
        return 0.5+((Math.pow(Math.sin(s1),2.0)-0.5)/(1.0+0.001*s1));
    }
}


class f30 extends f_xj  // Rosenbrock's valley     f(x)=0.0     -2.048<x[i]<2.048
{
    @Override
    double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;
        double ff=0.0;
        for(int i=0;i<n-1;i++)
        {
            ff+=(100.0*(x[i+1]-x[i]*x[i])*(x[i+1]-x[i]*x[i])+(1.0-x[i])*(1.0-x[i]));
        }
        return ff; 
    }
}

class f31 extends f_xj // De Jong�s first function     f(x)=0  @x=(0,0,...)     -5.12<x[i]<5.12
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double ff=0;
        int n=x.length;
        for(int i=0;i<n;i++)
        {
            ff+=x[i]*x[i];
        }
        return ff;
    }
}

class f32 extends f_xj //Axis parallel hyper-ellipsoid 2.2    f(x)=0  @x=(0,0,...)     -5.12<x[i]<5.12
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double ff=0;
        int n=x.length;

        for(int i=0;i<n;i++)
        {
            ff+=i*x[i]*x[i];
        }
        return ff;
    }
}

class f33 extends f_xj //Rotated hyper-ellipsoid function  -65.536<x[i]<65.536  f(x)=0   @x=(0,0,...)
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double ff=0;
        int n=x.length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                ff+=x[j]*x[j];
            }	
        }
        return ff;
    }
}

class f34 extends f_xj //Rastrigin�s function 2.5        f(x)=0  @x=(0,0,...)     -5.12<x[i]<5.12
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double ff=0;
        int n=x.length;
        for(int i=0;i<n;i++)
        {
            ff+=x[i]*x[i]-10* Math.cos(2.0* Math.PI*x[i]);
        }
        return ff+10*n;
    }
}

class f35 extends f_xj //sum of a different power function 2.8       f(x)=0   @x=(0,0,...)      -1<x[i]<1
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double ff=0;
        int n=x.length;
        double top=0;
        for(int i=0;i<n;i++)
        {
            top+= Math.pow(Math.abs(x[i]),(i+2));
        }
        return top;
    }
}

class f36 extends f_xj //Ackley�s function 2.9        f(x)=0;      @x=(0,0,0...)     -32.768<x[i]<32.768
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double a=20.0;
        double b=0.2;
        double c=2.* Math.PI;

        int n=x.length;

        double r= Math.PI/180;
        double top1=0.0;
        for(int i=0;i<n;i++)
        {
            top1+=x[i]*x[i];
        }
        
        top1= Math.sqrt(top1/n);
        double top2=0.0;
        for(int i=0;i<n;i++)
        {
            top2+= Math.cos(r*c*x[i]);
        }
        
        top2=top2/n;
        double top=-a* Math.exp(-b*top1)- Math.exp(top2)+a+ Math.exp(1);
        return top;
    }
}

class f37 extends f_xj //�Drop wave� function ++        i=1,2...    f(x)=-1.0  @x=(0,0)   -5.12<x[i]<5.12
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double r= Math.PI/180;
        double top1=0.0;
        for(int i=0;i<x.length;i++)
        {
            top1+=x[i]*x[i];
        }
        double top2=top1;
        top1= Math.sqrt(top1);
        top1=-(1.0+ Math.cos(12.0*top1))/(2.0+0.5*(top2));
        return top1;
    }
}

class f38 extends f_xj //Shubert�s function   -10<x[i]<10   18 global minima
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	

        double r= Math.PI/180;
        double top1=0;
        double top2=0;
        for(int i=1;i<=5;i++)     
        {
            top1+=i* Math.cos((i+1)*x[0]+1);
        }
        for(int i=1;i<=5;i++)     
        {
            top2+=i* Math.cos((i+1)*x[1]+1);
        }
        return -top1*top2;
    }
}


class f1050 extends f_xj  // dropwave  -5.12<x<5.12
{
    @Override
    double func(double x[])
    {
        int n=x.length;
        double sum=0.0;
        for(int i=0;i<n;i++)
        {
            sum+=x[i]*x[i];
        }
        
        double nom=1.0+ Math.cos(12.0* Math.sqrt(sum));
        double sum1=0.0;
        for(int i=0;i<n;i++)
        {
            sum1+=x[i]*x[i];
        }
        double denom=0.5*sum1+2.0;
        
        return -nom/denom;

    }
}


class f39 extends f_xj //Fletcher and Powell function---> min(alfa)<x[i]<max(alfa)  f(x)=0 @x=(alfa[1],alfa[2],,,alfa[i]) 
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double a[][]={{-79.0, 56.0, -62.0, -9.0, 92.0, 48.0, -22.0, -34.0, -39.0, -40.0, -95.0, -69.0, -20.0, -66.0, -98.0, -66.0,-67.0, 37.0,-83.0, -45.0},{91.0, -9.0, -18.0, -59.0, 99.0, -45.0, 88.0, -14.0, -29.0, 26.0, 71.0, -65.0, 19.0, 45.0, 88.0, 18.0, -11.0, -81.0, -10.0, 42.0},{-38.0, 8.0, -12.0, -73.0, 40.0, 26.0, -64.0, 29.0, -82.0, -32.0, -89.0, -3.0, 88.0, 98.0, 53.0, 58.0, 45.0, -39.0, 34.0, -23.0},{-78.0,-18.0 -49.0, 65.0, 66.0, -40.0, 88.0, -95.0, -57.0, 10.0, -98.0, -11.0, -16.0, -55.0, 33.0, 84.0, 21.0, -43.0, 45.0, 100.0,},{-1.0, -43.0, 93.0, -18.0, -76.0, -68.0, -42.0, 22.0, 46.0, -14.0, 69.0, 27.0, -12.0, -26.0, 57.0, -13.0, 0.0, 1.0, 56.0, 17.0},{34.0, -96.0, 26.0, -56.0, -36.0, -85.0, -62.0, 13.0, 93.0, 78.0, -43.0, 96.0, 77.0, 65.0, -34.0, -52.0, 82.0, 18.0, -59.0, -55.0},{52.0, -46.0, -69.0, 99.0, -47.0, -72.0, -11.0, 55.0, -55.0, 91.0, -30.0, 7.0, -35.0, 23.0, -20.0, 55.0, 61.0, -39.0, -58.0, 13.0},{81.0, 47.0, 35.0, 55.0, 67.0, -13.0, 33.0, 14.0, 83.0, -42.0, 8.0, -45.0, -44.0, 12.0, 100.0, -9.0,-33.0, -11.0, 21.0, 14.0},{5.0, -43.0, -45.0, 46.0, 56.0, -94.0, -62.0, 52.0, 66.0, 55.0, -86.0, -29.0, -52.0, -71.0, -91.0, -46.0, 27.0, -27.0, 6.0, 67.0},{-50.0, 66.0, -47.0, -75.0, 89.0, -16.0, 82.0, 6.0, -85.0, -62.0, -30.0, 31.0, -7.0, -75.0, -26.0, -24.0, 46.0, -95.0, -71.0, -57.0},{24.0, 98.0, -50.0, 68.0, -97.0, -64.0, -24.0, 81.0, -59.0, -7.0, 85.0, -92.0, 2.0, 61.0, 52.0, -59.0, -91.0, 74.0, -99.0, -95.0},{-30.0, -63.0, -32.0, -90.0, -35.0, 44.0, -64.0, 57.0, 27.0, 87.0, -70.0, -39.0, -18.0, -89.0, 99.0, 40.0, 14.0, -58.0 ,-5.0, -42.0},{56.0, 3.0, 88.0, 38.0, -14.0, -15.0, 84.0, -9.0, 65.0, -20.0, -75.0, -37.0, 74.0, 66.0, -44.0, 72.0, 74.0, 90.0, -83.0, -40.0},{84.0, 1.0, 73.0, 43.0, 84.0, -99.0, -35.0, 24.0, -78.0, -58.0, 47.0, -83.0, 94.0, -86.0, -65.0, 63.0, -22.0, 65.0, 50.0, -40.0},{-21.0, -8.0, -48.0, 68.0, -91.0, 17.0, -52.0, -99.0, -23.0, 43.0, -8.0, -5.0, -98.0, -17.0, -62.0, -79.0, 60.0, -18.0, 54.0, 74.0},{35.0, 93.0, -98.0, -88.0, -8.0, 64.0, 15.0, 69.0, -65.0, -86.0, 58.0, -44.0, -9.0, -94.0, 68.0, -27.0, -79.0, -67.0, -35.0, -56.0},{-91.0, 73.0, 51.0, 68.0, 96.0, 49.0, 10.0, -13.0, -6.0, -23.0, 50.0, -89.0, 19.0, -67.0, 36.0, -97.0, 0.0, 3.0, 1.0, 39.0},{53.0, 66.0, 23.0, 10.0, -33.0, 62.0, -73.0, 22.0, -65.0, 37.0, -83.0, -65.0, 59.0, -51.0, -56.0, 98.0,-57.0, -11.0, -48.0, 88.0},{83.0, 48.0, 67.0, 27.0, 91.0, -33.0, -90.0, -34.0, 39.0, -36.0, -68.0, 17.0, -7.0, 14.0, 11.0, -10.0, 96.0, 98.0, -32.0, 56.0},{52.0, -52.0, -5.0, 19.0, -25.0, 15.0, -1.0, -11.0, 8.0, -70.0, -4.0, -7.0, -4.0, -6.0, 48.0, 88.0, 13.0, -56.0, 85.0, -65.0}};
        double b[][]={{-65.0, -11.0, 76.0, 78.0, 30.0, 93.0, -86.0, -99.0, -37.0, 52.0, -20.0, -10.0, -97.0, -71.0, 16.0, 9.0, -99.0, -84.0, 90.0, -18.0, -94.0},
        {59.0, 67.0, 49.0, -45.0, 52.0, -33.0, -34.0, 29.0, -39.0, -80.0, 22.0, 7.0, 3.0, -19.0, -15.0, 7.0, -83.0, -4.0, 84.0 -60.0, -4.0},
        {21.0, -23.0, -80.0, 86.0, 86.0, -30.0, 39.0, -73.0, -91.0, 5.0, 83.0, -2.0, -45.0, -54.0, -81.0, -8.0, 14.0, 83.0, 73.0, 45.0, 32.0},
        {-91.0, -75.0, 20.0, -64.0, -15.0, 17.0, -89.0, 36.0, -49.0, -2.0, 56.0, -6.0, 76.0, 56.0, 2.0, -68.0, -59.0, -70.0, 48.0, 2.0, 24.0},
        {-79.0, 99.0, -31.0, -8.0, -67.0, -72.0, -43.0, -55.0, 76.0, -57.0, 1.0, -58.0, 3.0,-59.0, 30.0, 32.0, 57.0, 29.0, 66.0, 50.0, -80.0},
        {-89.0, -35.0, -55.0, 75.0, 15.0, -6.0, -53.0, -56.0, -96.0, 87.0, -90.0, -93.0, 52.0, -86.0, -38.0, -55.0, -53.0, 94.0, 98.0, 4.0,-79.0},
        {-76.0, 45.0, 74.0, 12.0, -12.0, -69.0, 2.0, 71.0, 75.0, -60.0, -50.0, 23.0, 0.0, 6.0, 44.0, -82.0, 37.0, 91.0, 84.0, -15.0, -63.0},
        {-50.0, -88.0, 93.0, 68.0, 10.0, -13.0, 84.0, -21.0, 65.0, 14.0, 4.0, 92.0, 11.0, 67.0, -18.0, -51.0, 4.0, 21.0, -38.0, 75.0, -59.0},
        {-23.0, -95.0, 99.0, 62.0, -37.0, 96.0, 27.0, 69.0, -64.0,-92.0, -12.0, 87.0, 93.0, -19.0, -99.0, -92.0, -34.0, -77.0, 17.0, -72.0, 29.0},
        {-5.0, -57.0, -30.0, -6.0, -96.0, 75.0, 25.0, -6.0, 96.0, 77.0, -35.0, -10.0, 82.0, 82.0, 97.0, -39.0, -65.0, -8.0, 34.0, 72.0, 65.0},
        {85.0, -9.0, -14.0, 27.0, -45.0, 70.0, 55.0, 26.0, -87.0, -98.0, -25.0, -12.0, 60.0, -45.0, -24.0, -42.0, -88.0, -46.0, -95.0, 53.0, 28.0},
        {80.0, -47.0, 38.0, -6.0, 43.0, -59.0, 91.0, -41.0, 90.0, -63.0, 11.0, -54.0, 33.0, -61.0, 74.0, 96.0, 21.0, -77.0, -58.0, -75.0, -9.0},
        {-66.0, -98.0, -4.0,96.0, -11.0, 88.0, -99.0, 5.0, 5.0, 58.0, -53.0, 52.0, -98.0, -97.0, 50.0, 49.0, 97.0, -62.0, 79.0, -10.0, -80.0},
        {80.0, -95.0, 82.0, 5.0, -68.0, -54.0, 64.0, -2.0, 5.0, 10.0, 85.0, -33.0, -54.0, -30.0, -65.0, 58.0, 40.0, -21.0, -84.0, -66.0, -11.0},
        {94.0, 85.0, -31.0, 37.0, -25.0, 60.0, 55.0, -13.0, 48.0, -23.0, -50.0, 84.0, -71.0, 54.0, 47.0, 18.0, -67.0, -30.0, 5.0, -46.0, 53.0},
        {-29.0, 54.0, -10.0, -68.0, -54.0, -24.0, -16.0, 21.0, 32.0, 33.0, -27.0, 48.0, 37.0, -61.0, 97.0, 45.0, -90.0, 87.0, -95.0, 85.0, 67.0},
        {76.0, -11.0, -48.0, 38.0, -7.0, 86.0, -55.0, 51.0, 26.0, 8.0, -96.0, 99.0, 69.0, -84.0, 41.0, 78.0, -53.0, 4.0, 29.0, 38.0, 16.0},
        {-8.0, 48.0, 95.0, 47.0, 39.0, -11.0, -72.0, -95.0, -17.0, 33.0, 65.0, 96.0, -52.0, -17.0, -22.0, -15.0, -91.0, -41.0, -16.0, 23.0, 14.0},
        {92.0, 87.0, 63.0, -63.0, -80.0, 96.0, -62.0, 71.0, -58.0, 17.0, -89.0, -35.0, -96.0, -79.0, 7.0, 46.0, -74.0, 88.0, 93.0, -44.0, 52.0},
        {-21.0, 35.0, 16.0, -17.0, 54.0, -22.0, -93.0, 27.0, 88.0, 0.0, -67.0, 94.0, -24.0, -30.0, -90.0, -5.0, -48.0, 45.0, -90.0, 32.0, -81.0},
        {-86.0, 31.0, -80.0, -79.0, -5.0, 11.0, -20.0, 9.0, 52.0, -38.0, 67.0, 64.0, -49.0, 23.0, -86.0, 39.0, -97.0, 76.0, 10.0, 81.0, 20.0}};


        double alfa[]={-2.7910,2.5623,-1.0429,0.5097,-2.8096,1.1883,2.0771,-2.9926,0.0715,0.4142,-2.5010,1.7731,1.6473,0.4934,2.1038,-1.9930,0.3813,-2.2144,-2.5572,2.9449};
        int n=x.length;
        double A[]=new double[x.length];
        double B[]=new double[x.length];
        double s1;
        double s2;
        for(int i=0;i<n;i++)
        {
            s1=0.0;   
            for(int j=0;j<n;j++)
            {
                s1+=a[i][j]* Math.sin(alfa[j])+b[i][j]* Math.cos(alfa[j]);}
            A[i]=s1;
        }    
        for(int i=0;i<n;i++)
        {
            s2=0.0;   
            for(int j=0;j<n;j++)
            {
                s2+=a[i][j]* Math.sin(x[j])+b[i][j]* Math.cos(x[j]);
            }
            B[i]=s2;
        }
        
        double s3=0.0;
        for(int i=0;i<n;i++)
        {
            s3+=(A[i]-B[i])*(A[i]-B[i]);
        }
        return s3;
    }
}


class f40 extends f_xj //Step function   f(x)=0   @x(-0.5,-0.5)   -5.0<x[i]<5.0
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;double s1=0.0;
        for(int i=0;i<n;i++)
        {
            s1+= Math.pow(Math.abs(x[i]+0.5),2.0);
        }
        return s1;
    }
}


class f41 extends f_xj // function   f(x)=0   @x(-1.0,-1.0)   -5.0<x[i]<5.0
{
    public double u(double x,double a,double k,double m)
    {
       double c=0.0;	

        if(x>a){c=k* Math.pow(x-a,m);return c;}
        if((x>=-a)||(x<=a)){c=0;return c;}
        if(x<-a){c=k* Math.pow(-x-a,m);return c;}

        return c;	
    }	

    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;
        double s1;
        double[] y=new double[n];
        for(int i=0;i<n;i++)
        {
            y[i]=(0.25*(x[i]+1.0))+1.0;
        }

        s1= Math.pow(Math.sin(3.1415*y[0]),2.0)*10.0;
        for(int i=0;i<n-1;i++)
        {
            s1+= Math.pow((y[i]-1.0),2.0)*(10.0* Math.pow(Math.sin(3.1415*y[i+1]),2.0)+1.0);
        }

        s1+= Math.pow((y[n-1]-1.0),2.0);
        s1=s1*3.1415/(double)n;
        double s2=0.0;
        for(int i=0;i<n;i++)
        {
            s2+=u(x[i],10.0,100.0,4.0);
        }
        return s1+s2;
    }
}

class f42 extends f_xj //Penalized2 function   f(x)=0   @x(1.0,1.0,....)   -5.0<x[i]<5.0
{
    public double u(double x,double a,double k,double m)
    {
    double c=0.0;	

    if(x>a){c=k* Math.pow(x-a,m);return c;}
    if((x>=-a)||(x<=a)){c=0;return c;}
    if(x<-a){c=k* Math.pow(-x-a,m);return c;}

    return c;	
}	

    @Override
    public double func(double x[]) 
{
    //��z�m� istenen fonksiyon	
    int n=x.length;double s1;

    s1= Math.pow(Math.sin(3.1415*x[0]),2.0);

    for(int i=0;i<n-1;i++)
    {
        s1+= Math.pow((x[i]-1.0),2.0)*(Math.pow(Math.sin(3.0*3.1415*x[i+1]),2.0)+1.0);}
        s1+= Math.pow((x[n-1]-1.0),2.0)*(Math.pow(Math.sin(2.0*3.1415*x[n-1]),2.0)+1.0);
        s1=s1*0.1;
        double s2=0.0;
        for(int i=0;i<n;i++)
        {
            s2+=u(x[i],5.0,100.0,4.0);
        }
        return s1+s2;
    }
}

class f43 extends f_xj //Shekel's Foxholes
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;double s1=0.0;

        double[][] a={
            {-32.0,-16.0,0.0,16.0,32.0,-32.0,-16.0,0.0,16.0,32.0,-32.0,-16.0,0.0,16.0,32.0,-32.0,-16.0,0.0,16.0,32.0,-32.0,-16.0,0.0,16.0,32.0},
            {-32.0,-32.0,-32.0,-32.0,-32.0,-16.0,-16.0,-16.0,-16.0,-16.0,0.0,0.0,0.0,0.0,0.0,16.0,16.0,16.0,16.0,16.0,32.0,32.0,32.0,32.0,32.0}
        };

        double sin;
        double sout=0.0;
        for(int j=0;j<25;j++)
        {   
            sin=0.0;
            for(int i=0;i<2;i++)
            {
                sin+= Math.pow((x[i]-a[i][j]),6.0);
            }	
            sout+=1.0/((double)j+sin);
        }
        return 1.0/(0.002+sout);
    }
}

class f44 extends f_xj //Shekel's Foxholes
{
    @Override
    public double func(double x[]) 
    {
        double a[][] = {
            {9.681, 0.667, 4.783, 9.095, 3.517, 9.325, 6.544, 0.211, 5.122, 2.020},
            {9.400, 2.041, 3.788, 7.931, 2.882, 2.672, 3.568, 1.284, 7.033, 7.374},
            {8.025, 9.152, 5.114, 7.621, 4.564, 4.711, 2.996, 6.126, 0.734, 4.982},
            {2.196, 0.415, 5.649, 6.979, 9.510, 9.166, 6.304, 6.054, 9.377, 1.426},
            {8.074, 8.777, 3.467, 1.863, 6.708, 6.349, 4.534, 0.276, 7.633, 1.567},
            {7.650, 5.658, 0.720, 2.764, 3.278, 5.283, 7.474, 6.274, 1.409, 8.208},
            {1.256, 3.605, 8.623, 6.905, 4.584, 8.133, 6.071, 6.888, 4.187, 5.448},
            {8.314, 2.261, 4.224, 1.781, 4.124, 0.932, 8.129, 8.658, 1.208, 5.762},
            {0.226, 8.858, 1.420, 0.945, 1.622, 4.698, 6.228, 9.096, 0.972, 7.637},
            {7.305, 2.228, 1.242, 5.928, 9.133, 1.826, 4.060, 5.204, 8.713, 8.247},
            {0.652, 7.027, 0.508, 4.876, 8.807, 4.632, 5.808, 6.937, 3.291, 7.016},
            {2.699, 3.516, 5.874, 4.119, 4.461, 7.496, 8.817, 0.690, 6.593, 9.789},
            {8.327, 3.897, 2.017, 9.570, 9.825, 1.150, 1.395, 3.885, 6.354, 0.109},
            {2.132, 7.006, 7.136, 2.641, 1.882, 5.943, 7.273, 7.691, 2.880, 0.564},
            {4.707, 5.579, 4.080, 0.581, 9.698, 8.542, 8.077, 8.515, 9.231, 4.670},
            {8.304, 7.559, 8.567, 0.322, 7.128, 8.392, 1.472, 8.524, 2.277, 7.826},
            {8.632, 4.409, 4.832, 5.768, 7.050, 6.715, 1.711, 4.323, 4.405, 4.591},
            {4.887, 9.112, 0.170, 8.967, 9.693, 9.867, 7.508, 7.770, 8.382, 6.740},
            {2.440, 6.686, 4.299, 1.007, 7.008, 1.427, 9.398, 8.480, 9.950, 1.675},
            {6.306, 8.583, 6.084, 1.138, 4.350, 3.134, 7.853, 6.061, 7.457, 2.258},
            {0.652, 2.343, 1.370, 0.821, 1.310, 1.063, 0.689, 8.819, 8.833, 9.070},
            {5.558, 1.272, 5.756, 9.857, 2.279, 2.764, 1.284, 1.677, 1.244, 1.234},
            {3.352, 7.549, 9.817, 9.437, 8.687, 4.167, 2.570, 6.540, 0.228, 0.027},
            {8.798, 0.880, 2.370, 0.168, 1.701, 3.680, 1.231, 2.390, 2.499, 0.064},
            {1.460, 8.057, 1.336, 7.217, 7.914, 3.615, 9.981, 9.198, 5.292, 1.224},
            {0.432, 8.645, 8.774, 0.249, 8.081, 7.461, 4.416, 0.652, 4.002, 4.644},
            {0.679, 2.800, 5.523, 3.049, 2.968, 7.225, 6.730, 4.199, 9.614, 9.229},
            {4.263, 1.074, 7.286, 5.599, 8.291, 5.200, 9.214, 8.272, 4.398, 4.506},
            {9.496, 4.830, 3.150, 8.270, 5.079, 1.231, 5.731, 9.494, 1.883, 9.732},
            {4.138, 2.562, 2.532, 9.661, 5.611, 5.500, 6.886, 2.341, 9.699, 6.500}};

        double c[] = {0.806,0.517,0.100,0.908,0.965,0.669,0.524,0.902,0.531,0.876,0.462,0.491,0.463,0.714,0.352,0.869,0.813,0.811,0.828,0.964,0.789,0.360,0.369,0.992,0.332,0.817,0.632,0.883,0.608,0.326};
        int dimension=x.length;
        double sum=0.0;
        double h;
        double sp;
        for (int j=0; j<30; j++)
        {
            sp=0.0;
            for (int i=0; i<dimension; i++)
            {
                h=(x[i])-a[j][i];
                sp+=h*h;
            }
            sum-=1.0/(sp+c[j]);
        }


        return sum;
    }
}

class f45 extends f_xj //Exp2 function   f(x)=0   @x(1.0,10.0)   0.0<x[i]<20.0
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;double s1=0.0;
        for(int i=0;i<10;i++)
        {
            s1+= Math.pow((Math.exp(-(double)i*x[0]/10.0)-(5.0* Math.exp(-(double)i*x[1]/10.0))- Math.exp(-(double)i/10.0)+5.0* Math.exp(-(double)i)),2.0);
        }
        return s1;
    }
}

class f46 extends f_xj //Sched V function   
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;double s1=0.0;
        for(int i=0;i<=n-2;i++)
        {
            s1+= Math.pow((x[i+1]*x[i+1]+x[i]*x[i]),0.25)* Math.sin(50.0* Math.pow((x[i+1]*x[i+1]+x[i]*x[i]),0.1))+1.0;
        }
        return s1;
    }
}

class f47 extends f_xj //Trecanni function   f(x)=0   @x(0.0,0.0,....)   -5.0<x[i]<5.0
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;
        double s1;
        s1= Math.pow(x[0],4.0)+4.0* Math.pow(x[0],3.0)+4.0* Math.pow(x[0],2.0)+x[1]*x[1];
        return s1;
    }
}

class f48 extends f_xj //Trefethen4 function   f(x)=-3.306868   @x(-0.0244031,0.2106124)   -6.5<x[0]<6.5    -4.5<x[1]<4.5                  
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;
        double s1;
        s1= Math.exp(Math.sin(50.0*x[0]))+ Math.sin(60.0* Math.exp(x[1]))+ Math.sin(70.0* Math.sin(x[0]))+ Math.sin(Math.sin(80.0*x[1]))- Math.sin(10.0*(x[0]+x[1]))+1.0/4.0*(x[0]*x[0]+x[1]*x[1]);
        
        return s1;
    }
}

class f49 extends f_xj //Paviani function                    
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;
        double s1=0.0;
        double fact=1.0;
        
        for(int i=0;i<=n-1;i++)
        {
            s1+= Math.pow(Math.log(x[i]-2.0),2.0)+ Math.pow(Math.log(10.0-x[i]),2.0);
        }
        
        for(int i=0;i<=n-1;i++)
        {
            fact*=x[i];
        }
        
        fact= Math.pow(fact,0.2);
        return s1-fact;
    }
}

class f50 extends f_xj //McCormick function      -1.5<=x[0]<=4 , -3.0<=x[1]<=4    f(x)=-1.9133  @x(-0.547,-1.54719)            
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	

        double s1= Math.sin(x[0]+x[1])+ Math.pow(x[0]-x[1],2.0)-1.5*x[0]+2.5*x[1]+1.0;
        return s1;
    }
}

class f51 extends f_xj //Leon function     f(x)=0.0  @x(1.0,1.0)           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	

        double s1=100.0*(x[1]-x[0]*x[0]*x[0])*(x[1]-x[0]*x[0]*x[0])+(x[0]-1.0)*(x[0]-1.0);
        return s1;
    }
}

class f52 extends f_xj //Hosaki function     f(x)=-2.3458  @x(4.0,2.0) Error!!!!           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	

        double s1=(1.0-8.0*x[0]+7.0*x[0]*x[0]-2.33*x[0]*x[0]*x[0]+0.25*x[0]*x[0]*x[0]*x[0])*x[1]*x[1]* Math.exp(-x[0]);
        return s1;
    }
}

class f53 extends f_xj //Hansen function     f(x)=-176.54  @x(-1.30,-1.42)           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double s1=0.0;
        double s2=0.0;
        
        for(int i=0;i<=4;i++)
        {
            s1+=((double)i+1.0)* Math.cos((double)i*x[0]+(double)i+1.0);
        }
        for(int j=0;j<=4;j++)
        {
            s2+=((double)j+1.0)* Math.cos(((double)j+2.0)*x[1]+(double)j+1.0);
        }
        return s1*s2;
    }
}

class f54 extends f_xj //Gear function     f(x)=0.0  @x(16,19,43,49)  12<=x[i]<=60           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	

        double s1= Math.pow((1.0/6.931-(x[0]*x[1])/(x[2]*x[3])),2.0);
        return s1;
    }
}

class f55 extends f_xj //Gear function     f(x)=0.0  @x(16,19,43,49)  12<=x[i]<=60           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double s1=0.0;
        int n=x.length;
        for(int i=0;i<=n-2;i++)
        {
            s1+=-(x[i+1]+47.0)* Math.sin(Math.sqrt(Math.abs(x[i+1]+0.5*x[i]+47.0)))+ Math.sin(Math.sqrt(Math.abs(x[i]-(x[i+1]+47.0))))*(-x[i]);
        }

        return s1;
    }
}

class f56 extends f_xj //Chichinadze function     f(x1, x2) = f(5.90133, 0.5) = -43.3159.  -30<=x[i]<=30           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double s1=x[0]*x[0]-12.0*x[0]+11.0+10.0* Math.cos(x[0]*3.1415/2.0)+8.0* Math.sin(5.0*3.1415*x[0])-((1.0/ Math.sqrt(5.0))* Math.exp(-(x[1]-0.5)*(x[1]-0.5)/2.0));

        return s1;
    }
}

class f57 extends f_xj //Zettl function     f(x1, x2) = f(-0.02990, 0.0) = -0.003791.  -30<=x[i]<=30           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        double s1= Math.pow((x[0]*x[0]+x[1]*x[1]-2.0*x[0]),2.0)+0.25*x[0];
        return s1;
    }
}

class f58 extends f_xj //Plateau function     f(x1, x2) = f(0.0, 0.0,0.0,0.0,0.0) = 30.0  -5.12<=x[i]<=5.12           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;double s1=0.0;
        for(int i=0;i<n;i++)
        {
            s1+= Math.abs(x[i]);
        }
        
        return s1+30.0;
    }
}


class f59 extends f_xj //Xin She Yang function1     f(x) = f(0.0, 0.0,0.0,0.0,0.0,....) = 0.0  -2pi<=x[i]<=2pi           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;double s1=0.0;double s2=0.0;
        for(int i=0;i<n;i++)
        {
            s1+= Math.abs(x[i]);
        }
        for(int i=0;i<n;i++)
        {
            s2+=-Math.sin(x[i]*x[i]);
        }
        return s1* Math.exp(-s2);
    }
}

class f60 extends f_xj //     f(x) = f(1.0,0.5,0.333,...) = 0.0  -5<=x[i]<=5           
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;double s1=0.0;
        for(int i=0;i<n;i++)
        {
            s1+= Math.random()* Math.abs(x[i]-(1.0/((double)i+1.0)));
        }
        return s1;
    }
}

class f61 extends f_xj //              
{
    @Override
    public double func(double x[]) 
    {
        //��z�m� istenen fonksiyon	
        int n=x.length;double s1=0.0;double s2=0.0;double s3=0.0;
        for(int i=0;i<n;i++)
        {
            s1+= Math.sin(x[i])* Math.sin(x[i]);
        }
        
        for(int i=0;i<n;i++)
        {
            s2+=x[i]*x[i];
        }
        
        double c1=(s1- Math.exp(-s2));
        for(int i=0;i<n;i++)
        {
            s3+= Math.pow(Math.sin(Math.sqrt(Math.abs(x[i]))),2.0);
        }
        return c1* Math.exp(-s3);
    }
}

class f62 extends f_xj // Yang funtion     x(pi,pi)             
{
@Override
public double func(double x[]) 
{
    //��z�m� istenen fonksiyon	
    double alfa=1.0;
    double beta=1.0;
    int K=10;
    double s1=0.0;
    for(int j=0;j<K;j++)
    {
        for(int i=0;i<K;i++)
        {
            s1+= Math.random()* Math.exp(-alfa*((x[0]-(double)i)*(x[0]-(double)i)+(x[1]-(double)j)*(x[1]-(double)j)));
        }	

    }
    
    double s2=-5.0* Math.exp(-beta*((x[0]-3.1415)*(x[0]-3.1415)+(x[1]-3.1415)*(x[1]-3.1415)));

    return s2-s1;

    }
}


class f63 extends f_xj // Generalized Schwefel�s Problem 2.26           
{
    @Override
    public double func(double x[]) 
    {
        int n=x.length;
        double top=0.0;
        for(int i=0;i<n;i++)
        {
            top+=(x[i]* Math.sin(Math.sqrt(Math.abs(x[i]))));
        }
            
        return -top;
    }
}

class f99 extends f_xj
{
   @Override
   double func(double x[])
   {
     return -0.0001* Math.pow((Math.abs(Math.exp(Math.abs(100.0-(Math.sqrt(x[0]*x[0]+x[1]*x[1])/ Math.PI)))* Math.sin(x[0])* Math.sin(x[1]))+1.0),0.1);
   }	
	
}

class f98 extends f_xj // Bukin f(-10,1)=0   -15<x<-5  -3<y<3
{
    @Override
    double func(double x[])
    {
        return 100.0* Math.sqrt(Math.abs(x[1]-0.01*x[0]*x[0]))+0.01* Math.abs(x[0]+10.0);
    }
}

class f97 extends f_xj // Holder table   -10<x[i]<10
{
    @Override
    double func(double x[])
    {
        return -Math.abs( Math.sin(x[0])* Math.cos(x[1])* Math.exp(Math.abs(1.0-(Math.sqrt(x[0]*x[0]+x[1]*x[1])/ Math.PI))));
    }
}

class f96 extends f_xj // Pen holder
{
    @Override
    double func(double x[])
    {
        return  1./-Math.exp(Math.abs(Math.exp(Math.abs((-Math.sqrt(x[0]*x[0]+x[1]*x[1])/ Math.PI)+1.0))* Math.cos(x[0])* Math.cos(x[1])));
    }
}

class f95 extends f_xj // Leon   -1.2<x[i]<1.2 f(x)=0  x(1,1)
{
    @Override
    double func(double x[])
    {
        return (1.0-x[0])*(1.0-x[0])+100.0*(x[1]-x[0]*x[0])*(x[1]-x[0]*x[0]);
    }
}

class f94 extends f_xj // FreudensteinRoth  -10.0<x[i]<10.0 f(x)=0  x(1,1)
{
    @Override
    double func(double x[])
    {
        return Math.pow((x[0]-13.0+((5.0-x[1])*x[1]-2.0)+x[1]),2.0)+ Math.pow((x[0]-29.0+((x[1]+1.0)*x[1]-14.0)),2.0);
    }
}

class f93 extends f_xj // Treccani  -1.2<x[i]<1.2 f(x)=0  x(1,1)
{
    @Override
    double func(double x[])
    {
        return  x[0]*x[0]*x[0]*x[0]+4.0*x[0]*x[0]*x[0]+4.0*x[0]*x[0]+x[1]*x[1];
    }
}

class f92 extends f_xj // Eggholder  -1.2<x[i]<1.2 f(x)=0  x(1,1)
{
    @Override
    double func(double x[])
    {
        return  -x[0]* Math.sin(Math.sqrt(Math.abs(x[0]-x[1]-47.0)))-(x[1]+47.0)* Math.sin(Math.sqrt(Math.abs(0.5*x[0]+x[1]+47.0)));
    }
}

class f100 extends f_xj // Eggholder  -1.2<x[i]<1.2 f(x)=0  x(1,1)
{
    @Override
    double func(double x[])
    {
        return  -4.0* Math.abs(Math.exp(Math.abs(Math.cos(0.005*x[0]*x[0]+0.005*x[1]*x[1])))* Math.sin(x[0])* Math.cos(x[1]));
    }
}

class f101 extends f_xj // Alpine  -10.0<x[i]<10.0 f(x)=0  x(0,0,...,0)
{
    @Override
    double func(double x[])
    {
        int n=x.length;
        double t=0.0;
        for(int i=0;i<n;i++)
        {
            t+= Math.abs(x[i]* Math.sin(x[i])+0.1*x[i]);
        }	
        return  t;
    }
}

class f106 extends f_xj  // Inverted Cosine Wave function,
{
    @Override
    double func(double x[])
    {
        int n=x.length;
        double t=0.0;
        for(int i=0;i<n-1;i++)
        {
            t+= Math.exp(-(x[i]*x[i]+x[i+1]*x[i+1]+0.5*x[i]*x[i+1])/8.0)* Math.cos(4.0* Math.sqrt(x[i]*x[i]+x[i+1]*x[i+1]+0.5*x[i]*x[i+1]));
        }
        
        return -t;
    }
}

class f102 extends f_xj  // Giunta   -1.0<x<1.0
{
    @Override
    double func(double x[])
    {
        int n=x.length;
        double t=0.0;
        for(int i=0;i<n;i++)
        {
            t+=(Math.sin(1.0-(x[i]*16.0/15.0))* Math.sin(1.0-(x[i]*16.0/15.0)))-(0.02* Math.sin(4.0-(x[i]*64.0/15.0)))-(Math.sin(1.0-(x[i]*16.0/15.0)));
        }	
            
        return  t+0.6;
    }
}

class f103 extends f_xj  // �nfinity  -1.0<x<1.0
{
    @Override
    double func(double x[])
    {
        int n=x.length;
        double t=0.0;
        for(int i=0;i<n;i++)
        {
            t+= Math.pow(x[i],6.0)*(Math.sin(1.0/x[i])+2.0);
        }	
        
        return  t;
    }
}

class f104 extends f_xj  // Quintic  -10.0<x<10.0
{
    @Override
    double func(double x[])
    {
        int n=x.length;
        double t=0.0;
        for(int i=0;i<n;i++)
        {
            t+= Math.abs(Math.pow(x[i],5.0)-3.0* Math.pow(x[i],4.0)+4.0* Math.pow(x[i],3.0)+2.0*x[i]*x[i]-10.0*x[i]-4.0);
        }	

        return  t;
    }
}

class f107 extends f_xj  // Pathologic function
{
    @Override
    double func(double x[])
    {
        int n=x.length;
        double t=0.0;
        for(int i=0;i<n-1;i++)
        {
            t+=(0.5+  (Math.sin(Math.sqrt(100.0*x[i]*x[i]+x[i+1]*x[i+1]))* Math.sin(Math.sqrt(100.0*x[i]*x[i]+x[i+1]*x[i+1]))-0.5)/(1.0+0.001*(x[i]*x[i]-2.0*x[i]*x[i+1]+x[i+1]*x[i+1])*(x[i]*x[i]-2.0*x[i]*x[i+1]+x[i+1]*x[i+1])))*(0.5+  (Math.sin(Math.sqrt(100.0*x[i]*x[i]+x[i+1]*x[i+1]))* Math.sin(Math.sqrt(100.0*x[i]*x[i]+x[i+1]*x[i+1]))-0.5)/(1.0+0.001*(x[i]*x[i]-2.0*x[i]*x[i+1]+x[i+1]*x[i+1])*(x[i]*x[i]-2.0*x[i]*x[i+1]+x[i+1]*x[i+1])));
        }
        
        return t;
    }
}

class f108 extends f_xj  // Salomon problem,
{
    @Override
    double func(double x[])
    {
        int n=x.length;
        double t1=0.0;
        for(int i=0;i<n;i++)
        {t1+=x[i]*x[i];}
        double t=1.0- Math.cos(2.0* Math.PI* Math.sqrt(t1))+0.1* Math.sqrt(t1);

        return t;
    }
}

public class flower_pollination_algorithm_test
{

    public static void main(String args[])
    {
	  
	  
        //double[] Lower={-2.3,-2.3,-3.2,-3.2,-3.2};//f70  * = (-1.717143, 1.595709, 1.827247, -0.7636413, -0.763645) , f (x*) = 0.0539498.
        //double[] Upper={2.3,2.3,3.2,3.2,3.2};//
        //double[] Lower={0.0,0.0};//f71 Mine blast algorithm const 1 1.393
        //double[] Upper={1.0,1.0};//
        //double[] Lower={0.0,0.0};//f72 Mine blast algorithm const 3 13.589
        //double[] Upper={6.0,6.0};//
        // double[] Lower={13.0,0.0};//f68 Mine blast algorithm const 5 -6961.81
        // double[] Upper={100.0,100.0};//
        // double[] Lower={-1.0,-1.0};//f69 Mine blast algorithm const 2 0.75
        // double[] Upper={1.0,1.0};
        //double[] Lower={0.0,0.0};//f73  // Three bar truss design problem
        //double[] Upper={1.0,1.0};// 263.895843
        //double[] Lower={0.0,0.25,2.00};//f75 tension compression 0.0127
        //double[] Upper={2.0,1.30,15.00};//
        //double[] Lower={0.0,0.0};//const_opt makalesinden f63
        //double[] Upper={3.0,5.0};// 18.00
        //double[] Lower={78.0,33.0,27.0,44.0,36.0};// f65  -30.665
        //double[] Upper={79.0,34.0,30.0,45.0,37.0};//
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};// f64
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0};  //679.21
        //double[] Lower={0.1,1.0,1.0,0.1}; //f76  1.7438 
        //double[] Upper={2.0,10.0,10.0,2.0};
        //double[] Lower={2.6,0.7,17.0,7.3,7.3,2.9,5.0}; //speed reducer 2994.42
        //double[] Upper={3.6,0.8,28.0,8.3,8.3,3.9,5.5};//f77

        //double[] Lower={-2.0,-2.0}; //f1 goldstein
        //double[] Upper={2.0,2.0}; //f1 goldstein

        //double[] Lower={-4.5,-4.5}; //f2 beale
        //double[] Upper={4.5,4.5}; //f2 beale

        //double[] Lower={-5.0,-5.0}; //f3 Bohachecsky
        //double[] Upper={5.0,5.0}; //f3 Bohachecsky

        //double[] Lower={-5.0,-5.0}; //f4 Bohachecsky 2
        //double[] Upper={5.0,5.0}; //f4 Bohachecsky 2

        //double[] Lower={-5.0,-5.0}; //f5 Bohachecsky 3
        //double[] Upper={5.0,5.0}; //f5 Bohachecsky 3

        //double[] Lower={-10.0,-10.0}; //f6 Booth
        //double[] Upper={10.0,10.0}; //f6 Booth

        //double[] Lower={-10.0,-10.0,-10.0,-10.0}; //f8 Colville
        //double[] Upper={10.0,10.0,10.0,10.0}; //f8 Colville

        //double[] Lower={-10.0,-10.0}; //f9 Easom
        //double[] Upper={10.0,10.0}; //f9 Easom

        //double[] Lower={-100.0,-100.0}; //f11 Griewank 2'li
        //double[] Upper={100.0,100.0}; //f11 Griewank 2'li

        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0}; //f11 Griewank 5'li
        //double[] Upper={10.0,10.0,10.0,10.0,10.0}; //f11 Griewank 5'li

        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0}; //f11 Griewank 10'li
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0}; //f11 Griewank 10'li

        //double[] Lower={-10.0,-10.0}; //f13 Matyas
        //double[] Upper={10.0,10.0}; //f13 Matyas

        //double[] Lower={0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,}; //f14 Michalewicz
        //double[] Upper={Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,Math.PI,}; //f14 Michalewicz

        //double[] Lower={0.0,0.0,0.0,0.0}; //f17 Shekel
        //double[] Upper={10.0,10.0,10.0,10.0}; //f17 Shekel

        //double[] Lower={-4.0,-4.0}; //f18 Trid 2'li
        //double[] Upper={4.0,4.0}; //f18 Trid 2'li

        //double[] Lower={-36.0,-36.0,-36.0,-36.0,-36.0,-36.0}; //f18 Trid 6'li
        //double[] Upper={36.0,36.0,36.0,36.0,36.0,36.0}; //f18 Trid 6'li
        
        //double[] Lower={-100.0,-100.0,-100.0,-100.0,-100.0,-100.0,-100.0,-100.0,-100.0,-100.0}; //f18 Trid 10'li
        //double[] Upper={100.0,100.0,100.0,100.0,100.0,100.0,100.0,100.0,100.0,100.0}; //f18 Trid 10'li

        // double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};//  f36 ackley
        //double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};

        //double[] Lower={-5.0,-5.0}; //f19 Zakharov 2'li
        //double[] Upper={10.0,10.0}; //f19 Zakharov 2'li

        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0}; //f19 Zakharov 5'li
        //double[] Upper={10.0,10.0,10.0,10.0,10.0}; //f19 Zakharov 5'li

        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0}; //f19 Zakharov 10'li
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0}; //f19 Zakharov 10'li

        //double[] Lower={-10.0,-10.0}; //f20 Levy 2'li
        //double[] Upper={10.0,10.0}; //f20 Levy 2'li

        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0}; //f20 Levy 5'li
        //double[] Upper={10.0,10.0,10.0,10.0,10.0}; //f20 Levy 5'li

        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0}; //f20 Levy 10'li
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0}; //f20 Levy 10'li

        //double[] Lower={-10.0,-10.0}; //f21 DixonPrice 2'li
        //double[] Upper={10.0,10.0}; //f21 DixonPrice 2'li

        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0}; //f21 DixonPrice 5'li
        //double[] Upper={10.0,10.0,10.0,10.0,10.0}; //f21 DixonPrice 5'li

        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0}; //f21 DixonPrice 10'li
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0}; //f21 DixonPrice 10'li

        //double[] Lower={0.0,0.0}; //f44 Modified Shekel Foxholes 2'li
        //double[] Upper={10.0,10.0}; //f44 Shekel's Foxholes 2'li

        //double[] Lower={0.0,0.0,0.0,0.0,0.0}; //f44 Modified Shekel Foxholes 5'li
        //double[] Upper={10.0,10.0,10.0,10.0,10.0}; //f44 Modified Shekel Foxholes 5'li

        //double[] Lower={-5.0,-5.0}; //f41 Penalized 
        //double[] Upper={5.0,5.0}; //f41 Penalized

        //double[] Lower={-5.0,-5.0}; //f42 Penalized2 2'li 
        //double[] Upper={5.0,5.0}; //f42 Penalized2 2'li

        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0}; //f42 Penalized2 5'li
        //double[] Upper={5.0,5.0,5.0,5.0,5.0}; //f42 Penalized2 5'li

        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0}; //f42 Penalized2 10'li
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0}; //f42 Penalized2 10'li  

        //double[] Lower={-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048};//  f30 Rosenbrock
        //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048};

        // double[] Lower={0.1,   0.1,   2e-3,   0.1e-3,   100.0,   1e-3, 1.0}; 
        // double[] Upper={1.0,   1.0,  10e-3,   0.2e-3,  1000.0,   10e-3, 200.0}; 

        //double[] Lower={0.01,0.15,0.2};//  f37 Dropwave
        //double[] Upper={0.032,1.2,0.45};

        //double[] Lower={0.0,0.0,0.0,0.0}; //f17 Shekel
        //double[] Upper={10.0,10.0,10.0,10.0}; //f17 Shekel

        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0};//  f20 Levy
        //double[] Upper={10.0,10.0,10.0,10.0,10.0};

        // double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0};//  f19 Zakharov
        // double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0};

        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f21 Dixon-price
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0};


        //double[] Lower={-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048};//  f30 Rosenbrock
        //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048};

        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,};//  f34 Rastrigin
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,};

        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0}; //f42 Penalized2 10'li
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0}; //f42 Penalized2 10'li

        //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,};//  f36 ackley
        // double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,};

        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.120,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,};//  f34 Rastrigin
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12};

        //  double[] Lower={0.3,0.3,0.3,0.3,0.3,0.3};   //f2001
        //  double[] Upper={1.0,1.0,1.0,1.0,1.0,1.0};    

        //double[] Lower={0.0,0.0,0.0,0.0};   //f2003
        //double[] Upper={1.0,1.0,1.0,1.0};

        //double[] Lower={0.0,0.0,0.0};   //f2002
        //double[] Upper={1.0,1.0,1.0}; 

        //double[] Lower={5.0,  25.0,   0.0};//  parf1 
        //double[] Upper={15.0, 30.0,   5.0};

        //double[] Lower={30.0,  0.0,    20.0,   };//  parf2 
        //double[] Upper={40.0,  5.0,   30.0,   };

        //double[] Lower={0.0,  0.0,    0.0   };//  parf3 
        //double[] Upper={5.0,  5.0,   10.0   };

        //  double[] Lower={0.0,  0.0,     };//  parf4 
        // double[] Upper={1.5,  0.5,      };

        //double[] Lower={0.0,  0.0, 0.0    };//  parf5 
        //double[] Upper={1.5,  2.0, 2.0     };

        //double[] Lower={0.8,  0.3, 0.3    };//  parf6 
        //double[] Upper={1.0,  0.7, 0.7     };

        //double[] Lower={0.0,  0.0, 0.0    };//  parf7 
        //double[] Upper={1.5,  2.0, 2.0     };

        //double[] Lower={-1.19969,  0.001, 3.60e-5,-2.60e-4  ,10.0,0.0001,0.0136,20e-4 ,500e-3 , 20.0  ,  1.0e-3 };//  est2
        //double[] Upper={-0.8532,  0.005, 9.80e-5,-9.54e-5  ,24.0,0.0008,0.5,   200e-4 ,1500e-3 , 100.0 , 30e-3 };

        // double[] Lower={0.3,0.3,0.3,0.3,0.3,0.3};   //f2001
        // double[] Upper={1.0,1.0,1.0,1.0,1.0,1.0};    

        //double[] Lower={0.3,0.3,0.3};   //f2002
        //double[] Upper={1.0,1.0,1.0}; 

        //double[] Lower={0.3,0.3,0.3,0.3};   //f2003
        //double[] Upper={1.0,1.0,1.0,1.0}; 

        //f20 levy                
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f20 levy
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};
        //f40 step 
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
        //f41 penal1
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f41 Penalized
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
        //f19 zakharov
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0};//  f19 Zakharov
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0};                  
        //f36 ackley
        //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};//  f36 ackley
        //double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};
        
        //f8 collvile
        //double[] Lower={-10.0,-10.0,-10.0,-10.0}; //f8 colville
        //double[] Upper={10.0,10.0,10.0,10.0};   
        
        // f11 griewank
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0};
          
        // f34 Rastrigin
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f34 Rastrigin
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12};
        
        // f30 Rosenbrock
        //double[] Lower={-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048};//  f30 Rosenbrock
        //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048};
        
        // f31 Sphere
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f31 sphere
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12 };

        //////////// 50D
        //f20 levy                
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f20 levy
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};
        
        //f40 step 
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,};
        
        //f41 penal1
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f41 Penalized
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0,};
        
        //f19 zakharov//
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f19 Zakharov
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};                  
        
        //f36 ackley //
        //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};//  f36 ackley
        //double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};
        
        //f8 collvile
        //double[] Lower={-10.0,-10.0,-10.0,-10.0}; //f8 colville
        //double[] Upper={10.0,10.0,10.0,10.0};   
        
        // f11 griewank
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0};
          
        // f34 Rastrigin //
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f34 Rastrigin
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12};
        
        // f30 Rosenbrock //
        //double[] Lower={-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048};//  f30 Rosenbrock
        //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048, 2.048, 2.048, 2.0480, 2.048, 2.048, 2.048, 2.048, 2.048, 2.048, 2.048};
        
        // f31 Sphere//
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f31 sphere
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12 };
          
        // f37 Dropwave//
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f31 sphere
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12 };
        
        // f80 Schwefel
        //double[] Lower={-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500};//  f31 sphere
        //double[] Upper={500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500, 500, 500, 500, 500, 5000, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500 };
        
        // f25 quartic//
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0};
        
        //107 Pathologic
        // double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f107 pathologic
        // double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0, 5.0, 5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,};
        
        // f101 alpine//
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0 };
        //
        
        //f108 Salomon
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0};//  f40 step
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
        
        // f27 Schfewel 2.22
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};

        //////////// 100D
        //f20 levy                
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f20 levy
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};
        //f40 step 
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,};
        //f41 penal1
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f41 Penalized
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0,};
        //f19 zakharov//
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f19 Zakharov
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};                  
        //f36 ackley //
        //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};//  f36 ackley
        //double[] Upper={ 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768, 32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};
        //f8 collvile
        //double[] Lower={-10.0,-10.0,-10.0,-10.0}; //f8 colville
        //double[] Upper={10.0,10.0,10.0,10.0};   
        // f11 griewank
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0};
        // f34 Rastrigin //
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f34 Rastrigin
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12};
        // f30 Rosenbrock //
        //double[] Lower={-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048};//  f30 Rosenbrock
        //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048, 2.048, 2.048, 2.0480, 2.048, 2.048, 2.048, 2.048, 2.048, 2.048, 2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048, 2.048, 2.048, 2.0480, 2.048, 2.048, 2.048, 2.048, 2.048, 2.048, 2.048};
        // f31 Sphere//
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f31 sphere
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12 };
        // f37 Dropwave//
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f31 sphere
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12, 5.12 };
        // f80 Schwefel
        //double[] Lower={-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500,-500};//  f31 sphere
        //double[] Upper={500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500,500, 500, 500, 500, 500, 5000, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500, 500 };
        // f25 quartic//
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
        //doubl
        //f107 pathologic
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f107 pathologic
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0, 5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,};
        // f101 alpine//
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0, 10.0 };

        //Unimodal
        // f31 Sphere
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f31 sphere
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12 };
        // f27 Schfewel 2.22
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};
        // f30 Rosenbrock
        //double[] Lower={-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.0480,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048};//  f30 Rosenbrock
        //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048};
        //f40 step 
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
        // f25 quartic//
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0 };
        // f63 Generalized Schwefel�s Problem 2.26
        //double[] Lower={-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0,-500.0};//  f11 griewank
        //double[] Upper={500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0,500.0 };
        // f34 Rastrigin
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12};//  f34 Rastrigin
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12};
        //36 ackley
        //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};//  f36 ackley
        //double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};
        // f11 griewank
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f11 griewank
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0};
        //f41 penal1
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f41 Penalized
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
        //f42 penal2
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f41 Penalized
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
        // f101 alpine//
        // double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0};//  f11 griewank
        // double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0 };
        //f106 inverted cosine
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
        //f107 pathologic
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
        //f108 Salomon
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,};//  f40 step
        //double[] Upper={5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0,5.0};
        //f19 zakharov
        // double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0};//  f19 Zakharov
        // double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0};                  
        //f20 levy                
        //double[] Lower={-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,-10.0,};//  f20 levy
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,};

        //Ackley�s function 2.9        f(x)=0;      @x=(0,0,0...)     -32.768<x[i]<32.768  // f36
        //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};
        //double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};

        //Griewank         f(x)=0;      @x=(0,0,0...)     -32.768<x[i]<32.768  // f11
        //double[] Lower={-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768,-32.768};
        //double[] Upper={32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768,32.768};

        //Rastrigin         f(x)=0;      @x=(0,0,0...)     -5.12<x[i]<5.12  // f34
        //double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12   };
        //double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12    };

        //Rosenbrock         f(x)=0;      @x=(0,0,0...)     -5.12<x[i]<5.12  // f30
        //double[] Lower={-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048,-2.048   };
        //double[] Upper={2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048,2.048    };

        // Zakharov   f(x)=0;      @x=(0,0,0...)     -5.0<x[i]<10.0  // f19
        //double[] Lower={-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0,-5.0   };
        //double[] Upper={10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0,10.0    };

        //Dropwave        f(x)=0;      @x=(0,0,0...)     -5.12<x[i]<5.12  // f37
        double[] Lower={-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12,-5.12   };
        double[] Upper={5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12,5.12    };

        int N=20; 
        double p=0.8;
        double delta=1.5;
        double eta=0.1;
        int maxiter=5000;//Maximum number of Cycles		                  
        f11 ff=new f11(); 
        flower_pollination_algorithm fpa = new flower_pollination_algorithm(N,Lower, Upper, p,  delta,  eta , maxiter,ff); 

        fpa.toStringnew();
	  
    }
}