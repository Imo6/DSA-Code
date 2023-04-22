

public class StringBuilder_StringBuffer implements  Runnable
{
	
	public static StringBuilder sb = new StringBuilder();
	 public void  run ()
    {
    	StringBuilder_StringBuffer .sb.append ("something");
    	for(int i=0;i<6;i++)
		{	
			System.out.println("Hello"+i);
		}
    }

    public static void main (String[] args)
    {
        // start two threads
        new Thread (new StringBuilder_StringBuffer ()).start();
        new Thread (new StringBuilder_StringBuffer ()).start();
    }

}

/*
public class StringBuilder_StringBuffer implements  Runnable
{
	
	public static StringBuffer sb = new StringBuffer();
    public synchronized void  run ()
    {
    	StringBuilder_StringBuffer .sb.append ("something");
    	System.out.println("thread access");
    }

    public static void main (String[] args)
    {
        // start two threads
        new Thread (new StringBuilder_StringBuffer ()).start();
        new Thread (new StringBuilder_StringBuffer ()).start();
    }

}*/
