package com.aspose.cells;

import com.aspose.cells.a.c.zc;
import com.aspose.cells.a.d.zav;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zbdj
{
  static void a(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4, AutoFitterOptions paramAutoFitterOptions)
    throws Exception
  {
    if (paramInt2 - paramInt1 > 2)
    {
      paramCells.c = new zlt(paramCells, 16383);
      paramCells.b = new zlx(paramCells, 16383);
      try
      {
        b(paramCells, paramInt1, paramInt2, paramInt3, paramInt4, paramAutoFitterOptions);
      }
      finally
      {
        paramCells.l();
        paramCells.k();
      }
    }
    else
    {
      b(paramCells, paramInt1, paramInt2, paramInt3, paramInt4, paramAutoFitterOptions);
    }
  }
  
  static int a(Cell paramCell, Style paramStyle, ArrayList paramArrayList, int paramInt1, int paramInt2)
    throws Exception
  {
    zat.a(paramArrayList, paramCell.d.p().p());
    Iterator localIterator = paramArrayList.iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (zqb)localIterator.next();
      ((zqb)localObject1).b.setName(zav.a().a(((zqb)localObject1).b.getName()));
    }
    int i = 0;
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      localObject1 = (zqb)paramArrayList.get(0);
      localObject2 = ((zqb)localObject1).b;
      if (localObject2 != null) {
        i = zanw.a(((Font)localObject2).getName(), ((Font)localObject2).getSize(), ((Font)localObject2).p());
      }
    }
    Object localObject1 = new zgw(paramCell.getRow(), paramCell.getColumn());
    ((zgw)localObject1).a(paramCell);
    ((zgw)localObject1).a(paramStyle);
    ((zgw)localObject1).a(paramArrayList);
    ((zgw)localObject1).b(false);
    Object localObject2 = zha.a((zgw)localObject1, paramInt1, 600.0F);
    int j = (int)(((zgz)localObject2).f * paramInt2 / 72.0F + 0.5D);
    if (paramStyle.getRotationAngle() != 0)
    {
      int k = (int)(((zgz)localObject2).e * paramInt2 / 72.0F + 0.5D) + 4 * i + 1;
      int m = Math.abs(paramStyle.getRotationAngle());
      if (m == 90) {
        return k;
      }
      if (paramStyle.getRotationAngle() == 255) {
        return j;
      }
      return (int)(k * Math.sin(3.141592653589793D * m / 180.0D) + j * Math.cos(3.141592653589793D * m / 180.0D) + 6.5D);
    }
    return j;
  }
  
  private static Object a(Cells paramCells, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramCells.o().getCount(); i++)
    {
      CellArea localCellArea = paramCells.o().a(i);
      if ((localCellArea.StartRow <= paramInt1) && (localCellArea.EndRow >= paramInt1) && (localCellArea.StartColumn <= paramInt2) && (localCellArea.EndColumn >= paramInt2)) {
        return localCellArea;
      }
    }
    return null;
  }
  
  private static Object a(Cells paramCells, HashMap paramHashMap, int paramInt1, int paramInt2)
  {
    Object localObject = paramHashMap.get(Integer.valueOf(paramInt1));
    if (localObject == null) {
      return null;
    }
    zami localzami = (zami)localObject;
    for (int i = 0; i < localzami.a(); i++)
    {
      CellArea localCellArea = paramCells.o().a(localzami.b(i));
      if ((localCellArea.StartColumn <= paramInt2) && (localCellArea.EndColumn >= paramInt2)) {
        return localCellArea;
      }
    }
    return null;
  }
  
  private static HashMap a(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < paramCells.o().getCount(); i++)
    {
      CellArea localCellArea = paramCells.o().a(i);
      if ((localCellArea.StartRow <= paramInt2) && (localCellArea.EndRow >= paramInt1)) {
        for (int j = localCellArea.StartRow; j <= localCellArea.EndRow; j++) {
          if (j >= paramInt1)
          {
            if (j > paramInt2) {
              break;
            }
            Object localObject = localHashMap.get(Integer.valueOf(j));
            if (localObject == null)
            {
              localObject = new zami(4);
              localHashMap.put(Integer.valueOf(j), localObject);
            }
            ((zami)localObject).a(i);
          }
        }
      }
    }
    return localHashMap;
  }
  
  private static int a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, AutoFitterOptions paramAutoFitterOptions)
  {
    int i = paramInt2 - paramInt4;
    if (paramAutoFitterOptions.a)
    {
      if ((i >= 0) && (i < paramArrayOfInt.length)) {
        paramArrayOfInt[i] = paramInt3;
      } else if (paramInt3 > paramInt1) {
        paramInt1 = paramInt3;
      }
    }
    else if (i >= 0) {
      if (i < paramArrayOfInt.length) {
        paramArrayOfInt[i] = paramInt3;
      } else if ((paramInt2 <= paramInt5) && (paramInt3 > paramInt1)) {
        paramInt1 = paramInt3;
      }
    }
    return paramInt1;
  }
  
  private static void b(Cells paramCells, int paramInt1, int paramInt2, int paramInt3, int paramInt4, AutoFitterOptions paramAutoFitterOptions)
    throws Exception
  {
    float f = 1440.0F / zbxp.a();
    HashMap localHashMap1 = new HashMap();
    int i = zavt.a(paramCells.p().T());
    localHashMap1.put(Integer.valueOf(-1), Integer.valueOf(i));
    localHashMap1.put(Integer.valueOf(15), Integer.valueOf(i));
    int j = zavt.a("   ", paramCells.p().T(), 1.0D);
    RowCollection localRowCollection = paramCells.getRows();
    Worksheet localWorksheet = paramCells.g();
    CellArea localCellArea1 = new CellArea();
    int k = 0;
    if (localWorksheet.hasAutofilter())
    {
      k = 1;
      localCellArea1 = localWorksheet.getAutoFilter().i();
    }
    HashMap localHashMap2 = null;
    if (paramCells.o().getCount() > 1024) {
      localHashMap2 = a(paramCells, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    int m = paramCells.b((short)0);
    int[] arrayOfInt1 = null;
    int n = 0;
    int i1 = 0;
    int i2 = 16384;
    Object localObject1;
    if ((paramCells.getColumns().a() != null) && (paramCells.getColumns().a().e()))
    {
      localObject1 = paramCells.getColumns().a();
      i2 = ((Column)localObject1).getIndex();
      i1 = i;
      if (((Column)localObject1).e()) {
        i1 = zavt.a(((Column)localObject1).f().getFont());
      }
      if (((Column)localObject1).getIndex() == 0) {
        i = i1;
      }
    }
    else
    {
      n = i;
    }
    if (paramAutoFitterOptions.a)
    {
      if ((paramCells.getColumns().a() != null) && (paramCells.getColumns().a().e()))
      {
        if (paramCells.getColumns().getCount() > 0) {
          if ((paramCells.getColumns().getColumnByIndex(0).getIndex() == 0) && (paramCells.getColumns().getColumnByIndex(paramCells.getColumns().getCount() - 1).getIndex() + 1 == i2)) {
            n = i1;
          } else {
            n = i1 > i ? i1 : i;
          }
        }
      }
      else {
        n = i;
      }
      arrayOfInt1 = new int[m + 1];
      if (i2 < arrayOfInt1.length)
      {
        zc.a(arrayOfInt1, 0, i2, i);
        zc.a(arrayOfInt1, i2, arrayOfInt1.length, i1);
      }
      else
      {
        zc.a(arrayOfInt1, 0, arrayOfInt1.length, i);
      }
      localObject1 = paramCells.getColumns().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (Column)((Iterator)localObject1).next();
        int i3 = ((Column)localObject2).getIndex() >= i2 ? i1 : i;
        if (((Column)localObject2).e()) {
          i3 = zavt.a(((Column)localObject2).f().getFont());
        }
        n = a(arrayOfInt1, n, ((Column)localObject2).getIndex(), i3, paramInt3, paramInt4, paramAutoFitterOptions);
      }
      if (paramCells.isDefaultRowHeightMatched())
      {
        double d = zbxp.a(n, (int)CellsHelper.getDPI());
        paramCells.a((int)(d * 20.0D + 0.5D));
      }
    }
    int[] arrayOfInt2 = null;
    if (paramAutoFitterOptions.a) {
      arrayOfInt2 = new int[arrayOfInt1.length];
    }
    Object localObject2 = null;
    zzu localzzu = new zzu();
    localzzu.a(paramCells.g().getWorkbook().getSettings().getGlobalizationSettings());
    zaja localzaja = localRowCollection.a.a(paramInt1, paramInt2, false);
    Object localObject3 = null;
    zbdx localzbdx1 = new zbdx();
    int i4 = -1;
    int i7 = 0;
    Object localObject4 = new zgs();
    Object localObject5 = localObject4;
    Object localObject6 = new zgs();
    Object localObject7 = localObject6;
    Style localStyle2 = null;
    int i8 = 0;
    int i9 = -1;
    int i10 = -1;
    int i12 = paramCells.g().d().h() ? 16384 : 256;
    int i13 = zbzv.i(paramCells.p().Q()) & 0xFF;
    int i14 = i13;
    i14 >>= 2;
    int i15;
    while (localzaja.hasNext())
    {
      zt localzt = localzaja.e();
      zbdx localzbdx2 = localzt.a(localzbdx1, 15);
      if (localzbdx2.a != i4 + 1)
      {
        i4 = localzbdx2.a;
        localObject3 = null;
        if (i13 != 0)
        {
          if (localzt.a() == i12)
          {
            i14 = 0;
          }
          else
          {
            i14 = i13;
            i14 &= 0xC;
            if (((i13 & 0x4) == 0) && (i4 > 0) && ((i13 & 0x1) != 0)) {
              i14 |= 0xC;
            }
          }
        }
        else {
          i14 = 0;
        }
      }
      else
      {
        i4++;
        i14 <<= 2;
      }
      if (((!localzbdx2.b()) || ((!paramAutoFitterOptions.getIgnoreHidden()) && ((k == 0) || (i4 < localCellArea1.StartRow) || (i4 > localCellArea1.EndRow)))) && ((!paramAutoFitterOptions.getOnlyAuto()) || (localzbdx2.c())))
      {
        if (localHashMap2 != null) {
          localHashMap2.remove(Integer.valueOf(i4 - 1));
        }
        i15 = n;
        int i6 = localzbdx2.d() ? localzbdx2.d : -1;
        Style localStyle1;
        if (i6 > -1)
        {
          localStyle1 = paramCells.p().f(i6);
          if (localHashMap1.get(Integer.valueOf(i6)) != null)
          {
            i15 = ((Integer)localHashMap1.get(Integer.valueOf(i6))).intValue();
          }
          else
          {
            i15 = zavt.a(localStyle1.getFont());
            if (!localStyle1.isTextWrapped()) {
              localHashMap1.put(Integer.valueOf(i6), Integer.valueOf(i15));
            }
          }
          i14 = a(localStyle1, i14);
          localObject2 = null;
        }
        else if (paramAutoFitterOptions.a)
        {
          localObject2 = arrayOfInt2;
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt2.length);
        }
        int i16 = 0;
        zaiv localzaiv = localzt.b(paramInt3, paramInt4, false);
        if (localzaiv != null)
        {
          int i11 = 1;
          localStyle1 = null;
          for (;;)
          {
            if (i11 != 0)
            {
              i7 = localzaiv.a();
              if (i7 < 0) {
                break;
              }
              localObject5 = localzt.a(i7, (zgs)localObject4, 7);
            }
            int i5 = ((zgs)localObject5).a;
            Object localObject8 = null;
            if (localHashMap2 == null) {
              localObject8 = a(paramCells, i4, i5);
            } else {
              localObject8 = a(paramCells, localHashMap2, i4, i5);
            }
            if (localObject8 != null)
            {
              CellArea localCellArea2 = (CellArea)localObject8;
              if (((localCellArea2.StartRow != localCellArea2.EndRow) && (!paramAutoFitterOptions.getAutoFitMergedCells())) || (i4 != localCellArea2.StartRow) || (i5 != localCellArea2.StartColumn))
              {
                i11 = 1;
                continue;
              }
            }
            if (i11 != 0)
            {
              i9 = Cell.a(paramCells, i6, (zgs)localObject5);
              localStyle1 = paramCells.p().f(i9);
              i14 = a(localStyle1, i14);
            }
            else
            {
              i11 = 1;
            }
            if (((localStyle1.isTextWrapped()) || (localStyle1.getRotationAngle() != 0)) && (((zgs)localObject5).h() == 5) && (!((zgs)localObject5).c()))
            {
              int i18 = paramCells.d(i5);
              if (localObject8 != null) {
                i18 += paramCells.b.b(i5 + 1, ((CellArea)localObject8).EndColumn);
              }
              int i20;
              if (localStyle1.getHorizontalAlignment() == 2)
              {
                i5++;
                Object localObject9;
                for (;;)
                {
                  i8 = localzaiv.a();
                  if (i8 < 0) {
                    break label1633;
                  }
                  localObject7 = localzt.a(i8, (zgs)localObject6, 7);
                  if (((zgs)localObject7).a > i5)
                  {
                    i20 = i5;
                    while (i5 < ((zgs)localObject7).a)
                    {
                      localObject9 = paramCells.p().f(Cell.a(paramCells, i6, i5));
                      i14 = a((Style)localObject9, i14);
                      if (((Style)localObject9).getHorizontalAlignment() != 2) {
                        break;
                      }
                      i5++;
                    }
                    if (i5 < ((zgs)localObject7).a)
                    {
                      if (i5 > i20) {
                        i18 += paramCells.b.b(i20, i5 - 1);
                      }
                      i10 = Cell.a(paramCells, i6, (zgs)localObject7);
                      localStyle2 = paramCells.p().f(i10);
                      i14 = a(localStyle2, i14);
                      i11 = 0;
                      break label1633;
                    }
                    i18 += paramCells.b.b(i20, i5 - 1);
                  }
                  i10 = Cell.a(paramCells, i6, (zgs)localObject7);
                  localStyle2 = paramCells.p().f(i10);
                  i14 = a(localStyle2, i14);
                  if ((((zgs)localObject7).c != 0) || (localStyle2.getHorizontalAlignment() != 2)) {
                    break;
                  }
                  i18 += paramCells.b.a(((zgs)localObject7).a);
                  i5 = ((zgs)localObject7).a + 1;
                }
                i11 = 0;
                label1633:
                if (i11 != 0)
                {
                  if (i5 <= paramInt4)
                  {
                    i20 = i5;
                    while (i5 <= paramInt4)
                    {
                      localObject9 = paramCells.p().f(Cell.a(paramCells, i6, i5));
                      i14 = a((Style)localObject9, i14);
                      if (((Style)localObject9).getHorizontalAlignment() != 2) {
                        break;
                      }
                      i5++;
                    }
                    i18 += paramCells.b.b(i20, i5 - 1);
                  }
                  if (i5 > paramInt4)
                  {
                    localObject9 = localzt.b(paramInt4 + 1, -1, false);
                    i8 = -1;
                    if (localObject9 != null) {
                      for (;;)
                      {
                        i8 = ((zaiv)localObject9).a();
                        if (i8 < 0) {
                          break;
                        }
                        localObject7 = localzt.a(i8, (zgs)localObject6, 7);
                        if (((zgs)localObject7).a > i5)
                        {
                          i20 = i5;
                          while (i5 < ((zgs)localObject7).a)
                          {
                            Style localStyle3 = paramCells.p().f(Cell.a(paramCells, i6, i5));
                            i14 = a(localStyle3, i14);
                            if (localStyle3.getHorizontalAlignment() != 2) {
                              break;
                            }
                            i5++;
                          }
                          if (i5 < ((zgs)localObject7).a)
                          {
                            if (i5 <= i20) {
                              break;
                            }
                            i18 += paramCells.b.b(i20, i5 - 1);
                            break;
                          }
                          i18 += paramCells.b.b(i20, i5 - 1);
                        }
                        i10 = Cell.a(paramCells, i6, (zgs)localObject7);
                        localStyle2 = paramCells.p().f(i10);
                        i14 = a(localStyle2, i14);
                        if ((((zgs)localObject7).c != 0) || (localStyle2.getHorizontalAlignment() != 2)) {
                          break;
                        }
                        i18 += paramCells.b.a(((zgs)localObject7).a);
                        i5 = ((zgs)localObject7).a + 1;
                      }
                    }
                    if (i8 < 0)
                    {
                      int i21 = 0;
                      int i22;
                      if (i6 > -1)
                      {
                        if (paramCells.p().f(i6).getHorizontalAlignment() == 2) {
                          i21 = 1;
                        }
                      }
                      else
                      {
                        i22 = paramCells.getColumns().getCount();
                        i21 = paramCells.p().Q().getHorizontalAlignment() == 2 ? 1 : 0;
                        if (i22 > 0)
                        {
                          i8 = paramCells.getColumns().e(i5);
                          if (i8 < 0) {}
                          for (i8 = -i8 - 1; i8 < i22; i8++)
                          {
                            Column localColumn = paramCells.getColumns().getColumnByIndex(i8);
                            if (localColumn.getIndex() > i5)
                            {
                              if (i21 == 0) {
                                break;
                              }
                              i18 += paramCells.b.b(i5, localColumn.getIndex() - 1);
                            }
                            Style localStyle4 = paramCells.p().f(localColumn.c());
                            i14 = a(localStyle4, i14);
                            if (localStyle4.getHorizontalAlignment() != 2)
                            {
                              i21 = 0;
                              break;
                            }
                            i18 += localColumn.a(true);
                          }
                        }
                      }
                      if (i21 != 0)
                      {
                        i22 = paramCells.b.b(i5, 16383);
                        if (i22 < 0) {
                          i18 = Integer.MAX_VALUE;
                        } else {
                          i18 += i22;
                        }
                      }
                    }
                  }
                }
              }
              if (localStyle1.getIndentLevel() != 0)
              {
                i20 = j * localStyle1.getIndentLevel();
                if (i18 > i20) {
                  i18 -= i20;
                }
              }
              Cell localCell2 = new Cell(localzaja.f(), i7, (zgs)localObject5, localObject5 == localObject4);
              localzzu.a(new zic(paramCells, localCell2.getRow(), ((zgs)localObject5).a, localStyle1, (i9 < 0) || (i9 == 15)));
              i16 = a(localCell2, localStyle1, localCell2.a(localzzu, localStyle1), i18, zbxp.a());
              if (i11 == 0)
              {
                localObject5 = localObject7;
                localObject7 = localObject4;
                localObject4 = localObject6;
                localObject6 = localObject7;
                i7 = i8;
                localStyle1 = localStyle2;
              }
            }
            else if (localHashMap1.get(Integer.valueOf(i9)) != null)
            {
              i16 = ((Integer)localHashMap1.get(Integer.valueOf(i9))).intValue();
            }
            else
            {
              Cell localCell1 = new Cell(localzaja.f(), i7, (zgs)localObject5, localObject5 == localObject4);
              i16 = a(localCell1, localStyle1, localCell1.I(), Integer.MAX_VALUE, zbxp.a());
              localHashMap1.put(Integer.valueOf(i9), Integer.valueOf(i16));
            }
            if (i16 > i15) {
              i15 = i16;
            }
          }
          if ((localObject2 != null) && (paramAutoFitterOptions.a)) {
            localObject2[localObject5.a] = i16;
          }
        }
        int i17;
        if ((localObject2 != null) && (paramAutoFitterOptions.a)) {
          for (i17 = 0; i17 < localObject2.length; i17++) {
            if (localObject2[i17] > i15) {
              i15 = localObject2[i17];
            }
          }
        }
        if ((localObject3 != null) && (((i14 & 0x8) != 0) || (((((zt)localObject3).l(1) & 0xFF & 0x20) == 0) && (localzbdx2.b()) && (((zt)localObject3).i() + 1 == localzt.i()) && ((i14 & 0x2) != 0))))
        {
          i17 = ((zt)localObject3).l(1);
          if (!zbdx.h(i17))
          {
            ((zt)localObject3).a(1, zbdx.f(i17, true));
            i19 = (int)(((int)(((zt)localObject3).k() / f + 0.5D) + 1) * f + 0.5D);
            if (i19 > paramAutoFitterOptions.getMaxRowHeight() * 20.0D) {
              i19 = (int)(paramAutoFitterOptions.getMaxRowHeight() * 20.0D);
            }
            ((zt)localObject3).m(i19);
            localzt.g();
          }
        }
        byte b = zbdx.g(localzt.l(1));
        if ((i14 & 0x4) != 0)
        {
          b = zbdx.e(b, true);
          i15++;
        }
        if ((i14 & 0x2) != 0)
        {
          b = zbdx.f(b, true);
          i15++;
        }
        localzt.a(1, b);
        int i19 = (int)(i15 * f + 0.5D);
        if (i19 > paramAutoFitterOptions.getMaxRowHeight() * 20.0D) {
          i19 = (int)(paramAutoFitterOptions.getMaxRowHeight() * 20.0D);
        }
        localzt.m(i19);
        Row.b(localzt, (paramAutoFitterOptions.a) && (!paramAutoFitterOptions.getAutoFitMergedCells()));
        localObject3 = localzt;
      }
    }
    if (((i14 & 0x2) == 0) && ((i13 & 0x8) != 0) && (i4 > -1)) {
      if (i4 < (paramCells.g().d().h() ? 1048575 : 65535))
      {
        ((zt)localObject3).a(1, zbdx.f(((zt)localObject3).l(1), true));
        i15 = (int)(((int)(((zt)localObject3).k() / f + 0.5D) + 1) * f + 0.5D);
        if (i15 > paramAutoFitterOptions.getMaxRowHeight() * 20.0D) {
          i15 = (int)(paramAutoFitterOptions.getMaxRowHeight() * 20.0D);
        }
        ((zt)localObject3).m(i15);
      }
    }
  }
  
  private static int a(Style paramStyle, int paramInt)
  {
    if (((paramInt & 0xF) == 15) || (paramStyle.d() == null)) {
      return paramInt;
    }
    BorderCollection localBorderCollection = paramStyle.getBorders();
    int i;
    if ((paramInt & 0x8) == 0)
    {
      i = localBorderCollection.getByBorderType(4).getLineStyle();
      if (zbdx.a(i)) {
        paramInt |= 0xC;
      } else if (zbdx.b(i)) {
        paramInt |= 0x8;
      }
    }
    else if (((paramInt & 0x4) == 0) && (zbdx.a(localBorderCollection.getByBorderType(4).getLineStyle())))
    {
      paramInt |= 0x4;
    }
    if ((paramInt & 0x2) == 0)
    {
      i = localBorderCollection.getByBorderType(8).getLineStyle();
      if (zbdx.a(i)) {
        paramInt |= 0x3;
      } else if (zbdx.b(i)) {
        paramInt |= 0x2;
      }
    }
    else if (((paramInt & 0x1) == 0) && (zbdx.a(localBorderCollection.getByBorderType(8).getLineStyle())))
    {
      paramInt |= 0x1;
    }
    return paramInt;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbdj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */