package com.aspose.cells;

class zbou
  implements zajg
{
  private boolean a;
  private zaiw[] b;
  
  zbou(zaca paramzaca, boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.b = new zaiw[paramBoolean ? paramzaca.l.f() : paramzaca.l.g()];
  }
  
  public zaiw c(zaca paramzaca)
  {
    int i = this.a ? paramzaca.d - paramzaca.l.StartRow : paramzaca.e - paramzaca.l.StartColumn;
    zaiw localzaiw = this.b[i];
    if (localzaiw == null) {
      return localzaiw;
    }
    localzaiw = localzaiw.c(paramzaca);
    this.b[i] = localzaiw;
    return localzaiw;
  }
  
  public void a(zaca paramzaca, zaiw paramzaiw)
  {
    this.b[(this.a ? paramzaca.d - paramzaca.l.StartRow : paramzaca.e - paramzaca.l.StartColumn)] = paramzaiw;
  }
  
  public zajg d(zaca paramzaca)
  {
    for (int i = 0; i < this.b.length; i++) {
      if (this.b[i] != null)
      {
        zaiw localzaiw1 = this.b[i];
        zaiw localzaiw2 = (zaiw)localzaiw1.d(paramzaca);
        if (localzaiw2 != localzaiw1)
        {
          localzaiw2.a(true);
          this.b[i] = localzaiw2;
        }
      }
    }
    return this;
  }
  
  public int B()
  {
    return this.a ? 2 : 1;
  }
  
  public void a(zaca paramzaca) {}
  
  public boolean a()
  {
    return true;
  }
  
  public void a(boolean paramBoolean)
  {
    for (zaiw localzaiw : this.b) {
      if (localzaiw != null) {
        localzaiw.a(paramBoolean);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */