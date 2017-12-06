package com.aspose.cells.b.a.b;

public final class zt
{
  private float a;
  private float b;
  
  public zt()
  {
    this.a = 0.0F;
    this.b = 0.0F;
  }
  
  public zt(float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
  }
  
  public static zt a()
  {
    return new zt(0.0F, 0.0F);
  }
  
  public float b()
  {
    return this.a;
  }
  
  public float c()
  {
    return this.b;
  }
  
  public void a(float paramFloat)
  {
    this.a = paramFloat;
  }
  
  public void b(float paramFloat)
  {
    this.b = paramFloat;
  }
  
  public int hashCode()
  {
    return (int)(this.a ^ this.b);
  }
  
  public boolean equals(Object obj)
  {
    return ((obj instanceof zt)) && (a(this, (zt)obj));
  }
  
  public static boolean a(zt paramzt1, zt paramzt2)
  {
    if (paramzt1 == paramzt2) {
      return true;
    }
    return (paramzt1 != null) && (paramzt2 != null) && (paramzt1.a == paramzt2.a) && (paramzt1.b == paramzt2.b);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */