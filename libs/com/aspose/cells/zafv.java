package com.aspose.cells;

import java.util.ArrayList;
import java.util.HashMap;

class zafv
{
  Cell a;
  int b = 0;
  int c = 1;
  int d = 1;
  boolean e = true;
  int f = -1;
  Style g = null;
  Hyperlink h = null;
  boolean i = false;
  HashMap j;
  boolean k = false;
  boolean l = false;
  boolean m = false;
  int n = -1;
  ArrayList o = null;
  Border p = null;
  Border q = null;
  private zafq s = null;
  private zaft t = null;
  private int u = -1;
  private double v = -1.0D;
  String r = null;
  
  zafv(zafq paramzafq)
  {
    this.s = paramzafq;
    this.t = paramzafq.e();
  }
  
  boolean a()
  {
    return (this.b == 0) || (this.o != null) || (this.d > 1);
  }
  
  boolean b()
  {
    if (this.g == null) {
      return true;
    }
    String str = this.g.t();
    return (this.g.r() <= 0) && ((str == null) || (str.length() == 0));
  }
  
  boolean c()
  {
    return (this.h != null) || (this.r != null);
  }
  
  double d()
  {
    if (this.v < 0.0D)
    {
      this.v = 0.0D;
      int i1 = this.s.d() + this.d;
      for (int i2 = this.s.d(); i2 < i1; i2++) {
        this.v += this.t.b().getCells().getRowHeight(i2);
      }
      if (this.a != null)
      {
        BorderCollection localBorderCollection = this.a.getStyle().getBorders();
        int i3 = localBorderCollection.getByBorderType(4).getLineStyle();
        int i4 = localBorderCollection.getByBorderType(8).getLineStyle();
        int i5 = zagn.g(i3) + zagn.g(i4);
        this.v -= zagn.b(96, i5);
      }
    }
    return this.v;
  }
  
  int e()
  {
    if (this.u < 0) {
      this.u = this.t.a(this.b, this.b + this.c);
    }
    return this.u;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */