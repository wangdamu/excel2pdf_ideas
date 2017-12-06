package com.aspose.cells;

class zafu
{
  private Style a = null;
  private Style b = null;
  private Style c = null;
  
  zafu(Style paramStyle1, Style paramStyle2, Style paramStyle3)
  {
    this.a = (paramStyle2 == null ? paramStyle1 : paramStyle2);
    this.b = (paramStyle3 == null ? paramStyle1 : paramStyle3);
    this.c = paramStyle1;
  }
  
  boolean a()
  {
    int i = this.a.l() ? this.a.getHorizontalAlignment() : this.c.getHorizontalAlignment();
    int j = this.b.l() ? this.b.getHorizontalAlignment() : this.c.getHorizontalAlignment();
    if ((i == 2) && (j != 2)) {
      return false;
    }
    return (i != 8) && (i != 1);
  }
  
  boolean b()
  {
    if ((!this.a.n()) && (!this.b.n())) {
      return true;
    }
    Style localStyle1 = this.a.n() ? this.a : this.c;
    Style localStyle2 = this.b.n() ? this.b : this.c;
    return (localStyle1.getPattern() == localStyle2.getPattern()) && (localStyle1.b.a(localStyle2.b)) && (localStyle1.a.a(localStyle2.a));
  }
  
  boolean c()
  {
    Style localStyle1 = zagn.d(this.a) ? this.a : this.c;
    Style localStyle2 = zagn.d(this.b) ? this.b : this.c;
    boolean bool1 = zagn.d(localStyle2);
    boolean bool2 = zagn.d(localStyle1);
    if ((!bool2) && (!bool1)) {
      return true;
    }
    if ((c(localStyle1)) && (a(localStyle2)) && (localStyle1.getBorders().getByBorderType(8).getLineStyle() == localStyle2.getBorders().getByBorderType(8).getLineStyle()) && (localStyle1.getBorders().getByBorderType(8).a.a(localStyle2.getBorders().getByBorderType(8).a))) {
      return true;
    }
    if ((d(localStyle1)) && (b(localStyle2)) && (localStyle1.getBorders().getByBorderType(4).getLineStyle() == localStyle2.getBorders().getByBorderType(4).getLineStyle()) && (localStyle1.getBorders().getByBorderType(4).a.a(localStyle2.getBorders().getByBorderType(4).a))) {
      return true;
    }
    return (e(localStyle1)) && (f(localStyle2)) && (localStyle1.getBorders().getByBorderType(4).getLineStyle() == localStyle2.getBorders().getByBorderType(4).getLineStyle()) && (localStyle1.getBorders().getByBorderType(4).a.a(localStyle2.getBorders().getByBorderType(4).a)) && (localStyle1.getBorders().getByBorderType(8).getLineStyle() == localStyle2.getBorders().getByBorderType(8).getLineStyle()) && (localStyle1.getBorders().getByBorderType(8).a.a(localStyle2.getBorders().getByBorderType(8).a));
  }
  
  private boolean a(Style paramStyle)
  {
    return (paramStyle.d() != null) && (paramStyle.getBorders().getByBorderType(4).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(2).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(1).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(8).getLineStyle() != 0) && (paramStyle.getBorders().getByBorderType(16).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(32).getLineStyle() == 0);
  }
  
  private boolean b(Style paramStyle)
  {
    return (paramStyle.d() != null) && (paramStyle.getBorders().getByBorderType(4).getLineStyle() != 0) && (paramStyle.getBorders().getByBorderType(2).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(8).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(1).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(16).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(32).getLineStyle() == 0);
  }
  
  private boolean c(Style paramStyle)
  {
    return (paramStyle.d() != null) && (paramStyle.getBorders().getByBorderType(4).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(2).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(8).getLineStyle() != 0) && (paramStyle.getBorders().getByBorderType(16).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(32).getLineStyle() == 0);
  }
  
  private boolean d(Style paramStyle)
  {
    return (paramStyle.d() != null) && (paramStyle.getBorders().getByBorderType(4).getLineStyle() != 0) && (paramStyle.getBorders().getByBorderType(2).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(8).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(16).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(32).getLineStyle() == 0);
  }
  
  private boolean e(Style paramStyle)
  {
    return (paramStyle.d() != null) && (paramStyle.getBorders().getByBorderType(4).getLineStyle() != 0) && (paramStyle.getBorders().getByBorderType(2).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(8).getLineStyle() != 0) && (paramStyle.getBorders().getByBorderType(16).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(32).getLineStyle() == 0);
  }
  
  private boolean f(Style paramStyle)
  {
    return (paramStyle.d() != null) && (paramStyle.getBorders().getByBorderType(4).getLineStyle() != 0) && (paramStyle.getBorders().getByBorderType(8).getLineStyle() != 0) && (paramStyle.getBorders().getByBorderType(1).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(16).getLineStyle() == 0) && (paramStyle.getBorders().getByBorderType(32).getLineStyle() == 0);
  }
  
  Border d()
  {
    Style localStyle = this.b.m() ? this.b : this.c;
    if (localStyle.d() == null) {
      return null;
    }
    Border localBorder = localStyle.getBorders().getByBorderType(2);
    if (localBorder.getLineStyle() == 0) {
      return null;
    }
    return localBorder;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */