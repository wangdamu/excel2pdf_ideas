package com.aspose.cells;

import com.aspose.cells.a.d.zav;
import com.aspose.cells.b.a.a.zc;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.a.zg;
import com.aspose.cells.b.a.b.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zlo
{
  static void a(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4, AutoFitterOptions paramAutoFitterOptions)
    throws Exception
  {
    if (paramAutoFitterOptions == null) {
      paramAutoFitterOptions = new AutoFitterOptions();
    }
    if (paramInt2 - paramInt1 > 2)
    {
      paramCells.c = new zlt(paramCells, 16383);
      try
      {
        b(paramCells, paramInt1, paramInt2, paramInt3, paramInt4, paramAutoFitterOptions);
      }
      finally
      {
        paramCells.l();
      }
    }
    else
    {
      b(paramCells, paramInt1, paramInt2, paramInt3, paramInt4, paramAutoFitterOptions);
    }
  }
  
  private static int a(WorksheetCollection paramWorksheetCollection, zgs paramzgs, Style paramStyle, String paramString, boolean paramBoolean, int paramInt)
    throws Exception
  {
    paramString = a(paramStyle, paramString);
    return a(paramWorksheetCollection, paramzgs, paramStyle, paramString, paramBoolean, 0, paramString.length(), paramInt);
  }
  
  private static int a(WorksheetCollection paramWorksheetCollection, zgs paramzgs, Style paramStyle, String paramString, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
    throws Exception
  {
    int i = paramInt1 + paramString.length() - 1;
    ArrayList localArrayList = null;
    Object localObject;
    if (paramzgs.c == 4)
    {
      localObject = (zbbj)paramzgs.d;
      if (((zbbj)localObject).f())
      {
        zbdd localzbdd = (zbdd)localObject;
        localArrayList = localzbdd.a(paramWorksheetCollection, paramInt2, paramStyle.getFont());
      }
    }
    if (localArrayList == null)
    {
      localArrayList = new ArrayList();
      localObject = new FontSetting(0, paramInt2, paramWorksheetCollection);
      ((FontSetting)localObject).q = paramStyle.q();
      zf.a(localArrayList, localObject);
    }
    FontSetting localFontSetting1 = 0;
    int j = 0;
    int k = 0;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      localFontSetting2 = (FontSetting)localIterator.next();
      n = localFontSetting2.o + localFontSetting2.p - 1;
      if (n >= paramInt1)
      {
        if (localFontSetting2.o > i) {
          break;
        }
        int i1 = Math.max(localFontSetting2.o, paramInt1) - paramInt1;
        n = Math.min(i, n) - paramInt1;
        int i2 = 0;
        float f = 10.0F;
        String str1 = "Arial";
        Font localFont = localFontSetting2.q;
        if (localFont != null)
        {
          if (localFont.isBold()) {
            i2 |= 0x1;
          }
          if (localFont.isItalic()) {
            i2 |= 0x2;
          }
          if (localFont.isStrikeout()) {
            i2 |= 0x8;
          }
          if (localFont.getUnderline() != 0) {
            i2 |= 0x4;
          }
          str1 = paramStyle.e().p().getSettings().a(localFont.getName());
          f = (float)localFont.getDoubleSize();
        }
        com.aspose.cells.a.d.zgs localzgs = zav.a().b(str1, i2, false);
        k = zanw.a(str1, f, i2);
        String str2 = paramString;
        int i3;
        if (localArrayList.size() > 0) {
          for (i3 = i1; i3 <= n; i3++) {
            localFontSetting1 += (int)localzgs.b(str2.charAt(i3), f);
          }
        } else {
          for (i3 = 0; i3 < str2.length(); i3++) {
            localFontSetting1 += (int)localzgs.b(str2.charAt(i3), f);
          }
        }
        if ((paramStyle.getRotationAngle() != 0) && (paramStyle.getRotationAngle() != 255)) {
          j = com.aspose.cells.a.d.zgs.a(str1, f, "|", i2).c();
        }
      }
    }
    if (paramStyle.getIndentLevel() > 0) {
      localFontSetting1 += paramInt3 * paramStyle.getIndentLevel();
    }
    if ((paramStyle.getRotationAngle() == 0) || (paramStyle.getRotationAngle() == 255))
    {
      if (paramBoolean)
      {
        m = 18;
        switch (paramStyle.getHorizontalAlignment())
        {
        case 1: 
          return localFontSetting1 + k * 4 + 1 + m * 2;
        }
        return localFontSetting1 + k * 4 + 1 + m;
      }
      return localFontSetting1 + k * 4 + 1;
    }
    int m = Math.abs(paramStyle.getRotationAngle());
    if (m == 90) {
      return j;
    }
    FontSetting localFontSetting2 = localFontSetting1;
    int n = j;
    double d = 3.141592653589793D * Math.abs(paramStyle.getRotationAngle()) / 180.0D;
    localFontSetting1 = (int)(localFontSetting2 * Math.cos(d) + n * Math.sin(d) + 6.5D);
    return localFontSetting1 + k * 4 + 1;
  }
  
  private static int a(zbl paramzbl, WorksheetCollection paramWorksheetCollection)
    throws Exception
  {
    int i = 0;
    ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < paramzbl.d.size(); j++)
    {
      localArrayList.clear();
      zqb localzqb1 = new zqb();
      localzqb1.a = ((String)paramzbl.d.get(j));
      localzqb1.b = new Font(paramWorksheetCollection, null, false);
      localzqb1.b.setName(paramzbl.a);
      zf.a(localArrayList, localzqb1);
      zat.a(localArrayList, paramWorksheetCollection.p());
      int k = 0;
      if ((localArrayList != null) && (localArrayList.size() > 0))
      {
        zqb localzqb2 = (zqb)localArrayList.get(0);
        localObject = localzqb2.b;
        if (localObject != null) {
          k = zanw.a(((Font)localObject).getName(), ((Font)localObject).getSize(), ((Font)localObject).p());
        }
      }
      int m = k * 4 + 1;
      Object localObject = localArrayList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        zqb localzqb3 = (zqb)((Iterator)localObject).next();
        com.aspose.cells.a.d.zgs localzgs = zav.a().b(localzqb3.b.getName(), paramzbl.c, false);
        float f = 0.0F;
        String str = localzqb3.a;
        for (int n = 0; n < str.length(); n++) {
          f += localzgs.b(str.charAt(n), paramzbl.b);
        }
        m += (int)(f + 0.5D);
      }
      if (i < m) {
        i = m;
      }
    }
    return i;
  }
  
  private static boolean a(Cells paramCells, int paramInt1, int paramInt2)
  {
    if (paramCells.g().hasAutofilter())
    {
      CellArea localCellArea = paramCells.g().getAutoFilter().i();
      if ((paramInt1 == localCellArea.StartRow) && (paramInt2 >= localCellArea.StartColumn) && (paramInt2 <= localCellArea.EndColumn)) {
        return true;
      }
    }
    if (paramCells.g().getListObjects().getCount() > 0) {
      return paramCells.g().getListObjects().g(paramInt1, paramInt2);
    }
    if (paramCells.g().getPivotTables().getCount() > 0) {
      return paramCells.g().getPivotTables().b(paramInt1, paramInt2);
    }
    return false;
  }
  
  private static void b(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4, AutoFitterOptions paramAutoFitterOptions)
    throws Exception
  {
    WorksheetCollection localWorksheetCollection = paramCells.p();
    Style localStyle1 = paramCells.p().Q();
    HashMap localHashMap1 = new HashMap();
    if (paramAutoFitterOptions != null) {
      for (i = 0; i < paramCells.getColumns().getCount(); i++)
      {
        localObject1 = paramCells.getColumns().getColumnByIndex(i);
        if ((((Column)localObject1).getIndex() >= paramInt3) && (((Column)localObject1).getIndex() <= paramInt4) && (paramAutoFitterOptions.getIgnoreHidden()) && (((Column)localObject1).isHidden())) {
          localHashMap1.put(Integer.valueOf(((Column)localObject1).getIndex()), Boolean.valueOf(true));
        }
      }
    }
    int i = paramCells.getCount() > 4096 ? 1 : 0;
    Object localObject1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    HashMap localHashMap3 = new HashMap();
    zapd localzapd = null;
    int j = zavt.a("   ", paramCells.p().T(), 1.0D);
    Object localObject2 = paramCells.o().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (CellArea)((Iterator)localObject2).next();
      if ((((CellArea)localObject3).EndRow >= paramInt1) && (((CellArea)localObject3).StartRow <= paramInt2) && (((CellArea)localObject3).EndColumn >= paramInt3) && (((CellArea)localObject3).StartColumn <= paramInt4))
      {
        localzapd = (zapd)localHashMap3.get(Integer.valueOf(((CellArea)localObject3).StartRow));
        if (localzapd == null)
        {
          localzapd = new zapd();
          localHashMap3.put(Integer.valueOf(((CellArea)localObject3).StartRow), localzapd);
        }
        localzapd.a((CellArea)localObject3);
      }
    }
    localzapd = new zapd();
    localObject2 = paramCells.e();
    Object localObject3 = paramCells.getRows().a.a(paramInt1, paramInt2, false);
    zgs localzgs1 = new zgs();
    zgs localzgs2 = localzgs1;
    int i1 = 0;
    int i8;
    int i9;
    while (((zaja)localObject3).hasNext())
    {
      zt localzt = ((zaja)localObject3).e();
      zaiv localzaiv = localzt.b(paramInt3, paramInt4, false);
      if (localzaiv != null)
      {
        int k = localzt.i();
        a(localHashMap3, localzapd, k);
        int n = Row.e(localzt);
        int i2 = 1;
        Object localObject4 = null;
        label1253:
        label1313:
        for (;;)
        {
          if (i2 != 0)
          {
            i1 = localzaiv.a();
            if (i1 < 0) {
              break;
            }
            localzgs2 = localzt.a(i1, localzgs1, 7);
          }
          int m = localzgs2.a;
          if (localHashMap1.get(Integer.valueOf(m)) != null)
          {
            i2 = 1;
          }
          else if (a(localzapd, k, m, localzgs2, paramAutoFitterOptions))
          {
            i2 = 1;
          }
          else
          {
            if (i2 != 0) {
              localObject4 = Cell.b(paramCells, n, localzgs2);
            } else {
              i2 = 1;
            }
            if (((HashMap)localObject1).get(Integer.valueOf(m)) == null) {
              ((HashMap)localObject1).put(Integer.valueOf(m), Integer.valueOf(0));
            }
            localObject5 = Cell.a(paramCells, (Style)localObject4, localzgs2, 1, false);
            if ((localObject5 != null) && (!"".equals(localObject5))) {
              if (a(paramCells, k, m))
              {
                int i3 = 0;
                int i6 = 0;
                i8 = ((String)localObject5).length();
                if (((Style)localObject4).isTextWrapped())
                {
                  String[] arrayOfString = zw.d((String)localObject5, '\n');
                  if (arrayOfString.length > 1)
                  {
                    localObject5 = arrayOfString[0] == null ? "" : arrayOfString[0];
                    i6 += ((String)localObject5).length();
                    for (i10 = 1; i10 < arrayOfString.length; i10++)
                    {
                      i6++;
                      if (arrayOfString[i10] != null)
                      {
                        if (arrayOfString[i10].length() > ((String)localObject5).length())
                        {
                          localObject5 = arrayOfString[i10];
                          i3 = i6;
                        }
                        i6 += arrayOfString[i10].length();
                      }
                    }
                  }
                }
                i9 = a(localWorksheetCollection, localzgs2, (Style)localObject4, (String)localObject5, true, i3, i8, j);
                int i10 = ((Integer)((HashMap)localObject1).get(Integer.valueOf(m))).intValue();
                if (i10 < i9) {
                  ((HashMap)localObject1).put(Integer.valueOf(m), Integer.valueOf(i9));
                }
              }
              else
              {
                if (((((Style)localObject4).getRotationAngle() == 0) || (((Style)localObject4).getRotationAngle() == 255)) && (((Style)localObject4).getIndentLevel() == 0))
                {
                  ArrayList localArrayList1 = (ArrayList)localHashMap2.get(Integer.valueOf(m));
                  if (localArrayList1 == null)
                  {
                    localArrayList1 = new ArrayList();
                    localHashMap2.put(Integer.valueOf(m), localArrayList1);
                  }
                  if (((Style)localObject4).getHorizontalAlignment() == 2)
                  {
                    if (m == paramInt4)
                    {
                      i1 = localzt.a(i1, false);
                      if (i1 > -1)
                      {
                        localzgs2 = localzt.a(i1, localzgs1, 7);
                        if (localzgs2.a == m + 1)
                        {
                          if ((localzgs2.c == 0) && (Cell.b(paramCells, n, localzgs2).getHorizontalAlignment() == 2)) {
                            break;
                          }
                          a(localArrayList1, (Style)localObject4, (String)localObject5);
                          break;
                        }
                      }
                      if (paramCells.p().f(Cell.a(paramCells, n, m + 1)).getHorizontalAlignment() == 2) {
                        break;
                      }
                      a(localArrayList1, (Style)localObject4, (String)localObject5);
                      break;
                    }
                    i1 = localzaiv.a();
                    if (i1 < 0)
                    {
                      if (paramCells.p().f(Cell.a(paramCells, n, m + 1)).getHorizontalAlignment() == 2) {
                        break;
                      }
                      a(localArrayList1, (Style)localObject4, (String)localObject5);
                      break;
                    }
                    localzgs2 = localzt.a(i1, localzgs1, 7);
                    if (localzgs2.a == m + 1)
                    {
                      if (localzgs2.c == 0)
                      {
                        Style localStyle2 = Cell.b(paramCells, n, localzgs2);
                        if (((Style)localObject4).getHorizontalAlignment() == 2) {
                          continue;
                        }
                        a(localArrayList1, (Style)localObject4, (String)localObject5);
                        localObject4 = localStyle2;
                        i2 = 0;
                        continue;
                      }
                      a(localArrayList1, (Style)localObject4, (String)localObject5);
                    }
                    else if (paramCells.p().f(Cell.a(paramCells, n, m + 1)).getHorizontalAlignment() != 2)
                    {
                      a(localArrayList1, (Style)localObject4, (String)localObject5);
                    }
                    i2 = 0;
                    localObject4 = Cell.b(paramCells, n, localzgs2);
                    break label1253;
                  }
                  if ((i == 0) || (localzgs2.d()))
                  {
                    i7 = a(localWorksheetCollection, localzgs2, (Style)localObject4, (String)localObject5, false, j);
                    i8 = ((Integer)((HashMap)localObject1).get(Integer.valueOf(m))).intValue();
                    if (i8 < i7) {
                      ((HashMap)localObject1).put(Integer.valueOf(m), Integer.valueOf(i7));
                    }
                  }
                  else
                  {
                    a(localArrayList1, (Style)localObject4, (String)localObject5);
                  }
                  break label1313;
                }
                int i4 = a(localWorksheetCollection, localzgs2, (Style)localObject4, (String)localObject5, false, j);
                i7 = ((Integer)((HashMap)localObject1).get(Integer.valueOf(m))).intValue();
                if (i7 < i4) {
                  ((HashMap)localObject1).put(Integer.valueOf(m), Integer.valueOf(i4));
                }
              }
            }
          }
        }
      }
    }
    Object localObject5 = zg.a(localHashMap2);
    while (((zc)localObject5).c())
    {
      ArrayList localArrayList2 = (ArrayList)((zc)localObject5).b();
      i7 = ((Integer)((zc)localObject5).a()).intValue();
      i8 = 0;
      for (i9 = 0; i9 < localArrayList2.size(); i9++)
      {
        zbl localzbl = (zbl)localArrayList2.get(i9);
        int i11 = a(localzbl, paramCells.p());
        if (i8 < i11) {
          i8 = i11;
        }
      }
      i9 = ((Integer)((HashMap)localObject1).get(Integer.valueOf(i7))).intValue();
      if (i8 > i9) {
        ((HashMap)localObject1).put(Integer.valueOf(i7), Integer.valueOf(i8));
      }
    }
    localObject5 = zg.a((HashMap)localObject1);
    int i5 = paramCells.p().p().h() ? 1048575 : 65535;
    int i7 = (paramInt1 == 0) && (paramInt2 == i5) ? 1 : 0;
    while (((zc)localObject5).c())
    {
      i8 = ((Integer)((zc)localObject5).b()).intValue();
      if (i8 != 0) {
        if ((paramAutoFitterOptions != null) && (paramAutoFitterOptions.b))
        {
          i9 = paramCells.getColumnWidthPixel(((Integer)((zc)localObject5).a()).intValue());
          if (i9 >= i8 - 1) {}
        }
        else
        {
          paramCells.getColumns().get(((Integer)((zc)localObject5).a()).intValue()).setWidth(zlp.a(i8, localWorksheetCollection));
        }
      }
    }
  }
  
  private static String a(Style paramStyle, String paramString)
  {
    if (paramStyle.isTextWrapped())
    {
      String[] arrayOfString = zw.d(paramString, '\n');
      if (arrayOfString.length > 1)
      {
        paramString = arrayOfString[0] == null ? "" : arrayOfString[0];
        for (int i = 1; i < arrayOfString.length; i++) {
          if ((arrayOfString[i] != null) && (arrayOfString[i].length() > paramString.length())) {
            paramString = arrayOfString[i];
          }
        }
      }
    }
    return paramString;
  }
  
  private static void a(ArrayList paramArrayList, Style paramStyle, String paramString)
  {
    int i = 0;
    float f = 10.0F;
    String str1 = "Arial";
    Object localObject;
    if (paramStyle.q() != null)
    {
      localObject = paramStyle.q();
      if (((Font)localObject).isBold()) {
        i |= 0x1;
      }
      if (((Font)localObject).isItalic()) {
        i |= 0x2;
      }
      if (((Font)localObject).isStrikeout()) {
        i |= 0x8;
      }
      if (((Font)localObject).getUnderline() != 0) {
        i |= 0x4;
      }
      str1 = ((Font)localObject).getName();
      f = (float)((Font)localObject).getDoubleSize();
    }
    if (paramStyle.isTextWrapped())
    {
      localObject = zw.d(paramString, '\n');
      if (localObject.length > 1)
      {
        paramString = localObject[0] == null ? "" : localObject[0];
        for (int k = 1; k < localObject.length; k++) {
          if ((localObject[k] != null) && (localObject[k].length() > paramString.length())) {
            paramString = localObject[k];
          }
        }
      }
    }
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      zbl localzbl2 = (zbl)paramArrayList.get(j);
      if ((zw.b(localzbl2.a, str1)) && (localzbl2.c == i) && ((int)localzbl2.b == (int)f))
      {
        for (int m = 0; m < localzbl2.d.size(); m++)
        {
          String str2 = (String)localzbl2.d.get(m);
          if (zw.b(str2, paramString)) {
            return;
          }
          if (str2.length() < paramString.length())
          {
            localzbl2.d.add(m, paramString);
            if (localzbl2.d.size() > 10) {
              localzbl2.d.remove(10);
            }
            return;
          }
        }
        if (localzbl2.d.size() < 10) {
          zf.a(localzbl2.d, paramString);
        }
        return;
      }
    }
    zbl localzbl1 = new zbl();
    localzbl1.a = str1;
    localzbl1.b = f;
    localzbl1.c = i;
    zf.a(localzbl1.d, paramString);
    zf.a(paramArrayList, localzbl1);
  }
  
  private static void a(HashMap paramHashMap, zapd paramzapd, int paramInt)
  {
    Object localObject;
    for (int i = paramzapd.getCount() - 1; i >= 0; i--)
    {
      localObject = paramzapd.a(i);
      if (((CellArea)localObject).EndRow < paramInt) {
        paramzapd.removeAt(i);
      }
    }
    zapd localzapd = (zapd)paramHashMap.get(Integer.valueOf(paramInt));
    if (localzapd != null)
    {
      localObject = localzapd.iterator();
      while (((Iterator)localObject).hasNext())
      {
        CellArea localCellArea = (CellArea)((Iterator)localObject).next();
        paramzapd.a(localCellArea);
      }
    }
  }
  
  private static boolean a(zapd paramzapd, int paramInt1, int paramInt2, zgs paramzgs, AutoFitterOptions paramAutoFitterOptions)
  {
    for (int i = 0; i < paramzapd.getCount(); i++)
    {
      CellArea localCellArea = paramzapd.a(i);
      if ((localCellArea.StartRow <= paramInt1) && (localCellArea.EndRow >= paramInt1) && (localCellArea.StartColumn <= paramInt2) && (localCellArea.EndColumn >= paramInt2)) {
        return localCellArea.StartColumn != localCellArea.EndColumn;
      }
    }
    if ((paramAutoFitterOptions != null) && (paramAutoFitterOptions.b)) {
      switch (paramzgs.h())
      {
      case 0: 
      case 2: 
      case 3: 
      case 5: 
      case 6: 
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */