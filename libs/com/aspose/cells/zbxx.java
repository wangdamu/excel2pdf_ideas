package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zp;
import java.util.ArrayList;
import java.util.List;

final class zbxx
{
  static void a(zr paramzr, zub paramzub, int paramInt, zp paramzp)
  {
    if (zbxz.a(paramzp)) {
      return;
    }
    if (paramzub == null) {
      return;
    }
    for (int i = 0; i < paramzub.a.size(); i++)
    {
      zud localzud = (zud)paramzub.a.get(i);
      zo localzo = localzud.a;
      float f5 = localzud.b;
      float f6 = localzud.c;
      if ((!localzo.b()) && (paramzub.d() != 2))
      {
        int j = 3;
        boolean bool = paramzub.h();
        if (ziy.a(paramInt)) {
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
            if ((paramzub.d() == 0) || (paramzub.d() == 3))
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
                zanv.a(paramzr, f1, f2, f3, f4, paramzub.a());
              }
              if ((paramzub.i()) && (localzo.e() - f6 >= paramzp.h()) && (localzo.e() - f6 <= paramzp.j())) {
                zanv.a(paramzr, localzo.d() - j, localzo.e() - f6, localzo.d() + j, localzo.e() - f6, paramzub.a());
              }
            }
            if ((paramzub.d() == 0) || (paramzub.d() == 1))
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
                zanv.a(paramzr, f1, f2, f3, f4, paramzub.a());
              }
              if ((paramzub.i()) && (localzo.e() + f5 >= paramzp.h()) && (localzo.e() + f5 <= paramzp.j())) {
                zanv.a(paramzr, localzo.d() - j, localzo.e() + f5, localzo.d() + j, localzo.e() + f5, paramzub.a());
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
            if ((paramzub.d() == 0) || (paramzub.d() == 3))
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
                zanv.a(paramzr, f1, f2, f3, f4, paramzub.a());
              }
              if ((paramzub.i()) && (localzo.d() + f6 >= paramzp.g()) && (localzo.d() + f6 <= paramzp.i())) {
                zanv.a(paramzr, localzo.d() + f6, localzo.e() - j, localzo.d() + f6, localzo.e() + j, paramzub.a());
              }
            }
            if ((paramzub.d() == 0) || (paramzub.d() == 1))
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
                zanv.a(paramzr, f1, f2, f3, f4, paramzub.a());
              }
              if ((paramzub.i()) && (localzo.d() - f5 >= paramzp.g() + 0.5F) && (localzo.d() - f5 <= paramzp.i() - 0.5F)) {
                zanv.a(paramzr, localzo.d() - f5, localzo.e() - j, localzo.d() - f5, localzo.e() + j, paramzub.a());
              }
            }
          }
        }
      }
    }
  }
  
  static void a(zbs paramzbs, ArrayList paramArrayList, zbfe paramzbfe)
    throws Exception
  {
    if (paramzbs.k() != 2) {
      return;
    }
    if (paramArrayList.size() <= 0) {
      return;
    }
    if (paramzbfe.getCount() <= 0) {
      return;
    }
    if ((paramzbs.N()) && (paramzbs.M())) {
      return;
    }
    if (!ziy.a(paramzbs)) {
      return;
    }
    for (int i = 0; i < paramArrayList.size(); i++)
    {
      double d = ziy.a(((zgm)paramArrayList.get(i)).a(), paramzbs.c().U());
      if ((!paramzbs.N()) && (d > paramzbs.z()))
      {
        a(paramzbfe, i);
        paramArrayList.remove(i);
        i--;
      }
      if ((!paramzbs.M()) && (d < paramzbs.D()))
      {
        a(paramzbfe, i);
        paramArrayList.remove(i);
        i--;
      }
    }
  }
  
  private static void a(zbfe paramzbfe, int paramInt)
    throws Exception
  {
    for (int i = 0; i < paramzbfe.getCount(); i++)
    {
      zbfc localzbfc = paramzbfe.c(i);
      zkg localzkg = localzbfc.D();
      if (localzkg.getCount() - 1 > paramInt) {
        localzkg.removeAt(paramInt);
      }
    }
  }
  
  static void a(zbs paramzbs1, zbs paramzbs2, zbfe paramzbfe, zbfc paramzbfc)
  {
    if (paramzbfc.aq()) {
      return;
    }
    int i = 10;
    int j;
    int k;
    zke localzke;
    if ((paramzbs1.n()) && (paramzbfc.aw())) {
      for (j = 0; j < paramzbfe.getCount(); j++) {
        for (k = 0; k < paramzbfe.a(j).k().getCount(); k++)
        {
          localzke = paramzbfe.c(j).D().b(k);
          if (localzke != null) {
            if (localzke.q() > 0.0D)
            {
              localzke.b(localzke.q());
              localzke.a(com.aspose.cells.b.a.zr.a(localzke.q(), i));
            }
            else
            {
              localzke.a(true);
            }
          }
        }
      }
    }
    if (paramzbs2.n()) {
      for (j = 0; j < paramzbfe.getCount(); j++) {
        for (k = 0; k < paramzbfe.a(j).k().getCount(); k++)
        {
          localzke = paramzbfe.c(j).D().b(k);
          if (localzke != null) {
            if (localzke.w() > 0.0D)
            {
              localzke.d(localzke.w());
              localzke.c(com.aspose.cells.b.a.zr.a(localzke.w(), i));
            }
            else
            {
              localzke.a(true);
            }
          }
        }
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbxx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */