package com.aspose.cells.b.a.b;

public final class zs
{
  private int a;
  private int b;
  
  public zs() {}
  
  public static zs a()
  {
    return new zs(0, 0);
  }
  
  public zs(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public int hashCode()
  {
    return this.a ^ this.b;
  }
  
  public boolean equals(Object obj)
  {
    return ((obj instanceof zs)) && (a(this, (zs)obj));
  }
  
  public static boolean a(zs paramzs1, zs paramzs2)
  {
    if (paramzs1 == paramzs2) {
      return true;
    }
    return (paramzs1 != null) && (paramzs2 != null) && (paramzs1.a == paramzs2.a) && (paramzs1.b == paramzs2.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */