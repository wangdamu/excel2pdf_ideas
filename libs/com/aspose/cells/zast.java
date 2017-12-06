package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import java.util.ArrayList;

class zast
{
  private zcjz a;
  private zasb b;
  
  public zast(zasb paramzasb)
  {
    this.b = paramzasb;
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    this.a = paramzcjz;
    paramzcjz.b("office:master-styles");
    for (int i = 0; i < this.b.g.size(); i++)
    {
      zasc localzasc = (zasc)this.b.g.get(i);
      a(localzasc);
    }
    paramzcjz.b();
  }
  
  private void a(zasc paramzasc)
    throws Exception
  {
    this.a.b("style:master-page");
    this.a.a("style", "name", null, "PageStyle_5f_" + paramzasc.l);
    this.a.a("style", "display-name", null, "PageStyle_" + paramzasc.l);
    this.a.a("style", "page-layout-name", null, "pm" + (paramzasc.i.getIndex() + 1));
    b(paramzasc);
    c(paramzasc);
    this.a.b();
  }
  
  private void b(zasc paramzasc)
    throws Exception
  {
    if (paramzasc.s != null)
    {
      this.a.b("style:header");
      a("style:region-left", paramzasc.s[0]);
      a("style:region-center", paramzasc.s[1]);
      a("style:region-right", paramzasc.s[2]);
      this.a.b();
      this.a.b("style:header-left");
      if (paramzasc.p)
      {
        a("style:region-left", paramzasc.q[0]);
        a("style:region-center", paramzasc.q[1]);
        a("style:region-right", paramzasc.q[2]);
      }
      else
      {
        this.a.a("style", "display", null, "false");
      }
      this.a.b();
    }
    else
    {
      this.a.b("style:header");
      this.a.a("style", "display", null, "false");
      this.a.b();
      this.a.b("style:header-left");
      this.a.a("style", "display", null, "false");
      this.a.b();
    }
  }
  
  private void c(zasc paramzasc)
    throws Exception
  {
    if (paramzasc.t != null)
    {
      this.a.b("style:footer");
      a("style:region-left", paramzasc.t[0]);
      a("style:region-center", paramzasc.t[1]);
      a("style:region-right", paramzasc.t[2]);
      this.a.b();
      this.a.b("style:footer-left");
      if (paramzasc.p)
      {
        a("style:region-left", paramzasc.r[0]);
        a("style:region-center", paramzasc.r[1]);
        a("style:region-right", paramzasc.r[2]);
      }
      else
      {
        this.a.a("style", "display", null, "false");
      }
      this.a.b();
    }
    else
    {
      this.a.b("style:footer");
      this.a.a("style", "display", null, "false");
      this.a.b();
      this.a.b("style:footer-left");
      this.a.a("style", "display", null, "false");
      this.a.b();
    }
  }
  
  private void a(String paramString, ArrayList paramArrayList)
    throws Exception
  {
    if ((paramArrayList == null) || (paramArrayList.size() == 0)) {
      return;
    }
    this.a.b(paramString);
    this.a.b("text:p");
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      HeaderFooterCommand localHeaderFooterCommand1 = (HeaderFooterCommand)paramArrayList.get(i);
      if ((i != 0) && (localHeaderFooterCommand1.getType() == 6))
      {
        HeaderFooterCommand localHeaderFooterCommand2 = (HeaderFooterCommand)paramArrayList.get(i - 1);
        if (localHeaderFooterCommand2.getType() == 7) {}
      }
      else
      {
        a(localHeaderFooterCommand1);
      }
    }
    this.a.b();
    this.a.b();
  }
  
  private void a(HeaderFooterCommand paramHeaderFooterCommand)
    throws Exception
  {
    this.a.b("text:span");
    this.a.a("text", "style-name", null, "T" + paramHeaderFooterCommand.getFont().m());
    switch (paramHeaderFooterCommand.getType())
    {
    case 0: 
      String str = paramHeaderFooterCommand.getText();
      String[] arrayOfString = zw.d(str, '\n');
      if (arrayOfString.length == 1)
      {
        this.a.a(paramHeaderFooterCommand.getText());
      }
      else
      {
        this.a.a(arrayOfString[0]);
        this.a.b();
        this.a.b();
        for (int i = 1; i < arrayOfString.length; i++)
        {
          this.a.b("text:p");
          this.a.b("text:span");
          this.a.a("text", "style-name", null, "T" + paramHeaderFooterCommand.getFont().m());
          this.a.a(arrayOfString[i]);
          if (i < arrayOfString.length - 1)
          {
            this.a.b();
            this.a.b();
          }
        }
      }
      break;
    case 1: 
      this.a.b("text:page-number");
      this.a.a("1");
      this.a.b();
      break;
    case 2: 
      this.a.b("text:page-count");
      this.a.a("99");
      this.a.b();
      break;
    case 3: 
      DateTime localDateTime1 = DateTime.getNow();
      this.a.b("text:date");
      this.a.a("style", "date-value", null, localDateTime1.b("yyyy-MM-dd"));
      this.a.a(localDateTime1.b("MM/d/yy"));
      this.a.b();
      break;
    case 4: 
      DateTime localDateTime2 = DateTime.getNow();
      this.a.b("text:time");
      this.a.a(localDateTime2.b("hh:mm:ss"));
      this.a.b();
      break;
    case 7: 
      this.a.b("text:file-name");
      this.a.a("text", "display", null, "full");
      this.a.a("???");
      this.a.b();
      break;
    case 6: 
      this.a.b("text:file-name");
      this.a.a("text", "display", null, "name-and-extension");
      this.a.a("???");
      this.a.b();
      break;
    case 5: 
      this.a.b("text:sheet-name");
      this.a.a("???");
      this.a.b();
    }
    this.a.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zast.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */