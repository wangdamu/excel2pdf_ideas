package com.aspose.cells;

import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zw;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zarn
{
  private zasg a;
  private zcjy b;
  private static final za c = new za(new String[] { "page-layout", "style", "name", "page-layout-properties", "header-style", "footer-style", "page-width", "page-height", "num-format", "print-orientation", "margin-top", "margin-bottom", "margin-left", "margin-right", "first-page-number", "scale-to", "scale-to-X", "scale-to-Y", "table-centering", "writing-mode", "print", "print-page-order", "both", "horizontal", "vertical", "annotations", "charts", "drawings", "objects", "headers", "grid", "header-footer-properties", "min-height", "family", "text-properties", "font-name", "font-weight", "font-style", "text-line-through-style", "font-size", "color", "text-underline-style", "text-underline-type", "text-position" });
  
  zarn(zasg paramzasg)
  {
    this.a = paramzasg;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    this.b = paramzcjy;
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (zauz.a(paramzcjy)) {
      switch (c.a(paramzcjy.q().toLowerCase()))
      {
      case 0: 
        a();
        break;
      case 1: 
        b();
        break;
      default: 
        paramzcjy.a();
      }
    }
  }
  
  private void a()
    throws Exception
  {
    zask localzask = new zask();
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (c.a(this.b.q()))
        {
        case 2: 
          localzask.a = this.b.t();
        }
      }
      this.b.l();
    }
    if (localzask.a == null)
    {
      this.b.a();
      return;
    }
    this.a.o.a.put(localzask.a, localzask);
    this.b.d();
    while (zauz.a(this.b)) {
      switch (c.a(this.b.q().toLowerCase()))
      {
      case 3: 
        a(localzask);
        break;
      case 4: 
        a(localzask, true);
        break;
      case 5: 
        a(localzask, false);
        break;
      default: 
        this.b.a();
      }
    }
  }
  
  private void a(zask paramzask)
    throws Exception
  {
    int i = 0;
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (c.a(this.b.q()))
        {
        case 6: 
          i = 1;
          paramzask.c = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          break;
        case 7: 
          i = 1;
          paramzask.d = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          break;
        case 8: 
          paramzask.e = zp.a(this.b.t());
          break;
        case 9: 
          paramzask.f = ("portrait".equals(this.b.t().toLowerCase()) ? 1 : 0);
          break;
        case 10: 
          paramzask.g = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          break;
        case 11: 
          paramzask.i = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          break;
        case 12: 
          paramzask.h = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          break;
        case 13: 
          paramzask.j = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          break;
        case 14: 
          if (zarb.b(this.b.t()))
          {
            paramzask.o = zp.a(this.b.t());
            paramzask.p = false;
          }
          else
          {
            paramzask.p = true;
          }
          break;
        case 15: 
          paramzask.q = true;
          String str1 = this.b.t();
          if (str1.endsWith("%")) {
            str1 = str1.substring(0, 0 + (str1.length() - 1));
          }
          paramzask.r = zasp.k(str1);
          break;
        case 16: 
          paramzask.q = false;
          paramzask.t = zp.a(this.b.t());
          break;
        case 17: 
          paramzask.q = false;
          paramzask.s = zp.a(this.b.t());
          break;
        case 18: 
          switch (c.a(this.b.t()))
          {
          case 22: 
            paramzask.u = true;
            paramzask.v = true;
            break;
          case 23: 
            paramzask.u = true;
            break;
          case 24: 
            paramzask.v = true;
          }
          break;
        case 19: 
          break;
        case 20: 
          String str2 = this.b.t();
          String[] arrayOfString = zw.d(str2, ' ');
          for (int j = 0; j < arrayOfString.length; j++) {
            switch (c.a(arrayOfString[j]))
            {
            case 25: 
              paramzask.A = true;
              break;
            case 26: 
            case 27: 
            case 28: 
              paramzask.z = false;
              break;
            case 29: 
              paramzask.x = true;
              break;
            case 30: 
              paramzask.y = true;
            }
          }
          break;
        case 21: 
          paramzask.w = ("ltr".equals(this.b.t()) ? 1 : 0);
        }
      }
      this.b.l();
    }
    if (i != 0) {
      paramzask.a();
    }
    this.b.a();
  }
  
  private void a(zask paramzask, boolean paramBoolean)
    throws Exception
  {
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    this.b.d();
    while (zauz.a(this.b)) {
      switch (c.a(this.b.q()))
      {
      case 31: 
        b(paramzask, paramBoolean);
        break;
      default: 
        this.b.a();
      }
    }
  }
  
  private void b(zask paramzask, boolean paramBoolean)
    throws Exception
  {
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (c.a(this.b.q()))
        {
        case 32: 
          if (paramBoolean) {
            paramzask.k = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          } else {
            paramzask.l = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          }
          break;
        case 11: 
          if (paramBoolean) {
            paramzask.m = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          }
          break;
        case 10: 
          if (!paramBoolean) {
            paramzask.n = (zasp.d(this.a.a, this.b.t()) / 72.0D);
          }
          break;
        }
      }
      this.b.l();
    }
    this.b.a();
  }
  
  private void b()
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    if (this.b.n())
    {
      while (this.b.m()) {
        switch (c.a(this.b.q()))
        {
        case 2: 
          str2 = this.b.t();
          break;
        case 33: 
          str1 = this.b.t();
        }
      }
      this.b.l();
    }
    if ((str1 == null) || (!"text".equals(str1)) || (this.b.o())) {
      return;
    }
    Font localFont = new Font(this.a.b.getWorksheets(), null, false);
    this.a.o.b.put(str2, localFont);
    this.b.d();
    while (zauz.a(this.b)) {
      switch (c.a(this.b.q()))
      {
      case 34: 
        a(localFont);
        break;
      default: 
        this.b.a();
      }
    }
  }
  
  private void a(Font paramFont)
    throws Exception
  {
    if (this.b.n())
    {
      String str1 = null;
      String str2 = null;
      while (this.b.m())
      {
        switch (c.a(this.b.q().toLowerCase()))
        {
        case 35: 
          if (this.a.q.get(this.b.t()) != null) {
            paramFont.a((String)this.a.q.get(this.b.t()), false, 0);
          } else {
            paramFont.a(this.b.t(), false, 0);
          }
          break;
        case 36: 
          paramFont.setBold("bold".equals(this.b.t().toLowerCase()));
          break;
        case 37: 
          paramFont.setItalic("italic".equals(this.b.t().toLowerCase()));
          break;
        case 38: 
          paramFont.setStrikeout("solid".equals(this.b.t().toLowerCase()));
          break;
        case 39: 
          paramFont.setDoubleSize(zasp.d(this.a.a, this.b.t()));
          break;
        case 40: 
          paramFont.setColor(zasp.h(this.b.t()));
          break;
        case 41: 
          str1 = this.b.t();
          break;
        case 42: 
          str2 = this.b.t();
          break;
        case 43: 
          int i = this.b.t().indexOf(' ');
          if ((i != -1) && (!this.b.t().equals("0% 100%")))
          {
            String[] arrayOfString = zw.d(this.b.t(), ' ');
            if (arrayOfString.length >= 2)
            {
              int j = arrayOfString[0].charAt(0) == '-' ? 1 : 0;
              if (j != 0) {
                paramFont.setSubscript(true);
              } else {
                paramFont.setSuperscript(true);
              }
            }
          }
          break;
        }
        if ((str1 != null) && ("solid".equals(str1)))
        {
          paramFont.setUnderline(1);
          if ("double".equals(str1)) {
            paramFont.setUnderline(2);
          }
        }
      }
      this.b.l();
    }
    this.b.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zarn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */