package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

class zakg
{
  private zqh a = null;
  private zqi b;
  private zava c;
  private ArrayList d;
  
  zakg(zqh paramzqh, zqi paramzqi)
  {
    this.a = paramzqh;
    this.b = paramzqi;
    this.c = this.a.a.getWorksheets().o();
    this.d = new ArrayList();
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    f(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() != 1) || (paramzcjy.o())) {
        paramzcjy.a();
      } else if ("commentList".equals(paramzcjy.q())) {
        c(paramzcjy);
      } else if ("authors".equals(paramzcjy.q())) {
        b(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
  }
  
  private void b(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() != 1) || (paramzcjy.o())) {
        paramzcjy.a();
      } else if ("author".equals(paramzcjy.q())) {
        zf.a(this.d, paramzcjy.j());
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void c(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() != 1) || (paramzcjy.o())) {
        paramzcjy.a();
      } else if ("comment".equals(paramzcjy.q())) {
        d(paramzcjy);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void d(zcjy paramzcjy)
    throws Exception
  {
    String str = paramzcjy.a("ref");
    if ((str == null) || (str.length() == 0)) {
      throw new CellsException(6, "Invalid comment element");
    }
    int i = zauj.F(paramzcjy.a("authorId"));
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    int j = this.b.d.getComments().a(str);
    Comment localComment = this.b.d.getComments().get(j);
    if ((i < this.d.size()) && (i >= 0)) {
      localComment.setAuthor((String)this.d.get(i));
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() != 1) || (paramzcjy.o())) {
        paramzcjy.a();
      } else if ("text".equals(paramzcjy.q())) {
        a(paramzcjy, localComment);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
  }
  
  private void a(zcjy paramzcjy, Comment paramComment)
    throws Exception
  {
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return;
    }
    ArrayList localArrayList = new ArrayList();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() != 1) || (paramzcjy.o()))
      {
        paramzcjy.a();
      }
      else if ("r".equals(paramzcjy.q()))
      {
        localObject = e(paramzcjy);
        zf.a(localArrayList, localObject);
      }
      else if ("t".equals(paramzcjy.q()))
      {
        localObject = new zrn();
        String str = paramzcjy.a("space", null);
        paramzcjy.c("preserve".equals(str));
        ((zrn)localObject).b = paramzcjy.j();
        paramzcjy.c(false);
        zf.a(localArrayList, localObject);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    Object localObject = new StringBuilder();
    int i = 0;
    for (int j = 0; j < localArrayList.size(); j++)
    {
      zrn localzrn = (zrn)localArrayList.get(j);
      if (localzrn.b != null)
      {
        int k = localzrn.b.length();
        FontSetting localFontSetting = paramComment.b().b(i, k);
        Font localFont = null;
        if (localzrn.a != null)
        {
          localFont = new Font(this.b.d.c(), null, true);
          localzrn.a.a(localFont);
          localFontSetting.a(localFont);
        }
        i += k;
        ((StringBuilder)localObject).append(localzrn.b);
      }
    }
    paramComment.b().c = zs.a(localObject);
  }
  
  private zrn e(zcjy paramzcjy)
    throws Exception
  {
    if (paramzcjy.o()) {
      throw new CellsException(6, "Invalid r element");
    }
    zrn localzrn = new zrn();
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if ((paramzcjy.s() == 1) && ("rPr".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        localzrn.a = zalk.a(paramzcjy, this.a.a.getWorksheets(), "rFont");
      }
      else if ((paramzcjy.s() == 1) && ("t".equals(paramzcjy.q())) && (!paramzcjy.o()))
      {
        String str = paramzcjy.a("space", null);
        paramzcjy.c("preserve".equals(str));
        localzrn.b = paramzcjy.j();
        paramzcjy.c(false);
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return localzrn;
  }
  
  private void f(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"comments".equals(paramzcjy.q()))) {
      throw new CellsException(6, "comments root element eror");
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zakg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */