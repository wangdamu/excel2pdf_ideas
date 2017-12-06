package com.aspose.cells;

/**
 * @deprecated
 */
public class ShapeFormat
{
  FillFormat a;
  LineFormat b;
  ThreeDFormat c;
  ztf d;
  String e;
  Workbook f;
  Object g;
  String h;
  
  ShapeFormat(Workbook workbook, Object parent)
  {
    this.f = workbook;
    this.g = parent;
  }
  
  /**
   * @deprecated
   */
  public FillFormat getFillFormat()
  {
    return getFill();
  }
  
  public FillFormat getFill()
  {
    if (this.a == null)
    {
      this.a = new FillFormat(this);
      if ((this.g instanceof Shape)) {
        Shape.a((Shape)this.g, this.a);
      }
    }
    return this.a;
  }
  
  int a()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.getFillType();
  }
  
  void a(int paramInt)
  {
    if (a() == paramInt) {
      return;
    }
    getFill().setFillType(paramInt);
  }
  
  /**
   * @deprecated
   */
  public LineFormat getOutline()
  {
    return getLine();
  }
  
  public LineFormat getLine()
  {
    if (this.b == null)
    {
      this.b = new LineFormat(this);
      if ((this.g instanceof Shape)) {
        Shape.a((Shape)this.g, this.b);
      }
    }
    return this.b;
  }
  
  int b()
  {
    if (this.b == null) {
      return 0;
    }
    return this.b.getFillType();
  }
  
  void b(int paramInt)
  {
    if (b() == paramInt) {
      return;
    }
    getLine().setFillType(paramInt);
  }
  
  ThreeDFormat c()
  {
    if (this.c == null) {
      this.c = new ThreeDFormat(this);
    }
    return this.c;
  }
  
  ThreeDFormat d()
    throws Exception
  {
    if (this.c == null) {
      this.c = new ThreeDFormat(this);
    }
    if ((this.c.j != null) || (this.c.a != null)) {
      zalf.a(this.c);
    }
    return this.c;
  }
  
  public ShadowEffect getShadowEffect()
    throws Exception
  {
    return f().h();
  }
  
  ReflectionEffect e()
    throws Exception
  {
    return f().l();
  }
  
  ztf f()
    throws Exception
  {
    if (this.d == null) {
      this.d = new ztf(this);
    }
    if (this.d.a != null) {
      zalf.a(this.d.a, this.d);
    }
    return this.d;
  }
  
  void a(ShapeFormat paramShapeFormat, CopyOptions paramCopyOptions)
  {
    if (paramShapeFormat.d != null)
    {
      this.d = new ztf(this);
      this.d.a(paramShapeFormat.d, paramCopyOptions);
    }
    if (paramShapeFormat.c != null)
    {
      this.c = new ThreeDFormat(this);
      this.c.c(paramShapeFormat.c, paramCopyOptions);
    }
  }
  
  void b(ShapeFormat paramShapeFormat, CopyOptions paramCopyOptions)
  {
    a(paramShapeFormat, paramCopyOptions);
    a(paramShapeFormat.a());
    if ((paramShapeFormat.a != null) && (this.a != null)) {
      this.a.a(paramShapeFormat.a, paramCopyOptions);
    }
    if (paramShapeFormat.b != null)
    {
      this.b = new LineFormat(this);
      this.b.a(paramShapeFormat.b, paramCopyOptions);
    }
    b(paramShapeFormat.b());
    this.e = paramShapeFormat.e;
  }
  
  public GlowEffect getGlowEffect()
    throws Exception
  {
    return f().e();
  }
  
  public void clearGlowEffect()
  {
    if (this.d != null) {
      this.d.a(null);
    }
  }
  
  public boolean hasGlowEffect()
  {
    return (this.d != null) && (this.d.f() != null) && (this.d.f().a());
  }
  
  public boolean hasFormat3D()
  {
    return this.c != null;
  }
  
  public void clearFormat3D()
  {
    this.c = null;
  }
  
  public double getSoftEdgeRadius()
    throws Exception
  {
    if (this.d == null) {
      return 0.0D;
    }
    return f().n();
  }
  
  public void setSoftEdgeRadius(double value)
    throws Exception
  {
    f().a(value);
  }
  
  public void clearShadowEffect()
  {
    if (this.d != null) {
      this.d.g();
    }
  }
  
  public boolean hasShadowEffect()
  {
    if (this.d == null) {
      return false;
    }
    return this.d.i();
  }
  
  void a(int paramInt, Object paramObject)
  {
    Object localObject = this.g;
    switch (paramInt)
    {
    case 0: 
      if ((paramObject == this.a) && (localObject != null) && ((localObject instanceof Area))) {
        ((Area)localObject).d();
      }
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ShapeFormat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */