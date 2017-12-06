package com.aspose.cells;

class zapk
{
  private static zapk a = new zapk();
  private double b = 0.0D;
  private Object c = new Object();
  private long d = 0L;
  private Object e = new Object();
  private final double f = 100.0D;
  private final long g = 5000L;
  private final long h = 43200000L;
  
  public static zapk a()
  {
    return a;
  }
  
  private long c()
  {
    long l = 0L;
    synchronized (this.e)
    {
      l = this.d;
    }
    return l;
  }
  
  private void a(long paramLong)
  {
    synchronized (this.e)
    {
      this.d = paramLong;
    }
  }
  
  void a(double paramDouble)
  {
    a(paramDouble, true);
  }
  
  void a(double paramDouble, boolean paramBoolean)
  {
    if (zapi.b() == 0) {
      return;
    }
    double d1 = 0.0D;
    synchronized (this.c)
    {
      this.b += paramDouble;
      d1 = this.b;
    }
    if (paramBoolean)
    {
      int i = 0;
      long l = System.currentTimeMillis() - c();
      getClass();
      if (l <= 43200000L)
      {
        getClass();
        if (l > 5000L)
        {
          getClass();
          if (d1 <= 100.0D) {}
        }
      }
      else
      {
        i = 1;
      }
      if (i != 0)
      {
        new za(null).start();
        a(System.currentTimeMillis());
      }
    }
  }
  
  double b()
  {
    double d1 = 0.0D;
    synchronized (this.c)
    {
      d1 = this.b;
      this.b = 0.0D;
    }
    return d1;
  }
  
  private class za
    extends Thread
  {
    private za() {}
    
    public void run()
    {
      zapi localzapi = zapi.a();
      if (localzapi != null) {
        localzapi.d();
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zapk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */