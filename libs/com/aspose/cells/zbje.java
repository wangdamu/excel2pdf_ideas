package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zp;
import java.util.ArrayList;
import java.util.Iterator;

class zbje
{
  private int c;
  private int d;
  private double e;
  private double f;
  private double g;
  private double h;
  private int i;
  private double j;
  private CellArea k;
  private int l;
  private double m;
  private Shape n;
  private int o;
  ArrayList a;
  boolean b = false;
  private String p;
  
  zbje(Shape paramShape, int paramInt, String paramString)
  {
    this.n = paramShape;
    this.o = paramInt;
    this.p = paramString;
    int i1 = paramShape.getPlacement();
    if (this.n.getMsoDrawingType() == 0) {
      this.a = new ArrayList();
    }
    if (!this.n.W())
    {
      double[] arrayOfDouble = paramShape.L();
      this.c = ((int)arrayOfDouble[2]);
      this.d = ((int)arrayOfDouble[0]);
      this.e = arrayOfDouble[3];
      this.f = arrayOfDouble[1];
      this.i = ((int)arrayOfDouble[6]);
      this.j = arrayOfDouble[7];
      this.l = ((int)arrayOfDouble[4]);
      this.m = arrayOfDouble[5];
      this.g = arrayOfDouble[8];
      this.h = arrayOfDouble[9];
      n();
    }
  }
  
  public double a()
  {
    return this.e;
  }
  
  public void a(double paramDouble)
  {
    this.e = paramDouble;
  }
  
  public double b()
  {
    return this.f;
  }
  
  public void b(double paramDouble)
  {
    this.f = paramDouble;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.i;
  }
  
  public double e()
  {
    return this.j;
  }
  
  public int f()
  {
    return this.d;
  }
  
  public int g()
  {
    return this.l;
  }
  
  public double h()
  {
    return this.m;
  }
  
  public double i()
  {
    return this.g;
  }
  
  public double j()
  {
    return this.h;
  }
  
  int k()
  {
    return this.n.getMsoDrawingType();
  }
  
  Shape l()
  {
    return this.n;
  }
  
  CellArea m()
  {
    return this.k;
  }
  
  private void n()
  {
    this.k = new CellArea();
    this.k.StartColumn = f();
    this.k.EndColumn = g();
    this.k.StartRow = c();
    this.k.EndRow = d();
    if ((l() instanceof CommentShape))
    {
      CommentShape localCommentShape = (CommentShape)l();
      a(localCommentShape.getComment().getColumn(), localCommentShape.getComment().getRow());
    }
    if ((l().getAutoShapeType() == 62) || (l().getAutoShapeType() == 61) || (l().getAutoShapeType() == 63)) {
      o();
    } else if (l().getAutoShapeType() == 35) {
      p();
    }
  }
  
  private void o()
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (l().P().p().h())
    {
      localObject = this.n.an();
      ShapeGuideCollection localShapeGuideCollection = null;
      if (localObject != null) {
        localShapeGuideCollection = ((Geometry)localObject).g();
      }
      if ((localObject != null) && (localShapeGuideCollection != null) && (localShapeGuideCollection.getCount() >= 2))
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = localShapeGuideCollection.iterator();
        while (localIterator.hasNext())
        {
          ShapeGuide localShapeGuide = (ShapeGuide)localIterator.next();
          String str1 = localShapeGuide.b().toLowerCase();
          if (str1.startsWith("val"))
          {
            String str2 = str1.substring(4).trim();
            if (zarb.b(str2)) {
              zf.a(localArrayList, Integer.valueOf(zp.a(str2)));
            }
          }
        }
        f1 = this.n.getWidth() / 2 + this.n.getWidth() * (ze.a(localArrayList.get(0)) / 100000.0F);
        f2 = this.n.getHeight() / 2 + this.n.getHeight() * (ze.a(localArrayList.get(1)) / 100000.0F);
      }
      else
      {
        f1 = this.n.getWidth() / 2 + this.n.getWidth() * -0.20473F;
        f2 = this.n.getHeight() / 2 + this.n.getHeight() * 0.61957F;
      }
    }
    else
    {
      localObject = l().ap();
      if ((((zadi)localObject).c(327)) && (((zadi)localObject).c(328)))
      {
        float f3 = ((zadi)localObject).b(327);
        float f4 = ((zadi)localObject).b(328);
        f1 = this.n.getWidth() * (f3 / 21600.0F);
        f2 = this.n.getHeight() * (f4 / 21600.0F);
      }
      else
      {
        f1 = this.n.getWidth() * 0.051435184F;
        f2 = this.n.getHeight() * 1.2056018F;
      }
    }
    Object localObject = l().Q().getCells();
    int i1 = this.k.StartColumn;
    if (f1 > 0.0F)
    {
      i2 = ((Cells)localObject).getColumnWidthPixel(i1) - l().getLeft();
      while (i2 < f1)
      {
        i2 += ((Cells)localObject).getColumnWidthPixel(i1);
        i1++;
      }
    }
    else if (f1 < 0.0F)
    {
      i2 = -l().getLeft();
      while (i2 > f1)
      {
        i1--;
        if (i1 < 0) {
          break;
        }
        i2 -= ((Cells)localObject).getColumnWidthPixel(i1);
      }
    }
    int i2 = this.k.StartRow;
    int i3;
    if (f2 > 0.0F)
    {
      i3 = ((Cells)localObject).getRowHeightPixel(i2) - l().getTop();
      while (i3 < f2)
      {
        i3 += ((Cells)localObject).getRowHeightPixel(i2);
        i2++;
      }
    }
    else if (f2 < 0.0F)
    {
      i3 = -l().getTop();
      while (i3 > f2)
      {
        i2--;
        if ((i2 < 0) || (i2 > 1048575)) {
          break;
        }
        i3 -= ((Cells)localObject).getRowHeightPixel(i2);
      }
    }
    a(i1, i2);
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    if (paramInt1 < this.k.StartColumn) {
      this.k.StartColumn = paramInt1;
    }
    if (paramInt1 > this.k.EndColumn) {
      this.k.EndColumn = paramInt1;
    }
    if (paramInt2 < this.k.StartRow) {
      this.k.StartRow = paramInt2;
    }
    if (paramInt2 > this.k.EndRow) {
      this.k.EndRow = paramInt2;
    }
  }
  
  private void p()
  {
    float f1 = 0.0F;
    float f2 = 0.0F;
    if (l().P().p().h())
    {
      localObject = this.n.an();
      ShapeGuideCollection localShapeGuideCollection = null;
      if (localObject != null) {
        localShapeGuideCollection = ((Geometry)localObject).g();
      }
      if ((localObject != null) && (localShapeGuideCollection != null) && (localShapeGuideCollection.getCount() >= 2))
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = localShapeGuideCollection.iterator();
        while (localIterator.hasNext())
        {
          ShapeGuide localShapeGuide = (ShapeGuide)localIterator.next();
          String str1 = localShapeGuide.b().toLowerCase();
          if (str1.startsWith("val"))
          {
            String str2 = str1.substring(4).trim();
            if (zarb.b(str2)) {
              zf.a(localArrayList, Integer.valueOf(zp.a(str2)));
            }
          }
        }
        if (ze.a(localArrayList.get(0)) < 0.0F) {
          f1 = this.n.getWidth() + this.n.getWidth() * (ze.a(localArrayList.get(0)) / 100000.0F);
        } else {
          f1 = this.n.getWidth() * (ze.a(localArrayList.get(0)) / 100000.0F);
        }
        if (ze.a(localArrayList.get(1)) < 0.0F) {
          f2 = this.n.getHeight() + this.n.getHeight() * (ze.a(localArrayList.get(1)) / 100000.0F);
        } else {
          f2 = this.n.getHeight() * (ze.a(localArrayList.get(1)) / 100000.0F);
        }
      }
      else
      {
        f1 = this.n.getWidth() * -0.20473F;
        f2 = this.n.getHeight() * 0.61957F;
      }
    }
    else
    {
      localObject = l().ap();
      if ((((zadi)localObject).c(327)) && (((zadi)localObject).c(328)))
      {
        float f3 = ((zadi)localObject).b(327);
        float f4 = ((zadi)localObject).b(328);
        f1 = this.n.getWidth() * (f3 / 21600.0F);
        f2 = this.n.getHeight() * (f4 / 21600.0F);
      }
      else
      {
        f1 = this.n.getWidth() * 0.051435184F;
        f2 = this.n.getHeight() * 1.2056018F;
      }
    }
    Object localObject = l().Q().getCells();
    int i1 = this.k.StartColumn;
    if (f1 > 0.0F)
    {
      i2 = ((Cells)localObject).getColumnWidthPixel(i1) - l().getLeft();
      while (i2 < f1)
      {
        i2 += ((Cells)localObject).getColumnWidthPixel(i1);
        i1++;
      }
    }
    else if (f1 < 0.0F)
    {
      i2 = -l().getLeft();
      while (i2 > f1)
      {
        i1--;
        if (i1 < 0) {
          break;
        }
        i2 -= ((Cells)localObject).getColumnWidthPixel(i1);
      }
      b((f1 - i2) * 72.0F / zbxp.a());
    }
    int i2 = this.k.StartRow;
    int i3;
    if (f2 > 0.0F)
    {
      i3 = ((Cells)localObject).getRowHeightPixel(i2) - l().getTop();
      while (i3 < f2)
      {
        i3 += ((Cells)localObject).getRowHeightPixel(i2);
        i2++;
      }
    }
    else if (f2 < 0.0F)
    {
      i3 = -l().getTop();
      while (i3 > f2)
      {
        i2--;
        if ((i2 < 0) || (i2 > 1048575)) {
          break;
        }
        i3 -= ((Cells)localObject).getRowHeightPixel(i2);
      }
      a((f2 - i3) * 72.0F / zbxp.a());
    }
    a(i1, i2);
    q();
  }
  
  private void q()
  {
    this.d = this.k.StartColumn;
    this.l = this.k.EndColumn;
    this.e = this.k.StartRow;
    this.i = this.k.EndRow;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbje.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */