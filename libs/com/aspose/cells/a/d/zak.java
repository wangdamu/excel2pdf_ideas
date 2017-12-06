package com.aspose.cells.a.d;

public class zak
{
  private zz b;
  
  public zak(zz paramzz)
  {
    this.b = paramzz;
  }
  
  public short a()
    throws Exception
  {
    return (short)this.b.f();
  }
  
  public int b()
    throws Exception
  {
    return this.b.e();
  }
  
  public short c()
    throws Exception
  {
    short s = (short)(this.b.f() & 0xFF);
    if ((!a) && ((s < 1) || (s > 4))) {
      throw new AssertionError();
    }
    return s;
  }
  
  public int[] a(short paramShort, int paramInt)
    throws Exception
  {
    if ((!a) && ((paramShort < 1) || (paramShort > 4))) {
      throw new AssertionError();
    }
    int[] arrayOfInt = new int[paramInt];
    byte[] arrayOfByte = this.b.a(paramShort * paramInt);
    for (int i = 0; i < paramInt; i++) {
      for (short s = 0; s < paramShort; s++)
      {
        arrayOfInt[i] |= arrayOfByte[(i * paramShort + s)];
        if (paramShort - s - 1 > 0) {
          arrayOfInt[i] <<= 8;
        }
      }
    }
    return arrayOfInt;
  }
  
  public zz d()
  {
    return this.b;
  }
  
  public zaj e()
    throws Exception
  {
    zaj localzaj = new zaj(this);
    return localzaj;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */