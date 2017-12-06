package com.aspose.cells.b.a.b;

public final class zo
{
  private float a;
  private float b;
  
  public zo()
  {
    this.a = 0.0F;
    this.b = 0.0F;
  }
  
  public zo(float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
  }
  
  public static zo a()
  {
    return new zo(0.0F, 0.0F);
  }
  
  public boolean b()
  {
    return (this.a == 0.0F) && (this.b == 0.0F);
  }
  
  public zo c()
  {
    return new zo(this.a, this.b);
  }
  
  public zo(double paramDouble1, double paramDouble2)
  {
    this((float)paramDouble1, (float)paramDouble2);
  }
  
  public float d()
  {
    return this.a;
  }
  
  public float e()
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
    return ((obj instanceof zo)) && (a(this, (zo)obj));
  }
  
  public static boolean a(zo paramzo1, zo paramzo2)
  {
    if (paramzo1 == paramzo2) {
      return true;
    }
    return (paramzo1 != null) && (paramzo2 != null) && (paramzo1.a == paramzo2.a) && (paramzo1.b == paramzo2.b);
  }
  
  public String toString()
  {
    return "X=" + this.a + ", Y=" + this.b;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/b/a/b/zo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */