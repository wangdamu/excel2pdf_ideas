package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;

class zatu
{
  private Workbook a;
  private zasg b;
  private zcjy c;
  private boolean d;
  private zats e;
  private zarq f;
  private static final za g = new za(new String[] { "automatic-styles", "font-face-decls", "body", "font-face", "name", "font-family", "spreadsheet", "table", "named-expressions", "database-ranges", "content-validations", "named-expression", "named-range", "expression", "cell-range-address" });
  
  zatu(Workbook paramWorkbook, zasg paramzasg, boolean paramBoolean)
  {
    this.a = paramWorkbook;
    this.b = paramzasg;
    this.d = paramBoolean;
  }
  
  void a()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    if (!zauz.a(this.c)) {
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (g.a(this.c.q().toLowerCase()))
      {
      case 0: 
        if (this.d)
        {
          this.c.a();
        }
        else
        {
          zatm localzatm = new zatm(this.b, false);
          localzatm.a(this.c);
        }
        break;
      default: 
        this.c.a();
      }
    }
    this.e = null;
  }
  
  void a(zi paramzi)
    throws Exception
  {
    this.c = zauy.a(paramzi, "content.xml", false);
    a();
    this.c = zauy.a(paramzi, "content.xml", false);
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    if (!zauz.a(this.c)) {
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (g.a(this.c.q().toLowerCase()))
      {
      case 1: 
        if (this.d) {
          this.c.a();
        } else {
          b();
        }
        break;
      case 0: 
        if (this.d)
        {
          this.c.a();
        }
        else
        {
          zatm localzatm = new zatm(this.b, false);
          localzatm.b(this.c);
        }
        break;
      case 2: 
        d();
        break;
      default: 
        this.c.a();
      }
    }
    this.e = null;
  }
  
  private void b()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (g.a(this.c.q()))
      {
      case 3: 
        c();
        break;
      default: 
        this.c.a();
      }
    }
  }
  
  private void c()
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (g.a(this.c.q()))
        {
        case 4: 
          str1 = this.c.t();
          break;
        case 5: 
          str2 = this.c.t();
        }
      }
      this.c.l();
    }
    if ((str1 != null) && (this.b.q.get(str1) == null)) {
      this.b.q.put(str1, str2);
    }
    this.c.a();
  }
  
  private void d()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (g.a(this.c.q().toLowerCase()))
      {
      case 6: 
        e();
        break;
      default: 
        this.c.a();
      }
    }
  }
  
  private void e()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    int i = 0;
    this.b.c.put(this.b.p, Integer.valueOf(15));
    this.c.d();
    while (zauz.a(this.c)) {
      switch (g.a(this.c.q().toLowerCase()))
      {
      case 7: 
        if (this.d)
        {
          if (this.f == null) {
            this.f = new zarq(this.b);
          }
          zash localzash = (zash)this.b.n.get(i++);
          this.f.a(this.c, localzash);
          a(localzash);
        }
        else
        {
          if (this.e == null) {
            this.e = new zats(this.b);
          }
          this.e.a(this.c);
        }
        break;
      case 8: 
        if (!this.d) {
          h();
        } else {
          this.c.a();
        }
        break;
      case 9: 
        f();
        break;
      case 10: 
        g();
        break;
      default: 
        this.c.a();
      }
    }
  }
  
  private void f()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c))
    {
      if ("database-range".equals(this.c.q().toLowerCase()))
      {
        String str1 = this.c.a("target-range-address");
        if (str1 != null)
        {
          int i = str1.indexOf('.');
          String str2 = str1.substring(0, 0 + i);
          Worksheet localWorksheet = this.a.getWorksheets().get(str2);
          if (localWorksheet != null)
          {
            int j = str1.indexOf(':');
            int k = str1.indexOf('.', i + 1);
            String str3 = null;
            if ((j == -1) || (k == -1)) {
              str3 = str1.substring(i + 1);
            } else {
              str3 = str1.substring(i + 1, i + 1 + (j - i)) + str1.substring(k + 1);
            }
            localWorksheet.getAutoFilter().setRange(str3);
          }
        }
      }
      this.c.a();
    }
  }
  
  private void a(zash paramzash)
    throws Exception
  {
    if (paramzash.g.size() > 0) {
      this.f.a.a(paramzash);
    }
  }
  
  private void g()
    throws Exception
  {
    this.c.a();
  }
  
  private void h()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (g.a(this.c.q().toLowerCase()))
      {
      case 11: 
      case 12: 
        i();
        break;
      default: 
        this.c.a();
      }
    }
  }
  
  private void i()
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    String str3 = null;
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (g.a(this.c.q()))
        {
        case 4: 
          str1 = this.c.t();
          break;
        case 13: 
          str2 = this.c.t();
          break;
        case 14: 
          str3 = this.c.t();
        }
      }
      this.c.l();
    }
    this.c.a();
    if (str1 == null) {
      return;
    }
    if (str1.startsWith("Excel_BuiltIn")) {
      return;
    }
    Name localName;
    if ((str2 != null) && (!"".equals(str2)))
    {
      localName = new Name(this.a.getWorksheets(), str1);
      localName.setRefersTo(zarq.a(str2, null));
      this.a.getWorksheets().getNames().a(localName, true);
    }
    else if ((str3 != null) && (!"".equals(str3)))
    {
      localName = new Name(this.a.getWorksheets(), str1);
      if (str3.indexOf("$#REF!$#REF!") != -1)
      {
        localName.setRefersTo("=#REF!");
      }
      else
      {
        String str4 = zasp.f(str3);
        localName.setRefersTo('=' + str4);
      }
      this.a.getWorksheets().getNames().a(localName, true);
    }
    else {}
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */