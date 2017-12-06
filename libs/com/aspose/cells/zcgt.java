package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zcgt
{
  private zchd c;
  private Workbook d;
  private zcbw e;
  private zawp f;
  private zri g;
  private zawq h;
  private int i;
  private byte[] j;
  private int k;
  String a;
  private HashMap l = null;
  int b;
  private static final za m = new za(new String[] { "http://schemas.openxmlformats.org/officeDocument/2006/relationships/pivotCacheDefinition" });
  
  zcgt(zchd paramzchd, zri paramzri, HashMap paramHashMap)
  {
    this.g = paramzri;
    this.c = paramzchd;
    this.f = paramzri.b;
    this.h = this.f.e;
    this.d = this.h.a.p();
    this.l = paramHashMap;
  }
  
  void a(zcbw paramzcbw)
    throws Exception
  {
    this.d.i();
    this.e = paramzcbw;
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 180: 
        this.e.a(1L);
        return;
      case 179: 
        b();
        break;
      case 185: 
        c();
        break;
      case 183: 
        f();
        break;
      case 245: 
        g();
        break;
      case 1066: 
        a();
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void a()
  {
    this.j = this.c.a(this.e);
    int n = this.j.length;
    this.f.y = new byte[n];
    System.arraycopy(this.j, 0, this.f.y, 0, n);
  }
  
  private void b()
    throws Exception
  {
    this.j = this.c.a(this.e);
    int n = this.j[3];
    if ((n & 0xFF & 0x1) == 1) {
      this.f.a(true, 1);
    } else {
      this.f.a(false, 1);
    }
    if ((n & 0xFF & 0x4) != 0) {
      this.f.a(true);
    } else {
      this.f.a(false);
    }
    this.f.t = zc.a(this.j, 4);
    this.b = zc.a(this.j, 17);
    int i1 = this.j[16];
    int i2 = 21;
    if ((i1 & 0xFF & 0x1) != 0)
    {
      arrayOfInt = new int[] { i2 };
      String str = zcgj.a(this.j, arrayOfInt);
      i2 = arrayOfInt[0];
    }
    int[] arrayOfInt = { i2 };
    this.a = zcgj.a(this.j, arrayOfInt);
    i2 = arrayOfInt[0];
  }
  
  private void c()
    throws Exception
  {
    this.j = this.c.a(this.e);
    int n = zc.a(this.j, 0);
    byte b1 = zcij.I(n);
    this.g.b.f = zawr.a(this.g.b, b1);
    if (this.g.b.b())
    {
      zbxs localzbxs = (zbxs)this.g.b.f;
      int i1 = zc.a(this.j, 4);
      localzbxs.a = i1;
      if (this.l != null)
      {
        ArrayList localArrayList = new ArrayList();
        Iterator localIterator = this.l.values().iterator();
        while (localIterator.hasNext())
        {
          zrl localzrl = (zrl)localIterator.next();
          switch (m.a(localzrl.c))
          {
          case 0: 
            break;
          default: 
            zf.a(localArrayList, localzrl);
          }
        }
        if (localArrayList.size() > 0) {
          localzbxs.c = localArrayList;
        }
      }
      return;
    }
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 186: 
        this.e.a(1L);
        return;
      case 187: 
        e();
        break;
      case 207: 
        d();
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void d()
    throws Exception
  {
    this.j = this.c.a(this.e);
    zno localzno = (zno)this.g.b.f;
    localzno.a = ((this.j[0] & 0xFF & 0x1) != 0);
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 208: 
        this.e.a(1L);
        return;
      case 209: 
        a(localzno);
        break;
      case 215: 
        a(localzno, localzno.c.length);
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void a(zno paramzno, int paramInt)
    throws Exception
  {
    this.j = this.c.a(this.e);
    int n = 0;
    int i1 = zc.a(this.j, 0);
    paramzno.b = new znp[i1];
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 216: 
        this.e.a(1L);
        return;
      case 217: 
        znp localznp = new znp(paramzno, paramInt);
        paramzno.b[n] = localznp;
        a(localznp);
        n++;
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void a(znp paramznp)
    throws Exception
  {
    this.j = this.c.a(this.e);
    paramznp.a[0] = zc.a(this.j, 0);
    if (paramznp.a.length > 1) {
      paramznp.a[1] = zc.a(this.j, 4);
    }
    if (paramznp.a.length > 2) {
      paramznp.a[2] = zc.a(this.j, 8);
    }
    if (paramznp.a.length > 3) {
      paramznp.a[3] = zc.a(this.j, 12);
    }
    int n = this.j[16];
    int i1 = (n & 0xFF & 0x1) == 1 ? 1 : 0;
    int i2 = this.j[18];
    int i3 = (i2 & 0xFF & 0x1) == 1 ? 1 : 0;
    int i4 = (i2 & 0xFF & 0x2) != 0 ? 1 : 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    CellArea localCellArea = new CellArea();
    int i5 = 19;
    int[] arrayOfInt;
    if (i4 != 0)
    {
      arrayOfInt = new int[] { i5 };
      str2 = zcgj.a(this.j, arrayOfInt);
      i5 = arrayOfInt[0];
    }
    if (i3 != 0)
    {
      arrayOfInt = new int[] { i5 };
      str3 = zcgj.a(this.j, arrayOfInt);
      i5 = arrayOfInt[0];
    }
    if (i1 == 0)
    {
      localCellArea = zcgj.a(this.j, i5);
      str1 = localCellArea.a(1048575, 16383, false);
    }
    else
    {
      arrayOfInt = new int[] { i5 };
      str1 = zcgj.a(this.j, arrayOfInt);
      i5 = arrayOfInt[0];
    }
    paramznp.b.a(zboy.a(this.l, str3, str2, str1), null);
  }
  
  private void a(zno paramzno)
    throws Exception
  {
    this.j = this.c.a(this.e);
    int n = zc.a(this.j, 0);
    if (!paramzno.a) {
      paramzno.c = new String[n][];
    } else {
      paramzno.c = new String[1][];
    }
    int i1 = 0;
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 210: 
        this.e.a(1L);
        return;
      case 211: 
        paramzno.c[i1] = a(i1);
        i1++;
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private String[] a(int paramInt)
    throws Exception
  {
    this.j = this.c.a(this.e);
    int n = zc.a(this.j, 0);
    String[] arrayOfString = new String[n];
    int i1 = 0;
    int i2 = 0;
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 212: 
        this.e.a(1L);
        return arrayOfString;
      case 213: 
        this.j = this.c.a(this.e);
        int[] arrayOfInt = { i2 };
        arrayOfString[i1] = zcgj.a(this.j, arrayOfInt);
        i2 = arrayOfInt[0];
        i2 = 0;
        i1++;
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void e()
    throws Exception
  {
    String str1 = null;
    String str2 = null;
    int n = 3;
    this.j = this.c.a(this.e);
    int i1 = (this.j[0] & 0xFF & 0x1) != 0 ? 1 : 0;
    int i2 = (this.j[2] & 0xFF & 0x1) != 0 ? 1 : 0;
    int i3 = (this.j[2] & 0xFF & 0x2) != 0 ? 1 : 0;
    String str3 = null;
    if (i3 != 0)
    {
      localObject = new int[] { n };
      str2 = zcgj.a(this.j, (int[])localObject);
      n = localObject[0];
    }
    if (i2 != 0)
    {
      localObject = new int[] { n };
      str3 = zcgj.a(this.j, (int[])localObject);
      n = localObject[0];
    }
    if (i1 != 0)
    {
      localObject = new int[] { n };
      str1 = zcgj.a(this.j, (int[])localObject);
      n = localObject[0];
      if (str1.startsWith("=")) {
        str1 = str1.substring(1);
      }
    }
    else
    {
      localObject = zcgj.a(this.j, n);
      str1 = ((CellArea)localObject).a(1048575, 16383, false);
    }
    Object localObject = (zboy)this.g.b.f;
    ((zboy)localObject).a(zboy.a(this.l, str3, str2, str1), null);
  }
  
  private void f()
    throws Exception
  {
    this.j = this.c.a(this.e);
    int n = this.j[0];
    int i1 = this.j[1];
    int i2 = (n & 0xFF & 0x8) != 0 ? 1 : 0;
    int i3 = (i1 & 0xFF & 0x1) != 0 ? 1 : 0;
    String str = "";
    zbtv localzbtv = new zbtv(this.f);
    localzbtv.o = ((n & 0xFF & 0x4) == 0);
    localzbtv.a(false);
    if (this.f.i == null) {
      this.f.i = new ArrayList();
    }
    zf.a(this.f.i, localzbtv);
    localzbtv.q = zc.a(this.j, 2);
    int i4 = 20;
    int[] arrayOfInt = { i4 };
    localzbtv.a = zcgj.a(this.j, arrayOfInt);
    i4 = arrayOfInt[0];
    if (i2 != 0)
    {
      arrayOfInt = new int[] { i4 };
      str = zcgj.a(this.j, arrayOfInt);
      i4 = arrayOfInt[0];
    }
    if (i3 != 0)
    {
      localzbtv.g(true);
      int i5 = zc.a(this.j, i4);
      if (i5 > 0)
      {
        localzbtv.e = new byte[i5];
        System.arraycopy(this.j, i4 + 4, localzbtv.e, 0, i5);
        localzbtv.f = new ArrayList();
      }
    }
    localzbtv.c = new ArrayList();
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 184: 
        this.e.a(1L);
        return;
      case 189: 
        b(localzbtv);
        break;
      case 219: 
        a(localzbtv);
        break;
      case 255: 
        if (localzbtv.f == null) {
          localzbtv.f = new ArrayList();
        }
        zbui localzbui = new zbui();
        zf.a(localzbtv.f, localzbui);
        a(localzbui);
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void a(zbui paramzbui)
  {
    this.j = this.c.a(this.e);
    paramzbui.b = ((int)(zc.d(this.j, 0) & 0xFFFFFFFF));
    paramzbui.c = (this.j[4] & 0xFF);
    int n = (this.j[5] & 0xFF & 0x1) != 0 ? 1 : 0;
    if (n != 0) {
      paramzbui.a |= 0x2;
    }
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 256: 
        this.e.a(1L);
        return;
      case 259: 
        zbuj localzbuj = new zbuj();
        paramzbui.b().a(localzbuj);
        this.j = this.c.a(this.e);
        localzbuj.c = (this.j[0] & 0xFF);
        localzbuj.a = ((int)(zc.d(this.j, 1) & 0xFFFFFFFF));
        localzbuj.b = ((int)(zc.d(this.j, 5) & 0xFFFFFFFF));
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void a(zbtv paramzbtv)
    throws Exception
  {
    this.j = this.c.a(this.e);
    SxRng localSxRng = new SxRng(paramzbtv);
    paramzbtv.j = localSxRng;
    paramzbtv.h(true);
    localSxRng.l = zc.a(this.j, 0);
    localSxRng.k = zc.a(this.j, 4);
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 220: 
        this.e.a(1L);
        return;
      case 223: 
        a(localSxRng);
        break;
      case 225: 
        b(localSxRng);
        break;
      case 221: 
        c(localSxRng);
        break;
      case 222: 
      case 224: 
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void a(SxRng paramSxRng)
  {
    this.j = this.c.a(this.e);
    paramSxRng.c = zcij.P(this.j[0] & 0xFF);
    paramSxRng.a = ((this.j[1] & 0xFF & 0x1) != 0);
    paramSxRng.b = ((this.j[1] & 0xFF & 0x2) != 0);
    int n = (this.j[1] & 0xFF & 0x4) != 0 ? 1 : 0;
    if (n != 0)
    {
      double d1 = zc.f(this.j, 2);
      double d2 = zc.f(this.j, 10);
      paramSxRng.f = CellsHelper.getDateTimeFromDouble(d1, false);
      paramSxRng.g = CellsHelper.getDateTimeFromDouble(d2, false);
    }
    else
    {
      paramSxRng.h = zc.f(this.j, 2);
      paramSxRng.i = zc.f(this.j, 10);
    }
    paramSxRng.j = zc.f(this.j, 18);
  }
  
  private void b(SxRng paramSxRng)
  {
    this.j = this.c.a(this.e);
    paramSxRng.n = new ArrayList();
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 226: 
        this.e.a(1L);
        return;
      case 26: 
        this.j = this.c.a(this.e);
        zf.a(paramSxRng.n, Integer.valueOf(zc.a(this.j, 0)));
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void c(SxRng paramSxRng)
    throws Exception
  {
    this.j = this.c.a(this.e);
    paramSxRng.d = new ArrayList();
    for (;;)
    {
      this.i = this.e.a();
      zbos localzbos1;
      int i1;
      switch (this.i)
      {
      case 222: 
        this.e.a(1L);
        return;
      case 20: 
        this.j = this.c.a(this.e);
        localzbos1 = new zbos();
        localzbos1.a = null;
        zf.a(paramSxRng.d, localzbos1);
        break;
      case 21: 
        this.j = this.c.a(this.e);
        localzbos1 = new zbos();
        localzbos1.a = Double.valueOf(zc.f(this.j, 0));
        zf.a(paramSxRng.d, localzbos1);
        break;
      case 22: 
        this.j = this.c.a(this.e);
        localzbos1 = new zbos();
        localzbos1.a = Boolean.valueOf(this.j[0] != 0);
        zf.a(paramSxRng.d, localzbos1);
        break;
      case 23: 
        this.j = this.c.a(this.e);
        localzbos1 = new zbos();
        switch (this.j[0])
        {
        case 0: 
          localzbos1.a = "#NULL!";
          break;
        case 7: 
          localzbos1.a = "#DIV/0!";
          break;
        case 15: 
          localzbos1.a = "#VALUE!";
          break;
        case 23: 
          localzbos1.a = "#REF!";
          break;
        case 29: 
          localzbos1.a = "#NAME?";
          break;
        case 36: 
          localzbos1.a = "#NUM!";
          break;
        case 42: 
          localzbos1.a = "#N/A";
        }
        zf.a(paramSxRng.d, localzbos1);
        break;
      case 24: 
        this.j = this.c.a(this.e);
        localzbos1 = new zbos();
        i1 = 0;
        int[] arrayOfInt1 = { i1 };
        localzbos1.a = zcgj.a(this.j, arrayOfInt1);
        i1 = arrayOfInt1[0];
        zf.a(paramSxRng.d, localzbos1);
        break;
      case 25: 
        this.j = this.c.a(this.e);
        localzbos1 = new zbos();
        localzbos1.a = a(this.j, 0);
        zf.a(paramSxRng.d, localzbos1);
        break;
      case 191: 
        this.j = this.c.a(this.e);
        int n = zc.b(this.j, 0);
        i1 = zc.a(this.j, 2);
        int i2 = 6;
        int i3;
        zbos localzbos2;
        switch (n)
        {
        case 1: 
          for (i3 = 0; i3 < i1; i3++)
          {
            localzbos2 = new zbos();
            localzbos2.a = Double.valueOf(zc.f(this.j, i2));
            zf.a(paramSxRng.d, localzbos2);
            i2 += 8;
          }
          break;
        case 2: 
          for (i3 = 0; i3 < i1; i3++)
          {
            localzbos2 = new zbos();
            int[] arrayOfInt2 = { i2 };
            localzbos2.a = zcgj.a(this.j, arrayOfInt2);
            i2 = arrayOfInt2[0];
            zf.a(paramSxRng.d, localzbos2);
          }
          break;
        case 4: 
          for (i3 = 0; i3 < i1; i3++)
          {
            localzbos2 = new zbos();
            localzbos2.a = Boolean.valueOf(this.j[i2] != 0);
            zf.a(paramSxRng.d, localzbos2);
            i2++;
          }
          break;
        case 32: 
          for (i3 = 0; i3 < i1; i3++)
          {
            localzbos2 = new zbos();
            localzbos2.a = a(this.j, i2);
            zf.a(paramSxRng.d, localzbos2);
            i2 += 8;
          }
        }
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void b(zbtv paramzbtv)
    throws Exception
  {
    this.j = this.c.a(this.e);
    int n = zc.b(this.j, 0);
    paramzbtv.f((n & 0x4) != 0);
    paramzbtv.e((n & 0x8) != 0);
    paramzbtv.j((n & 0x10) != 0);
    paramzbtv.n = ((n & 0x20) != 0);
    paramzbtv.b((n & 0x40) != 0);
    paramzbtv.c((n & 0x80) != 0);
    paramzbtv.p = ((n & 0x200) != 0);
    zbos localzbos = new zbos();
    int i1 = 0;
    for (;;)
    {
      this.i = this.e.a();
      int i2;
      int i3;
      switch (this.i)
      {
      case 190: 
        this.e.a(1L);
        return;
      case 20: 
      case 27: 
        this.j = this.c.a(this.e);
        localzbos = new zbos();
        localzbos.a = null;
        if (this.i == 27)
        {
          i2 = zc.b(this.j, 0);
          localzbos.b = ((i2 & 0x2) != 0);
          localzbos.c = ((i2 & 0x1) != 0);
        }
        zf.a(paramzbtv.c, localzbos);
        paramzbtv.a(true);
        break;
      case 21: 
      case 28: 
        this.j = this.c.a(this.e);
        localzbos = new zbos();
        if (this.i == 28)
        {
          i2 = zc.b(this.j, 8);
          localzbos.b = ((i2 & 0x2) != 0);
          localzbos.c = ((i2 & 0x1) != 0);
        }
        localzbos.a = Double.valueOf(zc.f(this.j, 0));
        zf.a(paramzbtv.c, localzbos);
        paramzbtv.a(true);
        break;
      case 22: 
      case 29: 
        this.j = this.c.a(this.e);
        localzbos = new zbos();
        localzbos.a = Boolean.valueOf(this.j[0] != 0);
        if (this.i == 29)
        {
          i2 = zc.b(this.j, 1);
          localzbos.b = ((i2 & 0x2) != 0);
          localzbos.c = ((i2 & 0x1) != 0);
        }
        zf.a(paramzbtv.c, localzbos);
        paramzbtv.a(true);
        paramzbtv.e(true);
        break;
      case 23: 
      case 30: 
        this.j = this.c.a(this.e);
        localzbos = new zbos();
        switch (this.j[0])
        {
        case 0: 
          localzbos.a = "#NULL!";
          break;
        case 7: 
          localzbos.a = "#DIV/0!";
          break;
        case 15: 
          localzbos.a = "#VALUE!";
          break;
        case 23: 
          localzbos.a = "#REF!";
          break;
        case 29: 
          localzbos.a = "#NAME?";
          break;
        case 36: 
          localzbos.a = "#NUM!";
          break;
        case 42: 
          localzbos.a = "#N/A";
        }
        if (this.i == 30)
        {
          i2 = zc.b(this.j, 1);
          localzbos.b = ((i2 & 0x2) != 0);
          localzbos.c = ((i2 & 0x1) != 0);
        }
        zf.a(paramzbtv.c, localzbos);
        paramzbtv.a(true);
        paramzbtv.e(true);
        break;
      case 24: 
      case 31: 
        this.j = this.c.a(this.e);
        localzbos = new zbos();
        i1 = 0;
        int[] arrayOfInt1 = { i1 };
        localzbos.a = zcgj.a(this.j, arrayOfInt1);
        i1 = arrayOfInt1[0];
        if (this.i == 31)
        {
          i3 = zc.b(this.j, i1);
          localzbos.b = ((i3 & 0x2) != 0);
          localzbos.c = ((i3 & 0x1) != 0);
        }
        zf.a(paramzbtv.c, localzbos);
        paramzbtv.a(true);
        paramzbtv.e(true);
        break;
      case 25: 
      case 32: 
        this.j = this.c.a(this.e);
        localzbos = new zbos();
        localzbos.a = a(this.j, 0);
        if (this.i == 32)
        {
          i3 = zc.b(this.j, 8);
          localzbos.b = ((i3 & 0x2) != 0);
          localzbos.c = ((i3 & 0x1) != 0);
        }
        zf.a(paramzbtv.c, localzbos);
        paramzbtv.a(true);
        break;
      case 191: 
        this.j = this.c.a(this.e);
        i3 = zc.b(this.j, 0);
        int i4 = zc.a(this.j, 2);
        i1 = 6;
        for (int i5 = 0; i5 < i4; i5++)
        {
          localzbos = new zbos();
          switch (i3)
          {
          case 1: 
            localzbos.a = Double.valueOf(zc.f(this.j, i1));
            i1 += 8;
            paramzbtv.b(true);
            break;
          case 2: 
            int[] arrayOfInt2 = { i1 };
            localzbos.a = zcgj.a(this.j, arrayOfInt2);
            i1 = arrayOfInt2[0];
            paramzbtv.e(true);
            break;
          case 4: 
            localzbos.a = Boolean.valueOf(this.j[i1] != 0);
            i1++;
            break;
          case 16: 
            switch (this.j[i1])
            {
            case 0: 
              localzbos.a = "#NULL!";
              break;
            case 7: 
              localzbos.a = "#DIV/0!";
              break;
            case 15: 
              localzbos.a = "#VALUE!";
              break;
            case 23: 
              localzbos.a = "#REF!";
              break;
            case 29: 
              localzbos.a = "#NAME?";
              break;
            case 36: 
              localzbos.a = "#NUM!";
              break;
            case 42: 
              localzbos.a = "#N/A";
            }
            paramzbtv.e(true);
            i1++;
            break;
          case 32: 
            localzbos.a = a(this.j, i1);
            i1 += 8;
            break;
          case 256: 
            localzbos.a = null;
          }
          zf.a(paramzbtv.c, localzbos);
        }
        paramzbtv.a(true);
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void g()
  {
    this.j = this.c.a(this.e);
    zaxa localzaxa = new zaxa(this.f);
    if (this.f.m == null) {
      this.f.m = new zawz();
    }
    this.f.m.a(localzaxa);
    int n = 4;
    int i1 = zc.a(this.j, n);
    if (i1 > 0)
    {
      localzaxa.c = new byte[i1];
      System.arraycopy(this.j, n + 4, localzaxa.c, 0, i1);
    }
    zbur localzbur = new zbur();
    localzaxa.g = localzbur;
    a(localzaxa.g);
    localzaxa.a(((zbtz)localzaxa.g.e.get(0)).b());
    localzaxa.b(localzaxa.b());
    a(localzaxa);
  }
  
  private void a(zaxa paramzaxa)
  {
    if (paramzaxa.e == null) {
      paramzaxa.e = new zbun();
    }
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 246: 
        this.e.a(1L);
        return;
      case 254: 
        this.e.a(1L);
        return;
      case 255: 
        zbui localzbui = new zbui();
        paramzaxa.e.a(localzbui);
        a(localzbui);
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private void a(zbur paramzbur)
  {
    zbtz localzbtz = null;
    for (;;)
    {
      this.i = this.e.a();
      switch (this.i)
      {
      case 248: 
        this.e.a(1L);
        return;
      case 247: 
        this.j = this.c.a(this.e);
        paramzbur.b = this.j[0];
        int n = zc.a(this.j, 4);
        paramzbur.b(this.j[4]);
        paramzbur.a((n & 0x100) != 0);
        paramzbur.b((n & 0x200) != 0);
        paramzbur.c((n & 0x400) != 0);
        paramzbur.d((n & 0x800) != 0);
        paramzbur.e((n & 0x1000) != 0);
        paramzbur.f((n & 0x2000) != 0);
        paramzbur.h((n & 0x4000) != 0);
        paramzbur.g((n & 0x8000) != 0);
        paramzbur.a((byte)(this.j[6] & 0xFF & 0xF));
        paramzbur.a = ((byte)((this.j[6] & 0xFF & 0xF0) >> 4 + (this.j[7] & 0xFF) & 0xF));
        break;
      case 251: 
        this.j = this.c.a(this.e);
        localzbtz = new zbtz();
        zf.a(paramzbur.e, localzbtz);
        localzbtz.b(zc.a(this.j, 0));
        int i1 = zc.b(this.j, 8);
        localzbtz.e = ((i1 & 0x1) != 0);
        localzbtz.f = ((i1 & 0x2) != 0);
        localzbtz.g = ((i1 & 0x4) != 0);
        localzbtz.h = ((i1 & 0x8) != 0);
        localzbtz.i = ((i1 & 0x10) != 0);
        localzbtz.j = ((i1 & 0x20) != 0);
        localzbtz.k = ((i1 & 0x40) != 0);
        localzbtz.l = ((i1 & 0x80) != 0);
        localzbtz.m = ((i1 & 0x100) != 0);
        localzbtz.n = ((i1 & 0x200) != 0);
        localzbtz.o = ((i1 & 0x400) != 0);
        localzbtz.p = ((i1 & 0x800) != 0);
        localzbtz.a((this.j[10] & 0xFF & 0x1) != 0);
        break;
      case 382: 
        this.j = this.c.a(this.e);
        if (localzbtz.c == null) {
          localzbtz.c = new ArrayList();
        }
        zf.a(localzbtz.c, Integer.valueOf(zc.a(this.j, 0)));
        break;
      default: 
        this.k = this.e.b();
        this.e.a(this.k);
      }
    }
  }
  
  private DateTime a(byte[] paramArrayOfByte, int paramInt)
  {
    int n = zc.e(this.j, 0 + paramInt) & 0xFFFF;
    int i1 = zc.e(this.j, 2 + paramInt) & 0xFFFF;
    int i2 = this.j[(4 + paramInt)];
    DateTime localDateTime = new DateTime(1900, 1, 1);
    if (i2 == 0) {
      localDateTime = new DateTime(n, i1, 1);
    } else {
      localDateTime = new DateTime(n, i1, this.j[(4 + paramInt)] & 0xFF, this.j[(5 + paramInt)] & 0xFF, this.j[(6 + paramInt)] & 0xFF, this.j[(7 + paramInt)] & 0xFF);
    }
    return localDateTime;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcgt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */