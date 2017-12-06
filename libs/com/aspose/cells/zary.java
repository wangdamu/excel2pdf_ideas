package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zary
{
  String a;
  zasf b;
  private String h;
  private String i;
  Style c;
  boolean d;
  boolean e;
  boolean f;
  boolean g;
  private static final za j = new za(new String[] { "Normal" });
  
  zary(Style paramStyle, int paramInt)
  {
    Style localStyle1 = null;
    int k = 0;
    if (paramStyle.getName() != null)
    {
      this.h = paramStyle.getName();
      switch (j.a(this.h))
      {
      case 0: 
        this.h = "Default";
        k = 1;
      }
    }
    else
    {
      this.h = ("ce" + zasp.a(paramInt));
      if ((paramStyle.h() >= 0) && (paramStyle.h() >= 0) && (paramStyle.h() < paramStyle.e().C().b()))
      {
        localStyle1 = paramStyle.e().C().a(paramStyle.h());
        switch (j.a(localStyle1.getName()))
        {
        case 0: 
          a("Default");
          break;
        default: 
          a(localStyle1.getName());
        }
      }
    }
    Style localStyle2 = paramStyle.e().Q();
    if (paramStyle.k())
    {
      this.b = new zasf(paramStyle.getFont());
    }
    else if ((localStyle1 != null) && (paramStyle.q() != null))
    {
      Font localFont = localStyle1.k() ? localStyle1.getFont() : paramStyle.e().T();
      if ((paramStyle.getFont().m() != 0) && (!paramStyle.getFont().a(localFont, paramStyle.e().p(), paramStyle.e().p()))) {
        this.b = new zasf(paramStyle.getFont());
      }
    }
    this.c = paramStyle;
    int m = 0;
    Object localObject = null;
    int[] arrayOfInt = { m };
    String[] arrayOfString = { localObject };
    paramStyle.a(arrayOfInt, arrayOfString);
    m = arrayOfInt[0];
    localObject = arrayOfString[0];
    if (paramStyle.j()) {
      this.a = ("N" + m);
    } else if ((localStyle1 != null) && (m != localStyle1.getNumber())) {
      this.a = ("N" + m);
    }
    if (k != 0)
    {
      this.g = true;
      this.f = true;
      this.e = true;
      this.d = true;
    }
    else
    {
      this.g = this.c.l();
      Style localStyle3;
      if ((!this.g) && (localStyle1 != null))
      {
        localStyle3 = localStyle1.l() ? localStyle1 : localStyle2;
        if ((paramStyle.getHorizontalAlignment() != localStyle3.getHorizontalAlignment()) || (paramStyle.getIndentLevel() != localStyle3.getIndentLevel()) || (paramStyle.getVerticalAlignment() != localStyle3.getVerticalAlignment()) || (paramStyle.isTextWrapped() != localStyle3.isTextWrapped()) || (paramStyle.getShrinkToFit() != localStyle3.getShrinkToFit()) || (paramStyle.getRotationAngle() != localStyle3.getRotationAngle()) || (paramStyle.getTextDirection() != localStyle3.getTextDirection())) {
          this.g = true;
        }
      }
      this.f = this.c.m();
      if ((!this.f) && (localStyle1 != null) && (!localStyle1.m()) && (paramStyle.f())) {
        this.f = true;
      }
      this.e = this.c.o();
      if ((!this.e) && (localStyle1 != null))
      {
        localStyle3 = localStyle1.o() ? localStyle1 : localStyle2;
        if ((paramStyle.isLocked() != localStyle3.isLocked()) || (paramStyle.isFormulaHidden() != localStyle3.isFormulaHidden())) {
          this.e = true;
        }
      }
      this.d = this.c.n();
      if ((!this.d) && (localStyle1 != null))
      {
        localStyle3 = localStyle1.n() ? localStyle1 : localStyle2;
        if (paramStyle.getPattern() != localStyle3.getPattern()) {
          this.d = true;
        }
      }
    }
  }
  
  String a()
  {
    return this.h;
  }
  
  String b()
  {
    return this.i;
  }
  
  void a(String paramString)
  {
    this.i = paramString;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zary.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */