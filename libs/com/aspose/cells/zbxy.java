package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import java.util.ArrayList;
import java.util.List;

final class zbxy
{
  static void a(zr paramzr, zuc paramzuc, int paramInt, zp paramzp)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzuc == null) {
      return;
    }
    for (int i = 0; i < paramzuc.a.size(); i++)
    {
      zue localzue = (zue)paramzuc.a.get(i);
      zo localzo = localzue.a;
      float f5 = localzue.b;
      float f6 = localzue.c;
      if ((!localzo.b()) && (paramzuc.d() != 2))
      {
        int j = a(paramzuc);
        boolean bool = paramzuc.h();
        if (ziz.a(paramInt)) {
          bool = false;
        }
        float f1 = localzo.d();
        float f2 = localzo.e();
        float f3;
        float f4;
        if (bool)
        {
          if ((f1 >= paramzp.g()) && (f1 <= paramzp.i()))
          {
            if (f2 < paramzp.h()) {
              f2 = paramzp.h();
            }
            if (f2 > paramzp.j()) {
              f2 = paramzp.j();
            }
            if ((paramzuc.d() == 0) || (paramzuc.d() == 3))
            {
              f3 = localzo.d();
              f4 = localzo.e() - f6;
              if (f4 < paramzp.h()) {
                f4 = paramzp.h();
              }
              if (f4 > paramzp.j()) {
                f4 = paramzp.j();
              }
              if (f6 != 0.0F) {
                paramzuc.a().a(f1, f2, f3, f4);
              }
              if ((paramzuc.i()) && (localzo.e() - f6 >= paramzp.h()) && (localzo.e() - f6 <= paramzp.j())) {
                paramzuc.a().a(localzo.d() - j, localzo.e() - f6, localzo.d() + j, localzo.e() - f6);
              }
            }
            if ((paramzuc.d() == 0) || (paramzuc.d() == 1))
            {
              f3 = localzo.d();
              f4 = localzo.e() + f5;
              if (f4 < paramzp.h()) {
                f4 = paramzp.h();
              }
              if (f4 > paramzp.j()) {
                f4 = paramzp.j();
              }
              if (f5 != 0.0F) {
                paramzuc.a().a(f1, f2, f3, f4);
              }
              if ((paramzuc.i()) && (localzo.e() + f5 >= paramzp.h()) && (localzo.e() + f5 <= paramzp.j())) {
                paramzuc.a().a(localzo.d() - j, localzo.e() + f5, localzo.d() + j, localzo.e() + f5);
              }
            }
          }
        }
        else
        {
          if (f1 < paramzp.g()) {
            f1 = paramzp.g();
          }
          if (f1 > paramzp.i()) {
            f1 = paramzp.i();
          }
          if ((f2 >= paramzp.h()) && (f2 <= paramzp.j()))
          {
            if ((paramzuc.d() == 0) || (paramzuc.d() == 3))
            {
              f3 = localzo.d() + f6;
              f4 = localzo.e();
              if (f3 < paramzp.g()) {
                f3 = paramzp.g();
              }
              if (f3 > paramzp.i()) {
                f3 = paramzp.i();
              }
              if (f6 != 0.0F) {
                paramzuc.a().a(f1, f2, f3, f4);
              }
              if ((paramzuc.i()) && (localzo.d() + f6 >= paramzp.g()) && (localzo.d() + f6 <= paramzp.i())) {
                paramzuc.a().a(localzo.d() + f6, localzo.e() - j, localzo.d() + f6, localzo.e() + j);
              }
            }
            if ((paramzuc.d() == 0) || (paramzuc.d() == 1))
            {
              f3 = localzo.d() - f5;
              f4 = localzo.e();
              if (f3 < paramzp.g()) {
                f3 = paramzp.g();
              }
              if (f3 > paramzp.i()) {
                f3 = paramzp.i();
              }
              if (f5 != 0.0F) {
                paramzuc.a().a(f1, f2, f3, f4);
              }
              if ((paramzuc.i()) && (localzo.d() - f5 >= paramzp.g()) && (localzo.d() - f5 <= paramzp.i())) {
                paramzuc.a().a(localzo.d() - f5, localzo.e() - j, localzo.d() - f5, localzo.e() + j);
              }
            }
          }
        }
      }
    }
  }
  
  private static int a(zuc paramzuc)
  {
    if (paramzuc.a().i() <= 2.0D) {
      return 3;
    }
    if (paramzuc.a().i() <= 4.0D) {
      return (int)(paramzuc.a().i() + 1.0D);
    }
    return (int)paramzuc.a().i();
  }
  
  static void a(zbt paramzbt, ArrayList paramArrayList, zbff paramzbff)
    throws Exception
  {
    if (paramzbt.k() != 2) {
      return;
    }
    if (paramArrayList.size() <= 0) {
      return;
    }
    if (paramzbff.getCount() <= 0) {
      return;
    }
    if ((paramzbt.N()) && (paramzbt.M())) {
      return;
    }
    if (!ziz.a(paramzbt)) {
      return;
    }
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      double d = ziz.a(((zgn)paramArrayList.get(i)).a(), paramzbt.e().U());
      if ((!paramzbt.N()) && (d > paramzbt.z()))
      {
        a(paramzbff, i);
        paramArrayList.remove(i);
        i--;
      }
      if ((!paramzbt.M()) && (d < paramzbt.D()))
      {
        a(paramzbff, i);
        paramArrayList.remove(i);
        i--;
      }
    }
  }
  
  private static void a(zbff paramzbff, int paramInt)
    throws Exception
  {
    for (int i = 0; i < paramzbff.getCount(); i++)
    {
      zbfd localzbfd = paramzbff.c(i);
      zkh localzkh = localzbfd.F();
      if (localzkh.getCount() - 1 > paramInt) {
        localzkh.removeAt(paramInt);
      }
    }
  }
  
  static Color a(zjf paramzjf, zjy paramzjy)
  {
    if (paramzjf.aA())
    {
      Chart localChart = paramzjf.az();
      Workbook localWorkbook = paramzjf.az().getWorksheet().getWorkbook();
      zsw localzsw;
      switch (paramzjy.F())
      {
      case 8: 
        localzsw = paramzjf.az().Q().y().g();
        if (localzsw == null) {
          return Color.getEmpty();
        }
        return localzsw.b.b.a(localWorkbook, localChart);
      case 9: 
        localzsw = paramzjf.az().Q().d().g();
        if (localzsw == null) {
          return Color.getEmpty();
        }
        return localzsw.b.b.a(localWorkbook, localChart);
      case 12: 
        localzsw = paramzjf.az().Q().f().g();
        if (localzsw == null) {
          return Color.getEmpty();
        }
        return localzsw.b.b.a(localWorkbook, localChart);
      case 10: 
        localzsw = paramzjf.az().Q().c().g();
        if (localzsw == null) {
          return Color.getEmpty();
        }
        return localzsw.b.b.a(localWorkbook, localChart);
      case 11: 
        localzsw = paramzjf.az().Q().l().g();
        if (localzsw == null) {
          return Color.getEmpty();
        }
        return localzsw.b.b.a(localWorkbook, localChart);
      case 16: 
        localzsw = paramzjf.az().Q().A().g();
        if (localzsw == null) {
          return Color.getEmpty();
        }
        return localzsw.b.b.a(localWorkbook, localChart);
      }
    }
    return Color.getEmpty();
  }
  
  static Color a(zjf paramzjf, zsw paramzsw)
  {
    if (paramzsw == null) {
      return Color.getEmpty();
    }
    Chart localChart = paramzjf.az();
    Workbook localWorkbook = paramzjf.az().getWorksheet().getWorkbook();
    return paramzsw.b.b.a(localWorkbook, localChart);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */