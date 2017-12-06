package com.aspose.cells;

class zbby
{
  zbbu a;
  int b;
  short c;
  int d = -1;
  Object e;
  boolean f;
  String g;
  byte[] h;
  short i;
  
  zbby(zbbu paramzbbu)
  {
    this.a = paramzbbu;
  }
  
  zbby(zbbu paramzbbu, int paramInt1, int paramInt2)
  {
    this.a = paramzbbu;
    this.b = paramInt1;
    this.c = ((short)paramInt2);
  }
  
  String a()
  {
    return CellsHelper.cellIndexToName(this.b, this.c);
  }
  
  void a(String paramString)
  {
    int j = 0;
    int k = 0;
    int[] arrayOfInt1 = { j };
    int[] arrayOfInt2 = { k };
    CellsHelper.a(paramString, arrayOfInt1, arrayOfInt2);
    j = arrayOfInt1[0];
    k = arrayOfInt2[0];
    this.b = j;
    this.c = ((short)k);
  }
  
  int b()
  {
    if (this.e == null) {
      return 3;
    }
    Object localObject = this.e;
    switch (zaoj.a(localObject.getClass()))
    {
    case 3: 
      return 0;
    case 9: 
    case 14: 
      return 4;
    case 16: 
      return 1;
    case 18: 
      if (ztr.c((String)localObject)) {
        return 2;
      }
      return 5;
    }
    if ((localObject instanceof zbbj)) {
      return 5;
    }
    return 6;
  }
  
  double c()
  {
    switch (b())
    {
    case 1: 
      return CellsHelper.getDoubleFromDateTime((DateTime)this.e, false);
    case 4: 
      return ((Double)this.e).doubleValue();
    }
    throw new CellsException(6, "This cell does not contain numberic value.");
  }
  
  public Object d()
  {
    if (this.e == null) {
      return this.e;
    }
    switch (zaoj.a(this.e.getClass()))
    {
    }
    if ((this.e instanceof zbbj)) {
      return ((zbbj)this.e).c;
    }
    return this.e;
  }
  
  boolean e()
  {
    return (this.g != null) || (this.h != null);
  }
  
  Object f()
  {
    return this.e;
  }
  
  boolean g()
  {
    return false;
  }
  
  String h()
  {
    return this.g;
  }
  
  void b(String paramString)
  {
    this.g = paramString;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */