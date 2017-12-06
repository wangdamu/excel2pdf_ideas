package com.aspose.cells.a.d;

public class zbt
{
  public zbs[] a;
  public short[] b;
  
  public zbt() {}
  
  public zbt(zz paramzz, int paramInt1, int paramInt2)
    throws Exception
  {
    this.a = new zbs[paramInt1];
    for (int i = 0; i < this.a.length; i++)
    {
      this.a[i] = new zbs();
      this.a[i].a = paramzz.e();
      this.a[i].b = paramzz.d();
    }
    i = paramInt2 - paramInt1;
    this.b = new short[i];
    for (int j = 0; j < this.b.length; j++) {
      this.b[j] = paramzz.d();
    }
  }
  
  public zbs a(int paramInt)
  {
    if (paramInt < this.a.length) {
      return this.a[paramInt];
    }
    zbs localzbs = this.a[(this.a.length - 1)];
    if (paramInt - this.a.length < this.b.length)
    {
      short s = this.b[(paramInt - this.a.length)];
      return new zbs(localzbs.a, s);
    }
    return new zbs(localzbs.a, (short)0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zbt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */