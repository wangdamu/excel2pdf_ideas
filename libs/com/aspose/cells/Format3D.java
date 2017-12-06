package com.aspose.cells;

import com.aspose.cells.b.a.zr;

public class Format3D
{
  private ShapePropertyCollection a;
  
  Format3D(ShapePropertyCollection spPr)
  {
    this.a = spPr;
  }
  
  private void a()
  {
    if (this.a.d() == null)
    {
      zbep localzbep = this.a.e();
      localzbep.a().a(46);
      localzbep.b().a(25);
      localzbep.b().b(5);
    }
  }
  
  public Bevel getTopBevel()
  {
    a();
    return this.a.c().d();
  }
  
  public boolean hasTopBevelData()
  {
    return (this.a.b() != null) && (this.a.b().c() != null) && (this.a.b().c().getType() != 0);
  }
  
  public int getSurfaceMaterialType()
  {
    a();
    return this.a.c().e();
  }
  
  public void setSurfaceMaterialType(int value)
  {
    a();
    this.a.c().a(value);
  }
  
  public int getSurfaceLightingType()
  {
    a();
    return this.a.e().b().a();
  }
  
  public void setSurfaceLightingType(int value)
  {
    a();
    this.a.e().b().a(value);
  }
  
  public double getLightingAngle()
  {
    a();
    return zr.b(this.a.e().b().e() / znq.k, 1);
  }
  
  public void setLightingAngle(double value)
  {
    a();
    if ((value < 0.0D) || (value > 359.9D)) {
      throw new CellsException(6, "LightingAngle must between 0 and 359.9");
    }
    this.a.e().b().e((int)(value * znq.k));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Format3D.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */