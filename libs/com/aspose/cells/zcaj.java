package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

class zcaj
{
  private Workbook a;
  private zbcj b;
  private zrg c;
  private byte[] d = new byte[8];
  private int e = 0;
  private byte[] f = new byte[8];
  private int g = 0;
  private zbot h = new zbot();
  private byte[] i;
  
  zcaj(Workbook paramWorkbook)
  {
    this.a = paramWorkbook;
    this.b = paramWorkbook.getWorksheets().m;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    this.c = paramzrg;
    this.i = new byte['․'];
    a();
    b();
    c();
    for (int j = 0; j < this.b.getCount(); j++)
    {
      zbci localzbci = this.b.a(j);
      a(localzbci);
    }
    paramzrg.a(new byte[] { 10, 0, 0, 0 });
    paramzrg.c();
  }
  
  private void a()
    throws Exception
  {
    byte[] arrayOfByte = new byte[54];
    int j = 0;
    arrayOfByte[j] = -106;
    arrayOfByte[(j + 1)] = 1;
    arrayOfByte[(j + 2)] = 50;
    j += 4;
    System.arraycopy(zc.a(this.b.k), 0, arrayOfByte, j, 2);
    j += 4;
    short s = 0;
    if (this.b.g) {
      s = (short)(s | 0x1);
    }
    if (this.b.a) {
      s = (short)(s | 0x2);
    }
    if (this.b.c) {
      s = (short)(s | 0x4);
    }
    if (this.b.h) {
      s = (short)(s | 0x8);
    }
    if (this.b.b) {
      s = (short)(s | 0x10);
    }
    System.arraycopy(zc.a(s), 0, arrayOfByte, j, 2);
    j += 2;
    System.arraycopy(this.b.l, 0, arrayOfByte, j, 16);
    j += 16;
    System.arraycopy(this.b.m == null ? this.b.l : this.b.m, 0, arrayOfByte, j, 16);
    j += 16;
    System.arraycopy(zc.a(this.b.i), 0, arrayOfByte, j, 4);
    j += 4;
    System.arraycopy(zc.a(this.b.j), 0, arrayOfByte, j, 4);
    j += 4;
    s = 0;
    if (!this.b.c) {
      s = (short)(s | 0x1);
    }
    if (this.b.f) {
      s = (short)(s | 0x2);
    }
    System.arraycopy(zc.a(s), 0, arrayOfByte, j, 2);
    j += 2;
    System.arraycopy(zc.a(this.b.e), 0, arrayOfByte, j, 2);
    j += 2;
    this.c.a(arrayOfByte, 0, j);
  }
  
  private void b()
    throws Exception
  {
    byte[] arrayOfByte1 = new byte['¦'];
    int j = 0;
    arrayOfByte1[j] = -107;
    arrayOfByte1[(j + 1)] = 1;
    arrayOfByte1[(j + 2)] = -94;
    j += 4;
    System.arraycopy(zc.a(this.b.p), 0, arrayOfByte1, j, 2);
    j += 4;
    String str = this.b.q;
    if ((str != null) && (str.length() > 52)) {
      str = str.substring(0, 52);
    }
    if (str != null)
    {
      byte[] arrayOfByte2 = zct.c(str);
      zct.a(arrayOfByte1, j, arrayOfByte2, str);
    }
    this.c.a(arrayOfByte1, 0, 166);
  }
  
  private void c()
    throws Exception
  {
    byte[] arrayOfByte1 = new byte['¦'];
    int j = 0;
    arrayOfByte1[j] = -108;
    arrayOfByte1[(j + 1)] = 1;
    arrayOfByte1[(j + 2)] = -94;
    j += 4;
    if (this.b.r) {
      arrayOfByte1[j] = 1;
    }
    j += 4;
    System.arraycopy(zc.a(this.b.s), 0, arrayOfByte1, j, 8);
    j += 8;
    String str = this.b.t;
    if ((str != null) && (str.length() > 54)) {
      str = str.substring(0, 54);
    }
    if (str != null)
    {
      byte[] arrayOfByte2 = zct.c(str);
      zct.a(arrayOfByte1, j, arrayOfByte2, str);
    }
    this.c.a(arrayOfByte1, 0, 166);
  }
  
