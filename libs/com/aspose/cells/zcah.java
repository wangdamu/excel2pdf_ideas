package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcah
{
  private zqj a;
  private byte[] b;
  private int c;
  private byte[] d;
  private int e;
  private WorksheetCollection f;
  private zbcj g;
  private boolean h = false;
  private zbci i;
  
  zcah(zqj paramzqj, WorksheetCollection paramWorksheetCollection)
  {
    this.a = paramzqj;
    this.b = new byte[2];
    this.f = paramWorksheetCollection;
    this.g = paramWorksheetCollection.ag();
  }
  
  void a()
    throws Exception
  {
    for (;;)
    {
      this.c = this.a.b(this.b);
      switch (this.c)
      {
      case 406: 
        p();
        break;
      case 405: 
        q();
        break;
      case 404: 
        r();
        break;
      case 312: 
        n();
        break;
      case 317: 
        o();
        break;
      case 318: 
        this.i.c.a(m());
        break;
      case 428: 
        this.i.c.a(l());
        break;
      case 28: 
        this.i.c.a(k());
        break;
      case 338: 
        this.i.c.a(i());
        break;
      case 333: 
        this.i.c.a(h());
        break;
      case 330: 
        this.i.c.a(g());
        break;
      case 331: 
        this.i.c.a(f());
        break;
      case 339: 
        this.i.c.a(j());
        break;
      case 315: 
        this.i.c.a(d());
        break;
      case 311: 
        this.i.c.a(c());
        break;
      case 320: 
        this.i.c.a(b());
        break;
      case 2056: 
        this.i.c.a(e());
        break;
      case 334: 
      case 336: 
        this.e = this.a.b(this.b);
        this.a.a(this.e & 0xFFFF);
        this.h = true;
        break;
      case 10: 
        return;
      default: 
        this.e = this.a.b(this.b);
        this.a.a(this.e & 0xFFFF);
      }
    }
  }
  
  private zbbu b()
    throws Exception
  {
    zbbz localzbbz = new zbbz();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbcn.a(localzbbz);
    int j = 14;
    localzbbz.b = a(this.d, j);
    j += 8;
    localzbbz.c = a(this.d, j);
    j += 8;
    localzbbz.g = zc.b(this.d, j);
    j += 2;
    int k = zc.a(this.d, j);
    j += 4;
    for (int m = 0; m < k; m++)
    {
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = j;
      localzbbz.d().a(a(arrayOfInt));
      j = arrayOfInt[0];
    }
    if (this.h) {
      for (;;)
      {
        this.c = this.a.b(this.b);
        switch (this.c)
        {
        case 330: 
          localzbbz.d().a(g());
          break;
        case 315: 
          localzbbz.d().a(d());
          break;
        case 335: 
          this.h = false;
          this.e = this.a.b(this.b);
          this.a.a(this.e & 0xFFFF);
          return localzbbz;
        default: 
          this.e = this.a.b(this.b);
          this.a.a(this.e & 0xFFFF);
        }
      }
    }
    return localzbbz;
  }
  
  private zbbu c()
    throws Exception
  {
    zbcg localzbcg = new zbcg();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbcg.g = localzbcn.b;
    localzbcg.i = localzbcn.d;
    localzbcg.e = localzbcn.e;
    localzbcg.h = localzbcn.h;
    switch (localzbcn.c)
    {
    case 0: 
      localzbcg.b = 5;
      break;
    case 1: 
      localzbcg.b = 4;
      break;
    case 2: 
      localzbcg.b = 3;
      break;
    case 3: 
      localzbcg.b = 2;
      break;
    }
    int j = 14;
    localzbcg.d = ((this.d[j] & 0xFF & 0x1) != 0);
    j += 2;
    localzbcg.f = a(this.d, j);
    j += 8;
    int k = zc.a(this.d, j);
    j += 4;
    for (int m = 0; m < k; m++)
    {
      int[] arrayOfInt = new int[1];
      arrayOfInt[0] = j;
      localzbcg.b().a(a(arrayOfInt));
      j = arrayOfInt[0];
    }
    if (this.h) {
      for (;;)
      {
        this.c = this.a.b(this.b);
        switch (this.c)
        {
        case 330: 
          localzbcg.b().a(g());
          break;
        case 315: 
          localzbcg.b().a(d());
          break;
        case 337: 
          this.h = false;
          this.e = this.a.b(this.b);
          this.a.a(this.e & 0xFFFF);
          return localzbcg;
        default: 
          this.e = this.a.b(this.b);
          this.a.a(this.e & 0xFFFF);
        }
      }
    }
    return localzbcg;
  }
  
  private zbbu a(int[] paramArrayOfInt)
  {
    zbcr localzbcr = new zbcr();
    int j = paramArrayOfInt[0];
    j += 4;
    localzbcr.f = (zc.e(this.d, j) & 0xFFFF);
    j += 2;
    localzbcr.b = this.d[j];
    j++;
    localzbcr.g = ((this.d[j] & 0xFF & 0x1) != 0);
    localzbcr.h = ((this.d[j] & 0xFF & 0x2) != 0);
    j++;
    if (localzbcr.b == 24) {
      j += 5;
    }
    switch (localzbcr.b & 0xFF & 0x1F)
    {
    case 4: 
    case 26: 
      localzbcr.i = zc.b(this.d, j);
      localzbcr.j = (this.d[(j + 2)] & 0xFF);
      localzbcr.e = CellArea.createCellArea(localzbcr.i, localzbcr.j, localzbcr.i, localzbcr.j);
      break;
    case 5: 
    case 27: 
      localzbcr.e = a(this.d, j);
      break;
    }
    j += 8;
    if (localzbcr.g)
    {
      localzbcr.k = zc.b(this.d, j);
      j += 2;
      localzbcr.d = this.d[j];
      j += (localzbcr.d == 0 ? 1 : 4);
      paramArrayOfInt[0] = j;
      localzbcr.c = zct.b(this.d, paramArrayOfInt);
      j = paramArrayOfInt[0];
    }
    else
    {
      localzbcr.k = zc.b(this.d, j);
      j += 2;
      localzbcr.i = zc.b(this.d, j);
      j += 2;
      localzbcr.j = zc.b(this.d, j);
      j += 2;
    }
    paramArrayOfInt[0] = j;
    return localzbcr;
  }
  
  private zbbu d()
    throws Exception
  {
    zbbw localzbbw = new zbbw();
    s();
    ArrayList localArrayList = new ArrayList();
    zf.a(localArrayList, this.d);
    for (;;)
    {
      this.c = this.a.b(this.b);
      if ((this.c & 0xFFFF) != 60) {
        break;
      }
      s();
      zf.a(localArrayList, this.d);
    }
    this.a.a(-2);
    this.d = ((byte[])localArrayList.get(0));
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbcn.a(localzbbw);
    int j = 14;
    int k = 0;
    int m = 0;
    int n = zc.b(this.d, j);
    int i1 = zchh.a(n & 0x7);
    m = zchh.a(n >> 3 & 0x7);
    localzbbw.i = ((n & 0x40) != 0);
    localzbbw.g = ((n & 0x80) != 0);
    localzbbw.c = ((n & 0x100) != 0);
    k = (n & 0x200) != 0 ? 1 : 0;
    localzbbw.o = ((n & 0x400) != 0);
    localzbbw.l = ((n & 0x800) != 0);
    localzbbw.b = ((n & 0x1000) != 0);
    int i2 = (n & 0x2000) != 0 ? 1 : 0;
    j += 2;
    localzbbw.e = (this.d[j] & 0xFF);
    j++;
    localzbbw.f = ((this.d[j] & 0xFF & 0x1) != 0);
    localzbbw.h = ((this.d[j] & 0xFF & 0x2) != 0);
    localzbbw.d = ((this.d[j] & 0xFF & 0x4) != 0);
    int i3 = (this.d[j] & 0xFF & 0x8) != 0 ? 1 : 0;
    j++;
    int i4 = zc.b(this.d, j);
    j += 2;
    int i5 = zc.b(this.d, j);
    j += 2;
    int i6 = zc.a(this.d, j);
    j += 4;
    int i7 = zc.b(this.d, j);
    j += 2;
    if ((localzbbw.c) && (k == 0))
    {
      localzbbw.r = new zbcp();
      j = a(j, localzbbw.r);
    }
    if ((localzbbw.b) && (i2 == 0))
    {
      localzbbw.s = new zbcp();
      j = a(j, localzbbw.s);
    }
    Object localObject = null;
    int i8 = 0;
    byte[] arrayOfByte = null;
    zbel localzbel;
    int i10;
    if (i6 > 0)
    {
      switch (n >> 3 & 0x7)
      {
      case 1: 
        localObject = Double.valueOf(zayi.a(this.d, j));
        j += 4;
        break;
      case 2: 
        localObject = Double.valueOf(zc.f(this.d, j));
        j += 8;
        break;
      case 3: 
        localzbel = new zbel(localArrayList, this.f);
        localObject = localzbel.a(i8, this.d, j);
        this.d = localzbel.a;
        i8 = localzbel.b;
        j = localzbel.c;
        break;
      case 4: 
        if (this.d[j] == 0) {
          localObject = ztr.b(this.d[(j + 1)]);
        } else {
          localObject = this.d[(j + 1)] == 1 ? znq.d : znq.e;
        }
        j += 2;
        break;
      case 5: 
        i10 = zc.b(this.d, j);
        j += 2;
        arrayOfByte = a(this.d, j, i10);
        if (arrayOfByte != null) {
          j += arrayOfByte.length - 2;
        }
        j++;
        break;
      }
      if ((arrayOfByte != null) || (localObject != null))
      {
        localzbbw.p = new zbby(localzbbw, i4, i5);
        if (arrayOfByte != null) {
          localzbbw.p.h = arrayOfByte;
        }
        localzbbw.p.e = localObject;
      }
    }
    arrayOfByte = null;
    localObject = null;
    switch (n & 0x7)
    {
    case 1: 
      localObject = Double.valueOf(zayi.a(this.d, j));
      j += 4;
      break;
    case 2: 
      localObject = Double.valueOf(zc.f(this.d, j));
      j += 8;
      break;
    case 3: 
      localzbel = new zbel(localArrayList, this.f);
      localObject = localzbel.a(i8, this.d, j);
      this.d = localzbel.a;
      i8 = localzbel.b;
      j = localzbel.c;
      break;
    case 4: 
      if (this.d[j] == 0) {
        localObject = ztr.b(this.d[(j + 1)]);
      } else {
        localObject = this.d[(j + 1)] == 1 ? znq.d : znq.e;
      }
      j += 2;
      break;
    case 5: 
      i10 = zc.b(this.d, j);
      j += 2;
      arrayOfByte = a(this.d, j, i10);
      if (arrayOfByte != null) {
        j += arrayOfByte.length - 2;
      }
      j++;
      break;
    }
    if ((arrayOfByte != null) || (localObject != null))
    {
      localzbbw.q = new zbby(localzbbw, i4, i5);
      if (arrayOfByte != null) {
        localzbbw.q.h = arrayOfByte;
      }
      localzbbw.q.e = localObject;
    }
    if (i7 != 0)
    {
      localzbbw.t = new Font[i7];
      for (int i9 = 0; i9 < i7; i9++)
      {
        localzbbw.t[i9] = new Font(this.f, null, false);
        a(localzbbw.t[i9], j);
      }
    }
    return localzbbw;
  }
  
  private void a(Font paramFont, int paramInt)
    throws Exception
  {
    s();
    int j = zc.b(this.d, paramInt);
    paramInt += 2;
    int k = this.d[paramInt] & 0xFF;
    paramInt++;
    boolean bool = this.d[paramInt] == 0;
    paramInt++;
    paramFont.setName(zct.a(this.d, paramInt, bool, k));
    paramInt += 62;
    paramFont.c(zc.a(this.d, paramInt));
    paramInt += 4;
    paramFont.setItalic((this.d[paramInt] & 0xFF & 0x2) != 0);
    paramFont.setStrikeout((this.d[paramInt] & 0xFF & 0x80) != 0);
    paramInt += 4;
    paramFont.b(zc.b(this.d, paramInt));
    paramInt += 2;
    switch (this.d[paramInt])
    {
    case 1: 
      paramFont.setSuperscript(true);
      break;
    case 2: 
      paramFont.setSubscript(true);
      break;
    }
    paramInt += 2;
    switch (this.d[paramInt])
    {
    case 1: 
      paramFont.setUnderline(1);
      break;
    case 2: 
      paramFont.setUnderline(2);
      break;
    case 3: 
      paramFont.setUnderline(3);
      break;
    case 4: 
      paramFont.setUnderline(4);
      break;
    }
    paramInt++;
    paramFont.a(this.d[paramInt]);
    paramInt++;
    paramFont.setCharset(this.d[paramInt]);
    paramInt++;
    paramFont.b().a(3, zc.b(this.d, paramInt));
    paramInt += 2;
  }
  
  private zbbu e()
    throws Exception
  {
    zbcm localzbcm = new zbcm();
    s();
    int j = 4;
    if (this.g.j == 12)
    {
      localzbcm.c = a(this.d, j);
      j += 8;
    }
    else
    {
      localzbcm.c = zcgj.a(this.d, j);
      j += 16;
    }
    zbcn localzbcn = zchh.a(this.d, j);
    localzbcm.d = localzbcn.h;
    localzbcm.e = localzbcn.b;
    j += 14;
    localzbcm.b = zc.a(this.d, j);
    return localzbcm;
  }
  
  private zbbu f()
    throws Exception
  {
    zbbv localzbbv = new zbbv();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbbv.e = localzbcn.h;
    int j = 14;
    localzbbv.d = a(this.d, j);
    j += 8;
    localzbbv.c = zc.b(this.d, j);
    j += 2;
    localzbbv.b = zc.b(this.d, j);
    j += 2;
    return localzbbv;
  }
  
  private static CellArea a(byte[] paramArrayOfByte, int paramInt)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = zc.b(paramArrayOfByte, paramInt);
    localCellArea.EndRow = zc.b(paramArrayOfByte, paramInt + 2);
    localCellArea.StartColumn = (paramArrayOfByte[(paramInt + 4)] & 0xFF);
    localCellArea.EndColumn = (paramArrayOfByte[(paramInt + 6)] & 0xFF);
    return localCellArea;
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt, ArrayList paramArrayList)
  {
    int j = paramInt;
    int k = zc.b(paramArrayOfByte, j);
    j += 2;
    for (int m = 0; (m < k) && (j < paramArrayOfByte.length); m++)
    {
      CellArea localCellArea = new CellArea();
      localCellArea.StartRow = zc.b(paramArrayOfByte, j);
      localCellArea.EndRow = zc.b(paramArrayOfByte, j + 2);
      localCellArea.StartColumn = zc.b(paramArrayOfByte, j + 4);
      localCellArea.EndColumn = zc.b(paramArrayOfByte, j + 6);
      zf.a(paramArrayList, localCellArea);
      j += 8;
    }
    return j;
  }
  
  private zbbu g()
    throws Exception
  {
    zbcd localzbcd = new zbcd();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbcd.e = (localzbcn.h - 1);
    int j = 14;
    localzbcd.h = ((this.d[j] & 0xFF & 0x1) != 0);
    int k = (this.d[j] & 0xFF & 0x2) != 0 ? 1 : 0;
    localzbcd.d = ((this.d[j] & 0xFF & 0x4) != 0);
    j += 2;
    ArrayList localArrayList = new ArrayList();
    j = a(this.d, j, localArrayList);
    localzbcd.f = localArrayList;
    if (k == 0)
    {
      localzbcd.b = new zbcp();
      j = a(j, localzbcd.b);
    }
    return localzbcd;
  }
  
  private int a(int paramInt, zbcp paramzbcp)
    throws Exception
  {
    paramzbcp.b = ((this.d[(paramInt + 4)] & 0xFF & 0x4) != 0);
    Style localStyle = new Style(this.f);
    paramInt = zcal.a(this.d, paramInt, localStyle);
    paramzbcp.c = localStyle;
    return paramInt;
  }
  
  private zbbu h()
    throws Exception
  {
    zbch localzbch = new zbch();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbch.d = localzbcn.b;
    localzbch.g = localzbcn.d;
    localzbch.c = localzbcn.e;
    localzbch.e = localzbcn.h;
    int j = 14;
    localzbch.f = (zc.e(this.d, j) & 0xFFFF);
    j += 4;
    localzbch.b = zct.a(this.d, j);
    return localzbch;
  }
  
  private zbbu i()
    throws Exception
  {
    zbck localzbck = new zbck();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbck.d = localzbcn.b;
    localzbck.c = localzbcn.d;
    localzbck.b = localzbcn.e;
    localzbck.e = localzbcn.h;
    return localzbck;
  }
  
  private zbbu j()
    throws Exception
  {
    zbcc localzbcc = new zbcc();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbcc.C = localzbcn.b;
    localzbcc.B = localzbcn.d;
    localzbcc.A = localzbcn.e;
    localzbcc.b = (localzbcn.c == 34);
    int j = 14;
    localzbcc.w = zc.b(this.d, j);
    j += 2;
    localzbcc.p = ((this.d[j] & 0xFF & 0x1) != 0);
    localzbcc.q = ((this.d[j] & 0xFF & 0x2) != 0);
    j += 2;
    int k = zc.b(this.d, j);
    j += 2;
    int m = (this.d[j] & 0xFF & 0x1) != 0 ? 1 : 0;
    localzbcc.s = ((this.d[j] & 0xFF & 0x2) != 0);
    localzbcc.a((byte)((this.d[j] & 0xFF) >> 2));
    localzbcc.c(this.d[(j + 1)]);
    j += 2;
    int n = zc.b(this.d, j);
    j += 2;
    localzbcc.u = ((n & 0x1) != 0);
    int i1 = zc.b(this.d, j);
    j += 2;
    int i2 = (this.d[j] & 0xFF & 0x1) != 0 ? 1 : 0;
    localzbcc.s = ((this.d[j] & 0xFF & 0x2) != 0);
    localzbcc.t = ((this.d[j] & 0xFF & 0x2) != 0);
    localzbcc.b((byte)((this.d[j] & 0xFF) >> 2));
    localzbcc.d(this.d[(j + 1)]);
    j += 2;
    int i3 = zc.b(this.d, j);
    j += 2;
    localzbcc.v = ((i3 & 0x1) != 0);
    localzbcc.r = this.d[j];
    if (localzbcc.r != 0) {
      j += 4;
    } else {
      j++;
    }
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = j;
    localzbcc.x = zct.b(this.d, arrayOfInt);
    j = arrayOfInt[0];
    localzbcc.d = a(this.d, j, k);
    if (localzbcc.d != null) {
      j += localzbcc.d.length - 2;
    }
    arrayOfInt[0] = j;
    if ((n & 0x2) != 0) {
      localzbcc.j = zct.b(this.d, arrayOfInt);
    }
    if ((n & 0x4) != 0) {
      localzbcc.l = zct.b(this.d, arrayOfInt);
    }
    if ((n & 0x8) != 0) {
      localzbcc.n = zct.b(this.d, arrayOfInt);
    }
    if ((n & 0x10) != 0) {
      localzbcc.y = zct.b(this.d, arrayOfInt);
    }
    j = arrayOfInt[0];
    localzbcc.c = a(this.d, j, i1);
    if (localzbcc.c != null) {
      j += localzbcc.c.length - 2;
    }
    arrayOfInt[0] = j;
    if ((i3 & 0x2) != 0) {
      localzbcc.k = zct.b(this.d, arrayOfInt);
    }
    if ((i3 & 0x4) != 0) {
      localzbcc.m = zct.b(this.d, arrayOfInt);
    }
    if ((i3 & 0x8) != 0) {
      localzbcc.o = zct.b(this.d, arrayOfInt);
    }
    if ((i3 & 0x10) != 0) {
      localzbcc.z = zct.b(this.d, arrayOfInt);
    }
    j = arrayOfInt[0];
    return localzbcc;
  }
  
  private byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return null;
    }
    int j = zbcq.a(paramArrayOfByte, paramInt1, paramInt2, this.f);
    byte[] arrayOfByte = new byte[paramInt2 + j + 2];
    System.arraycopy(zc.a(paramInt2), 0, arrayOfByte, 0, 2);
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 2, arrayOfByte.length - 2);
    return arrayOfByte;
  }
  
  private zbbu k()
    throws Exception
  {
    zbbx localzbbx = new zbbx();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbbx.l = localzbcn.h;
    int j = 14;
    if ((this.d[j] & 0xFF & 0x2) != 0) {
      localzbbx.b = 0;
    }
    if ((this.d[j] & 0xFF & 0x1) != 0) {
      localzbbx.b = 1;
    }
    j += 2;
    localzbbx.e = zc.b(this.d, j);
    localzbbx.f = zc.b(this.d, j + 2);
    j += 4;
    localzbbx.c = ((this.d[j] & 0xFF & 0x2) != 0);
    localzbbx.g = ((this.d[j] & 0xFF & 0x80) != 0);
    localzbbx.h = ((this.d[(j + 1)] & 0xFF & 0x1) != 0);
    j += 2;
    localzbbx.d = b(this.d, j);
    j += 16;
    localzbbx.k = zc.a(this.d, j);
    j += 4;
    localzbbx.i = (zc.a(this.d, j) + localzbbx.k);
    j += 4;
    localzbbx.a(zct.a(this.d, j));
    return localzbbx;
  }
  
  private zbbu l()
    throws Exception
  {
    zbcb localzbcb = new zbcb();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    switch (localzbcn.c)
    {
    case 43: 
      localzbcb.c = 0;
      break;
    case 44: 
      localzbcb.c = 1;
      break;
    default: 
      localzbcb.c = 0;
    }
    int j = 14;
    localzbcb.b = b(this.d, j);
    return localzbcb;
  }
  
  private zbbu m()
    throws Exception
  {
    zbco localzbco = new zbco();
    s();
    zbcn localzbcn = zchh.a(this.d, 0);
    localzbco.e = localzbcn.b;
    localzbco.g = localzbcn.d;
    localzbco.d = localzbcn.e;
    localzbco.f = localzbcn.h;
    int j = 14;
    localzbco.c = zct.a(this.d, j);
    j += 257;
    localzbco.b = zct.a(this.d, j);
    j += 257;
    return localzbco;
  }
  
  private void n()
    throws Exception
  {
    s();
    int j = 0;
    this.i = new zbci(this.g);
    this.g.a(this.i);
    zbcn localzbcn = zchh.a(this.d, j);
    j += 14;
    zbce localzbce = this.i.b;
    localzbce.b = b(this.d, j);
    j += 16;
    localzbce.j = zc.b(this.d, j);
    j += 2;
    localzbce.f = zct.a(this.d, j);
    j += 116;
    localzbce.a = zchf.a(this.d, j);
    j += 8;
    localzbce.e = zc.b(this.d, j);
  }
  
  private void o()
    throws Exception
  {
    s();
    int j = 0;
    zbce localzbce = this.i.b;
    localzbce.g = new int[(this.e & 0xFFFF) / 2];
    for (int k = 0; k < (this.e & 0xFFFF); k += 2) {
      localzbce.g[(k / 2)] = zc.b(this.d, k);
    }
  }
  
  private void p()
    throws Exception
  {
    s();
    int j = 0;
    this.g.k = zc.b(this.d, j);
    j += 4;
    this.g.g = ((this.d[j] & 0xFF & 0x1) != 0);
    this.g.a = ((this.d[j] & 0xFF & 0x2) != 0);
    this.g.c = ((this.d[j] & 0xFF & 0x4) != 0);
    this.g.h = ((this.d[j] & 0xFF & 0x8) != 0);
    this.g.b = ((this.d[j] & 0xFF & 0x10) != 0);
    j += 2;
    this.g.l = b(this.d, j);
    j += 16;
    this.g.m = b(this.d, j);
    j += 16;
    this.g.i = zc.a(this.d, j);
    j += 4;
    this.g.j = zc.a(this.d, j);
    j += 4;
    this.g.c = ((this.d[j] & 0xFF & 0x1) == 0);
    this.g.f = ((this.d[j] & 0xFF & 0x2) != 0);
    j += 2;
    this.g.e = zc.b(this.d, j);
    j += 2;
  }
  
  private void q()
    throws Exception
  {
    s();
    int j = 0;
    this.g.p = zc.a(this.d, j);
    j += 4;
    this.g.q = zct.a(this.d, j);
  }
  
  private void r()
    throws Exception
  {
    s();
    int j = 0;
    this.g.r = (this.d[j] != 0);
    j += 4;
    this.g.s = zc.c(this.d, j);
    j += 8;
    this.g.t = zct.a(this.d, j);
  }
  
  private static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = new byte[16];
    System.arraycopy(paramArrayOfByte, paramInt, arrayOfByte, 0, 16);
    return arrayOfByte;
  }
  
  private void s()
    throws Exception
  {
    this.e = this.a.b(this.b);
    if ((this.e & 0xFFFF) != 0)
    {
      this.d = new byte[this.e];
      this.a.a(this.d);
    }
    else
    {
      this.d = null;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */