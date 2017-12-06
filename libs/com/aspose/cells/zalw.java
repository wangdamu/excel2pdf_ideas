package com.aspose.cells;

import com.aspose.cells.b.c.a.za;
import java.util.HashMap;

class zalw
{
  private zqh a = null;
  private Worksheet b = null;
  private zqi c;
  private HashMap d;
  private boolean e;
  private zajl f;
  private zalh g = null;
  private static final za h = new za(new String[] { "cols", "sheetData", "n", "s", "str", "e", "b" });
  
  zalw(zqh paramzqh, zqi paramzqi, boolean paramBoolean)
  {
    this.a = paramzqh;
    this.c = paramzqi;
    this.b = paramzqi.d;
    this.f = this.b.d().getWorksheets().g;
    this.d = new HashMap();
    this.e = paramBoolean;
  }
  
  void a(zcjy paramzcjy)
    throws Exception
  {
    e(paramzcjy);
    if (paramzcjy.o()) {
      return;
    }
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else {
        switch (h.a(paramzcjy.q()))
        {
        case 0: 
          c(paramzcjy);
          break;
        case 1: 
          b(paramzcjy);
          break;
        default: 
          paramzcjy.a();
        }
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
    int i = -1;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ("row".equals(paramzcjy.q()))
      {
        i = a(paramzcjy, i);
      }
      else
      {
        paramzcjy.a();
        throw new CellsException(6, "Invalid sheetData sub Element " + paramzcjy.q());
      }
    }
    paramzcjy.h();
  }
  
  private int a(zcjy paramzcjy, int paramInt)
    throws Exception
  {
    int i = paramInt + 1;
    int j = -1;
    double d1 = -1.0D;
    int k = 0;
    int m = 0;
    boolean bool1 = false;
    int n = 0;
    int i1 = -1;
    boolean bool2 = false;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("r".equals(paramzcjy.q()))
        {
          i = zauj.F(paramzcjy.t()) - 1;
        }
        else if ("s".equals(paramzcjy.q()))
        {
          j = zauj.F(paramzcjy.t());
        }
        else if (("customFormat".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
        {
          k = 1;
        }
        else if ("ht".equals(paramzcjy.q()))
        {
          d1 = zauj.C(paramzcjy.t());
          if (d1 > 409.5D) {
            d1 = 409.5D;
          }
          n = 1;
        }
        else if (("customHeight".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
        {
          m = 1;
        }
        else if (("hidden".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
        {
          bool1 = true;
        }
        else if ("outlineLevel".equals(paramzcjy.q()))
        {
          i1 = zauj.H(paramzcjy.t());
        }
        else if (("collapsed".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
        {
          bool2 = true;
        }
      }
      paramzcjy.l();
    }
    Row localRow = this.b.getCells().getRows().a(i, 16);
    if ((j != -1) && (k != 0))
    {
      Object localObject = this.a.d.get(Integer.valueOf(j));
      if (localObject != null)
      {
        localRow.e(((Integer)localObject).intValue());
        localRow.c(true);
      }
      else
      {
        throw new CellsException(6, "Invalid row style Idx, rowid:" + i);
      }
    }
    localRow.b(bool2);
    if (i1 != -1) {
      localRow.a((byte)i1);
    }
    if (n != 0) {
      if (m != 0)
      {
        this.b.getCells().setRowHeight(i, d1);
      }
      else
      {
        localRow.f((int)(d1 * 20.0D));
        localRow.setHeightMatched(true);
      }
    }
    localRow.setHidden(bool1);
    if (paramzcjy.o())
    {
      paramzcjy.a();
      return i;
    }
    int i2 = -1;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("c".equals(paramzcjy.q())) {
        i2 = a(paramzcjy, localRow, i, i2);
      } else {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return i;
  }
  
  void a(zalh paramzalh)
  {
    this.g = paramzalh;
  }
  
  private int a(zcjy paramzcjy, Row paramRow, int paramInt1, int paramInt2)
    throws Exception
  {
    int i = -1;
    String str1 = "n";
    String str2 = null;
    if (paramzcjy.n())
    {
      while (paramzcjy.m()) {
        if ("r".equals(paramzcjy.q())) {
          str2 = paramzcjy.t();
        } else if ("s".equals(paramzcjy.q())) {
          i = zauj.F(paramzcjy.t());
        } else if ("t".equals(paramzcjy.q())) {
          str1 = paramzcjy.t();
        }
      }
      paramzcjy.l();
    }
    int j = paramInt2 + 1;
    Object localObject1;
    if (str2 != null)
    {
      int k = 0;
      int[] arrayOfInt1 = { k };
      localObject1 = new int[] { j };
      CellsHelper.a(str2, arrayOfInt1, (int[])localObject1);
      k = arrayOfInt1[0];
      j = localObject1[0];
      if ((paramInt1 != k) || (j < paramInt2 + 1)) {
        throw new CellsException(6, "Invalid cell name");
      }
    }
    Cell localCell = paramRow.a(this.b.getCells().getRows(), j, false, false, false);
    paramInt2 = j;
    if (i != -1)
    {
      m = ((Integer)this.a.d.get(Integer.valueOf(i))).intValue();
      localCell.b(m);
    }
    else
    {
      localCell.b(15);
    }
    if (paramzcjy.o())
    {
      if (localCell.A()) {
        localCell.f();
      }
      paramzcjy.a();
      return paramInt2;
    }
    int m = 1;
    paramzcjy.d();
    while (paramzcjy.s() != 4)
    {
      paramzcjy.k();
      if (paramzcjy.s() != 1)
      {
        paramzcjy.a();
      }
      else if ((this.e) && ("f".equals(paramzcjy.q())))
      {
        m = 0;
        localObject1 = paramzcjy.a("t");
        String str3;
        if (("array".equals(localObject1)) || ("shared".equals(localObject1)))
        {
          str3 = paramzcjy.a("ref");
          String str4 = paramzcjy.a("si");
          String str5 = paramzcjy.j();
          Object localObject2;
          if ((str3 != null) && (str5 != null))
          {
            if ("array".equals(localObject1))
            {
              int n = 0;
              int i1 = 0;
              int[] arrayOfInt2 = { n };
              int[] arrayOfInt3 = { i1 };
              a(str3, arrayOfInt2, arrayOfInt3);
              n = arrayOfInt2[0];
              i1 = arrayOfInt3[0];
              localCell.a("=" + str5, n, i1);
            }
            else if ("shared".equals(localObject1))
            {
              localObject2 = (CellArea)CellArea.a(str3, true);
              byte[] arrayOfByte = localCell.a("=" + str5, (CellArea)localObject2);
              if (str4 != null) {
                this.d.put(str4, arrayOfByte);
              }
            }
          }
          else if (("shared".equals(localObject1)) && (str4 != null))
          {
            localObject2 = this.d.get(str4);
            if (localObject2 != null) {
              localCell.c((byte[])localObject2);
            }
          }
        }
        else
        {
          str3 = paramzcjy.j();
          localCell.setFormula("=" + str3);
        }
      }
      else if ("v".equals(paramzcjy.q()))
      {
        if ((m != 0) && (localCell.A())) {
          localCell.f();
        }
        localObject1 = paramzcjy.j();
        if ((localObject1 != null) && (!"".equals(localObject1))) {
          a(localCell, (String)localObject1, str1);
        }
      }
      else if ("is".equals(paramzcjy.q()))
      {
        if (("inlineStr".equals(str1)) && (this.g != null))
        {
          localObject1 = this.g.b(paramzcjy);
          localCell.a(4, localObject1, false);
        }
        else
        {
          paramzcjy.a();
        }
      }
      else
      {
        paramzcjy.a();
      }
    }
    paramzcjy.h();
    return paramInt2;
  }
  
  private void a(Cell paramCell, String paramString1, String paramString2)
  {
    switch (h.a(paramString2))
    {
    case 2: 
      double d1 = zauj.C(paramString1);
      paramCell.a(1, Double.valueOf(d1));
      break;
    case 3: 
      int i = zauj.F(paramString1);
      zbbj localzbbj = this.f.a(i);
      localzbbj.d += 1;
      paramCell.a(4, localzbbj, false);
      break;
    case 4: 
      if (!paramCell.g()) {
        paramCell.putValue(paramString1);
      } else {
        paramCell.a(4, paramString1);
      }
      break;
    case 5: 
      paramCell.a(3, Byte.valueOf(ztr.b(paramString1)));
      break;
    case 6: 
      boolean bool = "1".equals(paramString1);
      paramCell.a(2, Boolean.valueOf(bool));
      break;
    }
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
      if (paramzcjy.s() != 1) {
        paramzcjy.a();
      } else if ("col".equals(paramzcjy.q())) {
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
    if (!paramzcjy.n())
    {
      paramzcjy.a();
      return;
    }
    int i = -1;
    int j = -1;
    int k = -1;
    int m = -1;
    double d1 = -1.0D;
    int n = 0;
    boolean bool1 = false;
    int i1 = 0;
    boolean bool2 = false;
    while (paramzcjy.m()) {
      if ("min".equals(paramzcjy.q()))
      {
        i = zauj.F(paramzcjy.t()) - 1;
        if (j == -1) {
          j = i;
        }
      }
      else if ("max".equals(paramzcjy.q()))
      {
        j = zauj.F(paramzcjy.t()) - 1;
      }
      else if ("width".equals(paramzcjy.q()))
      {
        d1 = zauj.C(paramzcjy.t());
        n = 1;
      }
      else if ("style".equals(paramzcjy.q()))
      {
        k = zauj.F(paramzcjy.t());
      }
      else if (("hidden".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
      {
        bool1 = true;
      }
      else if (("customWidth".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
      {
        i1 = 1;
      }
      else if ("outlineLevel".equals(paramzcjy.q()))
      {
        m = zauj.H(paramzcjy.t());
      }
      else if (("collapsed".equals(paramzcjy.q())) && ("1".equals(paramzcjy.t())))
      {
        bool2 = true;
      }
    }
    paramzcjy.l();
    paramzcjy.a();
    for (int i2 = i; (i2 <= j) && (i2 <= 255); i2++)
    {
      Column localColumn = this.b.getCells().getColumns().get(i2);
      if ((n != 0) && (i1 != 0)) {
        this.b.getCells().setColumnWidthPixel(i2, (int)(d1 * this.a.a.getWorksheets().U()));
      }
      if (k != -1)
      {
        int i3 = ((Integer)this.a.d.get(Integer.valueOf(k))).intValue();
        localColumn.c(i3);
      }
      else
      {
        localColumn.c(15);
      }
      if (m != -1) {
        localColumn.a((byte)m);
      }
      localColumn.setHidden(bool1);
      localColumn.c(bool2);
    }
  }
  
  private void e(zcjy paramzcjy)
    throws Exception
  {
    paramzcjy.k();
    if ((paramzcjy.s() != 1) || (!"worksheet".equals(paramzcjy.q()))) {
      throw new CellsException(6, "Absent root element: worksheet");
    }
  }
  
  private static void a(String paramString, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    for (int i = 0; (i < paramString.length()) && (paramString.charAt(i) != ':'); i++) {}
    if (i == paramString.length())
    {
      paramArrayOfInt1[0] = 1;
      paramArrayOfInt2[0] = 1;
      return;
    }
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int[] arrayOfInt1 = { j };
    int[] arrayOfInt2 = { m };
    CellsHelper.a(paramString.substring(0, 0 + i), arrayOfInt1, arrayOfInt2);
    j = arrayOfInt1[0];
    m = arrayOfInt2[0];
    int[] arrayOfInt3 = { k };
    int[] arrayOfInt4 = { n };
    CellsHelper.a(paramString.substring(i + 1), arrayOfInt3, arrayOfInt4);
    k = arrayOfInt3[0];
    n = arrayOfInt4[0];
    paramArrayOfInt1[0] = (k - j + 1);
    paramArrayOfInt2[0] = (n - m + 1);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zalw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */