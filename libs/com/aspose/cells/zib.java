package com.aspose.cells;

abstract class zib
  extends zo
{
  private boolean e;
  protected zsl a;
  protected zsl b;
  protected double c;
  protected double d;
  
  public zib(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  protected abstract void a();
  
  protected abstract void b();
  
  public abstract double c();
  
  protected abstract boolean d();
  
  protected void e()
  {
    this.c = a(this.a);
  }
  
  protected void f()
  {
    this.d = a(this.b);
  }
  
  public int a(String paramString, char paramChar)
  {
    if (d())
    {
      if (this.a == null) {
        b();
      }
      if (this.e) {
        return (int)((c() - ((paramString == null) || (paramString.equals("")) ? 0.0D : this.a.a(paramString))) / this.a.a(paramChar));
      }
      return (int)((c() * this.c - ((paramString == null) || (paramString.equals("")) ? 0.0D : this.a.a(paramString))) / this.a.a(paramChar));
    }
    if (this.b == null) {
      a();
    }
    if (this.e) {
      return (int)((c() - (paramString == null ? 0.0D : this.b.a(paramString))) / this.b.a(paramChar));
    }
    if (this.a == null) {
      b();
    }
    return (int)((c() * this.c - (paramString == null ? 0.0D : this.b.a(paramString))) / this.b.a(paramChar));
  }
  
  public int a(String paramString1, String paramString2)
  {
    if (d())
    {
      if (this.a == null) {
        b();
      }
      if (this.e) {
        return (int)((c() - ((paramString1 == null) || (paramString1.equals("")) ? 0.0D : this.a.a(paramString1))) / this.a.a(paramString2));
      }
      return (int)((c() * this.c - ((paramString1 == null) || (paramString1.equals("")) ? 0.0D : this.a.a(paramString1))) / this.a.a(paramString2));
    }
    if (this.b == null) {
      a();
    }
    if (this.e) {
      return (int)((c() - (paramString1 == null ? 0.0D : this.b.a(paramString1))) / this.b.a(paramString2));
    }
    if (this.a == null) {
      b();
    }
    return (int)((c() * this.c - (paramString1 == null ? 0.0D : this.b.a(paramString1))) / this.b.a(paramString2));
  }
  
  protected int a(String paramString)
  {
    if (d())
    {
      if ((paramString == null) || (paramString.equals(""))) {
        return (int)c();
      }
      if (this.a == null) {
        b();
      }
      if (this.e) {
        return (int)((c() - this.a.a(paramString)) / this.c);
      }
      return (int)(c() - this.a.a(paramString) / this.c);
    }
    if (this.b == null) {
      a();
    }
    if (this.e) {
      return (int)((c() - (paramString == null ? 0.0D : this.b.a(paramString))) / this.d);
    }
    if (this.a == null) {
      b();
    }
    return (int)((c() * this.c - (paramString == null ? 0.0D : this.b.a(paramString))) / this.d);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zib.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */