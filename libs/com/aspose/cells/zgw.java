package com.aspose.cells;

import java.util.ArrayList;
import java.util.HashMap;

class zgw
{
  private float m;
  boolean a = false;
  private boolean n = false;
  boolean b = false;
  private Style o;
  HashMap c;
  public Border d;
  public Border e;
  private int p;
  private int q;
  private Cell r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private zgr x;
  private Hyperlink y;
  private ArrayList z;
  private int A;
  int f = 1;
  private int B = -1;
  private int C = -1;
  private boolean D = false;
  boolean g = false;
  boolean h = false;
  Style i = null;
  boolean j = true;
  boolean k = false;
  int l = 0;
  
  public float a()
  {
    return this.m;
  }
  
  public void a(float paramFloat)
  {
    this.m = paramFloat;
  }
  
  boolean b()
  {
    return this.n;
  }
  
  void a(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }
  
  public Style c()
  {
    return this.o;
  }
  
  public void a(Style paramStyle)
  {
    this.o = paramStyle;
  }
  
  boolean d()
  {
    if ((c() == null) || (c().d() == null)) {
      return false;
    }
    BorderCollection localBorderCollection = c().getBorders();
    return (localBorderCollection.getByBorderType(1).getLineStyle() != 0) || (localBorderCollection.getByBorderType(4).getLineStyle() != 0) || (localBorderCollection.getByBorderType(2).getLineStyle() != 0) || (localBorderCollection.getByBorderType(8).getLineStyle() != 0);
  }
  
  public int e()
  {
    return this.p;
  }
  
  public void a(int paramInt)
  {
    this.p = paramInt;
  }
  
  public boolean f()
  {
    return (this.l & 0x5) == 5;
  }
  
  public int g()
  {
    return this.q;
  }
  
  public void b(int paramInt)
  {
    this.q = paramInt;
  }
  
  public Cell h()
  {
    return this.r;
  }
  
  public void a(Cell paramCell)
  {
    this.r = paramCell;
  }
  
  public int i()
  {
    return this.s;
  }
  
  public void c(int paramInt)
  {
    this.s = paramInt;
  }
  
  public int j()
  {
    return this.t;
  }
  
  public int k()
  {
    return this.u;
  }
  
  public int l()
  {
    return this.v;
  }
  
  public void d(int paramInt)
  {
    this.v = paramInt;
    this.C = -1;
  }
  
  public int m()
  {
    return this.w;
  }
  
  public void e(int paramInt)
  {
    this.w = paramInt;
    this.B = -1;
  }
  
  public boolean n()
  {
    return (this.l & 0x1) == 1;
  }
  
  public zgr o()
  {
    return this.x;
  }
  
  public void a(zgr paramzgr)
  {
    this.x = paramzgr;
  }
  
  public Hyperlink p()
  {
    return this.y;
  }
  
  public void a(Hyperlink paramHyperlink)
  {
    this.y = paramHyperlink;
  }
  
  zgw(int paramInt1, int paramInt2)
  {
    this.t = paramInt1;
    this.u = paramInt2;
    this.v = 1;
    this.w = 1;
    this.p = -1;
  }
  
  zgw()
  {
    this.v = 1;
    this.w = 1;
    this.p = -1;
  }
  
  boolean q()
  {
    return (h() != null) && (h().c.c != 0);
  }
  
  ArrayList r()
  {
    return this.z;
  }
  
  void a(ArrayList paramArrayList)
  {
    this.z = paramArrayList;
  }
  
  int s()
  {
    return this.A;
  }
  
  void f(int paramInt)
  {
    this.A = paramInt;
  }
  
  double a(Worksheet paramWorksheet, int paramInt1, int paramInt2, int paramInt3)
  {
    double d1 = zavt.a(paramWorksheet.getCells(), paramInt1, Math.min(paramInt1 + paramInt3 - 1, paramInt2));
    return d1;
  }
  
  int b(Worksheet paramWorksheet, int paramInt1, int paramInt2, int paramInt3)
  {
    RowCollection localRowCollection = paramWorksheet.getCells().getRows();
    int i1 = zavt.b(paramWorksheet.getCells(), paramInt1, Math.min(paramInt1 + l() - 1, paramInt2));
    return i1;
  }
  
  private int a(Cells paramCells)
  {
    if (this.B > -1) {
      return this.B;
    }
    this.B = 0;
    int i1 = k();
    if (this.f < 0)
    {
      i1 = k() - (m() - 1);
      if (i1 < 0) {
        i1 = 0;
      }
    }
    if (this.f > 0) {
      this.B += zavt.d(paramCells, i1, Math.min(k() + m() - 1, 16383));
    } else {
      this.B += zavt.d(paramCells, i1, Math.min(k(), 16383));
    }
    return this.B;
  }
  
  private int b(Cells paramCells)
  {
    if (this.C > -1) {
      return this.C;
    }
    this.C = 0;
    this.C += zavt.b(paramCells, j(), j() + l() - 1);
    return this.C;
  }
  
  int a(Cells paramCells, Style paramStyle)
    throws Exception
  {
    int i1 = c().getRotationAngle();
    int i2 = 0;
    if ((i1 == 90) || (i1 == -90) || (i1 == 255))
    {
      i2 = b(paramCells);
    }
    else
    {
      i2 = a(paramCells);
      i2 -= (int)zavt.a(this.o.getIndentLevel(), paramStyle.getFont(), 1.0D);
    }
    return i2;
  }
  
  boolean t()
  {
    return this.D;
  }
  
  void b(boolean paramBoolean)
  {
    this.D = paramBoolean;
  }
  
  boolean u()
  {
    return this.h;
  }
  
  void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  boolean v()
  {
    return (c() != null) && (c().getRotationAngle() == 255);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zgw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */