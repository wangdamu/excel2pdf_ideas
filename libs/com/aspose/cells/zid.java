package com.aspose.cells;

class zid
  extends zib
{
  private boolean e = true;
  private String f;
  private int g;
  private int h;
  private double i;
  
  public zid(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramBoolean);
    this.a = new zsl(paramString, paramInt1, paramInt2, true, null);
    e();
  }
  
  protected boolean d()
  {
    return this.e;
  }
  
  protected void b() {}
  
  protected void a()
  {
    if (this.f == null)
    {
      this.e = true;
      return;
    }
    if (this.a.a(this.f, this.h))
    {
      if (this.a.b() == this.g)
      {
        this.e = true;
        return;
      }
      if ((this.b != null) && (this.b.a(this.f, this.h)))
      {
        if (this.b.b() == this.g) {
          return;
        }
        if (this.b.d() != null)
        {
          this.b = new zsl(this.f, this.g, this.h, this.b.d());
          f();
          return;
        }
      }
      if (this.a.d() != null)
      {
        this.b = new zsl(this.f, this.g, this.h, this.a.d());
        f();
        return;
      }
    }
    this.b = new zsl(this.f, this.g, this.h, this.a.d());
    f();
  }
  
  public double c()
  {
    return this.i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zid.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */