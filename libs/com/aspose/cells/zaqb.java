package com.aspose.cells;

class zaqb
{
  private Shape a;
  
  zaqb(Shape paramShape)
  {
    this.a = paramShape;
  }
  
  zaum a()
  {
    return this.a.R().d();
  }
  
  public boolean b()
  {
    return a().a(191, 1, false);
  }
  
  public void a(boolean paramBoolean)
  {
    a().b(191, 1, paramBoolean);
  }
  
  public boolean c()
  {
    return a().a(191, 3, false);
  }
  
  public void b(boolean paramBoolean)
  {
    a().b(191, 3, paramBoolean);
  }
  
  int d()
  {
    return a().c(129, (int)(7.2D * znq.j + 0.5D));
  }
  
  void a(int paramInt)
  {
    a().a(129, 0, Integer.valueOf(paramInt));
  }
  
  int e()
  {
    return a().c(131, (int)(7.2D * znq.j + 0.5D));
  }
  
  void b(int paramInt)
  {
    a().a(131, 0, Integer.valueOf(paramInt));
  }
  
  int f()
  {
    return a().c(130, (int)(3.6D * znq.j + 0.5D));
  }
  
  void c(int paramInt)
  {
    a().a(130, 0, Integer.valueOf(paramInt));
  }
  
  int g()
  {
    return a().c(132, (int)(3.6D * znq.j + 0.5D));
  }
  
  void d(int paramInt)
  {
    a().a(132, 0, Integer.valueOf(paramInt));
  }
  
  void h()
    throws Exception
  {
    if ((!b()) && (c()) && (this.a.x == null)) {
      return;
    }
    ShapeTextAlignment localShapeTextAlignment = this.a.getTextBody().getTextAlignment();
    if (b()) {
      localShapeTextAlignment.setAutoSize(true);
    }
    localShapeTextAlignment.e(c());
    if (!localShapeTextAlignment.l())
    {
      localShapeTextAlignment.d(d());
      localShapeTextAlignment.e(e());
      localShapeTextAlignment.b(f());
      localShapeTextAlignment.c(g());
    }
  }
  
  void i()
    throws Exception
  {
    if (this.a.x == null) {
      return;
    }
    ShapeTextAlignment localShapeTextAlignment = this.a.x.getTextAlignment();
    a(localShapeTextAlignment.getAutoSize());
    b(localShapeTextAlignment.l());
    if (!localShapeTextAlignment.l())
    {
      a(localShapeTextAlignment.j());
      b(localShapeTextAlignment.k());
      c(localShapeTextAlignment.h());
      d(localShapeTextAlignment.i());
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaqb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */