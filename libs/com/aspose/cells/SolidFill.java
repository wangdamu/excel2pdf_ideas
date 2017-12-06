package com.aspose.cells;

public class SolidFill
  extends Fill
{
  zaml a = new zaml(true);
  zaml b = new zaml(true);
  private FillFormat d;
  Workbook c;
  
  SolidFill(FillFormat parent, Workbook workbook)
  {
    this.d = parent;
    this.c = workbook;
  }
  
  Chart b()
  {
    if (this.d == null) {
      return null;
    }
    Object localObject1 = c();
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
  
  Object c()
  {
    return this.d.b.g;
  }
  
  int a()
  {
    return 2;
  }
  
  public Color getColor()
  {
    return this.a.a(this.c, b());
  }
  
  public void setColor(Color value)
  {
    this.a.a(2, value.toArgb());
    if ((c() instanceof Area))
    {
      Area localArea = (Area)c();
      localArea.c();
    }
  }
  
  public CellsColor getCellsColor()
  {
    return new CellsColor(this.c, this.a);
  }
  
  public void setCellsColor(CellsColor value)
  {
    this.a = value.a;
    if ((c() instanceof Area))
    {
      Area localArea = (Area)c();
      localArea.c();
    }
  }
  
  Color d()
  {
    return this.b.a(this.c, b());
  }
  
  void a(Color paramColor)
  {
    this.b.a(2, paramColor.toArgb());
    if ((c() instanceof Area))
    {
      Area localArea = (Area)c();
      localArea.c();
    }
  }
  
  public double getTransparency()
  {
    return zaml.d(this.a);
  }
  
  public void setTransparency(double value)
  {
    this.a = zaml.a(this.a, value);
  }
  
  int e()
  {
    return zaml.e(this.a);
  }
  
  void a(int paramInt)
  {
    this.a = zaml.a(this.a, paramInt);
  }
  
  void a(Fill paramFill, CopyOptions paramCopyOptions)
  {
    a((SolidFill)paramFill, paramCopyOptions);
  }
  
  void a(SolidFill paramSolidFill, CopyOptions paramCopyOptions)
  {
    if (paramSolidFill.a != null)
    {
      this.a = new zaml(true);
      this.a.a(paramSolidFill.a, paramCopyOptions);
    }
    else
    {
      this.a = null;
    }
    if (paramSolidFill.b != null)
    {
      this.b = new zaml(true);
      this.b.a(paramSolidFill.b, paramCopyOptions);
    }
    else
    {
      this.b = null;
    }
  }
  
  boolean a(SolidFill paramSolidFill, zmz paramzmz)
  {
    if (!zaml.a(this.a, paramSolidFill.a, paramzmz)) {
      return false;
    }
    return zaml.a(this.b, paramSolidFill.b, paramzmz);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/SolidFill.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */