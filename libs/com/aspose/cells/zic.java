package com.aspose.cells;

import com.aspose.cells.a.c.zn;
import com.aspose.cells.b.a.zw;

class zic
  extends zib
{
  private Cells e;
  private int f;
  private int g;
  private Style h;
  private boolean i;
  private double j = -1.0D;
  
  public zic(Cells paramCells, int paramInt1, int paramInt2, Style paramStyle, boolean paramBoolean)
  {
    super(false);
    this.e = paramCells;
    this.f = paramInt1;
    this.g = paramInt2;
    this.h = paramStyle;
    this.i = paramBoolean;
  }
  
  public double c()
  {
    if (this.j < 0.0D)
    {
      Range localRange = this.e.o().a(this.e, this.f, this.g);
      if (localRange == null) {
        this.j = this.e.getColumnWidth(this.g);
      } else {
        this.j = this.e.b.a(localRange.getFirstColumn(), localRange.getFirstColumn() + localRange.getColumnCount() - 1);
      }
    }
    return this.j;
  }
  
  protected int a(String paramString)
  {
    if (this.h.getShrinkToFit()) {
      return 11;
    }
    return super.a(paramString);
  }
  
  protected boolean d()
  {
    if (this.a == null)
    {
      if (this.i) {
        return true;
      }
      Style localStyle1 = this.e.p().p().getDefaultStyle();
      Font localFont1 = localStyle1.getFont();
      Style localStyle2 = this.h;
      Font localFont2 = localStyle2.q();
      if (localFont2 == null)
      {
        localStyle2 = localStyle2.getParentStyle();
        if ((localStyle2 == null) || (localStyle2 == localStyle1)) {
          return true;
        }
        localFont2 = localStyle2.q();
        if (localFont2 == null) {
          return true;
        }
      }
      if ((localFont2.p() == localFont1.p()) && (zw.b(localFont2.getName(), localFont1.getName())))
      {
        if (localFont2.getSize() == localFont1.getSize()) {
          return true;
        }
        this.a = new zsl(localFont1.getName(), localFont1.getSize(), localFont1.p(), zn.a(localFont1.getName(), localFont1.p()));
        e();
        this.b = new zsl(localFont2.getName(), localFont2.getSize(), localFont2.p(), this.a.d());
        f();
        return false;
      }
      this.a = new zsl(localFont1.getName(), localFont1.getSize(), localFont1.p(), true, null);
      e();
      this.b = new zsl(localFont2.getName(), localFont2.getSize(), localFont2.p(), true, null);
      f();
      return false;
    }
    if (this.b == null) {}
    return this.a.a(this.b);
  }
  
  protected void b()
  {
    Font localFont = this.e.p().p().getDefaultStyle().getFont();
    if ((this.b != null) && (this.b.c() == localFont.p()) && (zw.b(this.b.a(), localFont.getName())))
    {
      if (this.b.b() == localFont.getSize())
      {
        this.a = this.b;
        e();
        return;
      }
      if (this.b.d() != null)
      {
        this.a = new zsl(localFont.getName(), localFont.getSize(), localFont.p(), this.b.d());
        e();
        return;
      }
    }
    this.a = new zsl(localFont.getName(), localFont.getSize(), localFont.p(), true, null);
    e();
  }
  
  protected void a()
  {
    if (this.i)
    {
      if (this.a == null) {
        b();
      }
      this.b = this.a;
      f();
      return;
    }
    Style localStyle1 = this.e.p().p().getDefaultStyle();
    Font localFont1 = localStyle1.getFont();
    Style localStyle2 = this.h;
    Font localFont2 = localStyle2.q();
    if (localFont2 == null)
    {
      localStyle2 = localStyle2.getParentStyle();
      if ((localStyle2 == null) || (localStyle2 == localStyle1) || (localStyle2.q() == null))
      {
        if (this.a == null) {
          b();
        }
        this.b = this.a;
        f();
        return;
      }
      localFont2 = localStyle2.q();
    }
    if ((localFont2.p() == localFont1.p()) && (zw.b(localFont2.getName(), localFont1.getName())))
    {
      if (localFont2.getSize() == localFont1.getSize())
      {
        if (this.a == null) {
          b();
        }
        this.b = this.a;
        f();
        return;
      }
      this.a = new zsl(localFont1.getName(), localFont1.getSize(), localFont1.p(), zn.a(localFont1.getName(), localFont1.p()));
      e();
      this.b = new zsl(localFont2.getName(), localFont2.getSize(), localFont2.p(), this.a.d());
      f();
      return;
    }
    if (this.a == null)
    {
      this.a = new zsl(localFont1.getName(), localFont1.getSize(), localFont1.p(), true, null);
      e();
    }
    this.b = new zsl(localFont2.getName(), localFont2.getSize(), localFont2.p(), true, null);
    f();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */