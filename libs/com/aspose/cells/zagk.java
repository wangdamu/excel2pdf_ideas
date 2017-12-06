package com.aspose.cells;

import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.d.zn;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

class zagk
  extends zagj
{
  private StringBuilder c = new StringBuilder();
  private StringBuilder d = new StringBuilder();
  private zage e;
  private boolean f = false;
  private boolean g = false;
  private boolean h = false;
  private boolean i = false;
  HashMap b = new HashMap();
  
  public zagk(zm paramzm, Workbook paramWorkbook, zage paramzage, String paramString)
    throws Exception
  {
    this.e = paramzage;
    this.e.n();
    this.e.f = this.b;
    a(paramWorkbook);
    a(new zn(paramzm, paramzage.b.getEncoding()));
    this.e.d(paramString);
  }
  
  public zagk(zm paramzm, Workbook paramWorkbook, HTMLLoadOptions paramHTMLLoadOptions)
    throws Exception
  {
    a(paramWorkbook);
    this.e = new zage(paramzm, paramWorkbook, paramHTMLLoadOptions);
    this.e.f = this.b;
    a(new zn(paramzm, paramHTMLLoadOptions.getEncoding()));
  }
  
  public void a(zage paramzage, Workbook paramWorkbook, Encoding paramEncoding)
    throws Exception
  {
    ArrayList localArrayList = paramzage.o();
    HashMap localHashMap = paramzage.l();
    zc localzc = zg.a(localHashMap);
    while (localzc.c())
    {
      String str = null;
      Object localObject = null;
      String[] arrayOfString1 = { str };
      String[] arrayOfString2 = { localObject };
      a((String)localzc.a(), arrayOfString1, arrayOfString2);
      str = arrayOfString1[0];
      localObject = arrayOfString2[0];
      paramzage.m().a(paramzage.m().ac().get(str));
      zm localzm = (zm)localzc.b();
      zagk localzagk = new zagk(localzm, paramWorkbook, paramzage, (String)localzc.a());
      localzagk.b = this.b;
      localzagk.l();
      localzagk.p().m().V();
      localzm.a();
    }
  }
  
  private void a(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    paramArrayOfString1[0] = (paramArrayOfString2[0] = null);
    String[] arrayOfString = zw.d(paramString, '\b');
    paramArrayOfString1[0] = arrayOfString[0];
    paramArrayOfString2[0] = arrayOfString[1];
  }
  
  public void l()
    throws Exception
  {
    s();
    int j = 32;
    b(g());
    while (!f()) {
      if (k() == '<')
      {
        char c1 = g();
        if ((c1 == '!') && ((j = g()) == '-') && (g() == '-'))
        {
          u();
          m();
        }
        else if ((c1 == '!') && (j == 91))
        {
          v();
        }
        else
        {
          c(c1);
          o();
        }
      }
      else if (this.f)
      {
        t();
        if (!this.g) {
          n();
        }
      }
      else
      {
        b(g());
      }
    }
    q();
  }
  
  private void q()
    throws Exception
  {
    this.e.s();
  }
  
  public void m()
    throws Exception
  {
    this.e.b(zs.a(this.c));
  }
  
  public void n()
    throws Exception
  {
    if (this.d.length() > 0) {
      this.e.a(zs.a(this.d));
    }
  }
  
  public void o()
    throws Exception
  {
    r();
    if (zs.a(j()).startsWith("/")) {
      this.e.b(zs.a(j()).toLowerCase(), d());
    } else {
      this.e.a(zs.a(j()).toLowerCase(), d());
    }
  }
  
  private void r()
    throws Exception
  {
    this.f = true;
    if ("script".equals(zs.a(j()).toLowerCase())) {
      this.g = true;
    }
    if ("/script".equals(zs.a(j()).toLowerCase())) {
      this.g = false;
    }
    if ((!this.h) && ("table".equals(zs.a(j()).toLowerCase())))
    {
      this.e.m().G();
      this.h = true;
    }
    if ((this.h) && ("/table".equals(zs.a(j()).toLowerCase()))) {
      this.h = false;
    }
    if ((!this.i) && ("head".equals(zs.a(j()).toLowerCase()))) {
      this.i = true;
    }
    if ((this.i) && ("/head".equals(zs.a(j()).toLowerCase()))) {
      this.i = false;
    }
    if ((this.i) && ("xml".equals(zs.a(j()).toLowerCase())))
    {
      this.c.delete(0, 0 + this.c.length());
      this.c.append("<xml>");
      while (!f())
      {
        char c1 = g();
        if (c1 == '<')
        {
          this.c.append(c1);
          c1 = g();
          if (c1 == '/')
          {
            this.c.append(c1);
            c1 = g();
            char c2 = g();
            char c3 = g();
            if ((c1 == 'x') && (c2 == 'm') && (c3 == 'l'))
            {
              this.c.delete(this.c.length() - 1, this.c.length() - 1 + 1);
              this.c.append("/xml><![endif]");
              break;
            }
            this.c.append(c1);
            this.c.append(c2);
            this.c.append(c3);
            c1 = g();
          }
        }
        this.c.append(c1);
      }
      m();
      b(g());
    }
  }
  
  public zage p()
  {
    return this.e;
  }
  
  private void s()
  {
    this.e.k();
  }
  
  private void t()
    throws Exception
  {
    char c1 = g();
    if ((c1 == '\r') || (c1 == '\n') || (c1 == '<'))
    {
      b(c1);
      this.d.delete(0, 0 + this.d.length());
      return;
    }
    this.d.delete(0, 0 + this.d.length());
    this.d.append(c1);
    while (!f())
    {
      c1 = g();
      if (c1 == '<')
      {
        b(c1);
        break;
      }
      this.d.append(c1);
    }
  }
  
  private void c(char paramChar)
    throws Exception
  {
    j().delete(0, 0 + j().length());
    c();
    j().append(paramChar);
    while (!f())
    {
      char c1 = g();
      if (c1 == '>')
      {
        b(c1);
        return;
      }
      if (a(c1)) {
        break;
      }
      j().append(c1);
    }
    b(e());
    while (k() != '>')
    {
      String str1 = h();
      if (k() == '>')
      {
        a(str1, "");
        break;
      }
      String str2 = i();
      a(str1, str2);
    }
  }
  
  private void u()
    throws Exception
  {
    this.c.delete(0, 0 + this.c.length());
    while (!f())
    {
      char c1 = g();
      if (c1 == '-')
      {
        this.c.append(c1);
        c1 = g();
        if (c1 == '-')
        {
          c1 = g();
          if (c1 == '>')
          {
            this.c.delete(this.c.length() - 1, this.c.length() - 1 + 1);
            break;
          }
        }
      }
      else if ((c1 == '>') && (zs.a(this.c).endsWith("--")))
      {
        this.c.delete(this.c.length() - 2, this.c.length() - 2 + 2);
        break;
      }
      this.c.append(c1);
    }
    b(g());
  }
  
  private void v()
    throws Exception
  {
    this.c.delete(0, 0 + this.c.length());
    int j = 32;
    while (!f())
    {
      char c1 = g();
      if ((c1 == ']') && (((j = g()) == '>') || ((j == 93) && (g() == '>')))) {
        break;
      }
      this.c.append(c1);
    }
    b(g());
  }
  
  private void a(Workbook paramWorkbook)
  {
    for (int j = 0; j < paramWorkbook.getWorksheets().getCount(); j++) {
      paramWorkbook.getWorksheets().get(j).setGridlinesVisible(false);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zagk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */