package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zato
{
  private zasg a;
  private zcjy b;
  private static final za c = new za(new String[] { "font-face-decls", "styles", "automatic-styles", "master-styles", "font-face", "name", "font-family" });
  
  zato(zasg paramzasg)
  {
    this.a = paramzasg;
  }
  
  void a(zi paramzi)
    throws Exception
  {
    this.b = zauy.a(paramzi, "styles.xml", false);
    if (this.b.o())
    {
      this.b.a();
      return;
    }
    this.b.d();
    if (!zauz.a(this.b)) {
      return;
    }
    this.b.d();
    while (zauz.a(this.b)) {
      switch (c.a(this.b.q().toLowerCase()))
      {
      case 0: 
        a();
        break;
      case 1: 
        zatm localzatm = new zatm(this.a, true);
        localzatm.c(this.b);
        break;
      case 2: 
        zarn localzarn = new zarn(this.a);
        localzarn.a(this.b);
        break;
      case 3: 
        zass localzass = new zass(this.a);
        localzass.a(this.b);
        break;
      default: 
        this.b.a();
      }
    }
  }
  
  private void a()
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
      case 4: 
        b();
        break;
      default: 
        this.b.a();
      }
    }
  }
  
  private void b()
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    if (this.b.n()) {
      while (this.b.m()) {
        switch (c.a(this.b.q()))
        {
        case 5: 
          str1 = this.b.t();
          break;
        case 6: 
          str2 = this.b.t();
        }
      }
    }
    if (str1 != null)
    {
      if ((str2.length() >= 2) && (str2.charAt(0) == '\'') && (str2.charAt(str2.length() - 1) == '\'')) {
        str2 = str2.substring(1, 1 + (str2.length() - 2));
      }
      if (this.a.q.get(str1) == null) {
        this.a.q.put(str1, str2);
      }
    }
    this.b.a();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zato.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */