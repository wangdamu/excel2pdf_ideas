package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zasc
{
  zasl a;
  zasa b;
  zasl c;
  zasa d;
  ArrayList e;
  ArrayList f;
  HashMap g;
  HashMap h;
  Worksheet i;
  Cells j;
  zasb k;
  String l;
  String m;
  ArrayList n;
  boolean o;
  boolean p;
  ArrayList[] q;
  ArrayList[] r;
  ArrayList[] s;
  ArrayList[] t;
  ArrayList u;
  
  zasc(zasb paramzasb, Worksheet paramWorksheet)
  {
    this.k = paramzasb;
    this.i = paramWorksheet;
    this.l = a(paramWorksheet.getName());
    this.j = paramWorksheet.getCells();
    this.g = new HashMap();
    this.h = new HashMap();
    this.a = paramzasb.d.a(this.j);
    this.b = new zasa(this.j, paramzasb.c.size() + 1);
    zf.a(paramzasb.c, this.b);
    this.b.a("co" + paramzasb.c.size());
    this.m = "false";
    paramWorksheet.b(this.l);
  }
  
  private String a(String paramString)
  {
    char[] arrayOfChar = paramString.toCharArray();
    for (int i1 = 0; i1 < arrayOfChar.length; i1++) {
      switch (i1)
      {
      case 33: 
      case 34: 
      case 35: 
      case 36: 
      case 37: 
      case 38: 
      case 39: 
      case 40: 
      case 41: 
      case 42: 
      case 43: 
      case 44: 
      case 45: 
      case 46: 
      case 47: 
      case 58: 
      case 59: 
      case 60: 
      case 61: 
      case 62: 
      case 63: 
      case 64: 
      case 91: 
      case 92: 
      case 93: 
      case 94: 
      case 96: 
      case 123: 
      case 124: 
      case 125: 
      case 126: 
        arrayOfChar[i1] = '_';
      }
    }
    return new String(arrayOfChar);
  }
  
  String a(int paramInt)
  {
    Object localObject = this.h.get(Integer.valueOf(paramInt));
    if (localObject != null) {
      return (String)localObject;
    }
    return this.a.a();
  }
  
  String b(int paramInt)
  {
    Object localObject = this.g.get(Integer.valueOf(paramInt));
    if (localObject != null) {
      return (String)localObject;
    }
    return this.b.b();
  }
  
  void a(zasb paramzasb)
  {
    a(this.j.getRows());
    a(this.j.getColumns());
    b();
    a();
    c();
    b(paramzasb);
  }
  
  void b(zasb paramzasb)
  {
    int i1;
    int i2;
    Object localObject;
    if ((this.i.getHorizontalPageBreaks() != null) && (this.i.getHorizontalPageBreaks().getCount() > 0))
    {
      this.c = paramzasb.d.a(this.j);
      this.c.b(2);
      i1 = this.i.getHorizontalPageBreaks().getCount();
      this.e = new ArrayList();
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = this.i.getHorizontalPageBreaks().get(i2);
        if (localObject != null) {
          zf.a(this.e, Integer.valueOf(((HorizontalPageBreak)localObject).getRow()));
        }
      }
    }
    if ((this.i.getVerticalPageBreaks() != null) && (this.i.getVerticalPageBreaks().getCount() > 0))
    {
      this.d = new zasa(this.j, paramzasb.c.size() + 1);
      this.d.a(2);
      zf.a(paramzasb.c, this.d);
      i1 = this.i.getVerticalPageBreaks().getCount();
      this.f = new ArrayList();
      for (i2 = 0; i2 < i1; i2++)
      {
        localObject = this.i.getVerticalPageBreaks().get(i2);
        if (localObject != null) {
          zf.a(this.f, Integer.valueOf(((VerticalPageBreak)localObject).getColumn()));
        }
      }
    }
  }
  
  void a(RowCollection paramRowCollection)
  {
    zv localzv = paramRowCollection.c;
    zaiv localzaiv = localzv.a(-1, -1, false);
    zbdx localzbdx1 = new zbdx();
    Object localObject1 = null;
    for (;;)
    {
      int i1 = localzaiv.a();
      if (i1 < 0) {
        break;
      }
      zt localzt = localzv.f(i1);
      zbdx localzbdx2 = localzt.a(localzbdx1, 15);
      boolean bool = localzbdx2.c();
      int i2 = localzbdx2.e;
      Object localObject2 = null;
      if ((localObject1 != null) && (((zasl)localObject1).a(bool, i2)))
      {
        localObject2 = localObject1;
      }
      else
      {
        localObject2 = this.k.d.a(bool, i2);
        localObject1 = localObject2;
      }
      this.h.put(Integer.valueOf(localzt.i()), ((zasl)localObject2).a());
    }
  }
  
  void a(ColumnCollection paramColumnCollection)
  {
    Iterator localIterator = paramColumnCollection.iterator();
    while (localIterator.hasNext())
    {
      Column localColumn = (Column)localIterator.next();
      if ((!this.o) && (localColumn.e())) {
        this.o = true;
      }
      if (!this.b.a(localColumn, this.j.getColumnWidthInch(localColumn.getIndex())))
      {
        int i1 = 0;
        for (int i2 = 0; i2 < this.k.c.size(); i2++)
        {
          zasa localzasa2 = (zasa)this.k.c.get(i2);
          if (localzasa2.a(localColumn, this.j.getColumnWidthInch(localColumn.getIndex())))
          {
            this.g.put(Integer.valueOf(localColumn.getIndex()), localzasa2.b());
            i1 = 1;
            break;
          }
        }
        if (i1 == 0)
        {
          zasa localzasa1 = new zasa(localColumn, this.j.getColumnWidthInch(localColumn.getIndex()));
          zf.a(this.k.c, localzasa1);
          localzasa1.a("co" + this.k.c.size());
          this.g.put(Integer.valueOf(localColumn.getIndex()), localzasa1.b());
        }
      }
    }
  }
  
  private void b()
  {
    ArrayList localArrayList = this.j.getMergedCells();
    this.n = new ArrayList(localArrayList.size());
    WorksheetCollection localWorksheetCollection = this.k.a.getWorksheets();
    for (int i1 = 0; i1 < localArrayList.size(); i1++)
    {
      CellArea localCellArea = (CellArea)localArrayList.get(i1);
      zasu localzasu = new zasu(localCellArea);
      zf.a(this.n, localzasu);
      int i2 = this.j.d(localCellArea.StartRow, localCellArea.StartColumn);
      if (i2 == -1) {
        i2 = 15;
      }
      int i3 = i2;
      if ((localCellArea.StartRow != localCellArea.EndRow) || (localCellArea.StartColumn != localCellArea.EndColumn))
      {
        i3 = this.j.d(localCellArea.EndRow, localCellArea.EndColumn);
        if (i3 == -1) {
          i3 = 15;
        }
      }
      if (i2 == i3)
      {
        localzasu.e = i3;
      }
      else
      {
        Style localStyle1 = this.k.a.getWorksheets().e(i2);
        Style localStyle2 = this.k.a.getWorksheets().e(i3);
        if (localStyle1.f())
        {
          if (localStyle2.f())
          {
            Style localStyle3 = new Style(localWorksheetCollection);
            localStyle3.copy(localStyle1);
            localStyle3.getBorders().getByBorderType(2).a(localStyle2.getBorders().getByBorderType(2));
            localStyle3.getBorders().getByBorderType(8).a(localStyle2.getBorders().getByBorderType(8));
            localzasu.e = localWorksheetCollection.a(localStyle3);
          }
          else
          {
            localzasu.e = i2;
          }
        }
        else if (localStyle2.f()) {
          localzasu.e = i3;
        }
      }
    }
  }
  
  private void c()
  {
    if ((this.i.w() == null) || (this.i.getShapes().getCount() == 0)) {
      return;
    }
    this.u = new ArrayList();
    for (int i1 = 0; i1 < this.i.getShapes().getCount(); i1++)
    {
      Shape localShape = this.i.getShapes().get(i1);
      switch (localShape.getMsoDrawingType())
      {
      case 25: 
        break;
      default: 
        zf.a(this.u, new zatg(localShape));
      }
    }
  }
  
  void a()
  {
    PageSetup localPageSetup = this.i.getPageSetup();
    String str = localPageSetup.getHeader(0);
    a(str, 0, "&L");
    str = localPageSetup.getHeader(1);
    a(str, 1, "&C");
    str = localPageSetup.getHeader(2);
    a(str, 2, "&R");
    str = localPageSetup.getFooter(0);
    b(str, 0, "&L");
    str = localPageSetup.getFooter(1);
    b(str, 1, "&C");
    str = localPageSetup.getFooter(2);
    b(str, 2, "&R");
    ArrayList localArrayList;
    Font localFont;
    if ((this.s != null) || (this.t != null))
    {
      localArrayList = this.k.k;
      if (localArrayList.size() == 0)
      {
        localFont = new Font(this.i.c(), null, false);
        localFont.a(this.i.c().T(), null);
        localFont.d(1);
        zf.a(localArrayList, localFont);
      }
      if (this.s != null) {
        a(localArrayList, this.s);
      }
      if (this.t != null) {
        a(localArrayList, this.t);
      }
    }
    this.p = localPageSetup.isHFDiffOddEven();
    if (this.p)
    {
      str = localPageSetup.getEvenHeader(0);
      c(str, 0, "&L");
      str = localPageSetup.getEvenHeader(1);
      c(str, 1, "&C");
      str = localPageSetup.getEvenHeader(2);
      c(str, 2, "&R");
      str = localPageSetup.getEvenFooter(0);
      d(str, 0, "&L");
      str = localPageSetup.getEvenFooter(1);
      d(str, 1, "&C");
      str = localPageSetup.getEvenFooter(2);
      d(str, 2, "&R");
      if ((this.q != null) || (this.r != null))
      {
        localArrayList = this.k.k;
        if (localArrayList.size() == 0)
        {
          localFont = new Font(this.i.c(), null, false);
          localFont.a(this.i.c().T(), null);
          localFont.d(1);
          zf.a(localArrayList, localFont);
        }
        if (this.q != null) {
          a(localArrayList, this.q);
        }
        if (this.r != null) {
          a(localArrayList, this.r);
        }
      }
    }
  }
  
  private void a(ArrayList paramArrayList, ArrayList[] paramArrayOfArrayList)
  {
    for (int i1 = 0; i1 < paramArrayOfArrayList.length; i1++)
    {
      ArrayList localArrayList = paramArrayOfArrayList[i1];
      if (localArrayList != null) {
        for (int i2 = 0; i2 < localArrayList.size(); i2++)
        {
          HeaderFooterCommand localHeaderFooterCommand = (HeaderFooterCommand)localArrayList.get(i2);
          if (localHeaderFooterCommand.getFont() != null)
          {
            int i3 = 0;
            for (int i4 = 0; i4 < paramArrayList.size(); i4++)
            {
              Font localFont = (Font)paramArrayList.get(i4);
              if (localFont.equals(localHeaderFooterCommand.getFont()))
              {
                localHeaderFooterCommand.getFont().d(i4 + 1);
                i3 = 1;
                break;
              }
            }
            if (i3 == 0)
            {
              zf.a(paramArrayList, localHeaderFooterCommand.getFont());
              localHeaderFooterCommand.getFont().d(paramArrayList.size());
            }
          }
        }
      }
    }
  }
  
  private void a(String paramString1, int paramInt, String paramString2)
  {
    if ((paramString1 != null) && (!"".equals(paramString1)))
    {
      if (paramString1.startsWith(paramString2)) {
        paramString1 = paramString1.substring(2);
      }
      ArrayList localArrayList = HeaderFooterCommand.a(this.i.d(), paramString1);
      if ((localArrayList != null) && (localArrayList.size() != 0))
      {
        if (this.s == null) {
          this.s = new ArrayList[3];
        }
        this.s[paramInt] = localArrayList;
      }
    }
  }
  
  private void b(String paramString1, int paramInt, String paramString2)
  {
    if ((paramString1 != null) && (!"".equals(paramString1)))
    {
      if (paramString1.startsWith(paramString2)) {
        paramString1 = paramString1.substring(2);
      }
      ArrayList localArrayList = HeaderFooterCommand.a(this.i.d(), paramString1);
      if ((localArrayList != null) && (localArrayList.size() != 0))
      {
        if (this.t == null) {
          this.t = new ArrayList[3];
        }
        this.t[paramInt] = localArrayList;
      }
    }
  }
  
  private void c(String paramString1, int paramInt, String paramString2)
  {
    if ((paramString1 != null) && (!"".equals(paramString1)))
    {
      if (paramString1.startsWith(paramString2)) {
        paramString1 = paramString1.substring(2);
      }
      ArrayList localArrayList = HeaderFooterCommand.a(this.i.d(), paramString1);
      if ((localArrayList != null) && (localArrayList.size() != 0))
      {
        if (this.q == null) {
          this.q = new ArrayList[3];
        }
        this.q[paramInt] = localArrayList;
      }
    }
  }
  
  private void d(String paramString1, int paramInt, String paramString2)
  {
    if ((paramString1 != null) && (!"".equals(paramString1)))
    {
      if (paramString1.startsWith(paramString2)) {
        paramString1 = paramString1.substring(2);
      }
      ArrayList localArrayList = HeaderFooterCommand.a(this.i.d(), paramString1);
      if ((localArrayList != null) && (localArrayList.size() != 0))
      {
        if (this.r == null) {
          this.r = new ArrayList[3];
        }
        this.r[paramInt] = localArrayList;
      }
    }
  }
  
  Comment a(int paramInt1, int paramInt2)
  {
    if ((this.i.w() == null) || (this.i.getShapes().getCount() == 0)) {
      return null;
    }
    for (int i1 = 0; i1 < this.i.getComments().getCount(); i1++)
    {
      Comment localComment = this.i.getComments().get(i1);
      if ((localComment.getRow() == paramInt1) && (localComment.getColumn() == paramInt2)) {
        return localComment;
      }
    }
    return null;
  }
  
  boolean b(int paramInt1, int paramInt2)
  {
    if ((this.u == null) || (this.u.size() == 0)) {
      return false;
    }
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < this.u.size(); i1++)
    {
      zatg localzatg = (zatg)this.u.get(i1);
      if ((localzatg.f == paramInt1) && (localzatg.g == paramInt2)) {
        return true;
      }
    }
    return false;
  }
  
  ArrayList c(int paramInt1, int paramInt2)
  {
    if ((this.u == null) || (this.u.size() == 0)) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < this.u.size(); i1++)
    {
      zatg localzatg = (zatg)this.u.get(i1);
      if ((localzatg.f == paramInt1) && (localzatg.g == paramInt2))
      {
        zf.a(localArrayList, localzatg);
        this.u.remove(i1--);
      }
    }
    if (localArrayList.size() == 0) {
      return null;
    }
    return localArrayList;
  }
  
  zasu d(int paramInt1, int paramInt2)
  {
    for (int i1 = 0; i1 < this.n.size(); i1++)
    {
      zasu localzasu = (zasu)this.n.get(i1);
      if (localzasu.b < paramInt1) {
        this.n.remove(i1--);
      } else if ((paramInt1 >= localzasu.a) && (paramInt1 <= localzasu.b) && (paramInt2 >= localzasu.c) && (paramInt2 <= localzasu.d)) {
        return localzasu;
      }
    }
    return null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zasc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */