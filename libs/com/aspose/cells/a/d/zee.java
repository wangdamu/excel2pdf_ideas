package com.aspose.cells.a.d;

public class zee
  extends zey
{
  private float a = 1.0F;
  private float b = 1.0F;
  
  public zee(zdz paramzdz)
  {
    super(paramzdz);
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    paramzez.a("/Type", "/ExtGState");
    if (this.e.b().u())
    {
      paramzez.a("/CA", "1.0");
      paramzez.a("/ca", "1.0");
    }
    else
    {
      paramzez.a("/CA", this.a);
      paramzez.a("/ca", this.b);
    }
    paramzez.h();
    paramzez.b();
  }
  
  public boolean a(zee paramzee)
  {
    return (paramzee != null) && (b() == paramzee.b()) && (c() == paramzee.c());
  }
  
  public int e_()
  {
    return 3;
  }
  
  public float b()
  {
    return this.a;
  }
  
  public void a(float paramFloat)
  {
    this.a = paramFloat;
  }
  
  public float c()
  {
    return this.b;
  }
  
  public void b(float paramFloat)
  {
    this.b = paramFloat;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */