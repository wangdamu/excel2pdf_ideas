package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

class zuo
  extends ztp
{
  private zpu b;
  private HashMap c;
  private ArrayList d;
  
  zuo(zpu paramzpu)
  {
    this.b = paramzpu;
    this.c = new HashMap();
    this.d = new ArrayList();
    for (int i = 0; i < this.b.a.getComments().getCount(); i++)
    {
      Comment localComment = this.b.a.getComments().get(i);
      if (this.c.get(localComment.getAuthor()) == null)
      {
        this.c.put(localComment.getAuthor(), zauj.z(this.d.size()));
        zf.a(this.d, localComment.getAuthor());
      }
    }
  }
  
  void a(zcjz paramzcjz)
    throws Exception
  {
    paramzcjz.b(true);
    paramzcjz.b("comments");
    if (zauj.a) {
      paramzcjz.a("xmlns", zaty.a);
    } else {
      paramzcjz.a("xmlns", zaty.b);
    }
    paramzcjz.b("authors");
    for (int i = 0; i < this.d.size(); i++)
    {
      paramzcjz.b("author");
      paramzcjz.a((String)this.d.get(i));
      paramzcjz.b();
    }
    paramzcjz.b();
    paramzcjz.b("commentList");
    for (i = 0; i < this.b.a.getComments().getCount(); i++)
    {
      Comment localComment = this.b.a.getComments().get(i);
      a(paramzcjz, localComment);
    }
    paramzcjz.b();
    paramzcjz.b();
    paramzcjz.d();
    paramzcjz.e();
  }
  
  private void a(zcjz paramzcjz, Comment paramComment)
    throws Exception
  {
    paramzcjz.b("comment");
    String str1 = CellsHelper.cellIndexToName(paramComment.getRow(), paramComment.getColumn());
    paramzcjz.a("ref", str1);
    paramzcjz.a("authorId", (String)this.c.get(paramComment.getAuthor()));
    paramzcjz.b("text");
    ArrayList localArrayList = paramComment.b().a(false, false);
    int i = localArrayList.size();
    for (int j = 0; j < i; j++)
    {
      FontSetting localFontSetting = (FontSetting)localArrayList.get(j);
      Font localFont = localFontSetting.h();
      if (localFont == null) {
        localFont = localFontSetting.e().q;
      }
      String str2 = paramComment.b().getText().substring(localFontSetting.getStartIndex(), localFontSetting.getStartIndex() + localFontSetting.getLength());
      a(paramzcjz, localFont, str2);
    }
    paramzcjz.b();
    paramzcjz.b();
  }
  
  private void a(zcjz paramzcjz, Font paramFont, String paramString)
    throws Exception
  {
    paramzcjz.b("r");
    if (paramFont != null)
    {
      paramzcjz.b("rPr");
      zvq.a(paramFont, paramzcjz, "rFont");
      paramzcjz.b();
    }
    paramzcjz.b("t");
    if ((paramString != null) && (zauj.ap(paramString))) {
      paramzcjz.a("xml:space", null, "preserve");
    }
    String str = zauj.a(paramString);
    paramzcjz.a(str);
    paramzcjz.b();
    paramzcjz.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zuo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */