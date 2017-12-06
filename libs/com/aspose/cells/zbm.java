package com.aspose.cells;

import java.util.ArrayList;

class zbm
{
  int a;
  int b;
  int c;
  int d = -1;
  int e;
  Chart f;
  
  zbm(Chart paramChart, int paramInt, boolean paramBoolean)
  {
    this(paramChart, paramInt, paramBoolean, 1);
  }
  
  zbm(Chart paramChart, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    this.f = paramChart;
    this.c = paramInt2;
    if (paramBoolean) {
      a(paramInt1);
    }
  }
  
  void a(int paramInt)
  {
    this.a = ((int)(this.f.getChartObject().getWidth() * 20 * 72.0F / zbxp.a() + 0.5D - 135.0D));
    this.b = ((int)(this.f.getChartObject().getHeight() * 20 * 72.0F / zbxp.a() + 0.5D - 135.0D));
    if (((this.b & 0xFFFF) > 32767) || ((this.a & 0xFFFF) > 32767))
    {
      this.a = 0;
      this.b = 0;
    }
    this.e = (paramInt * 20);
  }
  
  void a(zbm paramzbm)
  {
    this.a = paramzbm.a;
    this.b = paramzbm.b;
    this.c = paramzbm.c;
    this.d = paramzbm.d;
    this.e = paramzbm.e;
  }
  
  boolean a(zbm paramzbm, Font paramFont)
  {
    if (this.d == -1) {
      return false;
    }
    if ((this.a == paramzbm.a) && (this.b == paramzbm.b) && (this.c == paramzbm.c)) {
      return a().a(paramFont);
    }
    return false;
  }
  
  Font a()
  {
    if (this.d != -1) {
      return (Font)this.f.n().A().get(this.d > 4 ? this.d - 1 : this.d);
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */