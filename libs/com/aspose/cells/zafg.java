package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

class zafg
{
  private zago a = null;
  private Workbook b = null;
  private Worksheet c = null;
  private double d;
  private int e;
  private zafo f = null;
  private zaft g = null;
  private boolean h = true;
  private HtmlSaveOptions i;
  private String j;
  private int[] k;
  private String l = null;
  private int m = 0;
  
  public void a(String paramString)
  {
    this.j = paramString;
  }
  
  zafg(zafo paramzafo, Worksheet paramWorksheet, zago paramzago, String paramString1, String paramString2, String paramString3, String paramString4, HtmlSaveOptions paramHtmlSaveOptions)
    throws Exception
  {
    this.i = paramHtmlSaveOptions;
    this.f = paramzafo;
    this.j = paramString2;
    this.c = paramWorksheet;
    this.a = paramzago;
    this.g = new zaft(this.f, paramWorksheet, paramzago, paramString1, this.j, paramString3, paramString4, paramHtmlSaveOptions);
    this.b = this.f.j;
    this.d = this.c.getCells().getStandardHeight();
    this.e = this.c.getCells().getStandardWidthPixels();
    ColumnCollection localColumnCollection = paramWorksheet.getCells().getColumns();
    for (int n = this.g.c(); n > -1; n--) {
      if ((localColumnCollection.get(n).c() > -1) && (localColumnCollection.get(n).c() != 15))
      {
        Column localColumn = localColumnCollection.get(n);
        this.k = new int[localColumn.getIndex() + 1];
        this.k[localColumn.getIndex()] = localColumn.c();
        n--;
        while (n > -1)
        {
          localColumn = localColumnCollection.get(n);
          if (localColumn.c() < 0) {
            this.k[localColumn.getIndex()] = 15;
          } else {
            this.k[localColumn.getIndex()] = localColumn.c();
          }
          n--;
        }
      }
    }
    if (this.k == null) {
      this.k = new int[0];
    }
  }
  
  void a()
    throws Exception
  {
    f();
    e();
    c();
    this.a.b("</table>");
    if (this.i.isExportComments()) {
      b();
    }
  }
  
  private void b()
    throws Exception
  {
    if ((this.c.getComments() == null) || (this.c.getComments().getCount() == 0)) {
      return;
    }
    this.a.b("<div style='mso-element:comment-list'>");
    this.a.b("<hr align=left size=1 width='33%'>");
    int n = this.c.getComments().getCount();
    for (int i1 = 1; i1 <= n; i1++)
    {
      this.a.b(" <div style='mso-element:comment'>");
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("  <a href='#_cells_anchor_");
      localStringBuilder.append(i1);
      localStringBuilder.append("' name='_cells_com_");
      localStringBuilder.append(i1);
      localStringBuilder.append("'>[");
      localStringBuilder.append(i1);
      localStringBuilder.append("]</a>");
      this.a.b(zs.a(localStringBuilder));
      this.a.a("  <div>");
      String str = this.c.getComments().get(i1 - 1).getCommentShape().getHtmlText();
      str = zw.a(str, "\n", "<br>");
      this.a.a(str);
      this.a.b("  </div>");
      this.a.b(" </div>");
    }
    this.a.b("</div>");
  }
  
  private void c()
    throws Exception
  {
    Cells localCells = this.c.getCells();
    int n = -1;
    int i1 = localCells.getRows().getCount();
    if (i1 > this.g.d() + 1) {
      i1 = this.g.d() + 1;
    }
    for (int i2 = 0; i2 < i1; i2++)
    {
      this.b.i();
      Row localRow = localCells.getRows().getRowByIndex(i2);
      int i3 = localRow.getIndex();
      if (i3 <= this.g.d())
      {
        if (i3 > n + 1) {
          a(n, i3);
        }
        a(localRow);
        n = i3;
      }
    }
    if (n < this.g.d()) {
      a(n, this.g.d() + 1);
    }
    if (this.i.getExportBogusRowData()) {
      d();
    }
  }
  
  private void a(int paramInt1, int paramInt2)
    throws Exception
  {
    Object localObject = null;
    for (int n = paramInt1 + 1; n < paramInt2; n++)
    {
      zafq localzafq = this.g.a(null, n);
      localzafq.a(this.j);
      if ((a((zafq)localObject, localzafq)) && (!this.i.getExportGridLines()))
      {
        ((zafq)localObject).a(((zafq)localObject).b() + 1);
      }
      else
      {
        if (localObject != null) {
          a((zafq)localObject);
        }
        localObject = localzafq;
      }
    }
    if (localObject != null) {
      a((zafq)localObject);
    }
  }
  
  private boolean a(zafq paramzafq1, zafq paramzafq2)
  {
    if ((paramzafq1 == null) || (paramzafq2 == null)) {
      return false;
    }
    return (paramzafq1.c() == null) && (paramzafq1.g()) && (paramzafq2.c() == null) && (paramzafq2.g());
  }
  
  private void d()
    throws Exception
  {
    if (!this.i.getDisableDownlevelRevealedComments()) {
      this.a.b("<![if supportMisalignedColumns]>");
    }
    this.a.b(" <tr height='0' style='display:none'>");
    for (int n = 0; n <= this.g.c(); n++)
    {
      int i1 = this.g.a(n);
      double d1 = this.f.e().a(i1);
      if ((this.i.getHiddenColDisplayType() != 1) || ((i1 != 0) && (d1 != 0.0D)))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("  <td width='").append(zauj.z(i1)).append("' style='width:").append(zauj.b(d1)).append("pt'></td>");
        this.a.b(zs.a(localStringBuilder));
      }
    }
    this.a.b(" </tr>");
    if (!this.i.getDisableDownlevelRevealedComments()) {
      this.a.b(" <![endif]>");
    }
  }
  
  private void a(Row paramRow)
    throws Exception
  {
    zafq localzafq = this.g.a(paramRow, paramRow.getIndex());
    int n = 0;
    int i1 = paramRow.e();
    int i2 = paramRow.a();
    if (i2 > this.g.c() + 1) {
      i2 = this.g.c() + 1;
    }
    for (int i3 = 0; i3 < i2; i3++)
    {
      Cell localCell2 = paramRow.getCellByIndex(i3);
      if ((n <= localCell2.getColumn()) && (localCell2.getColumn() <= this.g.c()))
      {
        if ((n < localCell2.getColumn()) && (i1 <= -1) && (n < this.k.length))
        {
          int i4 = Math.min(localCell2.getColumn(), this.k.length);
          while (n < i4)
          {
            if (this.k[n] != 15) {
              localzafq.a(paramRow.getIndex(), n, this.k[n]);
            }
            n++;
          }
        }
        localzafq.a(localCell2);
        n = localCell2.getColumn() + 1;
      }
    }
    if (n < this.k.length) {
      while (n < this.k.length)
      {
        if (this.k[n] != 15)
        {
          Cell localCell1 = null;
          try
          {
            localCell1 = this.c.getCells().get(paramRow.getIndex(), n);
          }
          catch (Exception localException)
          {
            localCell1 = null;
          }
          if (localCell1 != null) {
            localzafq.a(paramRow.getIndex(), n, localCell1.r());
          } else {
            localzafq.a(paramRow.getIndex(), n, this.k[n]);
          }
        }
        n++;
      }
    }
    localzafq.a(paramRow.getIndex(), this.g.c());
    a(localzafq);
  }
  
  private void a(zafq paramzafq)
    throws Exception
  {
    if (this.h)
    {
      paramzafq.e = true;
      this.h = false;
    }
    boolean bool = b(paramzafq);
    if (bool) {
      return;
    }
    ArrayList localArrayList1 = paramzafq.f();
    HashMap localHashMap1 = new HashMap();
    if (paramzafq.a() != null) {
      for (int n = 0; n < paramzafq.a().size(); n++)
      {
        zafv localzafv = (zafv)paramzafq.a().get(n);
        if (localzafv.d > 1) {
          for (int i2 = paramzafq.d(); i2 < paramzafq.d() + localzafv.d; i2++) {
            if ((paramzafq.c() != null) && (paramzafq.c().a.get(i2) != null) && (!paramzafq.c().a.get(i2).isHidden()))
            {
              localHashMap1.put(Integer.valueOf(n), Integer.valueOf(localzafv.d));
              break;
            }
          }
        }
      }
    }
    if ((localHashMap1.size() > 0) && (this.l != null))
    {
      localObject = (ArrayList)this.f.i.get(Integer.valueOf(this.c.getIndex()));
      if (localObject == null)
      {
        localObject = new ArrayList();
        zf.a((ArrayList)localObject, this.l);
        this.f.i.put(Integer.valueOf(this.c.getIndex()), localObject);
      }
      else
      {
        zf.a((ArrayList)localObject, this.l);
      }
    }
    Object localObject = null;
    for (int i1 = 0; i1 < localArrayList1.size(); i1++)
    {
      localObject = (String)localArrayList1.get(i1);
      String str1 = b((String)localObject);
      if (localHashMap1.size() > 0)
      {
        String str2 = "tdr0";
        if (localHashMap1.get(Integer.valueOf(i1)) != null)
        {
          int i3 = ((Integer)localHashMap1.get(Integer.valueOf(i1))).intValue();
          int i4 = 0;
          for (int i5 = paramzafq.d() + 1; i5 < paramzafq.d() + i3; i5++) {
            if (paramzafq.c().a.get(i5).isHidden()) {
              i4++;
            }
          }
          if (i4 != 0)
          {
            i3 -= i4;
            HashMap localHashMap2 = (HashMap)this.f.h.get(Integer.valueOf(this.c.getIndex()));
            if (localHashMap2 == null)
            {
              localHashMap2 = new HashMap();
              if (str1 != null)
              {
                localHashMap2.put(str1, Integer.valueOf(i3));
                this.f.h.put(Integer.valueOf(this.c.getIndex()), localHashMap2);
                str2 = "";
              }
              else
              {
                localHashMap2.put("tdr0", Integer.valueOf(i3));
                this.f.h.put(Integer.valueOf(this.c.getIndex()), localHashMap2);
                str2 = "id='tdr0'";
              }
            }
            else if (str1 != null)
            {
              str2 = "";
              localHashMap2.put(str1, Integer.valueOf(i3));
            }
            else
            {
              str2 = "id='tdr" + localHashMap2.size() + "'";
              localHashMap2.put("tdr" + localHashMap2.size(), Integer.valueOf(i3));
            }
            localObject = "<td " + str2 + ((String)localObject).substring(3, 3 + (((String)localObject).length() - 3));
          }
        }
        else if (paramzafq.c().a.get(paramzafq.d()).isHidden())
        {
          ArrayList localArrayList2 = (ArrayList)this.f.e.get(Integer.valueOf(this.c.getIndex()));
          if (localArrayList2 == null)
          {
            localArrayList2 = new ArrayList();
            if (str1 != null)
            {
              zf.a(localArrayList2, str1);
              this.f.e.put(Integer.valueOf(this.c.getIndex()), localArrayList2);
              str2 = "";
            }
            else
            {
              zf.a(localArrayList2, "t0");
              this.f.e.put(Integer.valueOf(this.c.getIndex()), localArrayList2);
              str2 = "id='t0'";
            }
          }
          else if (str1 != null)
          {
            str2 = "";
            zf.a(localArrayList2, str1);
          }
          else
          {
            str2 = "id='t" + localArrayList2.size() + "'";
            zf.a(localArrayList2, "t" + localArrayList2.size());
          }
          localObject = "<td " + str2 + ((String)localObject).substring(3, 3 + (((String)localObject).length() - 3));
        }
      }
      this.a.b((String)localObject);
    }
    this.a.b(" </tr>");
    this.a.h();
    this.l = null;
  }
  
  private String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int n = paramString.indexOf("id='");
    if (n != -1)
    {
      int i1 = paramString.indexOf("'", n + 4);
      return paramString.substring(n + 4, n + 4 + (i1 - n - 4));
    }
    return null;
  }
  
  private boolean b(zafq paramzafq)
    throws Exception
  {
    double d1 = paramzafq.i();
    StringBuilder localStringBuilder1 = new StringBuilder(50);
    StringBuilder localStringBuilder2 = new StringBuilder(50);
    if (d1 > 1.0E-7D)
    {
      localStringBuilder1.append(" <tr height='");
      localStringBuilder1.append(this.f.e().a(d1));
      localStringBuilder1.append("'");
      localStringBuilder2.append(" style='mso-height-source:userset;height:");
      localStringBuilder2.append(zauj.b(d1)).append("pt");
    }
    else
    {
      if (this.i.getHiddenRowDisplayType() == 1) {
        return true;
      }
      localStringBuilder1.append(" <tr height='0'");
      localStringBuilder2.append(" style='display:none");
    }
    if (paramzafq.b() > 1) {
      localStringBuilder2.append(";mso-xlrowspan:").append(zauj.z(paramzafq.b()));
    }
    Row localRow = paramzafq.c();
    if ((localRow != null) && (localRow.e() != -1) && (localRow.e() != 15))
    {
      localStringBuilder1.append(" class='");
      localStringBuilder1.append(this.i.getCellCssPrefix());
      localStringBuilder1.append("x").append(zauj.z(localRow.e()));
      localStringBuilder1.append("'");
    }
    Object localObject = localRow != null ? localRow.b.p().e(localRow.e()) : null;
    if ((localObject != null) && (((Style)localObject).getFont().isStrikeout())) {
      localStringBuilder2.append(";text-decoration:none");
    }
    localStringBuilder1.append(zs.a(localStringBuilder2));
    localStringBuilder2 = null;
    localStringBuilder1.append("'");
    this.l = ("r" + this.m);
    this.m += 1;
    localStringBuilder1.append(" id='" + this.l);
    localStringBuilder1.append("'>");
    this.a.b(zs.a(localStringBuilder1));
    localStringBuilder1 = null;
    return false;
  }
  
  private void e()
    throws Exception
  {
    ArrayList localArrayList = this.g.e();
    for (int n = 0; n < localArrayList.size(); n++)
    {
      zafn localzafn = (zafn)localArrayList.get(n);
      a(localzafn);
    }
  }
  
  private void a(zafn paramzafn)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(100);
    if (paramzafn.g)
    {
      localStringBuilder.append(" <col");
      localStringBuilder.append(" width='");
      localStringBuilder.append(zauj.z(this.e));
      localStringBuilder.append("'");
      if (paramzafn.b > 1)
      {
        localStringBuilder.append(" span='");
        localStringBuilder.append(zauj.z(paramzafn.b));
        localStringBuilder.append("'");
      }
      if (this.i.getPresentationPreference()) {
        localStringBuilder.append(" style='width:").append(zauj.z(this.e)).append("px'>");
      } else {
        localStringBuilder.append(" style='width:").append(zauj.b(this.f.e().a(this.e))).append("pt'>");
      }
    }
    else
    {
      int n;
      if (paramzafn.d)
      {
        n = paramzafn.e;
        localStringBuilder.append(" <col");
        if (n != 15)
        {
          localStringBuilder.append(" class='");
          localStringBuilder.append(this.i.getCellCssPrefix());
          localStringBuilder.append("x").append(zauj.z(n));
          localStringBuilder.append("'");
        }
        localStringBuilder.append(" width='0'");
        localStringBuilder.append(" mso-width='0'");
        if (paramzafn.b > 1)
        {
          localStringBuilder.append(" span='");
          localStringBuilder.append(zauj.z(paramzafn.b));
          localStringBuilder.append("'");
        }
        if (this.i.getHiddenColDisplayType() == 1) {
          return;
        }
        ArrayList localArrayList = (ArrayList)this.f.e.get(Integer.valueOf(this.c.getIndex()));
        if (localArrayList == null)
        {
          localArrayList = new ArrayList();
          zf.a(localArrayList, "c0");
          this.f.e.put(Integer.valueOf(this.c.getIndex()), localArrayList);
          localStringBuilder.append(" id='c0'");
        }
        else
        {
          localStringBuilder.append(" id='c");
          localStringBuilder.append(localArrayList.size());
          localStringBuilder.append("'");
          zf.a(localArrayList, "c" + localArrayList.size());
        }
        localStringBuilder.append(" style='mso-width-source:userset;width:0pt;mso-width-alt:0pt'>");
      }
      else
      {
        n = paramzafn.e;
        localStringBuilder.append(" <col");
        if (n != 15)
        {
          localStringBuilder.append(" class='");
          localStringBuilder.append(this.i.getCellCssPrefix());
          localStringBuilder.append("x").append(zauj.z(n));
          localStringBuilder.append("'");
        }
        localStringBuilder.append(" width='");
        localStringBuilder.append(zauj.z(paramzafn.c));
        localStringBuilder.append("'");
        if (paramzafn.b > 1)
        {
          localStringBuilder.append(" span='");
          localStringBuilder.append(zauj.z(paramzafn.b));
          localStringBuilder.append("'");
        }
        if (this.i.getPresentationPreference()) {
          localStringBuilder.append(" style='mso-width-source:userset;width:").append(zauj.z(paramzafn.c)).append("px'>");
        } else {
          localStringBuilder.append(" style='mso-width-source:userset;width:").append(zauj.b(this.f.e().a(paramzafn.c))).append("pt'>");
        }
      }
    }
    this.a.b(zs.a(localStringBuilder));
  }
  
  private void f()
    throws Exception
  {
    long l1 = this.g.f();
    long l2 = l1 * 3L / 4L;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<table border='0' cellpadding='0' cellspacing='0' width='");
    localStringBuilder.append(zauj.a(l1));
    localStringBuilder.append("' style='border-collapse: ");
    this.a.b(zs.a(localStringBuilder));
    localStringBuilder = new StringBuilder();
    localStringBuilder.append(" collapse;table-layout:fixed;width:");
    localStringBuilder.append(zauj.a(l2));
    localStringBuilder.append("pt'>");
    this.a.b(zs.a(localStringBuilder));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */