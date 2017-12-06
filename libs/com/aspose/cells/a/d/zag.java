package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.b.zo;
import com.aspose.cells.b.a.b.zq;
import com.aspose.cells.b.a.b.zt;
import java.util.ArrayList;

public class zag
{
  public static ArrayList a(Color paramColor1, Color paramColor2, zq paramzq, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramzq.h() == 0.0F) || (paramzq.i() == 0.0F)) {
      return localArrayList;
    }
    zi localzi = null;
    zp localzp = null;
    double d;
    float f1;
    float f2;
    zo localzo2;
    zo localzo3;
    zo localzo4;
    zo localzo5;
    switch (paramInt1)
    {
    case 4: 
      switch (paramInt2)
      {
      case 1: 
        localzi = new zi(paramzq.d(), new zo(paramzq.j(), paramzq.m()), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(paramzq);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 2: 
        localzi = new zi(new zo(paramzq.j(), paramzq.m()), paramzq.d(), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(paramzq);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 3: 
        localzi = new zi(paramzq.d(), new zo(paramzq.j(), paramzq.k() + paramzq.i() / 2.0F), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(new zq(paramzq.d(), new zt(paramzq.h(), paramzq.i() / 2.0F)));
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        localzi = new zi(new zo(paramzq.j(), paramzq.m()), new zo(paramzq.j(), paramzq.k() + paramzq.i() / 2.0F), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(new zq(paramzq.j(), paramzq.k() + paramzq.i() / 2.0F, paramzq.h(), paramzq.i() / 2.0F));
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
      }
      break;
    case 5: 
      switch (paramInt2)
      {
      case 1: 
        localzi = new zi(paramzq.d(), new zo(paramzq.l(), paramzq.k()), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(paramzq);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 2: 
        localzi = new zi(new zo(paramzq.l(), paramzq.k()), paramzq.d(), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(paramzq);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 3: 
        localzi = new zi(paramzq.d(), new zo(paramzq.l() - paramzq.h() / 2.0F, paramzq.k()), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(new zq(paramzq.j(), paramzq.k(), paramzq.h() / 2.0F, paramzq.i()));
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        localzi = new zi(new zo(paramzq.l(), paramzq.k()), new zo(paramzq.l() - paramzq.h() / 2.0F, paramzq.k()), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(new zq(paramzq.j() + paramzq.h() / 2.0F, paramzq.k(), paramzq.h() / 2.0F, paramzq.i()));
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
      }
      break;
    case 1: 
      switch (paramInt2)
      {
      case 1: 
        localzi = new zi(paramzq.d(), new zo(paramzq.l(), paramzq.m()), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(paramzq);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 2: 
        localzi = new zi(new zo(paramzq.l(), paramzq.m()), paramzq.d(), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(paramzq);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 3: 
        d = Math.atan2(paramzq.i(), paramzq.h());
        f1 = (float)(paramzq.h() * Math.sin(d) * Math.sin(d));
        f2 = (float)(f1 * Math.tan(d));
        localzi = new zi(paramzq.d(), new zo(paramzq.j() + f1, paramzq.m() - f2), paramColor1, paramColor2, 1.0F);
        localzp = zp.a(paramzq.d(), new zo(paramzq.l(), paramzq.k()), new zo(paramzq.j(), paramzq.m()));
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        localzp = zp.a(new zo(paramzq.j(), paramzq.m()), new zo(paramzq.l(), paramzq.k()));
        localzp.a(new zx(paramColor2));
        zf.a(localArrayList, localzp);
        localzi = new zi(new zo(paramzq.l(), paramzq.m()), new zo(paramzq.l() - f1, paramzq.k() + f2), paramColor1, paramColor2, 1.0F);
        localzp = zp.a(new zo(paramzq.l(), paramzq.m()), new zo(paramzq.l(), paramzq.k()), new zo(paramzq.j(), paramzq.m()));
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
      }
      break;
    case 0: 
      switch (paramInt2)
      {
      case 1: 
        localzi = new zi(new zo(paramzq.l(), paramzq.k()), new zo(paramzq.l(), paramzq.m()), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(paramzq);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 2: 
        localzi = new zi(new zo(paramzq.j(), paramzq.m()), new zo(paramzq.l(), paramzq.k()), paramColor1, paramColor2, 1.0F);
        localzp = zp.b(paramzq);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 3: 
        d = Math.atan2(paramzq.i(), paramzq.h());
        f1 = (float)(paramzq.h() * Math.sin(d) * Math.sin(d));
        f2 = (float)(f1 * Math.tan(d));
        localzi = new zi(new zo(paramzq.l(), paramzq.k()), new zo(paramzq.l() - f1, paramzq.m() - f2), paramColor1, paramColor2, 1.0F);
        localzp = zp.a(paramzq.d(), new zo(paramzq.l(), paramzq.k()), new zo(paramzq.l(), paramzq.m()));
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        localzp = zp.a(new zo(paramzq.l(), paramzq.m()), new zo(paramzq.j(), paramzq.k()));
        localzp.a(new zx(paramColor2));
        zf.a(localArrayList, localzp);
        localzi = new zi(new zo(paramzq.j(), paramzq.m()), new zo(paramzq.j() + f1, paramzq.k() + f2), paramColor1, paramColor2, 1.0F);
        localzp = zp.a(new zo(paramzq.l(), paramzq.m()), new zo(paramzq.j(), paramzq.m()), paramzq.d());
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
      }
      break;
    case 2: 
      zo localzo1 = new zo((paramzq.j() + paramzq.l()) / 2.0F, (paramzq.k() + paramzq.m()) / 2.0F);
      localzo2 = new zo(paramzq.j(), paramzq.k());
      localzo3 = new zo(paramzq.l(), paramzq.k());
      localzo4 = new zo(paramzq.l(), paramzq.m());
      localzo5 = new zo(paramzq.j(), paramzq.m());
      localzi = new zi(new zo(paramzq.j(), paramzq.k()), new zo(localzo1.d(), paramzq.k()), paramColor2, paramColor1, 1.0F);
      localzp = zp.a(localzo2, localzo1, localzo5);
      localzp.a(localzi);
      zf.a(localArrayList, localzp);
      localzi = new zi(new zo(paramzq.j(), paramzq.k()), new zo(paramzq.j(), localzo1.e()), paramColor2, paramColor1, 1.0F);
      localzp = zp.a(localzo2, localzo1, localzo3);
      localzp.a(localzi);
      zf.a(localArrayList, localzp);
      localzi = new zi(new zo(paramzq.l(), paramzq.k()), new zo(localzo1.d(), paramzq.k()), paramColor2, paramColor1, 1.0F);
      localzp = zp.a(localzo3, localzo1, localzo4);
      localzp.a(localzi);
      zf.a(localArrayList, localzp);
      localzi = new zi(new zo(paramzq.l(), paramzq.m()), new zo(paramzq.l(), localzo1.e()), paramColor2, paramColor1, 1.0F);
      localzp = zp.a(localzo4, localzo1, localzo5);
      localzp.a(localzi);
      zf.a(localArrayList, localzp);
      break;
    case 3: 
      localzo2 = new zo(paramzq.j(), paramzq.k());
      localzo3 = new zo(paramzq.l(), paramzq.k());
      localzo4 = new zo(paramzq.l(), paramzq.m());
      localzo5 = new zo(paramzq.j(), paramzq.m());
      switch (paramInt2)
      {
      case 1: 
        localzi = new zi(localzo2, localzo3, paramColor1, paramColor2, 1.0F);
        localzp = zp.a(localzo2, localzo3, localzo4);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        localzi = new zi(localzo2, localzo5, paramColor1, paramColor2, 1.0F);
        localzp = zp.a(localzo2, localzo5, localzo4);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 2: 
        localzi = new zi(localzo2, localzo3, paramColor2, paramColor1, 1.0F);
        localzp = zp.a(localzo2, localzo3, localzo5);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        localzi = new zi(localzo2, localzo5, paramColor1, paramColor2, 1.0F);
        localzp = zp.a(localzo3, localzo5, localzo4);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 3: 
        localzi = new zi(localzo5, localzo2, paramColor1, paramColor2, 1.0F);
        localzp = zp.a(localzo2, localzo3, localzo5);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        localzi = new zi(localzo5, localzo4, paramColor1, paramColor2, 1.0F);
        localzp = zp.a(localzo3, localzo5, localzo4);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        break;
      case 4: 
        localzi = new zi(localzo3, localzo4, paramColor2, paramColor1, 1.0F);
        localzp = zp.a(localzo2, localzo3, localzo4);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
        localzi = new zi(localzo5, localzo4, paramColor2, paramColor1, 1.0F);
        localzp = zp.a(localzo2, localzo5, localzo4);
        localzp.a(localzi);
        zf.a(localArrayList, localzp);
      }
      break;
    }
    return localArrayList;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */