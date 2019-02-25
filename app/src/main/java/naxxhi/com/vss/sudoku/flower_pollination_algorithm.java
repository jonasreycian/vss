package naxxhi.com.vss.sudoku;


public class flower_pollination_algorithm
{
    int D;
    int N;
    double Lower[];
    double Upper[];
    int maxiter;
    double p;
    double GBEST[];
    double fitness[];
    double XX[][];
    double YY[][];
    double delta;
    double sigma2;
    double L;
    double U;
    double V;
    double s;
    double eta;
    double bestsol;
    int randomkk;
    int randomjj;
    f_xj ff;

 
    public flower_pollination_algorithm(int iN, double[] iLower, double[] iUpper, double ip, double idelta, double ieta , int imaxiter, f_xj iff )
    {
        ff=iff;    
        maxiter=imaxiter;
        N=iN;    
        Lower=iLower;
        Upper=iUpper;
        D=Lower.length;    
        p=ip;
        delta=idelta;    
        eta=ieta;
        GBEST=new double[D];   
        fitness=new double[N]; 
        XX=new double[N][D];    
        YY=new double[N][D];   
    }

    void init()
    {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<D;j++)
            {
                XX[i][j]=Lower[j]+(Upper[j]-Lower[j])* Math.random();
            }
        }


        for(int i=0;i<N;i++)
        {
            fitness[i]=ff.func(XX[i]);
        }

        double[] vals=getminval_index(fitness); 
        int mindex=(int)vals[1];
        for(int j=0;j<D;j++)
        {
            GBEST[j]=XX[mindex][j];
        }
    }

    double[] getminval_index(double[] a)
    {
        double m=0.0;	 
        double b[]=new double[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        } 
        
        double minval=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<minval){
                minval=a[i];
            }
        }
        
        for(int i=0;i<a.length;i++)
        {
            if(b[i]==minval){
                m=i;
                break;
            }
        };
        
        double[] dep=new double[2];
        dep[0]=minval;
        dep[1]=m;
        return dep;	 
    }

    public double  gaussrandom(double xort,double r)
    { 
        int iset=0;
        double gset=0;
	double fac,rsq,v1,v2;
	double aret=0;
	if(iset==0)
	{
            do{
                v1=2.0* Math.random()-1.0;
		v2=2.0* Math.random()-1.0;
		rsq=v1*v1+v2*v2;  
            }while(rsq>=1.0 || rsq==0.0);	   
	   
            fac= Math.sqrt(-2.0* Math.log(rsq)/rsq);
            gset=v1*fac;
            iset=1;
            aret=v2*fac;
        }
        else
        {
            iset=0;
            aret=gset;
        }
        
        return aret/8.0*r+xort;	
    }
 
    double logGamma(double x) 
    {
        double tmp =(x-0.5)* Math.log(x+4.5)-(x+4.5);
	double ser = 1.0 + 76.18009173    / (x + 0)   - 86.50532033    / (x + 1)+ 24.01409822    / (x + 2)   -  1.231739516   / (x + 3)+  0.00120858003 / (x + 4)   -  0.00000536382 / (x + 5);
	return tmp + Math.log(ser * Math.sqrt(2 * Math.PI));
    }
	      
    double gamma(double x) 
    { 
        return Math.exp(logGamma(x));
    }

    double[][] solution()
    {
        init(); 
	int iter=1;
	    
	while(iter<maxiter)
	{
            for(int i=0;i<N;i++)
            {
                if (Math.random() < p )
		{
                    sigma2= Math.pow(((gamma(1.0+delta)/(delta*gamma((1.0+delta)/2.0)))*((Math.sin(Math.PI*delta/2.0))/(Math.pow(2.0,((delta-1)/2.0))))),1.0/delta) ;
                    V=gaussrandom(0.0,1.0);
                    U=gaussrandom(0.0,sigma2);
                    s=U/ Math.pow(Math.abs(V),1.0/delta);
                    L=((delta*gamma(delta)* Math.sin(Math.PI*delta/2.0))/ Math.PI)*(1.0/(Math.pow(s,1.0+delta)));
                    
                    for(int j=0;j<D;j++)
                    { 
                        YY[i][j]=YY[i][j]+eta*L*(GBEST[j]-YY[i][j]);
                    }
		
                }
		else
		{
                    randomkk=(int) Math.floor(N* Math.random());
                    randomjj=(int) Math.floor(N* Math.random());
					
                    while(i==randomkk)
                    {   
                        randomkk=(int) Math.floor(N* Math.random());
                    }
                    
                    while(randomjj==randomkk)
                    {
                        randomjj=(int) Math.floor(N* Math.random());
                    }
				    
                    while(i==randomjj)
                    {
                        randomjj=(int) Math.floor(N* Math.random());
                    }
				    
                    for(int j=0;j<D;j++)
                    {
                        YY[i][j]=YY[i][j]+(Math.random()*(YY[randomjj][j] - YY[randomkk][j]));
                    }
					
		}
			      
            }
		      
            for(int i=0;i<N;i++)
            {
                if(ff.func(YY[i])<ff.func(XX[i]))
                {
                    for(int j=0;j<D;j++)
                    {
                        XX[i][j]=YY[i][j];
                    }
                    
		}	 
            }
		 
            for(int i=0;i<N;i++)
            {
                fitness[i]=ff.func(XX[i]);
            }
	
            double[] valsss=getminval_index(fitness); 
            int mindexxx=(int)valsss[1];
            for(int j=0;j<D;j++)
            {
                GBEST[j]=XX[mindexxx][j];
            }
		
		
            iter++; 
   
		    
        } 	 
		 
	double[] valss=getminval_index(fitness); 
	int mindexx=(int)valss[1];
	for(int j=0;j<D;j++)
        {
            GBEST[j]=XX[mindexx][j];
        }
        
        bestsol=ff.func(GBEST);
	double out[][]=new double[2][D];   
	out[0][0]=bestsol;
	for(int j=0;j<D;j++)
	{
            out[1][j]=GBEST[j];
        } 
	   
	return out;
    }

    void  toStringnew()
    {
        double[][] out=solution();
        System.out.println("Optimized value = "+out[0][0]);
        for(int i=0;i<out[1].length;i++)
        {
            System.out.println("x["+i+"] = "+out[1][i]);
        
        }	
    }
}