  private void a(zbci paramzbci)
    throws Exception
  {
    b(paramzbci);
    c(paramzbci);
    for (int j = 0; j < paramzbci.c.getCount(); j++)
    {
      zbbu localzbbu = paramzbci.c.a(j);
      switch (localzbbu.a())
      {
      case 5: 
        a((zbbx)localzbbu);
        break;
      case 8: 
        a((zbbz)localzbbu);
        break;
      case 2: 
        zbbw localzbbw = (zbbw)localzbbu;
        a(localzbbw);
        break;
      case 6: 
        zbcd localzbcd = (zbcd)localzbbu;
        a(localzbcd);
        break;
      case 11: 
        zbcg localzbcg = (zbcg)localzbbu;
        a(localzbcg);
        break;
      case 0: 
        zbcb localzbcb = (zbcb)localzbbu;
        a(localzbcb);
        break;
      case 7: 
        zbch localzbch = (zbch)localzbbu;
        a(localzbch);
        break;
      case 12: 
        a((zbco)localzbbu);
        break;
      case 1: 
        a((zbcc)localzbbu);
        break;
      case 3: 
        a((zbbv)localzbbu);
        break;
      case 10: 
        a((zbcm)localzbbu);
      }
    }
  }
  
  private void a(zbbz paramzbbz)
    throws Exception
  {
    this.c.a(new byte[] { 78, 1, 0, 0 });
    zbcn localzbcn = new zbcn(paramzbbz);
    int j = 0;
    this.i[j] = 64;
    this.i[(j + 1)] = 1;
    j += 4;
    j = localzbcn.a(this.i, j);
    a(paramzbbz.b, this.i, j);
    j += 8;
    a(paramzbbz.c, this.i, j);
    j += 8;
    System.arraycopy(zc.a(paramzbbz.g), 0, this.i, j, 2);
    j += 2;
    ArrayList localArrayList = new ArrayList();
    Object localObject;
    if (paramzbbz.i != null)
    {
      localIterator = paramzbbz.i.iterator();
      while (localIterator.hasNext())
      {
        localObject = (zbbu)localIterator.next();
        if (((zbbu)localObject).a() == 9) {
          localArrayList.add((zbcr)localObject);
        }
      }
    }
    System.arraycopy(zc.a(localArrayList.size()), 0, this.i, j, 4);
    j += 4;
    Iterator localIterator = localArrayList.iterator();
    while (localIterator.hasNext())
    {
      localObject = (zbcr)localIterator.next();
      j = a((zbcr)localObject, j);
    }
    System.arraycopy(zc.a(j - 4), 0, this.i, 2, 2);
    this.c.a(this.i, 0, j);
    if (paramzbbz.i != null)
    {
      localIterator = paramzbbz.i.iterator();
      while (localIterator.hasNext())
      {
        localObject = (zbbu)localIterator.next();
        switch (((zbbu)localObject).a())
        {
        case 2: 
          a((zbbw)localObject);
          break;
        case 6: 
          a((zbcd)localObject);
        }
      }
    }
    this.c.a(new byte[] { 79, 1, 0, 0 });
  }
  
  private void a(zbcg paramzbcg)
    throws Exception
  {
    if ((paramzbcg.j != null) && (paramzbcg.j.getCount() != 0)) {
      this.c.a(new byte[] { 80, 1, 0, 0 });
    }
    zbcn localzbcn = new zbcn(paramzbcg);
    int j = 0;
    this.i[j] = 55;
    this.i[(j + 1)] = 1;
    j += 4;
    j = localzbcn.a(this.i, j);
    this.i[j] = ((byte)(paramzbcg.d ? 1 : 0));
    this.i[(j + 1)] = 0;
    j += 2;
    a(paramzbcg.f, this.i, j);
    j += 8;
    ArrayList localArrayList = null;
    Iterator localIterator;
    Object localObject;
    if (paramzbcg.j != null)
    {
      localArrayList = new ArrayList();
      localIterator = paramzbcg.j.iterator();
      while (localIterator.hasNext())
      {
        localObject = (zbbu)localIterator.next();
        if (((zbbu)localObject).a() == 9) {
          localArrayList.add((zbcr)localObject);
        }
      }
    }
    System.arraycopy(zc.a(localArrayList == null ? 0 : localArrayList.size()), 0, this.i, j, 4);
    j += 4;
    if (localArrayList != null)
    {
      localIterator = localArrayList.iterator();
      while (localIterator.hasNext())
      {
        localObject = (zbcr)localIterator.next();
        j = a((zbcr)localObject, j);
      }
    }
    System.arraycopy(zc.a(j - 4), 0, this.i, 2, 2);
    this.c.a(this.i, 0, j);
    if (paramzbcg.j != null)
    {
      localIterator = paramzbcg.j.iterator();
      while (localIterator.hasNext())
      {
        localObject = (zbbu)localIterator.next();
        switch (((zbbu)localObject).a())
        {
        case 2: 
          a((zbbw)localObject);
          break;
        case 6: 
          a((zbcd)localObject);
        }
      }
    }
    if ((paramzbcg.j != null) && (paramzbcg.j.getCount() != 0)) {
      this.c.a(new byte[] { 81, 1, 0, 0 });
    }
  }
  
  private int a(zbcr paramzbcr, int paramInt)
  {
    this.i[paramInt] = 0;
    this.i[(paramInt + 1)] = 0;
    this.i[(paramInt + 2)] = 0;
    this.i[(paramInt + 3)] = 0;
    paramInt += 4;
    System.arraycopy(zc.a(paramzbcr.f), 0, this.i, paramInt, 2);
    paramInt += 2;
    this.i[paramInt] = paramzbcr.b;
    paramInt++;
    int j = 0;
    if (paramzbcr.g) {
      j |= 0x1;
    }
    if (paramzbcr.h) {
      j |= 0x2;
    }
    this.i[paramInt] = ((byte)j);
    paramInt++;
    if (paramzbcr.b == 24) {
      paramInt += 5;
    }
    switch (paramzbcr.b & 0xFF & 0x1F)
    {
    case 4: 
    case 26: 
      System.arraycopy(zc.a(paramzbcr.e.StartRow), 0, this.i, paramInt, 2);
      System.arraycopy(zc.a(paramzbcr.e.StartColumn), 0, this.i, paramInt + 2, 2);
      break;
    case 5: 
    case 27: 
      a(paramzbcr.e, this.i, paramInt);
      break;
    }
    paramInt += 8;
    if (paramzbcr.g)
    {
      System.arraycopy(zc.a(paramzbcr.k), 0, this.i, paramInt, 2);
      paramInt += 2;
      System.arraycopy(zc.a(paramzbcr.i), 0, this.i, paramInt, 2);
      paramInt += 2;
      System.arraycopy(zc.a(paramzbcr.j), 0, this.i, paramInt, 2);
      paramInt += 2;
    }
    else
    {
      System.arraycopy(zc.a(paramzbcr.k), 0, this.i, paramInt, 2);
      paramInt += 2;
      this.i[paramInt] = paramzbcr.d;
      paramInt++;
      if (paramzbcr.d != 0)
      {
        this.i[paramInt] = 0;
        this.i[(paramInt + 1)] = 0;
        this.i[(paramInt + 2)] = 0;
        paramInt += 3;
      }
      paramInt = zct.a(this.i, paramInt, paramzbcr.c);
    }
    return paramInt;
  }
  
  private int a(zbby paramzbby, boolean paramBoolean)
  {
    if (paramzbby.h != null) {
      return 5;
    }
    switch (paramzbby.b())
    {
    case 3: 
      return 0;
    case 0: 
    case 2: 
      return 4;
    case 1: 
    case 4: 
      double d1 = 0.0D;
      if (paramzbby.b() == 1) {
        d1 = CellsHelper.getDoubleFromDateTime((DateTime)paramzbby.d(), this.a.getSettings().getDate1904());
      } else {
        d1 = ((Double)paramzbby.e).doubleValue();
      }
      if (paramBoolean)
      {
        this.e = zayi.a(d1, this.d, 0);
        if (this.e == 4) {
          return 1;
        }
      }
      else
      {
        this.g = zayi.a(d1, this.f, 0);
        if (this.g == 4) {
          return 1;
        }
      }
      return 2;
    case 5: 
      return 3;
    }
    return 0;
  }
  
  private void a(zbbw paramzbbw)
    throws Exception
  {
    zbcn localzbcn = new zbcn(paramzbbw);
    int j = 0;
    this.i[j] = 59;
    this.i[(j + 1)] = 1;
    j += 4;
    if (localzbcn.a == 0) {
      localzbcn.a = 76;
    }
    j = localzbcn.a(this.i, j);
    int k = 0;
    int m = 0;
    if (paramzbbw.q != null)
    {
      m = a(paramzbbw.q, true);
      k |= m;
    }
    if (paramzbbw.p != null) {
      k |= a(paramzbbw.p, false) << 3;
    }
    if (paramzbbw.i) {
      k |= 0x40;
    }
    if (paramzbbw.g) {
      k |= 0x80;
    }
    if (paramzbbw.c)
    {
      k |= 0x100;
      if (paramzbbw.r == null) {
        k |= 0x200;
      }
    }
    if (paramzbbw.o) {
      k |= 0x400;
    }
    if (paramzbbw.l) {
      k |= 0x800;
    }
    if (paramzbbw.b)
    {
      k |= 0x1000;
      if (paramzbbw.s == null) {
        k |= 0x2000;
      }
    }
    System.arraycopy(zc.a(k), 0, this.i, j, 2);
    j += 2;
    k = 0;
    int n = paramzbbw.e;
    if ((n > 0) && (n <= 59)) {
      this.i[j] = ((byte)n);
    } else {
      this.i[j] = 0;
    }
    j++;
    if (paramzbbw.h) {
      k |= 0x1;
    }
    if (paramzbbw.f) {
      k |= 0x2;
    }
    if (paramzbbw.d) {
      k |= 0x4;
    }
    this.i[j] = ((byte)k);
    j++;
    System.arraycopy(zc.a(paramzbbw.b()), 0, this.i, j, 2);
    j += 2;
    System.arraycopy(zc.a(paramzbbw.c()), 0, this.i, j, 2);
    j += 2;
    System.arraycopy(zc.a(b(paramzbbw.p, false)), 0, this.i, j, 4);
    j += 4;
    if (paramzbbw.t != null) {
      System.arraycopy(zc.a(paramzbbw.t.length), 0, this.i, j, 2);
    }
    j += 2;
    zsz localzsz;
    if (paramzbbw.r != null)
    {
      localzsz = new zsz(paramzbbw.r);
      System.arraycopy(localzsz.e(), 0, this.i, j, localzsz.e().length);
      j += localzsz.e().length;
    }
    if (paramzbbw.s != null)
    {
      localzsz = new zsz(paramzbbw.s);
      System.arraycopy(localzsz.e(), 0, this.i, j, localzsz.e().length);
      j += localzsz.e().length;
    }
    if (paramzbbw.p != null) {
      j = a(paramzbbw.p, j, false);
    }
    if (paramzbbw.q != null) {
      j = a(paramzbbw.q, j, true);
    }
    System.arraycopy(zc.a(j - 4), 0, this.i, 2, 2);
    this.c.a(this.i, 0, j);
    if (paramzbbw.t != null) {
      for (int i1 = 0; i1 < paramzbbw.t.length; i1++) {
        a(paramzbbw.t[i1]);
      }
    }
  }
  
  private int a(zbby paramzbby, int paramInt, boolean paramBoolean)
    throws Exception
  {
    if (paramzbby.h != null)
    {
      System.arraycopy(paramzbby.h, 0, this.i, paramInt, paramzbby.h.length);
      paramInt += paramzbby.h.length;
      this.i[paramInt] = 0;
      paramInt++;
      return paramInt;
    }
    switch (paramzbby.b())
    {
    case 3: 
      break;
    case 0: 
      this.i[paramInt] = 1;
      this.i[(paramInt + 1)] = ((byte)(((Boolean)paramzbby.d()).booleanValue() ? 0 : 1));
      break;
    case 2: 
      this.i[paramInt] = 0;
      this.i[(paramInt + 1)] = ztr.b((String)paramzbby.d());
      paramInt += 2;
      break;
    case 1: 
    case 4: 
      if (paramBoolean)
      {
        System.arraycopy(this.d, 0, this.i, paramInt, this.e);
        paramInt += this.e;
      }
      else
      {
        System.arraycopy(this.f, 0, this.i, paramInt, this.g);
        paramInt += this.g;
      }
      break;
    case 5: 
      this.h.b(this.i);
      this.h.a = paramInt;
      this.h.a((zbbj)paramzbby.e, false, this.c);
      this.i = this.h.e();
      paramInt = this.h.a;
      break;
    }
    return paramInt;
  }
  
  private int b(zbby paramzbby, boolean paramBoolean)
  {
    if (paramzbby == null) {
      return 0;
    }
    if (paramzbby.h != null)
    {
      int j = paramzbby.h.length;
      return j < 24 ? 24 : j;
    }
    switch (paramzbby.b())
    {
    case 3: 
      return 0;
    case 0: 
    case 2: 
      return 2;
    case 1: 
    case 4: 
      return paramBoolean ? this.e : this.g;
    case 5: 
      return (3 + ((zbbj)paramzbby.e).c.length()) * 2;
    }
    return 0;
  }
  
  private void a(Font paramFont)
    throws Exception
  {
    int j = 94;
    byte[] arrayOfByte = new byte[j];
    int k = 0;
    arrayOfByte[k] = 84;
    arrayOfByte[(k + 1)] = 1;
    arrayOfByte[(k + 2)] = 90;
    k += 4;
    System.arraycopy(zc.a(paramFont.m()), 0, arrayOfByte, k, 2);
    k += 2;
    String str = paramFont.getName();
    if (str.length() > 31) {
      str = str.substring(0, 31);
    }
    arrayOfByte[k] = ((byte)str.length());
    arrayOfByte[(k + 1)] = 1;
    k += 2;
    System.arraycopy(Encoding.getUnicode().a(paramFont.getName()), 0, arrayOfByte, k, paramFont.getName().length() * 2);
    k += 62;
    System.arraycopy(zc.a(paramFont.j()), 0, arrayOfByte, k, 4);
    k += 4;
    int m = 0;
    if (paramFont.isItalic()) {
      m |= 0x2;
    }
    if (paramFont.isStrikeout()) {
      m |= 0x80;
    }
    System.arraycopy(zc.a(m), 0, arrayOfByte, k, 4);
    k += 4;
    System.arraycopy(zc.a(paramFont.g()), 0, arrayOfByte, k, 2);
    k += 2;
    arrayOfByte[k] = paramFont.e();
    k += 2;
    switch (paramFont.getUnderline())
    {
    case 0: 
      arrayOfByte[k] = 0;
      break;
    case 1: 
      arrayOfByte[k] = 1;
      break;
    case 3: 
      arrayOfByte[k] = 33;
      break;
    case 2: 
      arrayOfByte[k] = 2;
      break;
    case 4: 
      arrayOfByte[k] = 34;
      break;
    }
    k++;
    arrayOfByte[k] = paramFont.e;
    k++;
    arrayOfByte[k] = paramFont.a;
    k++;
    k++;
    int n = 0;
    boolean[] arrayOfBoolean = { n };
    int i1 = paramFont.b().a(this.a.getWorksheets(), 64, true, arrayOfBoolean);
    n = arrayOfBoolean[0];
    arrayOfByte[k] = ((byte)i1);
    k += 2;
    k += 6;
    this.c.a(arrayOfByte, 0, k);
  }
  
  private void a(zbcd paramzbcd)
    throws Exception
  {
    int j = 22;
    if ((paramzbcd.f != null) && (paramzbcd.f.size() > 0)) {
      j += 8 * paramzbcd.f.size();
    }
    zsz localzsz = null;
    if ((paramzbcd.b != null) && (paramzbcd.b.c != null))
    {
      localzsz = new zsz(paramzbcd.b);
      j += localzsz.d();
    }
    byte[] arrayOfByte = new byte[j];
    int k = 0;
    arrayOfByte[k] = 74;
    arrayOfByte[(k + 1)] = 1;
    System.arraycopy(zc.a(j - 4), 0, arrayOfByte, k + 2, 2);
    k += 4;
    zbcn localzbcn = new zbcn(paramzbcd);
    localzbcn.a = (j + 2);
    localzbcn.h += 1;
    k = localzbcn.a(arrayOfByte, k);
    int m = 0;
    if (paramzbcd.h)
    {
      m |= 0x1;
      if (localzsz == null) {
        m |= 0x2;
      }
    }
    if (paramzbcd.d) {
      m |= 0x4;
    }
    arrayOfByte[k] = ((byte)m);
    k += 2;
    k = a(paramzbcd.f, arrayOfByte, k);
    this.c.a(arrayOfByte, 0, k);
    if (localzsz != null) {
      this.c.a(localzsz.e(), 0, localzsz.d());
    }
  }
  
  private int a(ArrayList paramArrayList, byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(zc.a(paramArrayList.size()), 0, paramArrayOfByte, paramInt, 2);
    paramInt += 2;
    for (int j = 0; j < paramArrayList.size(); j++)
    {
      CellArea localCellArea = (CellArea)paramArrayList.get(j);
      a(localCellArea, paramArrayOfByte, paramInt);
      paramInt += 8;
    }
    return paramInt;
  }
  
  private void a(zbbx paramzbbx)
    throws Exception
  {
    byte[] arrayOfByte1 = zct.c(paramzbbx.b());
    int j = 53 + arrayOfByte1.length + 2;
    byte[] arrayOfByte2 = new byte[j];
    int k = 0;
    arrayOfByte2[k] = 28;
    arrayOfByte2[(k + 1)] = 0;
    arrayOfByte2[(k + 2)] = ((byte)(arrayOfByte2.length - 4));
    k += 4;
    zbcn localzbcn = new zbcn(paramzbbx);
    k = localzbcn.a(arrayOfByte2, k);
    arrayOfByte2[k] = ((byte)(paramzbbx.b == 0 ? 2 : 1));
    k += 2;
    System.arraycopy(zc.a(paramzbbx.e), 0, arrayOfByte2, k, 2);
    k += 2;
    System.arraycopy(zc.a(paramzbbx.f), 0, arrayOfByte2, k, 2);
    k += 2;
    int m = 0;
    if (paramzbbx.c) {
      m |= 0x2;
    }
    if (paramzbbx.g) {
      m |= 0x80;
    }
    if (paramzbbx.h) {
      m |= 0x100;
    }
    System.arraycopy(zc.a(m), 0, arrayOfByte2, k, 2);
    k += 2;
    System.arraycopy(paramzbbx.d, 0, arrayOfByte2, k, 16);
    k += 16;
    System.arraycopy(zc.a(paramzbbx.k), 0, arrayOfByte2, k, 4);
    k += 4;
    System.arraycopy(zc.a(paramzbbx.i - paramzbbx.k), 0, arrayOfByte2, k, 4);
    k += 4;
    k += zct.a(arrayOfByte2, k, arrayOfByte1, paramzbbx.b());
    k += 2;
    this.c.a(arrayOfByte2, 0, k);
  }
  
  private void a(zbcb paramzbcb)
    throws Exception
  {
    byte[] arrayOfByte = new byte[34];
    zbcn localzbcn = new zbcn(paramzbcb);
    int j = 0;
    arrayOfByte[j] = -84;
    arrayOfByte[(j + 1)] = 1;
    arrayOfByte[(j + 2)] = 30;
    j += 4;
    j = localzbcn.a(arrayOfByte, j);
    System.arraycopy(paramzbcb.b, 0, arrayOfByte, j, 16);
    j += 16;
    this.c.a(arrayOfByte, 0, j);
  }
  
  private void a(zbch paramzbch)
    throws Exception
  {
    int j = 280;
    byte[] arrayOfByte = new byte[j];
    int k = 0;
    arrayOfByte[k] = 77;
    arrayOfByte[(k + 1)] = 1;
    System.arraycopy(zc.a(j - 4), 0, arrayOfByte, k + 2, 2);
    k += 4;
    zbcn localzbcn = new zbcn(paramzbch);
    k = localzbcn.a(arrayOfByte, k);
    System.arraycopy(zc.a(paramzbch.f), 0, arrayOfByte, k, 2);
    k += 4;
    k = zct.a(arrayOfByte, k, paramzbch.b);
    this.c.a(arrayOfByte, 0, j);
  }
  
  private void a(zbco paramzbco)
    throws Exception
  {
    int j = 532;
    byte[] arrayOfByte = new byte[j];
    int k = 0;
    arrayOfByte[k] = 62;
    arrayOfByte[(k + 1)] = 1;
    System.arraycopy(zc.a(j - 4), 0, arrayOfByte, k + 2, 2);
    k += 4;
    zbcn localzbcn = new zbcn(paramzbco);
    k = localzbcn.a(arrayOfByte, k);
    zct.a(arrayOfByte, k, paramzbco.c);
    k += 257;
    zct.a(arrayOfByte, k, paramzbco.b);
    k += 257;
    this.c.a(arrayOfByte, 0, k);
  }
  
  private static void a(CellArea paramCellArea, byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, paramArrayOfByte, paramInt, 2);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, paramArrayOfByte, paramInt + 2, 2);
    System.arraycopy(zc.a(paramCellArea.StartColumn), 0, paramArrayOfByte, paramInt + 4, 2);
    System.arraycopy(zc.a(paramCellArea.EndColumn), 0, paramArrayOfByte, paramInt + 6, 2);
  }
  
  private void a(zbcc paramzbcc)
    throws Exception
  {
    int j = 35;
    if (paramzbcc.r != 0) {
      j += 3;
    }
    byte[] arrayOfByte1 = zct.c(paramzbcc.x);
    j += 3 + (arrayOfByte1 == null ? 0 : arrayOfByte1.length);
    if (paramzbcc.d != null) {
      j += paramzbcc.d.length - 2;
    }
    j += a(paramzbcc.j);
    j += a(paramzbcc.l);
    j += a(paramzbcc.n);
    j += a(paramzbcc.y);
    if (paramzbcc.c != null) {
      j += paramzbcc.c.length - 2;
    }
    j += a(paramzbcc.k);
    j += a(paramzbcc.m);
    j += a(paramzbcc.o);
    j += a(paramzbcc.z);
    byte[] arrayOfByte2 = new byte[j];
    int k = 0;
    arrayOfByte2[k] = 83;
    arrayOfByte2[(k + 1)] = 1;
    System.arraycopy(zc.a(j - 4), 0, arrayOfByte2, k + 2, 2);
    k += 4;
    zbcn localzbcn = new zbcn(paramzbcc);
    k = localzbcn.a(arrayOfByte2, k);
    System.arraycopy(zc.a(paramzbcc.w), 0, arrayOfByte2, k, 2);
    k += 2;
    if (paramzbcc.p) {
      arrayOfByte2[k] = 1;
    }
    k += 2;
    if (paramzbcc.d != null) {
      System.arraycopy(paramzbcc.d, 0, arrayOfByte2, k, 2);
    }
    k += 2;
    int m = 0;
    if (paramzbcc.s) {
      m |= 0x2;
    }
    m |= (byte)((paramzbcc.d() & 0xFF) << 2);
    m |= (paramzbcc.f() & 0xFF) << 8;
    int n = 0;
    if (paramzbcc.u) {
      n |= 0x1;
    }
    if (!zw.b(paramzbcc.j))
    {
      n |= 0x2;
      m |= 0x1;
    }
    if (!zw.b(paramzbcc.l))
    {
      n |= 0x4;
      m |= 0x1;
    }
    if (!zw.b(paramzbcc.n))
    {
      n |= 0x8;
      m |= 0x1;
    }
    if (!zw.b(paramzbcc.y))
    {
      n |= 0x10;
      m |= 0x1;
    }
    System.arraycopy(zc.a(m), 0, arrayOfByte2, k, 2);
    k += 2;
    System.arraycopy(zc.a(n), 0, arrayOfByte2, k, 2);
    k += 2;
    if (paramzbcc.c != null) {
      System.arraycopy(paramzbcc.c, 0, arrayOfByte2, k, 2);
    }
    k += 2;
    m = 0;
    if (paramzbcc.t) {
      m |= 0x2;
    }
    m |= (byte)((paramzbcc.e() & 0xFF) << 2);
    m |= (paramzbcc.g() & 0xFF) << 8;
    n = 0;
    if (paramzbcc.v) {
      n |= 0x1;
    }
    if (!zw.b(paramzbcc.k))
    {
      n |= 0x2;
      m |= 0x1;
    }
    if (!zw.b(paramzbcc.m))
    {
      n |= 0x4;
      m |= 0x1;
    }
    if (!zw.b(paramzbcc.o))
    {
      n |= 0x8;
      m |= 0x1;
    }
    if (!zw.b(paramzbcc.z))
    {
      n |= 0x10;
      m |= 0x1;
    }
    System.arraycopy(zc.a(m), 0, arrayOfByte2, k, 2);
    k += 2;
    System.arraycopy(zc.a(n), 0, arrayOfByte2, k, 2);
    k += 2;
    arrayOfByte2[k] = paramzbcc.r;
    k++;
    if (paramzbcc.r != 0) {
      k += 3;
    }
    k += zct.a(arrayOfByte2, k, arrayOfByte1, paramzbcc.x);
    if (paramzbcc.d != null)
    {
      System.arraycopy(paramzbcc.d, 2, arrayOfByte2, k, paramzbcc.d.length - 2);
      k += paramzbcc.d.length - 2;
    }
    if (!zw.b(paramzbcc.j)) {
      k = a(arrayOfByte2, k, paramzbcc.j);
    }
    if (!zw.b(paramzbcc.l)) {
      k = a(arrayOfByte2, k, paramzbcc.l);
    }
    if (!zw.b(paramzbcc.n)) {
      k = a(arrayOfByte2, k, paramzbcc.n);
    }
    if (!zw.b(paramzbcc.y)) {
      k = a(arrayOfByte2, k, paramzbcc.y);
    }
    if (paramzbcc.c != null)
    {
      System.arraycopy(paramzbcc.c, 2, arrayOfByte2, k, paramzbcc.c.length - 2);
      k += paramzbcc.c.length - 2;
    }
    if (!zw.b(paramzbcc.k)) {
      k = a(arrayOfByte2, k, paramzbcc.k);
    }
    if (!zw.b(paramzbcc.m)) {
      k = a(arrayOfByte2, k, paramzbcc.m);
    }
    if (!zw.b(paramzbcc.o)) {
      k = a(arrayOfByte2, k, paramzbcc.o);
    }
    if (!zw.b(paramzbcc.z)) {
      k = a(arrayOfByte2, k, paramzbcc.z);
    }
    this.c.a(arrayOfByte2, 0, k);
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    if (zw.b(paramString)) {
      return paramInt + 3;
    }
    System.arraycopy(zc.a(paramString.length()), 0, paramArrayOfByte, paramInt, 2);
    paramInt += 2;
    byte[] arrayOfByte = Encoding.getUnicode().a(paramString);
    int j = arrayOfByte.length == paramString.length() ? 1 : 0;
    paramArrayOfByte[(paramInt++)] = (j != 0 ? 0 : 1);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt, arrayOfByte.length);
    return paramInt + arrayOfByte.length;
  }
  
  private int a(String paramString)
  {
    if (zw.b(paramString)) {
      return 0;
    }
    return 3 + paramString.length() * 2;
  }
  
  private void a(zbbv paramzbbv)
    throws Exception
  {
    byte[] arrayOfByte = new byte[32];
    zbcn localzbcn = new zbcn(paramzbbv);
    int j = 0;
    arrayOfByte[j] = 8;
    arrayOfByte[(j + 1)] = 8;
    arrayOfByte[(j + 2)] = 28;
    j += 4;
    j = localzbcn.a(arrayOfByte, j);
    a(paramzbbv.d, arrayOfByte, j);
    j += 8;
    System.arraycopy(zc.a(paramzbbv.c), 0, arrayOfByte, j, 2);
    j += 2;
    System.arraycopy(zc.a(paramzbbv.b), 0, arrayOfByte, j, 2);
    j += 4;
    this.c.a(arrayOfByte, 0, j);
  }
  
  private void a(zbcm paramzbcm)
    throws Exception
  {
    int j = 26;
    if (this.b.k == 12) {
      j += 16;
    } else {
      j += 8;
    }
    byte[] arrayOfByte = new byte[j + 4];
    int k = 0;
    arrayOfByte[k] = 8;
    arrayOfByte[(k + 1)] = 8;
    arrayOfByte[(k + 2)] = ((byte)j);
    k += 4;
    arrayOfByte[k] = 8;
    arrayOfByte[(k + 1)] = 8;
    arrayOfByte[(k + 2)] = 1;
    k += 4;
    if (this.b.k == 12)
    {
      zcgj.a(paramzbcm.c, arrayOfByte, k);
      k += 16;
    }
    else
    {
      zcgj.a(paramzbcm.c, arrayOfByte, k);
      k += 8;
    }
    zbcn localzbcn = new zbcn(paramzbcm);
    k = localzbcn.a(arrayOfByte, k);
    System.arraycopy(zc.a(paramzbcm.b), 0, arrayOfByte, k, 4);
    k += 4;
    this.c.a(arrayOfByte, 0, k);
  }
  
  private static void a(DateTime paramDateTime, byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(zc.a(paramDateTime.getYear()), 0, paramArrayOfByte, paramInt, 2);
    paramArrayOfByte[(paramInt + 2)] = ((byte)paramDateTime.getMonth());
    paramArrayOfByte[(paramInt + 3)] = ((byte)paramDateTime.getDay());
    paramArrayOfByte[(paramInt + 4)] = ((byte)paramDateTime.getHour());
    paramArrayOfByte[(paramInt + 5)] = ((byte)paramDateTime.getMinute());
    paramArrayOfByte[(paramInt + 6)] = ((byte)paramDateTime.getSecond());
    int j = paramDateTime.getDayOfWeek();
    if (j == 0) {
      j = 7;
    }
    paramArrayOfByte[(paramInt + 7)] = ((byte)j);
  }
  
  private void b(zbci paramzbci)
    throws Exception
  {
    byte[] arrayOfByte1 = new byte['¢'];
    int j = 0;
    arrayOfByte1[j] = 56;
    arrayOfByte1[(j + 1)] = 1;
    arrayOfByte1[(j + 2)] = -98;
    j += 4;
    zbcn localzbcn = new zbcn(paramzbci);
    j = localzbcn.a(arrayOfByte1, j);
    zbce localzbce = paramzbci.b;
    System.arraycopy(localzbce.b, 0, arrayOfByte1, j, 16);
    j += 16;
    System.arraycopy(zc.a(localzbce.j), 0, arrayOfByte1, j, 2);
    j += 2;
    String str = localzbce.f;
    if ((str != null) && (str.length() > 54)) {
      str = str.substring(0, 54);
    }
    byte[] arrayOfByte2 = zct.c(str);
    zct.a(arrayOfByte1, j, arrayOfByte2, str);
    j += 116;
    a(localzbce.a, arrayOfByte1, j);
    j += 8;
    System.arraycopy(zc.a(localzbce.e), 0, arrayOfByte1, j, 2);
    j += 2;
    this.c.a(arrayOfByte1, 0, j);
  }
  
  private void c(zbci paramzbci)
    throws Exception
  {
    int j = 4;
    if (paramzbci.b.g != null) {
      j += paramzbci.b.g.length * 2;
    }
    byte[] arrayOfByte = new byte[j];
    int k = 0;
    arrayOfByte[k] = 61;
    arrayOfByte[(k + 1)] = 1;
    System.arraycopy(zc.a(j - 4), 0, arrayOfByte, k + 2, 2);
    k += 4;
    for (int m = 0; m < paramzbci.b.g.length; m++)
    {
      System.arraycopy(zc.a(paramzbci.b.g[m]), 0, arrayOfByte, k, 2);
      k += 2;
    }
    this.c.a(arrayOfByte, 0, k);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcaj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */