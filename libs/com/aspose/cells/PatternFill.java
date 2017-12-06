package com.aspose.cells;

public class PatternFill
  extends Fill
{
  private FillFormat c;
  private Workbook d;
  private int e;
  zaml a;
  zaml b;
  
  PatternFill(FillFormat parent, Workbook workbook)
  {
    this.c = parent;
    this.d = workbook;
    this.a = new zaml(true);
    this.b = new zaml(true);
  }
  
  Object b()
  {
    if (this.c == null) {
      return null;
    }
    return this.c.b.g;
  }
  
  Chart c()
  {
    Object localObject1 = b();
    if (localObject1 == null) {
      return null;
    }
    Object localObject2;
    if ((localObject1 instanceof Area))
    {
      localObject2 = (Area)localObject1;
      return ((Area)localObject2).a();
    }
    if ((localObject1 instanceof Shape))
    {
      localObject2 = (Shape)localObject1;
      if (((Shape)localObject2).T())
      {
        Chart localChart = (Chart)((Shape)localObject2).N().i();
        return localChart;
      }
    }
    return null;
  }
  
  public int getPattern()
  {
    return this.e;
  }
  
  public void setPattern(int value)
  {
    this.e = value;
  }
  
  public Color getBackgroundColor()
  {
    if (getPattern() == 1) {
      return getForegroundColor();
    }
    return this.a.a(this.d, c());
  }
  
  public void setBackgroundColor(Color value)
  {
    this.a.a(2, value.toArgb());
    if ((b() instanceof Area))
    {
      Area localArea = (Area)b();
      localArea.c();
    }
  }
  
  zaml d()
  {
    if (getPattern() == 1) {
      return this.b;
    }
    return this.a;
  }
  
  public CellsColor getBackgroundCellsColor()
  {
    if (getPattern() == 1) {
      return getForegroundCellsColor();
    }
    return new CellsColor(this.d, this.a);
  }
  
  public void setBackgroundCellsColor(CellsColor value)
  {
    this.a = value.a;
    if ((b() instanceof Area))
    {
      Area localArea = (Area)b();
      localArea.c();
    }
  }
  
  public Color getForegroundColor()
  {
    return this.b.a(this.d, c());
  }
  
  public void setForegroundColor(Color value)
  {
    this.b.a(2, value.toArgb());
    if ((b() instanceof Area))
    {
      Area localArea = (Area)b();
      localArea.c();
    }
  }
  
  public CellsColor getForegroundCellsColor()
  {
    return new CellsColor(this.d, this.b);
  }
  
  public void setForegroundCellsColor(CellsColor value)
  {
    this.b = value.a;
    if ((b() instanceof Area))
    {
      Area localArea = (Area)b();
      localArea.c();
    }
  }
  
  int e()
  {
    return zaml.e(this.b);
  }
  
  void a(int paramInt)
  {
    this.b = zaml.a(this.b, paramInt);
  }
  
  public double getForeTransparency()
  {
    return zaml.d(this.b);
  }
  
  public void setForeTransparency(double value)
  {
    this.b = zaml.a(this.b, value);
  }
  
  int f()
  {
    return zaml.e(this.a);
  }
  
  public double getBackTransparency()
  {
    return zaml.d(this.a);
  }
  
  public void setBackTransparency(double value)
  {
    this.a = zaml.a(this.a, value);
  }
  
  void a(Fill paramFill, CopyOptions paramCopyOptions)
  {
    a((PatternFill)paramFill, paramCopyOptions);
  }
  
  void a(PatternFill paramPatternFill, CopyOptions paramCopyOptions)
  {
    this.e = paramPatternFill.e;
    if ((paramPatternFill.a.c() == 3) && (paramPatternFill.d != this.d)) {
      this.a.a(2, paramPatternFill.a.c(paramPatternFill.d));
    } else {
      this.a.f(paramPatternFill.a);
    }
    if ((paramPatternFill.b.c() == 3) && (paramPatternFill.d != this.d)) {
      this.b.a(2, paramPatternFill.b.c(paramPatternFill.d));
    } else {
      this.b.f(paramPatternFill.b);
    }
  }
  
  boolean a(PatternFill paramPatternFill)
  {
    if (this.e != paramPatternFill.e) {
      return false;
    }
    if (!this.a.g(paramPatternFill.a)) {
      return false;
    }
    return this.b.g(paramPatternFill.b);
  }
  
  int a()
  {
    return 5;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PatternFill.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */