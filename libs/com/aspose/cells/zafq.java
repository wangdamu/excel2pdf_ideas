package com.aspose.cells;

import com.aspose.cells.a.d.zbp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.za;
import com.aspose.cells.b.a.b.zi;
import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

class zafq
{
  ArrayList a = null;
  ArrayList b = null;
  ArrayList c = null;
  ArrayList d = null;
  private int f = -1;
  private Worksheet g;
  private ArrayList h = new ArrayList();
  private Row i = null;
  private int j = 1;
  private zaft k = null;
  private zafo l = null;
  private zafk m = null;
  boolean e = false;
  private HtmlSaveOptions n;
  private boolean o;
  private boolean p;
  private String q;
  private boolean r = false;
  
  public void a(String paramString)
  {
    this.q = paramString;
  }
  
  ArrayList a()
  {
    return this.h;
  }
  
  zafq(zafo paramzafo, zaft paramzaft, Row paramRow, int paramInt, HtmlSaveOptions paramHtmlSaveOptions, String paramString)
  {
    this.l = paramzafo;
    this.k = paramzaft;
    this.g = paramzaft.b();
    this.f = paramInt;
    this.i = paramRow;
    this.m = paramzafo.e();
    this.n = paramHtmlSaveOptions;
    this.o = (this.n.getHtmlCrossStringType() != 2);
    this.p = (this.n.getHtmlCrossStringType() == 3);
    this.q = paramString;
  }
  
  int b()
  {
    return this.j;
  }
  
  void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  Row c()
  {
    return this.i;
  }
  
  int d()
  {
    return this.f;
  }
  
  zaft e()
  {
    return this.k;
  }
  
  void a(zafl paramzafl)
  {
    e(paramzafl);
    int i2;
    if ((paramzafl.h != null) && (paramzafl.h.isFormula()))
    {
      String str = paramzafl.h.getFormula();
      if (str == null) {
        str = paramzafl.h.getFormula();
      }
      if ((str != null) && (str.startsWith("=HYPERLINK(")))
      {
        i2 = str.indexOf(')');
        int i3 = "=HYPERLINK(".length();
        String[] arrayOfString = zw.d(str.substring(i3, i3 + (i2 - i3)), ',');
        paramzafl.g = new Hyperlink();
        paramzafl.g.a = arrayOfString[0].substring(1, 1 + (arrayOfString[0].length() - 2));
        if (arrayOfString.length > 1) {
          paramzafl.g.b(arrayOfString[1].substring(1, 1 + (arrayOfString[1].length() - 2)));
        }
      }
    }
    if ((this.a == null) && (this.b == null) && (this.c == null) && (this.d == null)) {
      return;
    }
    int i1 = paramzafl.a;
    Object localObject1;
    if (this.a != null) {
      for (i2 = 0; i2 < this.a.size(); i2++)
      {
        localObject1 = (CellArea)this.a.get(i2);
        if ((i1 >= ((CellArea)localObject1).StartColumn) && (i1 <= ((CellArea)localObject1).EndColumn)) {
          if ((((CellArea)localObject1).StartRow == this.f) && (((CellArea)localObject1).StartColumn == i1))
          {
            paramzafl.c = true;
            paramzafl.e = (((CellArea)localObject1).EndRow - ((CellArea)localObject1).StartRow + 1);
            paramzafl.f = (((CellArea)localObject1).EndColumn - ((CellArea)localObject1).StartColumn + 1);
            int i4 = 0;
            Color localColor1 = Color.getWhite();
            Cells localCells = this.g.getCells();
            int i5 = 0;
            Color localColor2 = Color.getWhite();
            Style localStyle1 = localCells.getCellStyle(((CellArea)localObject1).StartRow, ((CellArea)localObject1).EndColumn);
            Style localStyle2 = localCells.getCellStyle(((CellArea)localObject1).EndRow, ((CellArea)localObject1).EndColumn);
            if (localStyle1.d() != null)
            {
              i4 = localStyle1.d().getByBorderType(2).getLineStyle();
              localColor1 = localStyle1.d().getByBorderType(2).getColor();
            }
            if (localStyle2.d() != null)
            {
              i5 = localStyle2.d().getByBorderType(8).getLineStyle();
              localColor2 = localStyle2.d().getByBorderType(8).getColor();
            }
            Border localBorder1 = null;
            BorderCollection localBorderCollection;
            for (int i6 = ((CellArea)localObject1).StartColumn; i6 <= ((CellArea)localObject1).EndColumn; i6++)
            {
              Style localStyle3 = localCells.getCellStyle(((CellArea)localObject1).EndRow, i6);
              localBorderCollection = localStyle3.d();
              if (localBorderCollection == null)
              {
                i5 = 0;
                localColor2 = Color.getWhite();
                break;
              }
              localBorder1 = localBorderCollection.getByBorderType(8);
              if ((localBorder1.getLineStyle() == 0) || ((localBorder1.getColor().toArgb() & 0xFFFFFF) == 16777215))
              {
                i5 = 0;
                localColor2 = Color.getWhite();
                break;
              }
            }
            Border localBorder2 = null;
            Object localObject2;
            for (int i7 = ((CellArea)localObject1).StartRow; i7 <= ((CellArea)localObject1).EndRow; i7++)
            {
              localObject2 = localCells.getCellStyle(i7, ((CellArea)localObject1).EndColumn);
              localBorderCollection = ((Style)localObject2).d();
              if (localBorderCollection == null)
              {
                i4 = 0;
                localColor1 = Color.getWhite();
                break;
              }
              localBorder2 = localBorderCollection.getByBorderType(2);
              if ((localBorder2.getLineStyle() == 0) || ((localBorder2.getColor().toArgb() & 0xFFFFFF) == 16777215))
              {
                i4 = 0;
                localColor1 = Color.getWhite();
                break;
              }
            }
            if (paramzafl.h != null)
            {
              Style localStyle4 = paramzafl.h.getStyle();
              Border localBorder3;
              if ((i4 != 0) || (i5 != 0) || (localStyle4.d() != null))
              {
                localObject2 = localStyle4.getBorders().getByBorderType(2);
                ((Border)localObject2).setLineStyle(i4);
                ((Border)localObject2).setColor(localColor1);
                localBorder3 = localStyle4.getBorders().getByBorderType(8);
                localBorder3.setLineStyle(i5);
                localBorder3.setColor(localColor2);
              }
              if ((i4 != 0) || (i5 != 0) || (paramzafl.j.d() != null))
              {
                localObject2 = paramzafl.j.getBorders().getByBorderType(2);
                ((Border)localObject2).setLineStyle(i4);
                ((Border)localObject2).setColor(localColor1);
                localBorder3 = paramzafl.j.getBorders().getByBorderType(8);
                localBorder3.setLineStyle(i5);
                localBorder3.setColor(localColor2);
                paramzafl.i = paramzafl.h.r();
              }
              break;
            }
          }
          else
          {
            paramzafl.d = true;
            break;
          }
        }
      }
    }
    if (this.b != null) {
      for (i2 = 0; i2 < this.b.size(); i2++)
      {
        localObject1 = (Hyperlink)this.b.get(i2);
        CellArea localCellArea = ((Hyperlink)localObject1).getArea();
        if ((i1 >= localCellArea.StartColumn) && (i1 <= localCellArea.EndColumn)) {
          paramzafl.g = ((Hyperlink)localObject1);
        }
      }
    }
    if (this.d != null) {
      for (i2 = 0; i2 < this.d.size(); i2++)
      {
        localObject1 = (zafr)this.d.get(i2);
        if ((((zafr)localObject1).c() == i1) || ((paramzafl.c) && (((zafr)localObject1).c() >= paramzafl.a) && (((zafr)localObject1).c() <= paramzafl.a + paramzafl.f - 1)))
        {
          if (paramzafl.m == null) {
            paramzafl.m = new ArrayList();
          }
          zf.a(paramzafl.m, localObject1);
        }
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    a(paramInt1, paramInt2 - 1);
    zafl localzafl = new zafl(paramInt1, paramInt2);
    localzafl.i = paramInt3;
    localzafl.j = this.g.d().getStyleInPool(paramInt3);
    b(localzafl);
  }
  
  void a(Cell paramCell)
    throws Exception
  {
    a(paramCell.getRow(), paramCell.getColumn() - 1);
    zafl localzafl = new zafl(paramCell, this.l);
    b(localzafl);
  }
  
  private void b(zafl paramzafl)
    throws Exception
  {
    int i1 = this.h.size();
    zafv localzafv = null;
    if (i1 > 0) {
      localzafv = (zafv)this.h.get(i1 - 1);
    }
    a(paramzafl);
    if ((paramzafl.d) || (paramzafl.c))
    {
      if (localzafv != null) {
        localzafv.e = false;
      }
      if (paramzafl.d) {
        return;
      }
    }
    if ((localzafv != null) && (localzafv.a != null) && (localzafv.a.getType() != 3) && (localzafv.m) && ((localzafv.n == -1) || (localzafv.n >= paramzafl.a)) && (a(localzafv, paramzafl))) {
      localzafv.c += 1;
    } else {
      c(paramzafl);
    }
  }
  
  void a(int paramInt1, int paramInt2)
    throws Exception
  {
    int i1 = 0;
    int i2 = this.h.size();
    zafv localzafv = null;
    if (i2 > 0)
    {
      localzafv = (zafv)this.h.get(i2 - 1);
      i1 = localzafv.b + localzafv.c;
    }
    for (int i3 = i1; i3 <= paramInt2; i3++)
    {
      zafl localzafl = new zafl(paramInt1, i3);
      a(localzafl);
      if ((localzafl.d) || (localzafl.c))
      {
        if (localzafv != null) {
          localzafv.e = false;
        }
        if (localzafl.d) {}
      }
      else if ((localzafv != null) && (localzafv.m) && ((localzafv.n == -1) || (localzafv.n >= localzafl.a)) && (a(localzafv, localzafl)) && (a(localzafv)))
      {
        localzafv.c += 1;
      }
      else
      {
        localzafv = c(localzafl);
      }
    }
  }
  
  private boolean a(zafv paramzafv)
  {
    int i1 = this.a == null ? -1 : this.a.size();
    if ((paramzafv.a == null) || (i1 < 1)) {
      return false;
    }
    int i2 = paramzafv.a.getRow();
    int i3 = paramzafv.a.getColumn();
    for (int i4 = 0; i4 < i1; i4++)
    {
      CellArea localCellArea = (CellArea)this.a.get(i4);
      if ((i2 >= localCellArea.StartRow) && (i2 <= localCellArea.EndRow) && (i3 >= localCellArea.StartColumn) && (i3 <= localCellArea.EndColumn)) {
        return true;
      }
    }
    return false;
  }
  
  private void b(zafv paramzafv)
    throws Exception
  {
    if (paramzafv.k)
    {
      paramzafv.m = false;
      return;
    }
    Cell localCell = paramzafv.a;
    if ((localCell == null) || (localCell.getType() == 3))
    {
      paramzafv.m = true;
      return;
    }
    Style localStyle = paramzafv.g;
    if ((localStyle != null) && ((localStyle.isTextWrapped()) || (localStyle.getHorizontalAlignment() == 6) || (localStyle.getRotationAngle() == 255) || (localStyle.getRotationAngle() == 90)))
    {
      paramzafv.m = false;
      return;
    }
    if ((!this.p) && (localCell.c.c == 4))
    {
      String str = localCell.getStringValue();
      int i1 = 0;
      if (localCell.isRichText())
      {
        ArrayList localArrayList = localCell.I();
        for (i3 = 0; i3 < localArrayList.size(); i3++)
        {
          zqb localzqb = (zqb)localArrayList.get(i3);
          localzqb.c = this.m.a(localzqb.b, localzqb.a);
          i1 += localzqb.c;
        }
      }
      else
      {
        i1 = this.m.a(paramzafv.g, str);
      }
      int i2 = 0;
      for (int i3 = paramzafv.b; i3 <= this.k.c(); i3++)
      {
        i2 += this.k.a(i3);
        if (i2 >= i1 + 3)
        {
          if (i3 > paramzafv.b)
          {
            paramzafv.m = true;
            paramzafv.n = i3;
          }
          return;
        }
      }
    }
    paramzafv.m = false;
  }
  
  private zafv c(zafl paramzafl)
    throws Exception
  {
    zafv localzafv = new zafv(this);
    zf.a(this.h, localzafv);
    localzafv.a = paramzafl.h;
    localzafv.b = paramzafl.a;
    localzafv.f = paramzafl.i;
    localzafv.g = paramzafl.j;
    localzafv.i = paramzafl.k;
    localzafv.j = paramzafl.l;
    localzafv.c = paramzafl.f;
    localzafv.d = paramzafl.e;
    localzafv.h = paramzafl.g;
    localzafv.k = paramzafl.c;
    localzafv.o = paramzafl.m;
    localzafv.r = paramzafl.n;
    b(localzafv);
    if (localzafv.k) {
      c(localzafv);
    }
    return localzafv;
  }
  
  private void c(zafv paramzafv)
  {
    if (!paramzafv.k) {
      return;
    }
    int i1 = paramzafv.b + paramzafv.c - 1;
    int i2 = d() + paramzafv.d - 1;
    Cell localCell = this.g.getCells().checkCell(i2, i1);
    if (localCell == null) {
      return;
    }
    Style localStyle = localCell.p();
    if (localStyle == null) {
      return;
    }
    BorderCollection localBorderCollection = localStyle.d();
    if (localBorderCollection == null) {
      return;
    }
    Border localBorder1 = localBorderCollection.getByBorderType(2);
    Border localBorder2 = localBorderCollection.getByBorderType(8);
    if (localBorder1.getLineStyle() != 0) {
      paramzafv.p = localBorder1;
    }
    if (localBorder2.getLineStyle() != 0) {
      paramzafv.q = localBorder2;
    }
  }
  
  private void d(zafl paramzafl)
  {
    if (paramzafl.h != null)
    {
      int i1 = 1;
      boolean[] arrayOfBoolean = { i1 };
      paramzafl.j = paramzafl.h.a(arrayOfBoolean);
      i1 = arrayOfBoolean[0];
      if (i1 == 0) {
        paramzafl.k = true;
      }
      zfe localzfe = zla.a(paramzafl.h.d.g(), paramzafl.h, null, paramzafl.h.o(), false);
      paramzafl.l = localzfe.c;
      if ((paramzafl.l != null) && (paramzafl.l.size() > 0)) {
        paramzafl.k = true;
      }
    }
  }
  
  private void e(zafl paramzafl)
  {
    if (paramzafl.i == -1)
    {
      Column localColumn = this.g.getCells().getColumns().get(paramzafl.a);
      if ((localColumn != null) && (localColumn.c() != -1))
      {
        paramzafl.i = localColumn.c();
        paramzafl.j = localColumn.f();
      }
      if ((this.i != null) && (this.i.e() != -1))
      {
        paramzafl.i = this.i.e();
        paramzafl.j = this.i.j();
      }
    }
    d(paramzafl);
  }
  
  private boolean a(zafv paramzafv, zafl paramzafl)
  {
    if (!paramzafv.e) {
      return false;
    }
    if ((paramzafv.o != null) || (paramzafl.m != null)) {
      return false;
    }
    Style localStyle = paramzafv.a == null ? null : paramzafv.a.o();
    if ((localStyle != null) && (localStyle.isTextWrapped())) {
      return false;
    }
    if ((paramzafl.h != null) && (paramzafl.h.c.c != 0)) {
      return false;
    }
    Column localColumn1 = this.g.getCells().getColumns().get(paramzafv.b);
    Column localColumn2 = this.g.getCells().getColumns().get(paramzafl.a);
    if ((localColumn1 != null) && (localColumn2 != null) && (localColumn1.isHidden() != localColumn2.isHidden())) {
      return false;
    }
    zafu localzafu = new zafu(this.l.i(), paramzafv.g, paramzafl.j);
    if (!localzafu.c()) {
      return false;
    }
    if ((!paramzafv.i) && (!paramzafl.k) && (paramzafv.f == paramzafl.i)) {
      return true;
    }
    if (!localzafu.a()) {
      return false;
    }
    if (!localzafu.b()) {
      return false;
    }
    paramzafv.p = localzafu.d();
    return true;
  }
  
  ArrayList f()
    throws Exception
  {
    if ((g()) && (!this.n.getExportGridLines())) {
      return h();
    }
    if ((this.h == null) || (this.h.size() == 0)) {
      a(this.f, this.k.c());
    }
    ArrayList localArrayList = new ArrayList(this.h.size());
    for (int i1 = 0; i1 < this.h.size(); i1++)
    {
      zafv localzafv = (zafv)this.h.get(i1);
      String str = d(localzafv);
      if (str != null) {
        zf.a(localArrayList, str);
      }
    }
    return localArrayList;
  }
  
  private String d(zafv paramzafv)
    throws Exception
  {
    this.r = false;
    String str;
    if ((paramzafv.o == null) || (paramzafv.o.size() == 0))
    {
      if ((paramzafv.i) && (paramzafv.j != null) && (paramzafv.j.size() > 0)) {
        str = e(paramzafv);
      } else {
        str = b(paramzafv, false);
      }
    }
    else {
      str = f(paramzafv);
    }
    this.o = (this.n.getHtmlCrossStringType() != 2);
    return str;
  }
  
  private float b(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = this.g.getCells().getMergedCells();
    int i1 = localArrayList.size();
    for (int i2 = 0; i2 < i1; i2++)
    {
      CellArea localCellArea = (CellArea)localArrayList.get(i2);
      if ((localCellArea.StartRow == paramInt1) && (localCellArea.StartColumn == paramInt2))
      {
        int i3 = 0;
        for (int i4 = localCellArea.StartColumn; i4 <= localCellArea.EndColumn; i4++) {
          i3 += this.k.a(i4);
        }
        return i3;
      }
    }
    return this.k.a(paramInt2);
  }
  
  private String c(String paramString)
  {
    int i1 = paramString.indexOf("class=");
    if (-1 == i1) {
      return "";
    }
    int i2 = paramString.indexOf(" ", i1);
    return paramString.substring(i1, i1 + (i2 - i1 + 1));
  }
  
  private String d(String paramString)
  {
    int i1 = paramString.indexOf("background:");
    int i2 = paramString.indexOf(";", i1);
    return paramString.substring(i1, i1 + (i2 - i1 + 1));
  }
  
  private String e(String paramString)
  {
    int i1 = paramString.indexOf("height=");
    int i2 = paramString.indexOf("width=");
    int i3 = paramString.indexOf(" ", i2);
    String str = paramString.substring(i1, i1 + (i3 - i1 + 1));
    str = zw.a(str, " ", "px;");
    return zw.a(str, "=", ":");
  }
  
  private String e(zafv paramzafv)
    throws Exception
  {
    int i1 = 0;
    StringBuilder localStringBuilder1 = new StringBuilder(300);
    boolean bool = false;
    String[] arrayOfString = { "ColorScaledStyle", "DataBarStyle", "IconSetStyle" };
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    for (localObject3 : arrayOfString)
    {
      localObject4 = (zahw)paramzafv.j.get(localObject3);
      if (localObject4 != null)
      {
        bool |= ((zahw)localObject4).c();
        localObject5 = new zq(0.0F, 1.0F, b(paramzafv.a.getRow(), paramzafv.a.getColumn()), (float)(paramzafv.a.b.getHeight() * 4.0D / 3.0D - 2.0D));
        localObject6 = ((zahw)localObject4).a((zq)localObject5);
        if (localObject6 != null)
        {
          localObject7 = (String)((ArrayList)localObject6).get(0);
          if (localObject7 != null)
          {
            int i8 = ((Integer)((ArrayList)localObject6).get(1)).intValue();
            int i9 = ((Integer)((ArrayList)localObject6).get(2)).intValue();
            i1 = 1;
            int i10 = 1;
            int i11 = 0;
            if ((localObject4 instanceof zov))
            {
              i11 = -1;
              if (((zov)localObject4).a.getDirection() == 2) {
                i10 = this.k.a(paramzafv.a.getColumn()) - i8;
              }
            }
            int i12 = 0;
            if ((localObject4 instanceof zajx)) {
              i12 = (int)((paramzafv.a.b.getHeight() * 4.0D / 3.0D - 16.0D) / 2.0D);
            }
            localStringBuilder1.append("<div style='mso-ignore:vglayout;position:absolute;");
            localStringBuilder1.append("z-index:");
            localStringBuilder1.append(i11);
            localStringBuilder1.append(";margin-left:");
            localStringBuilder1.append(zauj.z(i10));
            localStringBuilder1.append("px;margin-top:");
            localStringBuilder1.append(zauj.z(i12));
            localStringBuilder1.append("px;width:");
            localStringBuilder1.append(zauj.z(i8));
            localStringBuilder1.append("px;height:");
            localStringBuilder1.append(zauj.z(i9));
            localStringBuilder1.append("px'>");
            localStringBuilder1.append("<img width='");
            localStringBuilder1.append(zauj.z(i8));
            localStringBuilder1.append("' height=");
            localStringBuilder1.append(zauj.z(i9));
            localStringBuilder1.append("' src=\"");
            localStringBuilder1.append("data:image/png;base64,");
            localStringBuilder1.append((String)localObject7);
            localStringBuilder1.append("\"/>");
            localStringBuilder1.append("</div>");
          }
        }
      }
    }
    if ((i1 == 0) && (bool)) {
      return b(paramzafv, false);
    }
    ??? = b(paramzafv, true);
    StringBuilder localStringBuilder2 = new StringBuilder(100 + ((String)???).length());
    this.r = false;
    a(localStringBuilder2, paramzafv, true, false);
    Object localObject2 = a(paramzafv, false);
    Object localObject3 = a(zs.a(localStringBuilder2), (String)localObject2);
    if (null != localObject3) {
      localObject2 = localObject3;
    }
    localStringBuilder2.append((String)localObject2);
    localStringBuilder2.append(" align='left' valign='top'>");
    if ((this.n.getPresentationPreference()) && (paramzafv.a != null) && (paramzafv.a.getDisplayStyle().getPattern() != 0))
    {
      localObject4 = c((String)???);
      localObject5 = d((String)???);
      if (!"".equals(localObject4)) {
        ??? = zw.a((String)???, (String)localObject4, "");
      }
      ??? = zw.a((String)???, (String)localObject5, "");
      localObject6 = zs.a(localStringBuilder2);
      localStringBuilder2.delete(0, 0 + ((String)localObject6).length());
      if (!"".equals(localObject4)) {
        localObject6 = zw.a((String)localObject6, (String)localObject4, "");
      }
      localObject6 = zw.a((String)localObject6, (String)localObject5, "");
      localStringBuilder2.append((String)localObject6);
      localObject7 = new StringBuilder("<div style='mso-ignore:vglayout;position:absolute;z-index:-5;margin-left:1px;margin-top:0px;");
      ((StringBuilder)localObject7).append((String)localObject5);
      ((StringBuilder)localObject7).append(e((String)???));
      ((StringBuilder)localObject7).append("'></div>");
      localStringBuilder2.append(zs.a(localObject7));
      localObject7 = null;
    }
    if (localStringBuilder1 != null)
    {
      localStringBuilder2.append(zs.a(localStringBuilder1));
      localStringBuilder1 = null;
    }
    int i4 = 0;
    int i5 = paramzafv.a.getStyle().getHorizontalAlignment();
    if (i5 == 7)
    {
      i4 = 16;
    }
    else if (i5 == 1)
    {
      int i6 = paramzafv.e();
      int i7 = this.m.a(paramzafv.g, paramzafv.a.getStringValue());
      if (i7 + 16 < i6) {
        i4 = 16 + (i6 - 16 - i7) / 2;
      }
    }
    localStringBuilder2.append("<div  style='mso-ignore:vglayout2");
    localStringBuilder2.append(";margin-left:");
    localStringBuilder2.append(zauj.z(i4));
    localStringBuilder2.append("px;'");
    localStringBuilder2.append(">");
    localStringBuilder2.append("<table cellpadding='0' cellspacing='0'>");
    localStringBuilder2.append("<tr>");
    if (bool) {
      localStringBuilder2.append((String)???);
    }
    localStringBuilder2.append("</tr>");
    localStringBuilder2.append("</table>");
    localStringBuilder2.append("</div>");
    localStringBuilder2.append("</td>");
    return zs.a(localStringBuilder2);
  }
  
  private String f(zafv paramzafv)
    throws Exception
  {
    int i1 = paramzafv.o.size();
    String str1 = b(paramzafv, true);
    StringBuilder localStringBuilder = new StringBuilder(100 * i1 + str1.length());
    this.r = true;
    a(localStringBuilder, paramzafv, true, false);
    Object localObject = a(paramzafv, false);
    String str2 = a(zs.a(localStringBuilder), (String)localObject);
    if (null != str2) {
      localObject = str2;
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(" align='left' valign='top'>");
    for (int i2 = i1 - 1; i2 >= 0; i2--)
    {
      zafr localzafr = (zafr)paramzafv.o.get(i2);
      String str3 = a(localzafr, paramzafv);
      localStringBuilder.append(str3);
    }
    localStringBuilder.append("<span  style='mso-ignore:vglayout2'>");
    localStringBuilder.append("<table cellpadding='0' cellspacing='0'>");
    localStringBuilder.append("<tr>");
    localStringBuilder.append(str1);
    localStringBuilder.append("</tr>");
    localStringBuilder.append("</table>");
    localStringBuilder.append("</span>");
    localStringBuilder.append("</td>");
    return zs.a(localStringBuilder);
  }
  
  private String a(zafr paramzafr, zafv paramzafv)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(100);
    Shape localShape = paramzafr.f();
    zq localzq = localShape.ae();
    int i1 = com.aspose.cells.b.a.ze.f(Float.valueOf(localzq.h()));
    int i2 = com.aspose.cells.b.a.ze.f(Float.valueOf(localzq.i()));
    int i3 = 0;
    int i4 = 0;
    switch (localShape.getType())
    {
    case 41: 
    case 42: 
    case 43: 
    case 44: 
    case 45: 
    case 46: 
    case 47: 
    case 48: 
    case 49: 
    case 50: 
    case 51: 
    case 52: 
    case 178: 
    case 179: 
    case 180: 
    case 181: 
      i3 = (int)(localzq.j() + 0.5F);
      i4 = (int)(localzq.k() + 0.5F);
      break;
    default: 
      i3 = localShape.getLeft();
      i4 = localShape.getTop();
    }
    float f1 = localShape.getWidth();
    float f2 = localShape.getHeight();
    double d1 = localShape.getRotationAngle();
    if (d1 < 0.0D) {
      d1 += 360.0D;
    }
    if ((d1 != 0.0D) && (d1 != 180.0D) && (d1 != 90.0D) && (d1 != 270.0D)) {
      if (f1 > f2)
      {
        i4 -= (int)Math.abs(localzq.i() / 2.0F - f2 / 2.0F);
        i3 += (int)Math.abs(localzq.h() / 2.0F - f1 / 2.0F);
      }
      else
      {
        i4 += (int)Math.abs(localzq.i() / 2.0F - f2 / 2.0F);
        i3 -= (int)Math.abs(localzq.h() / 2.0F - f1 / 2.0F);
      }
    }
    if (paramzafv.k)
    {
      if (paramzafr.c() > paramzafv.b) {
        for (i5 = paramzafv.b; i5 < paramzafr.c(); i5++) {
          i3 += this.k.a(i5);
        }
      }
      if (paramzafr.a() > d()) {
        for (i5 = d(); i5 < paramzafr.a(); i5++) {
          i4 += this.g.getCells().getRowHeightPixel(i5);
        }
      }
    }
    localStringBuilder.append("<span style='mso-ignore:vglayout;position:absolute;");
    localStringBuilder.append("z-index:");
    localStringBuilder.append(localShape.w());
    localStringBuilder.append(";margin-left:");
    localStringBuilder.append(zauj.z(i3));
    localStringBuilder.append("px;margin-top:");
    localStringBuilder.append(zauj.z(i4));
    localStringBuilder.append("px;width:");
    localStringBuilder.append(zauj.z(i1));
    localStringBuilder.append("px;height:");
    localStringBuilder.append(zauj.z(i2));
    localStringBuilder.append("px'>");
    int i5 = 0;
    if ((paramzafr.f() != null) && (paramzafr.f().getHyperlink() != null) && (!"".equals(paramzafr.f().getHyperlink().getAddress().trim()))) {
      i5 = 1;
    }
    if (i5 != 0)
    {
      localStringBuilder.append("<a href=\"");
      localStringBuilder.append(paramzafr.f().getHyperlink().getAddress());
      localStringBuilder.append("\">");
    }
    localStringBuilder.append("<img width='");
    localStringBuilder.append(zauj.z(i1));
    localStringBuilder.append("' height=");
    localStringBuilder.append(zauj.z(i2));
    localStringBuilder.append("'");
    if (this.n.getExportImagesAsBase64())
    {
      localStringBuilder.append(" src=\"");
      localStringBuilder.append("data:image/png;base64,");
      zh localzh = new zh();
      ImageOrPrintOptions localImageOrPrintOptions = new ImageOrPrintOptions();
      localImageOrPrintOptions.setChartImageType(ImageFormat.getPng());
      localImageOrPrintOptions.setImageFormat(ImageFormat.getPng());
      localShape.a(localzh, localImageOrPrintOptions);
      String str = com.aspose.cells.b.a.ze.a(localzh.m(), 0, (int)localzh.h());
      localStringBuilder.append(str);
      localStringBuilder.append("\"");
      int i6 = str.length();
      if (i6 >= 32768)
      {
        HashMap localHashMap = (HashMap)this.l.d.get(Integer.valueOf(this.g.getIndex()));
        if (localHashMap == null)
        {
          localHashMap = new HashMap();
          this.l.d.put(Integer.valueOf(this.g.getIndex()), localHashMap);
          localHashMap.put("image000", a(localzh));
          localStringBuilder.append(" id='image000'");
        }
        else
        {
          localStringBuilder.append(" id='image00");
          localStringBuilder.append(localHashMap.size());
          localStringBuilder.append("'");
          localHashMap.put("image00" + localHashMap.size(), a(localzh));
        }
      }
      localzh.a();
    }
    else
    {
      localStringBuilder.append(" src=\"");
      if (this.q == null) {
        localStringBuilder.append(zw.a(paramzafr.e(), "#", "%23"));
      } else {
        localStringBuilder.append(zw.a(this.q + paramzafr.e(), "#", "%23"));
      }
      localStringBuilder.append("\"");
    }
    if (!"".equals(localShape.getName()))
    {
      localStringBuilder.append(" name='");
      localStringBuilder.append(localShape.getName());
      localStringBuilder.append("'");
    }
    if (localShape.getMsoDrawingType() == 11)
    {
      localStringBuilder.append(" shapeType='");
      localStringBuilder.append("checkbox");
      localStringBuilder.append("'");
    }
    if (!"".equals(localShape.getAlternativeText()))
    {
      localStringBuilder.append(" alt='");
      localStringBuilder.append(localShape.getAlternativeText());
      localStringBuilder.append("'");
    }
    localStringBuilder.append(">");
    if (i5 != 0) {
      localStringBuilder.append("</a>");
    }
    localStringBuilder.append("</span>");
    return zs.a(localStringBuilder);
  }
  
  private String a(zh paramzh)
    throws Exception
  {
    String str = com.aspose.cells.b.a.ze.a(paramzh.m(), 0, (int)paramzh.h());
    for (int i1 = str.length(); i1 >= 32768; i1 = str.length())
    {
      double d1 = 0.0D;
      double d2 = 0.0D;
      zj localzj = zj.a(paramzh);
      if (localzj.i() >= localzj.h())
      {
        d1 = localzj.i() - 80;
        d2 = d1 * localzj.h() / localzj.i();
      }
      else if (localzj.h() >= localzj.i())
      {
        d2 = localzj.h() - 50;
        d1 = d2 * localzj.i() / localzj.h();
      }
      za localza = new za((int)d1, (int)d2, localzj.c());
      zi localzi = zi.a(localza);
      localzi.b(2);
      localzi.c(7);
      localzi.a(localzj, 0.0F, 0.0F, localza.i(), localza.h());
      paramzh = new zh();
      localza.a(paramzh, ImageFormat.getPng());
      str = com.aspose.cells.b.a.ze.a(paramzh.m(), 0, (int)paramzh.h());
    }
    return str;
  }
  
  private int a(zafv paramzafv, zaft paramzaft)
  {
    ArrayList localArrayList = this.k.e();
    zafn localzafn = null;
    int i1 = 0;
    int i2 = 0;
    for (int i3 = 0; i3 < localArrayList.size(); i3++)
    {
      localzafn = (zafn)localArrayList.get(i3);
      if (localzafn.a + localzafn.b > paramzafv.b)
      {
        if (paramzafv.b + paramzafv.c <= localzafn.a) {
          break;
        }
        if ((localzafn.d) && (paramzafv.c > 1))
        {
          int i4 = 0;
          if ((localzafn.a <= paramzafv.b) && (localzafn.a + localzafn.b > paramzafv.b))
          {
            if (localzafn.a + localzafn.b <= paramzafv.b + paramzafv.c) {
              i4 = localzafn.a + localzafn.b - paramzafv.b;
            } else {
              i4 = paramzafv.c;
            }
          }
          else if ((localzafn.a > paramzafv.b) && (localzafn.a < paramzafv.b + paramzafv.c)) {
            if (localzafn.a + localzafn.b <= paramzafv.b + paramzafv.c) {
              i4 = localzafn.b;
            } else {
              i4 = paramzafv.c + paramzafv.b - localzafn.a;
            }
          }
          i1 += i4;
          if (this.n.getHiddenColDisplayType() == 1) {
            i2 += i4;
          }
        }
      }
    }
    i3 = paramzafv.c - i1;
    paramzafv.c = (i3 > paramzafv.c ? paramzafv.c : i3);
    if (this.n.getHiddenColDisplayType() == 1)
    {
      if (i2 > 0) {
        i3 = i3 + i1 - i2;
      } else {
        i3 = paramzafv.c;
      }
    }
    else {
      i3 += i1;
    }
    if (paramzafv.c < 1) {
      paramzafv.c = 1;
    }
    return i3;
  }
  
  private void a(StringBuilder paramStringBuilder, zafv paramzafv, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramStringBuilder.append("<td");
    if ((paramzafv.a != null) && (zax.b(paramzafv.a.k()))) {
      paramStringBuilder.append(" dir='RTL' align='right'");
    }
    int i1 = a(paramzafv, this.k);
    if (i1 > 1)
    {
      paramStringBuilder.append(" colspan='");
      paramStringBuilder.append(zauj.z(i1));
      paramStringBuilder.append("'");
      if (i1 != paramzafv.c)
      {
        HashMap localHashMap = (HashMap)this.l.f.get(Integer.valueOf(this.g.getIndex()));
        if (localHashMap == null)
        {
          localHashMap = new HashMap();
          localHashMap.put("tc0", Integer.valueOf(paramzafv.c));
          this.l.f.put(Integer.valueOf(this.g.getIndex()), localHashMap);
          paramStringBuilder.append(" id='tc0'");
        }
        else
        {
          paramStringBuilder.append(" id='tc");
          paramStringBuilder.append(localHashMap.size());
          paramStringBuilder.append("'");
          localHashMap.put("tc" + localHashMap.size(), Integer.valueOf(paramzafv.c));
        }
        paramzafv.c = i1;
      }
    }
    if (paramzafv.d > 1)
    {
      paramStringBuilder.append(" rowspan='");
      paramStringBuilder.append(zauj.z(paramzafv.d));
      paramStringBuilder.append("'");
    }
    if (((paramzafv.a()) && (paramzafv.d <= this.k.d() + 1)) || ((paramzafv.i) && (paramzafv.j != null) && (paramzafv.j.size() > 0)))
    {
      double d1 = paramzafv.d();
      paramStringBuilder.append(" height='");
      paramStringBuilder.append(zauj.z(this.m.a(d1)));
      paramStringBuilder.append("'");
    }
    int i2;
    if ((paramBoolean1) && (paramzafv.f != 15) && (paramzafv.f != -1))
    {
      i2 = paramzafv.f;
      zajm localzajm = this.g.c().C();
      Style localStyle1 = localzajm.a(paramzafv.f);
      Style localStyle2;
      if ((localStyle1.f()) && (paramBoolean2))
      {
        localStyle2 = new Style(this.g.c());
        localStyle2.copy(localStyle1);
        localStyle2.getBorders().setStyle(0);
        localStyle2.getBorders().setColor(Color.getWhite());
        i2 = localzajm.a(localStyle2);
      }
      if (this.r)
      {
        localStyle2 = new Style(this.g.c());
        localStyle2.copy(localStyle1);
        localStyle2.setHorizontalAlignment(5);
        localStyle2.setVerticalAlignment(5);
        i2 = localzajm.a(localStyle2);
      }
      paramStringBuilder.append(" class='");
      paramStringBuilder.append(this.l.c().getCellCssPrefix());
      paramStringBuilder.append("x").append(zauj.z(i2));
      paramStringBuilder.append("'");
    }
    if (((this.e) || (paramzafv.o != null) || ((paramzafv.j != null) && (paramzafv.j.size() > 0))) && (((this.g.c().p().f() == 0) && (i1 != 256)) || ((this.g.c().p().f() == 1) && (i1 != 16384))))
    {
      paramzafv.c = i1;
      i2 = paramzafv.e();
      paramStringBuilder.append(" width='");
      paramStringBuilder.append(zauj.z(i2));
      paramStringBuilder.append("'");
    }
  }
  
  private String a(zafv paramzafv, boolean paramBoolean)
    throws Exception
  {
    StringBuilder localStringBuilder = null;
    if (paramzafv.i) {
      localStringBuilder = new StringBuilder(300);
    } else {
      localStringBuilder = new StringBuilder(150);
    }
    localStringBuilder.append(" style='");
    if ((paramzafv.a != null) && (paramzafv.a.getStyle().getHorizontalAlignment() == 5) && (paramzafv.a.getType() == 4)) {
      localStringBuilder.append("text-align:right;");
    }
    String str1 = null;
    if ((paramzafv.c > 1) && (!paramzafv.k)) {
      localStringBuilder.append("mso-ignore:colspan;");
    }
    if (paramzafv.i) {
      localStringBuilder.append("mso-ignore:style;");
    }
    if ((paramzafv.p != null) || (paramzafv.q != null))
    {
      String str2;
      if ((paramzafv.p != null) && (!paramBoolean))
      {
        str2 = a(paramzafv.p, 2);
        if (str2 != null) {
          localStringBuilder.append(str2);
        }
      }
      if ((paramzafv.q != null) && (!paramBoolean))
      {
        str2 = a(paramzafv.q, 8);
        if (str2 != null) {
          localStringBuilder.append(str2);
        }
      }
    }
    if ((paramzafv.a()) && (paramzafv.d <= this.k.d() + 1))
    {
      localStringBuilder.append("height:");
      localStringBuilder.append(zauj.b(paramzafv.d()));
      localStringBuilder.append("pt;");
    }
    if ((this.e) || (paramzafv.o != null))
    {
      i1 = paramzafv.e();
      if ((i1 != 0) && ((paramzafv.c == 1) || (!this.e))) {
        localStringBuilder.append("width:").append(zauj.b(this.m.a(i1))).append("pt;");
      }
      if ((i1 == 0) && ((paramzafv.o == null) || ((paramzafv.o != null) && (paramBoolean))))
      {
        localObject = (ArrayList)this.l.e.get(Integer.valueOf(this.g.getIndex()));
        if (localObject == null)
        {
          localObject = new ArrayList();
          zf.a((ArrayList)localObject, "t0");
          this.l.e.put(Integer.valueOf(this.g.getIndex()), localObject);
          str1 = "id='t0'";
        }
        else
        {
          str1 = "id='t" + ((ArrayList)localObject).size() + "'";
          zf.a((ArrayList)localObject, "t" + ((ArrayList)localObject).size());
        }
      }
    }
    else
    {
      i1 = paramzafv.e();
      if (i1 == 0)
      {
        localObject = (ArrayList)this.l.e.get(Integer.valueOf(this.g.getIndex()));
        if (localObject == null)
        {
          localObject = new ArrayList();
          zf.a((ArrayList)localObject, "t0");
          this.l.e.put(Integer.valueOf(this.g.getIndex()), localObject);
          str1 = "id='t0'";
        }
        else
        {
          str1 = "id='t" + ((ArrayList)localObject).size() + "'";
          zf.a((ArrayList)localObject, "t" + ((ArrayList)localObject).size());
        }
      }
    }
    if (paramzafv.i) {
      a(paramzafv, localStringBuilder);
    }
    int i1 = this.k.a(paramzafv.b, paramzafv.b + paramzafv.c);
    if (i1 < this.m.a(paramzafv.g, "1"))
    {
      localStringBuilder.append("overflow:hidden;");
    }
    else if ((i1 > 0) && (paramzafv.a != null) && (paramzafv.a.getStringValue().length() > 0) && (i1 < this.m.a(paramzafv.g, paramzafv.a.getStringValue())) && (!paramzafv.a.getStyle().isTextWrapped()))
    {
      if (paramzafv.a.getColumn() < this.g.getCells().getMaxColumn())
      {
        localObject = null;
        localObject = this.g.getCells().get(paramzafv.a.getRow(), paramzafv.a.getColumn() + 1);
        if ((localObject != null) && (((Cell)localObject).getValue() != null))
        {
          localStringBuilder.append("overflow:hidden;");
        }
        else if ((paramzafv.a.getStyle().getHorizontalAlignment() == 8) && (paramzafv.a.getColumn() > 0))
        {
          localObject = this.g.getCells().get(paramzafv.a.getRow(), paramzafv.a.getColumn() - 1);
          if ((localObject != null) && (((Cell)localObject).getValue() != null)) {
            localStringBuilder.append("overflow:hidden;");
          }
        }
      }
      if ((paramzafv.d > 1) && (paramzafv.g != null) && (paramzafv.g.getHorizontalAlignment() == 6)) {
        localStringBuilder.append("white-space:normal;word-wrap:break-word;");
      }
    }
    if ((paramBoolean) && (this.n.getExportGridLines())) {
      localStringBuilder.append("border:none;");
    }
    localStringBuilder.append("'");
    Object localObject = zs.a(localStringBuilder);
    localStringBuilder = null;
    if (((String)localObject).equals(" style=''")) {
      localObject = "";
    }
    if (str1 != null) {
      localObject = (String)localObject + " " + str1;
    }
    return (String)localObject;
  }
  
  private void a(zafv paramzafv, StringBuilder paramStringBuilder)
    throws Exception
  {
    Style localStyle = null;
    if (paramzafv.g != null) {
      localStyle = paramzafv.g;
    }
    if ((localStyle == null) && (paramzafv.a != null) && (paramzafv.a.getStyle() != null)) {
      localStyle = paramzafv.a.getStyle();
    }
    if (null == localStyle) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder(100);
    a(localStyle.getFont(), localStringBuilder);
    a(localStyle, localStringBuilder);
    paramStringBuilder.append(zs.a(localStringBuilder));
    localStringBuilder = null;
  }
  
  public void a(Style paramStyle, StringBuilder paramStringBuilder)
    throws Exception
  {
    String str1 = "auto";
    String str2 = "auto";
    String str3 = "";
    String str4 = "";
    switch (paramStyle.getPattern())
    {
    case 0: 
      break;
    case 1: 
      if (!paramStyle.b.b()) {
        str1 = "#" + zauj.a(paramStyle.getForegroundColor());
      }
      str3 = " none";
      break;
    default: 
      if (!paramStyle.a.b()) {
        str1 = "#" + zauj.a(paramStyle.getBackgroundColor());
      }
      if (!paramStyle.b.b()) {
        str2 = "#" + zauj.a(paramStyle.getForegroundColor());
      }
      str3 = " " + ztt.b(paramStyle.getPattern());
      str4 = a(paramStyle);
    }
    paramStringBuilder.append("background:");
    paramStringBuilder.append(str1);
    paramStringBuilder.append(";");
    paramStringBuilder.append("mso-pattern:");
    paramStringBuilder.append(str2);
    paramStringBuilder.append(str3);
    paramStringBuilder.append(";");
    if (!"".equals(str4))
    {
      paramStringBuilder.append("background-image:url(\"data:image/png;base64,");
      paramStringBuilder.append(str4);
      paramStringBuilder.append("\");");
    }
  }
  
  private String a(Style paramStyle)
    throws Exception
  {
    int i1 = zavt.a(paramStyle.getPattern());
    Color localColor1 = Color.a(255, paramStyle.getForegroundColor());
    Color localColor2 = Color.a(255, paramStyle.getBackgroundColor());
    if (paramStyle.a.b()) {
      localColor2 = Color.getWhite();
    }
    zg localzg = new zg(i1, localColor1, localColor2);
    byte[] arrayOfByte = zbp.a(localzg);
    zh localzh = new zh();
    localzh.b(arrayOfByte, 0, arrayOfByte.length);
    return a(localzh);
  }
  
  private void a(Font paramFont, StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append("font-size:");
    paramStringBuilder.append(zauj.z(paramFont.getSize()));
    paramStringBuilder.append("pt;");
    paramStringBuilder.append("color:#");
    paramStringBuilder.append(zauj.a(paramFont.getColor()));
    paramStringBuilder.append(";");
    if (paramFont.isItalic()) {
      paramStringBuilder.append("font-style:italic;");
    }
    paramStringBuilder.append("font-weight:");
    paramStringBuilder.append(zauj.z(paramFont.g()));
    paramStringBuilder.append(";");
    paramStringBuilder.append("text-decoration:");
    if (paramFont.isStrikeout()) {
      paramStringBuilder.append("line-through");
    }
    if (paramFont.getUnderline() != 0) {
      paramStringBuilder.append(" underline");
    }
    if ((!paramFont.isStrikeout()) && (paramFont.getUnderline() == 0)) {
      paramStringBuilder.append("none");
    }
    if (paramFont.isStrikeout()) {
      paramStringBuilder.append(";text-line-through:single");
    } else {
      paramStringBuilder.append(";text-line-through:none");
    }
    if (paramFont.getUnderline() != 0)
    {
      paramStringBuilder.append(";text-underline-style:");
      paramStringBuilder.append(zafz.a(paramFont.getUnderline()));
    }
    paramStringBuilder.append(";font-family:\"");
    paramStringBuilder.append(paramFont.getName());
    paramStringBuilder.append("\";");
  }
  
  private String b(zafv paramzafv, boolean paramBoolean)
    throws Exception
  {
    if (paramzafv.a == null) {
      return c(paramzafv, paramBoolean);
    }
    StringBuilder localStringBuilder1 = new StringBuilder(150);
    if ((paramzafv.e() == 0) && (this.n.getHiddenColDisplayType() == 1)) {
      return null;
    }
    Object localObject1 = a(paramzafv, paramBoolean);
    a(localStringBuilder1, paramzafv, true, paramBoolean);
    String str1 = a(zs.a(localStringBuilder1), (String)localObject1);
    if (null != str1) {
      localObject1 = str1;
    }
    int i1 = 0;
    String str2 = "";
    Cell localCell1 = paramzafv.a;
    int i2 = 0;
    String[] arrayOfString = zagn.a(localCell1);
    int i20;
    Object localObject4;
    int i9;
    if (arrayOfString != null)
    {
      str3 = arrayOfString[0];
      str2 = arrayOfString[1];
      if ((paramzafv.g != null) && ((!"".equals(paramzafv.g.s())) || (paramzafv.g.getNumber() != 0)))
      {
        i2 = 1;
        localObject2 = new zzu();
        ((zzu)localObject2).a(new zia(localCell1.d.g().d(), true, false));
        str2 = Cell.b(localCell1.c.e(), (zzu)localObject2, paramzafv.g, localCell1.d);
        if ("num".equals(str3)) {
          str2 = str2.trim();
        }
      }
      localObject2 = arrayOfString[2];
      i3 = str3.charAt(0);
      int i4 = this.k.a(paramzafv.b, paramzafv.b + paramzafv.c);
      if (i4 == 0) {
        str2 = zagn.a(str2, this.n.getParseHtmlTagInCell(), this.l.b, paramzafv.g.getFont(), this.n.getPresentationPreference());
      }
      int i10;
      int i5;
      int i12;
      if (i4 > 0)
      {
        int i15;
        if (i3 == 115)
        {
          if ((this.o) && (paramzafv.g != null) && ((paramzafv.g.isTextWrapped()) || (paramzafv.g.getRotationAngle() != 0) || (paramzafv.g.getHorizontalAlignment() == 6) || ((paramzafv.b == this.k.c()) && (!this.p)))) {
            this.o = false;
          }
          StringBuilder localStringBuilder2 = new StringBuilder(str2.length() + 50);
          int i7;
          int i11;
          Object localObject5;
          String str7;
          if (localCell1.isRichText())
          {
            i7 = 0;
            ArrayList localArrayList = paramzafv.a.I();
            i11 = 0;
            for (int i13 = 0; i13 < localArrayList.size(); i13++)
            {
              localObject5 = (zqb)localArrayList.get(i13);
              i15 = -1;
              if ((((zqb)localObject5).b != null) && (this.l.f().b.containsKey(Integer.valueOf(((zqb)localObject5).b.m())))) {
                i15 = ((Integer)this.l.f().b.get(Integer.valueOf(((zqb)localObject5).b.m()))).intValue();
              }
              if (!this.o)
              {
                if (paramzafv.g.getRotationAngle() == 255) {
                  ((zqb)localObject5).a = b(((zqb)localObject5).a);
                }
                String str5 = a(((zqb)localObject5).b, i15, ((zqb)localObject5).a);
                localStringBuilder2.append(str5);
              }
              else
              {
                ((zqb)localObject5).c = this.m.a(((zqb)localObject5).b, ((zqb)localObject5).a);
                if ((i11 == 0) && (i7 + ((zqb)localObject5).c > i4))
                {
                  int i16 = 0;
                  int i18 = this.m.a(((zqb)localObject5).b, ((zqb)localObject5).a, i4);
                  if (i18 < 0) {
                    i18 = 0;
                  }
                  if (i18 > 0)
                  {
                    str7 = ((zqb)localObject5).a.substring(0, 0 + i18);
                    if (paramzafv.g.getRotationAngle() == 255) {
                      str7 = b(str7);
                    }
                    str7 = a(((zqb)localObject5).b, i15, str7);
                    localStringBuilder2.append(str7);
                    Cell localCell3 = null;
                    if ((localCell1 != null) && (localCell1.getColumn() < this.g.getCells().getMaxColumn())) {
                      localCell3 = this.g.getCells().get(localCell1.getRow(), localCell1.getColumn() + 1);
                    }
                    if (this.n.getParseHtmlTagInCell())
                    {
                      if ((localCell3 != null) && (localCell3.getValue() == null))
                      {
                        i16 = 1;
                        int i19 = 0;
                        i20 = 1;
                        Column localColumn2 = null;
                        while ((!this.p) && (a(paramzafv.g, localCell3.getStyle())) && (null == localCell3.getValue()))
                        {
                          localColumn2 = this.g.getCells().checkColumn(localCell3.getColumn());
                          if (null == localColumn2) {
                            i19 += this.g.getCells().getStandardWidthPixels();
                          } else {
                            i19 += localColumn2.a(true);
                          }
                          localColumn2 = null;
                          if (i19 + i4 >= i7)
                          {
                            i20 = 0;
                            i16 = 0;
                            break;
                          }
                          if ((localCell3 == null) || (localCell3.getColumn() >= this.g.getCells().getMaxColumn())) {
                            break;
                          }
                          localCell3 = this.g.getCells().get(localCell3.getRow(), localCell3.getColumn() + 1);
                        }
                        if (localCell3.getColumn() > this.k.c())
                        {
                          i20 = 0;
                          i16 = 0;
                        }
                        if ((i19 > 0) && (i20 != 0))
                        {
                          ((zqb)localObject5).a = ((zqb)localObject5).a.substring(i18);
                          i18 = this.m.a(((zqb)localObject5).b, ((zqb)localObject5).a, i19);
                          if (i18 > 0)
                          {
                            String str9 = ((zqb)localObject5).a.substring(0, 0 + i18);
                            if (paramzafv.g.getRotationAngle() == 255) {
                              str9 = b(str9);
                            }
                            str9 = a(((zqb)localObject5).b, i15, str9);
                            localStringBuilder2.append(str9);
                          }
                        }
                      }
                      if (i16 != 0) {
                        localStringBuilder2.append("<span style='display:none'>");
                      }
                    }
                  }
                  str7 = i18 > 0 ? ((zqb)localObject5).a.substring(i18) : ((zqb)localObject5).a;
                  if (paramzafv.g.getRotationAngle() == 255) {
                    str7 = b(str7);
                  }
                  str7 = a(((zqb)localObject5).b, i15, str7);
                  localStringBuilder2.append(str7);
                  i11 = 1;
                }
                else
                {
                  if (paramzafv.g.getRotationAngle() == 255) {
                    ((zqb)localObject5).a = b(((zqb)localObject5).a);
                  }
                  String str6 = a(((zqb)localObject5).b, i15, ((zqb)localObject5).a);
                  localStringBuilder2.append(str6);
                }
                i7 += ((zqb)localObject5).c;
              }
            }
            if ((i11 != 0) && (this.o)) {
              localStringBuilder2.append("</span>");
            }
            i1 = i7;
            str2 = zs.a(localStringBuilder2);
            localStringBuilder2 = null;
          }
          else
          {
            if (!this.o)
            {
              i1 = this.m.a(paramzafv.g, str2);
              if (paramzafv.g.getRotationAngle() == 255) {
                str2 = b(str2);
              }
              str2 = zagn.a(str2, this.n.getParseHtmlTagInCell(), this.l.b, paramzafv.g.getFont(), this.n.getPresentationPreference());
            }
            else
            {
              i7 = this.m.a(paramzafv.g, str2);
              if (i7 > i4)
              {
                i10 = this.m.a(paramzafv.g, str2, i4);
                i11 = 0;
                Cell localCell2 = null;
                if ((localCell1 != null) && (localCell1.getColumn() < this.g.getCells().getMaxColumn())) {
                  localCell2 = this.g.getCells().get(localCell1.getRow(), localCell1.getColumn() + 1);
                }
                if (i10 > 0)
                {
                  localObject5 = str2.substring(0, 0 + i10);
                  if (paramzafv.g.getRotationAngle() == 255) {
                    localObject5 = b((String)localObject5);
                  }
                  localObject5 = zagn.a((String)localObject5, this.n.getParseHtmlTagInCell(), this.l.b, paramzafv.g.getFont(), this.n.getPresentationPreference());
                  localStringBuilder2.append((String)localObject5);
                  if (this.n.getParseHtmlTagInCell())
                  {
                    if ((localCell2 != null) && (localCell2.getValue() == null))
                    {
                      i11 = 1;
                      i15 = 0;
                      int i17 = 1;
                      Column localColumn1 = null;
                      while ((!this.p) && (a(paramzafv.g, localCell2.getStyle())) && (null == localCell2.getValue()))
                      {
                        localColumn1 = this.g.getCells().checkColumn(localCell2.getColumn());
                        if (null == localColumn1) {
                          i15 += this.g.getCells().getStandardWidthPixels();
                        } else {
                          i15 += localColumn1.a(true);
                        }
                        localColumn1 = null;
                        if (i15 + i4 >= i7)
                        {
                          i17 = 0;
                          i11 = 0;
                          break;
                        }
                        if ((localCell2 == null) || (localCell2.getColumn() >= this.g.getCells().getMaxColumn())) {
                          break;
                        }
                        localCell2 = this.g.getCells().get(localCell2.getRow(), localCell2.getColumn() + 1);
                      }
                      if ((localCell2.getColumn() > this.k.c()) && (!this.p))
                      {
                        i17 = 0;
                        i11 = 0;
                      }
                      if ((i15 > 0) && (i17 != 0))
                      {
                        str2 = str2.substring(i10);
                        i10 = this.m.a(paramzafv.g, str2, i15);
                        if (i10 > 0)
                        {
                          str7 = str2.substring(0, 0 + i10);
                          if (paramzafv.g.getRotationAngle() == 255) {
                            str7 = b(str7);
                          }
                          str7 = zagn.a(str7, this.n.getParseHtmlTagInCell(), this.l.b, paramzafv.g.getFont(), this.n.getPresentationPreference());
                          localStringBuilder2.append(str7);
                        }
                      }
                    }
                    if (i11 != 0) {
                      localStringBuilder2.append("<span style='display:none'>");
                    }
                  }
                }
                localObject5 = i10 > 0 ? str2.substring(i10) : str2;
                if (paramzafv.g.getRotationAngle() == 255) {
                  localObject5 = b((String)localObject5);
                }
                localObject5 = zagn.a((String)localObject5, this.n.getParseHtmlTagInCell(), this.l.b, paramzafv.g.getFont(), this.n.getPresentationPreference());
                localStringBuilder2.append((String)localObject5);
                if ((i10 > 0) && (i11 != 0)) {
                  localStringBuilder2.append("</span>");
                }
                i1 = i7;
                str2 = zs.a(localStringBuilder2);
                localStringBuilder2 = null;
              }
              else
              {
                if (paramzafv.g.getRotationAngle() == 255) {
                  str2 = b(str2);
                }
                str2 = zagn.a(str2, this.n.getParseHtmlTagInCell(), this.l.b, paramzafv.g.getFont(), this.n.getPresentationPreference());
              }
            }
            if (paramzafv.g != null)
            {
              Font localFont = paramzafv.g.q();
              if (localFont != null) {
                if (localFont.isSuperscript()) {
                  str2 = "<sup>" + str2 + "</sup>";
                } else if (localFont.isSubscript()) {
                  str2 = "<sub>" + str2 + "</sub>";
                }
              }
            }
          }
        }
        else if (this.o)
        {
          i5 = this.m.a(paramzafv.g, str2);
          int i8;
          if (i2 != 0)
          {
            i8 = this.m.a(paramzafv.g, arrayOfString[1]);
            if (i8 <= i4) {
              i5 = i8;
            }
          }
          if (i5 > i4)
          {
            i8 = 1;
            i10 = this.m.a(paramzafv.g, str2, i4);
            int i14;
            if ((localCell1.c.h() == 4) && (paramzafv.b()) && (i10 > 0)) {
              try
              {
                String str4 = str2.substring(0, 0 + i10);
                i14 = localCell1.getIntValue();
                double d3 = zauj.C(str4);
                if ((d3 >= i14) || ((d3 < 0.0D) && (d3 <= i14))) {
                  i8 = 0;
                }
              }
              catch (Exception localException) {}
            }
            if (i8 != 0)
            {
              i12 = this.m.a(paramzafv.g, "#");
              i14 = i4 / i12 + 1;
              StringBuilder localStringBuilder4 = new StringBuilder(i14);
              for (i15 = 0; i15 < i14; i15++) {
                localStringBuilder4.append('#');
              }
              str2 = zs.a(localStringBuilder4);
              localStringBuilder4 = null;
            }
          }
        }
        else
        {
          if (paramzafv.g.getRotationAngle() == 255) {
            str2 = b(str2);
          }
          str2 = zagn.a(str2, this.n.getParseHtmlTagInCell(), this.l.b, paramzafv.g.getFont(), this.n.getPresentationPreference());
        }
      }
      if (this.l.a.d(str2)) {
        str2 = this.l.a.b(str2, "");
      }
      if ((this.n.isExportComments()) && (null != this.k.a().get(localCell1.getName())))
      {
        i5 = ((Integer)this.k.a().get(localCell1.getName())).intValue();
        StringBuilder localStringBuilder3 = new StringBuilder();
        localStringBuilder3.append(str2);
        localStringBuilder3.append("<a  href='#_cells_com_");
        localStringBuilder3.append(i5);
        localStringBuilder3.append("' name='_cells_anchor_");
        localStringBuilder3.append(i5);
        localStringBuilder3.append("'>[");
        localStringBuilder3.append(i5);
        localStringBuilder3.append("]</a>");
        str2 = zs.a(localStringBuilder3);
      }
      if ((paramzafv.g != null) && (paramzafv.g.getRotationAngle() == 0) && (paramzafv.g.getHorizontalAlignment() == 1) && (paramzafv.a != null) && (arrayOfString != null) && (arrayOfString[0].charAt(0) == 's') && (i1 > i4) && (!paramzafv.a.getStyle().isTextWrapped()))
      {
        localObject4 = new StringBuilder();
        i9 = (i1 - i4) / 2 - 10;
        if (paramzafv.b == this.k.c())
        {
          i10 = 0;
          i12 = 0;
          while (i10 < i9)
          {
            i12++;
            i10 = this.m.a(paramzafv.g, str2.substring(0, 0 + i12));
          }
          ((StringBuilder)localObject4).append("<span style='display:none'>");
          ((StringBuilder)localObject4).append(str2.substring(0, 0 + i12));
          ((StringBuilder)localObject4).append("</span>");
          ((StringBuilder)localObject4).append(str2.substring(i12));
          str2 = zs.a(localObject4);
        }
        else
        {
          ((StringBuilder)localObject4).append("<div style='margin-left:-");
          ((StringBuilder)localObject4).append(i9);
          ((StringBuilder)localObject4).append("px'>");
          ((StringBuilder)localObject4).append(str2);
          ((StringBuilder)localObject4).append("</div>");
          str2 = zs.a(localObject4);
        }
      }
      switch (i3)
      {
      case 110: 
        if (localObject2 != null)
        {
          if ((paramzafv.a != null) && (paramzafv.a.getType() != 1) && (paramzafv.a.getStyle().getHorizontalAlignment() == 5)) {
            localStringBuilder1.append(" align='right'");
          }
          localStringBuilder1.append(" x:num=\"").append((String)localObject2).append("\"");
        }
        break;
      case 98: 
      case 101: 
        localStringBuilder1.append(" align='center'");
        localStringBuilder1.append(" x:err=\"").append((String)localObject2).append("\"");
        break;
      case 115: 
        localObject4 = arrayOfString[1];
        if ((!localCell1.isFormula()) && (paramzafv.g.getRotationAngle() != 255) && (null != localObject4) && (((String)localObject4).length() > 0) && (((String)localObject4).charAt(0) == '=')) {
          localStringBuilder1.append(" x:str=\"'").append(zagn.c((String)localObject2)).append("\"");
        }
        break;
      }
    }
    String str3 = localCell1.getFormula();
    if ((str3 != null) && (str3.length() > 0))
    {
      if (localCell1.isInArray()) {
        localStringBuilder1.append(" x:arrayrange=\"" + localCell1.getName() + "\"");
      }
      localStringBuilder1.append(" x:fmla=\"").append(zagn.a(str3)).append("\"");
    }
    if ((localObject1 != null) && (!((String)localObject1).trim().equals(""))) {
      localStringBuilder1.append((String)localObject1);
    }
    localStringBuilder1.append(">");
    if ((paramzafv.g != null) && (paramzafv.g.getHorizontalAlignment() == 8) && (paramzafv.a != null) && (arrayOfString != null) && (arrayOfString[0].charAt(0) == 's')) {
      localStringBuilder1.append("<span style='float:right'>");
    }
    Object localObject2 = g(paramzafv);
    if (localObject2 != null) {
      localStringBuilder1.append((String)localObject2);
    }
    int i3 = 0;
    Object localObject3;
    if (paramzafv.c())
    {
      localObject3 = new StringBuilder(20);
      ((StringBuilder)localObject3).append("<a ");
      if (paramzafv.r != null)
      {
        ((StringBuilder)localObject3).append("name=\"");
        ((StringBuilder)localObject3).append(paramzafv.r);
        ((StringBuilder)localObject3).append("\" ");
      }
      if (paramzafv.h != null)
      {
        localObject4 = a(paramzafv.h);
        i9 = paramzafv.h.a(this.l.j.getWorksheets());
        ((StringBuilder)localObject3).append("href=\"");
        if ((this.l.a()) && (i9 == 1)) {
          ((StringBuilder)localObject3).append("../");
        }
        ((StringBuilder)localObject3).append((String)localObject4);
        ((StringBuilder)localObject3).append("\" ");
        if ((i9 == 0) || (i9 == 1))
        {
          ((StringBuilder)localObject3).append("target=\"");
          ((StringBuilder)localObject3).append(zagn.h(this.n.getLinkTargetType()));
          ((StringBuilder)localObject3).append("\"");
        }
      }
      ((StringBuilder)localObject3).append(">");
      if ((localCell1.r() != 15) && (localCell1.r() != -1))
      {
        i3 = 1;
        ((StringBuilder)localObject3).append("<span style='");
        a(paramzafv.g.getFont(), (StringBuilder)localObject3);
        ((StringBuilder)localObject3).append("'>");
      }
      localStringBuilder1.append(zs.a(localObject3));
      localObject3 = null;
    }
    if ((localCell1.getStyle().getRotationAngle() != 0) && (localCell1.getStyle().getRotationAngle() != 255))
    {
      localObject3 = localCell1.getStyle();
      int i6 = 0;
      i6 = -((Style)localObject3).getRotationAngle();
      double d1 = i6 * 3.141592653589793D / 180.0D;
      double d2 = Math.cos(d1);
      double d4 = -Math.sin(d1);
      double d5 = Math.sin(d1);
      double d6 = Math.cos(d1);
      String str8 = "";
      if (((((Style)localObject3).getVerticalAlignment() == 0) || (((Style)localObject3).getVerticalAlignment() == 1)) && (((Style)localObject3).getRotationAngle() == 90))
      {
        i20 = localCell1.getHeightOfValue();
        int i21 = localCell1.getWidthOfValue();
        double d7 = i20 / 2 + i21 / 2;
        int i22 = localCell1.d.getColumns().get(localCell1.getColumn()).a();
        int i23 = (i20 - i22) / 2;
        StringBuilder localStringBuilder5 = new StringBuilder();
        localStringBuilder5.append("width:");
        localStringBuilder5.append(i20);
        if (((Style)localObject3).getVerticalAlignment() == 0) {
          if (d7 >= 0.0D)
          {
            localStringBuilder5.append("px;margin-top:-");
            localStringBuilder5.append(d7);
          }
          else
          {
            localStringBuilder5.append("px;margin-top:");
            localStringBuilder5.append(Math.abs(d7));
          }
        }
        localStringBuilder5.append("px;");
        if (i23 >= 0)
        {
          localStringBuilder5.append("margin-left:-");
          localStringBuilder5.append(i23);
        }
        else
        {
          localStringBuilder5.append("margin-left:");
          localStringBuilder5.append(Math.abs(i23));
        }
        localStringBuilder5.append("px;");
        str8 = zs.a(localStringBuilder5);
        localStringBuilder5 = null;
      }
      str2 = "<div style='white-space:nowrap;" + str8 + "transform: rotate(" + i6 + "deg);-o-transform: rotate(" + i6 + "deg);-webkit-transform: rotate(" + i6 + "deg);-moz-transform: rotate(" + i6 + "deg);-ms-transform: rotate(" + i6 + "deg);'>" + str2 + "</div>";
    }
    if ((paramzafv != null) && (paramzafv.a != null))
    {
      localObject3 = (HashMap)this.l.d().get(this.g.getName());
      if ((localObject3 != null) && (((HashMap)localObject3).get(paramzafv.a.getName()) != null))
      {
        localStringBuilder1.append("<a name=\"");
        localStringBuilder1.append((String)((HashMap)localObject3).get(paramzafv.a.getName()));
        localStringBuilder1.append("\" title=\"currNameDef\">");
        localStringBuilder1.append(str2);
        localStringBuilder1.append("</a>");
      }
      else
      {
        localStringBuilder1.append(str2);
      }
    }
    else
    {
      localStringBuilder1.append(str2);
    }
    if (i3 != 0) {
      localStringBuilder1.append("</span>");
    }
    if (paramzafv.c()) {
      localStringBuilder1.append("</a>");
    }
    if (localObject2 != null) {
      localStringBuilder1.append("</font>");
    }
    if ((paramzafv.g != null) && (paramzafv.g.getHorizontalAlignment() == 8) && (paramzafv.a != null) && (arrayOfString != null) && (arrayOfString[0].charAt(0) == 's')) {
      localStringBuilder1.append("</span>");
    }
    localStringBuilder1.append("</td>");
    return zs.a(localStringBuilder1);
  }
  
  private boolean a(Style paramStyle1, Style paramStyle2)
  {
    if (this.n.getHtmlCrossStringType() == 1) {
      return zagn.b(paramStyle1, paramStyle2);
    }
    return true;
  }
  
  private String g(zafv paramzafv)
  {
    if ((paramzafv.a == null) || (paramzafv.a.getType() != 4)) {
      return null;
    }
    Color localColor = Color.getEmpty();
    switch (paramzafv.g.getNumber())
    {
    case 0: 
      String str = paramzafv.g.s();
      if ((str != null) && (!"".equals(str))) {
        localColor = zavt.a(paramzafv.a.getDoubleValue(), str, localColor);
      }
      break;
    case 6: 
    case 8: 
    case 38: 
    case 40: 
      if (paramzafv.a.getDoubleValue() < 0.0D) {
        localColor = Color.getRed();
      }
      break;
    }
    if (!localColor.isEmpty()) {
      return "<font color=\"#" + zauj.a(localColor) + "\" style='mso-ignore:color'>";
    }
    return null;
  }
  
  private String a(Border paramBorder, int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder(20);
    switch (paramInt)
    {
    case 2: 
      localStringBuilder.append("border-right:");
      break;
    case 8: 
      localStringBuilder.append("border-bottom:");
      break;
    case 1: 
      localStringBuilder.append("border-left:");
      break;
    case 4: 
      localStringBuilder.append("border-top:");
      break;
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      return null;
    }
    int i1 = paramBorder.getLineStyle();
    String str = zagn.f(i1);
    localStringBuilder.append(str);
    if (!"none".equals(str))
    {
      if (!paramBorder.a.b())
      {
        localStringBuilder.append(" #");
        localStringBuilder.append(zauj.a(paramBorder.getColor()));
        localStringBuilder.append(";");
      }
      else
      {
        localStringBuilder.append(" windowtext;");
      }
    }
    else {
      localStringBuilder.append(";");
    }
    return zs.a(localStringBuilder);
  }
  
  private String a(Hyperlink paramHyperlink)
  {
    String str1 = null;
    CellArea localCellArea = null;
    String[] arrayOfString = { str1 };
    CellArea[] arrayOfCellArea = { localCellArea };
    boolean bool = zagn.a(this.l.j.getWorksheets(), paramHyperlink, arrayOfString, arrayOfCellArea);
    str1 = arrayOfString[0];
    localCellArea = arrayOfCellArea[0];
    if ((!bool) && (str1 == null) && (localCellArea.StartColumn == 1) && (localCellArea.StartRow == 1) && (localCellArea.EndColumn == 0) && (localCellArea.EndRow == 0)) {
      return "#" + paramHyperlink.getAddress();
    }
    NameCollection localNameCollection = this.l.j.getWorksheets().getNames();
    if (bool)
    {
      if (zw.b(str1, this.g.getName())) {
        str1 = "";
      }
      String str2 = "";
      if (paramHyperlink.getAddress().indexOf("!") == -1)
      {
        int i2 = a(localNameCollection, paramHyperlink.getAddress());
        str2 = "#" + a(localNameCollection, i2);
      }
      else
      {
        str2 = zagn.a(localCellArea);
      }
      String str3 = this.l.a(str1);
      return str3 + str2;
    }
    int i1 = localNameCollection.getCount();
    for (int i3 = 0; i3 < i1; i3++)
    {
      Name localName = localNameCollection.get(i3);
      if ((paramHyperlink.getAddress() != null) && ((paramHyperlink.getAddress().equals(localName.getFullText())) || (paramHyperlink.getAddress().equals(localName.getText()))))
      {
        Range localRange = localName.getRange(false);
        String str4 = a(localNameCollection, i3);
        if (localRange != null) {
          return this.l.a(localRange.b()) + "#" + str4;
        }
        return "#" + str4;
      }
    }
    return paramHyperlink.getAddress();
  }
  
  private int a(NameCollection paramNameCollection, String paramString)
  {
    int i1 = paramNameCollection.getCount();
    for (int i2 = 0; i2 < i1; i2++) {
      if (paramNameCollection.get(i2).getText().equals(paramString)) {
        return i2;
      }
    }
    return -1;
  }
  
  private String a(NameCollection paramNameCollection, int paramInt)
  {
    Name localName = paramNameCollection.get(paramInt);
    Range localRange1 = localName.getRange(false);
    if (localRange1 == null) {
      return localName.getText();
    }
    String str = localRange1.getRefersTo();
    for (int i1 = 0; i1 < paramInt; i1++)
    {
      Range localRange2 = paramNameCollection.get(i1).getRange(false);
      if ((localRange2 != null) && (str.equals(localRange2.getRefersTo()))) {
        return paramNameCollection.get(i1).getText();
      }
    }
    return localName.getText();
  }
  
  private String a(Font paramFont, int paramInt, String paramString)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if (paramInt != -1)
    {
      localStringBuilder.append("<font class=\"");
      localStringBuilder.append(this.l.c().getCellCssPrefix());
      localStringBuilder.append("font");
      localStringBuilder.append(zauj.z(paramInt));
      localStringBuilder.append("\">");
      if (paramFont.isSuperscript()) {
        localStringBuilder.append("<sup>");
      } else if (paramFont.isSubscript()) {
        localStringBuilder.append("<sub>");
      }
    }
    localStringBuilder.append(zagn.a(paramString, this.n.getParseHtmlTagInCell(), this.l.b, paramFont, this.n.getPresentationPreference()));
    if (paramInt != -1)
    {
      if (paramFont.isSuperscript()) {
        localStringBuilder.append("</sup>");
      } else if (paramFont.isSubscript()) {
        localStringBuilder.append("</sub>");
      }
      localStringBuilder.append("</font>");
    }
    return zs.a(localStringBuilder);
  }
  
  private String c(zafv paramzafv, boolean paramBoolean)
    throws Exception
  {
    StringBuilder localStringBuilder = new StringBuilder(50);
    Object localObject = a(paramzafv, paramBoolean);
    a(localStringBuilder, paramzafv, true, false);
    String str = a(zs.a(localStringBuilder), (String)localObject);
    if (null != str) {
      localObject = str;
    }
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(">");
    if (paramzafv.r != null)
    {
      localStringBuilder.append("<a name=\"");
      localStringBuilder.append(paramzafv.r);
      localStringBuilder.append("\">");
      localStringBuilder.append("</a>");
    }
    localStringBuilder.append("</td>");
    return zs.a(localStringBuilder);
  }
  
  boolean g()
  {
    return (this.i == null) && (this.h.size() == 0) && ((this.a == null) || (this.a.size() == 0)) && ((this.b == null) || (this.b.size() == 0)) && ((this.c == null) || (this.c.size() == 0)) && ((this.d == null) || (this.d.size() == 0));
  }
  
  ArrayList h()
  {
    ArrayList localArrayList1 = this.k.e();
    ArrayList localArrayList2 = new ArrayList(localArrayList1.size());
    for (int i1 = 0; i1 < localArrayList1.size(); i1++)
    {
      zafn localzafn = (zafn)localArrayList1.get(i1);
      StringBuilder localStringBuilder1 = new StringBuilder(50);
      StringBuilder localStringBuilder2 = new StringBuilder(20);
      localStringBuilder1.append("  <td");
      localStringBuilder2.append(" style='");
      if (i1 == 0)
      {
        double d1 = i();
        localStringBuilder1.append(" height='");
        localStringBuilder1.append(zauj.z(this.m.a(d1)));
        localStringBuilder1.append("'");
        localStringBuilder2.append("height:" + zauj.b(d1) + "pt");
      }
      if (localzafn.b > 1)
      {
        if (localStringBuilder2.length() > 8) {
          localStringBuilder2.append(";");
        }
        localStringBuilder1.append(" colspan='");
        localStringBuilder1.append(zauj.z(localzafn.b));
        localStringBuilder1.append("'");
        localStringBuilder2.append("mso-ignore:colspan;");
      }
      int i2 = localzafn.e;
      if ((!"".equals(this.l.c().getCellCssPrefix())) && (i2 == 15) && (i1 == localArrayList1.size() - 1) && (localzafn.b > 1) && (i1 > 0)) {
        i2 = ((zafn)localArrayList1.get(i1 - 1)).e;
      }
      if ((i2 != 15) && (i2 != -1))
      {
        localStringBuilder1.append(" class='");
        localStringBuilder1.append(this.l.c().getCellCssPrefix());
        localStringBuilder1.append("x").append(zauj.z(i2));
        localStringBuilder1.append("'");
      }
      if (localStringBuilder2.length() > 8)
      {
        localStringBuilder2.append("'");
        localStringBuilder1.append(zs.a(localStringBuilder2));
      }
      localStringBuilder2 = null;
      localStringBuilder1.append("></td>");
      String str = zs.a(localStringBuilder1);
      localStringBuilder1 = null;
      zf.a(localArrayList2, str);
    }
    return localArrayList2;
  }
  
  double i()
  {
    double d1 = 0.0D;
    int i1 = d() + b();
    for (int i2 = d(); i2 < i1; i2++)
    {
      int i3 = this.g.getCells().getRowHeightPixel(i2);
      if ((i3 == 0) && (this.n.getHiddenRowDisplayType() == 1)) {
        d1 += this.g.getCells().getRows().get(i2).getHeight();
      } else {
        d1 += this.g.getCells().getRowHeight(i2);
      }
    }
    return d1;
  }
  
  String b(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(50);
    for (int i1 = 0; i1 < paramString.length(); i1++) {
      if (i1 == paramString.length() - 1) {
        localStringBuilder.append(paramString.charAt(i1));
      } else {
        localStringBuilder.append(paramString.charAt(i1)).append("\r");
      }
    }
    return zs.a(localStringBuilder);
  }
  
  private String a(String paramString1, String paramString2)
  {
    int i1 = paramString1.indexOf("id='tc");
    int i2 = paramString2.indexOf("id='t");
    if ((i1 != -1) && (i2 != -1))
    {
      int i3 = paramString1.indexOf("'", i1 + "id='tc".length());
      String str1 = paramString1.substring(i1 + 4, i1 + 4 + (i3 - i1 - 4));
      int i4 = paramString2.indexOf("'", i2 + "id='t".length());
      String str2 = paramString2.substring(i2 + 4, i2 + 4 + (i4 - i2 - 4));
      HashMap localHashMap = (HashMap)this.l.g.get(Integer.valueOf(this.g.getIndex()));
      if (localHashMap == null)
      {
        localHashMap = new HashMap();
        localHashMap.put(str2, str1);
        this.l.g.put(Integer.valueOf(this.g.getIndex()), localHashMap);
      }
      else
      {
        localHashMap.put(str2, str1);
      }
      return zw.a(paramString2, i2, i4 - i2 + 1);
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zafq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */