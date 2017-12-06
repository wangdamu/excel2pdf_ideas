package com.aspose.cells.b.a.b;

public final class zn
{
  private int a;
  private int b;
  
  public zn()
  {
    this.a = 0;
    this.b = 0;
  }
  
  public zn(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int hashCode()
  {
    return this.a ^ this.b;
  }
  
  public boolean equals(Object obj)
  {
    return ((obj instanceof zn)) && (a(this, (zn)obj));
  }
  
  public static boolean a(zn paramzn1, zn paramzn2)
  {
    if (paramzn1 == paramzn2) {
      return true;
    }
    return (paramzn1 != null) && (paramzn2 != null) && (paramzn1.a == paramzn2.a) && (paramzn1.b == paramzn2.b);
  }
  
  public String toString()
  {
    return "X=" + this.a + ", Y=" + this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */