package com.aspose.cells;

class zwj
{
  int a;
  Object b;
  
  int a()
  {
    if (this.b == null) {
      return 3;
    }
    if ((this.b instanceof zuf)) {
      return 2;
    }
    switch (zaoj.a(this.b.getClass()))
    {
    case 9: 
    case 14: 
      return 4;
    case 18: 
      if (ztr.d((String)this.b)) {
        return 2;
      }
      return 5;
    case 3: 
      return 0;
    }
    return 5;
  }
  
  int b()
  {
    if (this.b == null) {
      return 0;
    }
    if ((this.b instanceof zuf)) {
      return 3;
    }
    switch (zaoj.a(this.b.getClass()))
    {
    case 14: 
      return 1;
    case 18: 
      if (ztr.d((String)this.b)) {
        return 3;
      }
      return 2;
    case 3: 
      return 4;
    }
    return 2;
  }
  
  zwj(int paramInt, Object paramObject)
  {
    this.a = paramInt;
    this.b = paramObject;
  }
  
  double c()
  {
    return ((Double)this.b).doubleValue();
  }
  
  zuf d()
  {
    if ((this.b instanceof String))
    {
      int i = 0;
      boolean[] arrayOfBoolean = { i };
      zuf localzuf = ztr.a((String)this.b, arrayOfBoolean);
      i = arrayOfBoolean[0];
      return localzuf;
    }
    return (zuf)this.b;
  }
  
  boolean e()
  {
    return ((Boolean)this.b).booleanValue();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */