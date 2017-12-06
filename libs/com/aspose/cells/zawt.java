package com.aspose.cells;

import com.aspose.cells.a.c.zp;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zawt
{
  private int a;
  private int b;
  private byte[] c = new byte[2];
  private byte[] d;
  private zawp e;
  private zqj f;
  private Worksheet g;
  private zcal h;
  private int i = 0;
  private int j = 0;
  private int k = 0;
  
  void a(zawp paramzawp, Worksheet paramWorksheet, zcal paramzcal)
    throws Exception
  {
    this.h = paramzcal;
    zxf localzxf = paramzcal.c;
    zaoz localzaoz = localzxf.a().b("_SX_DB_CUR");
    if (localzaoz == null) {
      return;
    }
    String str = zp.c(paramzawp.b);
    zh localzh = localzaoz.a(str);
    if (localzh == null) {
      return;
    }
    this.e = paramzawp;
    localzaoz.g(str);
    this.g = paramWorksheet;
    this.e.u = localzh.o();
  }
  
  void b(zawp paramzawp, Worksheet paramWorksheet, zcal paramzcal)
    throws Exception
  {
    this.h = paramzcal;
    zxf localzxf = paramzcal.c;
    zaoz localzaoz = localzxf.a().b("_SX_DB_CUR");
    if (localzaoz == null) {
      return;
    }
    String str = zp.c(paramzawp.b);
    zh localzh = localzaoz.a(str);
    if (localzh == null) {
      return;
    }
    this.e = paramzawp;
    localzaoz.g(str);
    this.g = paramWorksheet;
    a(localzh);
  }
  
  private void a(zh paramzh)
    throws Exception
  {
    this.f = new zqj(paramzh);
    while (!this.f.a())
    {
      this.a = this.f.b(this.c);
      int i1;
      switch (this.a)
      {
      case 198: 
        c();
        this.i = zc.a(this.d, 0);
        this.e.b = (zc.e(this.d, 4) & 0xFFFF);
        this.e.g = zc.e(this.d, 6);
        this.e.r = (zc.e(this.d, 8) & 0xFFFF);
        this.j = (zc.e(this.d, 10) & 0xFFFF);
        this.k = (zc.e(this.d, 12) & 0xFFFF);
        int m = zc.b(this.d, 18);
        if (m != -1) {
          if (this.d[20] == 0) {
            this.e.n = Encoding.getASCII().a(this.d, 21, this.d.length - 21);
          } else {
            this.e.n = Encoding.getUnicode().a(this.d, 21, this.d.length - 21);
          }
        }
        break;
      case 290: 
        c();
        double d1 = zc.f(this.d, 0);
        if (d1 >= 0.0D)
        {
          this.e.k = CellsHelper.getDateTimeFromDouble(d1, this.g.d().getSettings().getDate1904());
          this.e.l = d1;
        }
        i1 = zc.e(this.d, 8) & 0xFFFF;
        if (i1 != 0) {
          a(i1);
        }
        break;
      case 199: 
        this.f.a(-2);
        a();
        zbtv localzbtv = null;
        for (int n = 0; n < this.e.i.size(); n++)
        {
          localzbtv = (zbtv)this.e.i.get(n);
          i1 = (localzbtv.c == null) || (localzbtv.c.size() == 0) ? 1 : 0;
          int i2 = (localzbtv.n()) && (localzbtv.j != null) && (localzbtv.j.d != null) && (localzbtv.j.d.size() > 0) ? 1 : 0;
          if ((i1 != 0) && (i2 != 0))
          {
            localzbtv.o = true;
            localzbtv.j.k = localzbtv.i;
          }
        }
        break;
      case 200: 
        this.f.a(-2);
        b();
        return;
      case 10: 
        this.f.a(2);
        return;
      }
    }
    if (this.e.h == null) {
      this.e.a(false, 1);
    }
  }
  
  private void a(int paramInt)
    throws Exception
  {
    zaxa localzaxa = null;
    zbui localzbui = null;
    zbur localzbur = null;
    zbtz localzbtz = null;
    for (;;)
    {
      this.a = this.f.b(this.c);
      switch (this.a)
      {
      case 249: 
        c();
        localzaxa = new zaxa(this.e);
        if (this.e.m == null) {
          this.e.m = new zawz();
        }
        this.e.m.a(localzaxa);
        int m = zc.e(this.d, 0) & 0xFFFF;
        localzaxa.c = new byte[m];
        System.arraycopy(this.d, 4, localzaxa.c, 0, m);
        break;
      case 246: 
        c();
        localzbui = new zbui();
        if (localzaxa.e == null) {
          localzaxa.e = new zbun();
        }
        localzaxa.e.a(localzbui);
        localzbui.a = zc.e(this.d, 0);
        localzbui.b = zc.e(this.d, 2);
        localzbui.c = zc.e(this.d, 4);
        break;
      case 248: 
        c();
        zbuj localzbuj = new zbuj();
        localzbui.b().a(localzbuj);
        localzbuj.a = zc.e(this.d, 0);
        localzbuj.b = zc.e(this.d, 2);
        localzbuj.c = zc.e(this.d, 6);
        break;
      case 240: 
        c();
        localzaxa.g = (localzbur = new zbur());
        localzbur.a = this.d[0];
        localzbur.b = this.d[1];
        localzbur.c = zc.e(this.d, 2);
        break;
      case 242: 
        c();
        localzbtz = new zbtz();
        zf.a(localzbur.e, localzbtz);
        localzbtz.a = zc.e(this.d, 0);
        localzbtz.b = zc.e(this.d, 2);
        localzbtz.a(zc.e(this.d, 4));
        break;
      case 245: 
        c();
        if (localzbtz.c == null) {
          localzbtz.c = new ArrayList();
        }
        zf.a(localzbtz.c, Integer.valueOf(zc.e(this.d, 0) & 0xFFFF));
        break;
      case 259: 
        c();
        localzaxa.f = zc.b(this.d, 2);
        break;
      case 10: 
      case 199: 
      case 200: 
        this.f.a(-2);
        return;
      default: 
        this.b = this.f.b(this.c);
        this.f.a(this.b & 0xFFFF);
      }
    }
  }
  
  void a()
    throws Exception
  {
    zbtv localzbtv = null;
    while (!this.f.a())
    {
      this.a = this.f.b(this.c);
      Object localObject;
      switch (this.a)
      {
      case 199: 
        c();
        localzbtv = new zbtv(this.e);
        if (this.e.i == null) {
          this.e.i = new ArrayList();
        }
        zf.a(this.e.i, localzbtv);
        localzbtv.b = zc.e(this.d, 0);
        localzbtv.h = (zc.e(this.d, 2) & 0xFFFF);
        localzbtv.a(zc.e(this.d, 4) & 0xFFFF);
        localzbtv.m = (zc.e(this.d, 12) & 0xFFFF);
        localzbtv.a = zct.a(this.d, 14);
        if (localzbtv.c())
        {
          localzbtv.c = new ArrayList();
          localzbtv.e(false);
          if (localzbtv.n())
          {
            localObject = new SxRng(localzbtv);
            localzbtv.j = ((SxRng)localObject);
            localzbtv.j.d = new ArrayList();
            if (localzbtv.i != 0) {
              localzbtv.j.k = localzbtv.i;
            } else {
              localzbtv.j.k = localzbtv.w();
            }
            if (localzbtv.l()) {
              localzbtv.j.l = localzbtv.h;
            }
          }
        }
        break;
      case 443: 
        c();
        localzbtv.g = zc.e(this.d, 0);
        break;
      case 201: 
        c();
        localObject = new zbos();
        ((zbos)localObject).a = Double.valueOf(zc.f(this.d, 0));
        if (localzbtv.n())
        {
          if ((localzbtv.j != null) && (localzbtv.j.d != null)) {
            zf.a(localzbtv.j.d, localObject);
          }
        }
        else if (localzbtv.c != null) {
          zf.a(localzbtv.c, localObject);
        }
        break;
      case 202: 
        c();
        localObject = new zbos();
        ((zbos)localObject).a = Boolean.valueOf(this.d[0] != 0);
        if (localzbtv.n())
        {
          if ((localzbtv.j != null) && (localzbtv.j.d != null)) {
            zf.a(localzbtv.j.d, localObject);
          }
        }
        else if (localzbtv.c != null) {
          zf.a(localzbtv.c, localObject);
        }
        break;
      case 204: 
        c();
        localObject = new zbos();
        ((zbos)localObject).a = Short.valueOf(zc.b(this.d, 0));
        if (localzbtv.n())
        {
          if ((localzbtv.j != null) && (localzbtv.j.d != null)) {
            zf.a(localzbtv.j.d, localObject);
          }
        }
        else if (localzbtv.c != null) {
          zf.a(localzbtv.c, localObject);
        }
        break;
      case 205: 
        c();
        localObject = null;
        if (this.d[2] == 0)
        {
          int n = this.d.length - 3;
          byte[] arrayOfByte = new byte[n * 2];
          for (int i1 = 0; i1 < n; i1++) {
            arrayOfByte[(i1 * 2)] = this.d[(3 + i1)];
          }
          localObject = Encoding.getUnicode().a(arrayOfByte, 0, n * 2);
        }
        else
        {
          localObject = Encoding.getUnicode().a(this.d, 3, this.d.length - 3);
        }
        zbos localzbos = new zbos();
        localzbos.a = localObject;
        if (localzbtv.n())
        {
          if ((localzbtv.j != null) && (localzbtv.j.d != null)) {
            zf.a(localzbtv.j.d, localzbos);
          }
        }
        else if (localzbtv.c != null) {
          zf.a(localzbtv.c, localzbos);
        }
        if (!localzbtv.n()) {
          localzbtv.e(true);
        }
        break;
      case 206: 
        c();
        localObject = new zbos();
        ((zbos)localObject).a = a(this.d, 0);
        if (localzbtv.n())
        {
          if ((localzbtv.j != null) && (localzbtv.j.d != null)) {
            zf.a(localzbtv.j.d, localObject);
          }
        }
        else if (localzbtv.c != null) {
          zf.a(localzbtv.c, localObject);
        }
        break;
      case 207: 
        c();
        localObject = new zbos();
        ((zbos)localObject).a = null;
        if (localzbtv.n())
        {
          if ((localzbtv.j != null) && (localzbtv.j.d != null)) {
            zf.a(localzbtv.j.d, localObject);
          }
        }
        else if (localzbtv.c != null) {
          zf.a(localzbtv.c, localObject);
        }
        break;
      case 203: 
        c();
        localObject = new zbos();
        switch (this.d[0])
        {
        case 0: 
          ((zbos)localObject).a = "#NULL!";
          break;
        case 7: 
          ((zbos)localObject).a = "#DIV/0!";
          break;
        case 15: 
          ((zbos)localObject).a = "#VALUE!";
          break;
        case 23: 
          ((zbos)localObject).a = "#REF!";
          break;
        case 29: 
          ((zbos)localObject).a = "#NAME?";
          break;
        case 36: 
          ((zbos)localObject).a = "#NUM!";
          break;
        case 42: 
          ((zbos)localObject).a = "#N/A";
        }
        if (localzbtv.n())
        {
          if ((localzbtv.j != null) && (localzbtv.j.d != null)) {
            zf.a(localzbtv.j.d, localObject);
          }
        }
        else if (localzbtv.c != null) {
          zf.a(localzbtv.c, localObject);
        }
        break;
      case 249: 
        c();
        int m = zc.e(this.d, 0) & 0xFFFF;
        localzbtv.e = new byte[m];
        System.arraycopy(this.d, 4, localzbtv.e, 0, m);
        localzbtv.f = new ArrayList();
        break;
      case 246: 
        c();
        zbui localzbui = new zbui();
        zf.a(localzbtv.f, localzbui);
        localzbui.a = zc.e(this.d, 0);
        localzbui.b = zc.e(this.d, 2);
        localzbui.c = zc.e(this.d, 4);
        break;
      case 200: 
        this.f.a(-2);
        b();
        break;
      case 216: 
        if (localzbtv.j == null)
        {
          this.b = this.f.b(this.c);
          this.f.a(this.b & 0xFFFF);
        }
        else
        {
          c();
          localzbtv.j.a = ((this.d[0] & 0xFF & 0x1) != 0);
          localzbtv.j.b = ((this.d[0] & 0xFF & 0x2) != 0);
          localzbtv.j.c = zaxj.c((this.d[0] & 0xFF & 0x1F) >> 2);
          System.arraycopy(this.d, 0, localzbtv.j.e, 0, 2);
          a(localzbtv);
        }
        break;
      case 10: 
        this.f.a(2);
        return;
      default: 
        this.b = this.f.b(this.c);
        this.f.a(this.b & 0xFFFF);
      }
    }
  }
  
  private void a(zbtv paramzbtv)
    throws Exception
  {
    int m = 0;
    while (!this.f.a())
    {
      this.a = this.f.b(this.c);
      switch (this.a)
      {
      case 201: 
        c();
        zbos localzbos1 = new zbos();
        localzbos1.a = Double.valueOf(zc.f(this.d, 0));
        if (m == 0) {
          paramzbtv.j.h = ((Double)localzbos1.a).doubleValue();
        } else if (m == 1) {
          paramzbtv.j.i = ((Double)localzbos1.a).doubleValue();
        } else if (m == 2) {
          paramzbtv.j.j = ((Double)localzbos1.a).doubleValue();
        } else if (paramzbtv.c != null) {
          zf.a(paramzbtv.c, localzbos1);
        }
        m++;
        break;
      case 204: 
        c();
        int n = zc.b(this.d, 0);
        if (m == 2) {
          paramzbtv.j.j = n;
        }
        m++;
        break;
      case 206: 
        c();
        zbos localzbos2 = new zbos();
        localzbos2.a = a(this.d, 0);
        if (m == 0) {
          paramzbtv.j.f = ((DateTime)localzbos2.a);
        } else if (m == 1) {
          paramzbtv.j.g = ((DateTime)localzbos2.a);
        } else if (paramzbtv.c != null) {
          zf.a(paramzbtv.c, localzbos2);
        }
        m++;
        break;
      default: 
        this.f.a(-2);
        return;
      }
    }
  }
  
  private void b()
    throws Exception
  {
    zawu localzawu = new zawu(this.e);
    this.e.h = localzawu;
    localzawu.a(this.i, this.j);
    int m = localzawu.a();
    boolean[] arrayOfBoolean1 = localzawu.b;
    boolean[] arrayOfBoolean2 = localzawu.c;
    int n = 0;
    Object[] arrayOfObject = null;
    while (!this.f.a())
    {
      this.a = this.f.b(this.c);
      switch (this.a)
      {
      case 200: 
        arrayOfObject = new Object[this.j];
        zf.a(this.e.h.a, arrayOfObject);
        n = 0;
        c();
        int i1;
        int i2;
        if ((this.b & 0xFFFF) == m)
        {
          i1 = 0;
          for (i2 = 0; i2 < (this.b & 0xFFFF); i2++)
          {
            while ((i1 < this.j) && (arrayOfBoolean1[i1] == 0)) {
              i1++;
            }
            arrayOfObject[(i1++)] = Integer.valueOf(this.d[i2] & 0xFF);
          }
        }
        else
        {
          i1 = 0;
          for (i2 = 0; i2 < (this.b & 0xFFFF); i2++)
          {
            while ((i1 < this.j) && (arrayOfBoolean1[i1] == 0)) {
              i1++;
            }
            if (i1 >= arrayOfBoolean2.length) {
              break;
            }
            if (arrayOfBoolean2[i1] != 0)
            {
              arrayOfObject[(i1++)] = Integer.valueOf(zc.e(this.d, i2) & 0xFFFF);
              i2++;
            }
            else
            {
              arrayOfObject[(i1++)] = Integer.valueOf(this.d[i2] & 0xFF);
            }
          }
        }
        break;
      case 201: 
      case 202: 
      case 205: 
      case 206: 
      case 207: 
        while ((n < this.j) && (arrayOfBoolean1[n] != 0)) {
          n++;
        }
        c();
        if (n < arrayOfObject.length) {
          switch (this.a)
          {
          case 201: 
            arrayOfObject[(n++)] = Double.valueOf(zc.f(this.d, 0));
            break;
          case 202: 
            arrayOfObject[(n++)] = Boolean.valueOf(this.d[0] != 0 ? 1 : false);
            break;
          case 205: 
            String str = null;
            if (this.d[2] == 0) {
              str = Encoding.getASCII().a(this.d, 3, this.d.length - 3);
            } else {
              str = Encoding.getUnicode().a(this.d, 3, this.d.length - 3);
            }
            arrayOfObject[(n++)] = str;
            break;
          case 206: 
            arrayOfObject[(n++)] = a(this.d, 0);
            break;
          case 207: 
            arrayOfObject[(n++)] = null;
          }
        }
        break;
      case 10: 
        this.f.a(2);
        return;
      default: 
        this.b = this.f.b(this.c);
        this.f.a(this.b & 0xFFFF);
      }
    }
  }
  
  private void c()
    throws Exception
  {
    this.b = this.f.b(this.c);
    if ((this.b & 0xFFFF) != 0)
    {
      this.d = new byte[this.b];
      this.f.a(this.d);
    }
  }
  
  private DateTime a(byte[] paramArrayOfByte, int paramInt)
  {
    int m = zc.e(this.d, 0 + paramInt) & 0xFFFF;
    int n = zc.e(this.d, 2 + paramInt) & 0xFFFF;
    int i1 = this.d[(4 + paramInt)];
    DateTime localDateTime = new DateTime(1900, 1, 1);
    if (i1 == 0)
    {
      localDateTime = CellsHelper.getDateTimeFromDouble(0.0D, false);
    }
    else
    {
      int i2 = this.d[(5 + paramInt)];
      int i3 = this.d[(6 + paramInt)];
      int i4 = this.d[(7 + paramInt)];
      localDateTime = a(m, n, i1 & 0xFF, i2 & 0xFF, i3 & 0xFF, i4 & 0xFF);
    }
    return localDateTime;
  }
  
  private boolean b(int paramInt)
  {
    return ((paramInt % 4 == 0) && (paramInt % 100 != 0)) || (paramInt % 400 == 0);
  }
  
  private DateTime a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    switch (paramInt2)
    {
    case 2: 
      if (b(paramInt1)) {
        paramInt3 = paramInt3 > 29 ? 29 : paramInt3;
      } else {
        paramInt3 = paramInt3 > 28 ? 28 : paramInt3;
      }
      break;
    case 1: 
    case 3: 
    case 5: 
    case 7: 
    case 8: 
    case 10: 
    case 12: 
      paramInt3 = paramInt3 > 31 ? 31 : paramInt3;
      break;
    case 4: 
    case 6: 
    case 9: 
    case 11: 
      paramInt3 = paramInt3 > 30 ? 30 : paramInt3;
    }
    paramInt2 = paramInt2 > 12 ? 12 : paramInt2;
    paramInt4 = paramInt4 > 23 ? 23 : paramInt4;
    paramInt5 = paramInt5 > 59 ? 59 : paramInt5;
    paramInt6 = paramInt6 > 59 ? 59 : paramInt6;
    return new DateTime(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */