package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.d.zk;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.c.a.za;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class zah
{
  private byte[] b;
  private int c;
  private int d;
  private ActiveXControl e;
  private static final za f = new za(new String[] { "persistPropertyBag", "persistStorage", "persistStream", "persistStreamInit" });
  
  static String a(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    boolean bool = (paramInt2 & 0x80000000) != 0L;
    int i = paramInt2 & 0x7FFFFFFF;
    String str = zct.a(paramArrayOfByte, paramArrayOfInt[0], bool, bool ? i : i >> 1);
    paramArrayOfInt[0] += i;
    paramArrayOfInt[0] += zaj.a(paramArrayOfInt[0] - paramInt1, 4);
    return str;
  }
  
  static ActiveXControl a(UnknownControl paramUnknownControl, Shape paramShape)
    throws Exception
  {
    byte[] arrayOfByte1 = paramUnknownControl.getData();
    byte[] arrayOfByte2 = new byte[16];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, 16);
    int i = zaj.a(arrayOfByte2);
    ActiveXControl localActiveXControl = ActiveXControlBase.a(i, paramUnknownControl, paramShape);
    localActiveXControl.c = arrayOfByte2;
    return localActiveXControl;
  }
  
  static void a(zqn paramzqn, Shape paramShape, Workbook paramWorkbook)
    throws Exception
  {
    String str1 = paramzqn.c;
    if ((str1 != null) && (paramWorkbook.a != null) && (paramWorkbook.a.a != null))
    {
      zi localzi = paramWorkbook.a.a.b;
      String str2 = zauj.aH(str1);
      zcjy localzcjy = zauy.a(localzi, str2, true);
      if (localzcjy == null) {
        return;
      }
      localzcjy.k();
      if ("ocx".equals(localzcjy.q()))
      {
        String str3 = localzcjy.a("id");
        String str4 = localzcjy.a("persistence");
        int i = 3;
        if (str4 == null)
        {
          if (zbsn.a(str3)) {
            i = 0;
          } else {
            i = 3;
          }
        }
        else {
          switch (f.a(str4))
          {
          case 0: 
            i = 0;
            break;
          case 1: 
            i = 1;
            break;
          case 2: 
            i = 2;
            break;
          case 3: 
            i = 3;
            break;
          }
        }
        String str5 = zalb.a(str1);
        str5 = zauj.aH(str5);
        localzcjy = zauy.a(localzi, str5, true);
        ArrayList localArrayList = null;
        HashMap localHashMap = null;
        Object localObject2;
        if (localzcjy != null)
        {
          localArrayList = zalb.a(localzcjy);
          localHashMap = new HashMap();
          localObject1 = localArrayList.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (zrl)((Iterator)localObject1).next();
            String str6 = ((zrl)localObject2).d;
            if (str6.startsWith("/")) {
              str6 = str6.substring(1);
            } else {
              str6 = "xl/activeX/" + zk.b(str6);
            }
            localHashMap.put(((zrl)localObject2).b, zalq.a(localzi, str6));
          }
        }
        Object localObject1 = null;
        if (i == 3) {
          localObject1 = (byte[])localHashMap.get(str3);
        } else {
          localObject1 = zalq.a(localzi, str2);
        }
        if (localObject1 != null)
        {
          localObject2 = new UnknownControl(paramShape, (byte[])localObject1, i);
          if (i != 3) {
            ((UnknownControl)localObject2).h = localHashMap;
          }
          paramzqn.l = ((ActiveXControl)localObject2);
        }
      }
    }
  }
  
  void b(zqn paramzqn, Shape paramShape, Workbook paramWorkbook)
    throws Exception
  {
    if (paramzqn.a()) {
      return;
    }
    if (paramzqn.l == null) {
      a(paramzqn, paramShape, paramWorkbook);
    }
    if (paramzqn.l == null) {
      return;
    }
    if (paramzqn.l.getType() == 11)
    {
      UnknownControl localUnknownControl = (UnknownControl)paramzqn.l;
      if (localUnknownControl.g == 3) {
        paramzqn.l = b(localUnknownControl, paramShape);
      }
    }
  }
  
  private ActiveXControl b(UnknownControl paramUnknownControl, Shape paramShape)
    throws Exception
  {
    this.e = a(paramUnknownControl, paramShape);
    if (this.e.getType() == 11) {
      return this.e;
    }
    byte[] arrayOfByte = paramUnknownControl.getData();
    this.b = arrayOfByte;
    this.c = 16;
    switch (this.e.getType())
    {
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 6: 
    case 9: 
      c();
      break;
    case 8: 
      d();
      break;
    case 0: 
    case 7: 
      b();
      break;
    case 5: 
    case 10: 
      a();
      break;
    }
    return this.e;
  }
  
  private void a()
  {
    zber localzber = (zber)this.e.e;
    this.d = (this.c + 2);
    int i = zc.b(this.b, this.d);
    this.d += 2;
    int j = this.e.getType() == 10 ? 1 : 0;
    this.e.d = zc.a(this.b, this.d);
    this.d += 4;
    if (this.e.c(3))
    {
      localzber.b = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(4))
    {
      localzber.c = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(14))
    {
      localzber.a = zc.a(this.b, this.d);
      this.d += 4;
    }
    if ((j != 0) && (this.e.c(5)))
    {
      localzber.g = this.b[this.d];
      this.d += 2;
    }
    if (this.e.c(43))
    {
      if (j != 0) {
        this.d += zaj.a(this.d - this.c, 4);
      }
      localzber.s = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(44))
    {
      if (j != 0) {
        this.d += zaj.a(this.d - this.c, 4);
      }
      localzber.r = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(45))
    {
      if (j != 0) {
        this.d += zaj.a(this.d - this.c, 4);
      }
      localzber.t = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(46))
    {
      if (j != 0) {
        this.d += zaj.a(this.d - this.c, 4);
      }
      localzber.u = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(47))
    {
      if (j != 0) {
        this.d += zaj.a(this.d - this.c, 4);
      }
      localzber.v = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(48))
    {
      this.d += zaj.a(this.d - this.c, 4);
      localzber.w = zc.a(this.b, this.d);
      this.d += 4;
    }
    if ((j != 0) && (this.e.c(49)))
    {
      this.d += zaj.a(this.d - this.c, 4);
      localzber.x = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(50))
    {
      this.d += zaj.a(this.d - this.c, 4);
      int k = zc.a(this.b, this.d);
      localzber.y = ((byte)(k == -1 ? 3 : k));
      this.d += 4;
    }
    if ((j != 0) && (this.e.c(51)))
    {
      this.d += zaj.a(this.d - this.c, 2);
      localzber.z = zc.a(this.b, this.d);
      this.d += 2;
    }
    if (this.e.c(52))
    {
      this.d += zaj.a(this.d - this.c, 4);
      localzber.A = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(15))
    {
      this.d += zaj.a(this.d - this.c, 2);
      this.d += 2;
    }
    if ((j == 0) && (this.e.c(5)))
    {
      localzber.g = this.b[this.d];
      this.d += 1;
    }
    this.d += zaj.a(this.d - this.c, 4);
    if (this.e.c(8))
    {
      localzber.h = zc.a(this.b, this.d);
      this.d += 4;
      localzber.i = zc.a(this.b, this.d);
      this.d += 4;
    }
    this.c += 4 + i;
    if (this.e.c(15)) {
      localzber.k = e();
    }
  }
  
  private void b()
  {
    zag localzag = this.e.e;
    this.d = (this.c + 2);
    int i = zc.b(this.b, this.d);
    this.d += 2;
    this.e.d = zc.a(this.b, this.d);
    this.d += 4;
    if (this.e.c(3))
    {
      localzag.b = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(4))
    {
      localzag.c = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(14))
    {
      localzag.a = zc.a(this.b, this.d);
      this.d += 4;
    }
    int j = 0;
    if (this.e.c(16))
    {
      j = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(12))
    {
      localzag.l = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(5))
    {
      localzag.g = this.b[this.d];
      this.d += 1;
    }
    if (this.e.getType() == 7)
    {
      if (this.e.c(2))
      {
        this.d += zaj.a(this.d - this.c, 4);
        localzag.e = zc.a(this.b, this.d);
        this.d += 4;
      }
      if (this.e.c(1))
      {
        this.d += zaj.a(this.d - this.c, 2);
        localzag.d = this.b[this.d];
        this.d += 2;
      }
      if (this.e.c(7))
      {
        this.d += zaj.a(this.d - this.c, 2);
        localzag.f = this.b[this.d];
        this.d += 2;
      }
    }
    if (this.e.c(9))
    {
      this.d += zaj.a(this.d - this.c, 2);
      this.d += 2;
    }
    if (this.e.c(0))
    {
      this.d += zaj.a(this.d - this.c, 2);
      localzag.m = ((char)(zc.e(this.b, this.d) & 0xFFFF));
      this.d += 2;
    }
    if (this.e.c(15))
    {
      this.d += zaj.a(this.d - this.c, 2);
      this.d += 2;
    }
    this.d += zaj.a(this.d - this.c, 4);
    if (this.e.c(16))
    {
      int[] arrayOfInt = { this.d };
      localzag.n = a(this.b, arrayOfInt, this.c, j);
      this.d = arrayOfInt[0];
    }
    if (this.e.c(8))
    {
      localzag.h = zc.a(this.b, this.d);
      this.d += 4;
      localzag.i = zc.a(this.b, this.d);
      this.d += 4;
    }
    this.c += 4 + i;
    a(this.e);
    a(this.e.getFont());
  }
  
  private void c()
  {
    zapr localzapr = (zapr)this.e.e;
    this.d = (this.c + 2);
    int i = zc.b(this.b, this.d);
    this.d += 2;
    this.e.d = zc.a(this.b, this.d);
    this.e.a(41, (this.b[(this.d + 4)] & 0xFF & 0x1) != 0);
    this.d += 8;
    if (this.e.c(14))
    {
      localzapr.a = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(4))
    {
      localzapr.c = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(3))
    {
      localzapr.b = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(25))
    {
      localzapr.r = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(1))
    {
      localzapr.d = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(26))
    {
      localzapr.s = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(27))
    {
      localzapr.t = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(5))
    {
      localzapr.g = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(28))
    {
      this.d += zaj.a(this.d - this.c, 2);
      localzapr.u = ((char)(zc.e(this.b, this.d) & 0xFFFF));
      this.d += 2;
    }
    if (this.e.c(29))
    {
      this.d += zaj.a(this.d - this.c, 4);
      localzapr.v = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(30))
    {
      this.d += zaj.a(this.d - this.c, 2);
      localzapr.w = (zc.e(this.b, this.d) & 0xFFFF);
      this.d += 2;
    }
    if (this.e.c(31))
    {
      this.d += zaj.a(this.d - this.c, 2);
      localzapr.x = (zc.e(this.b, this.d) & 0xFFFF);
      this.d += 2;
    }
    if (this.e.c(32))
    {
      this.d += zaj.a(this.d - this.c, 2);
      localzapr.y = (zc.e(this.b, this.d) & 0xFFFF);
      this.d += 2;
    }
    if (this.e.c(33))
    {
      this.d += zaj.a(this.d - this.c, 2);
      localzapr.z = (zc.e(this.b, this.d) & 0xFFFF);
      this.d += 2;
    }
    if (this.e.c(34))
    {
      this.d += zaj.a(this.d - this.c, 2);
      localzapr.A = (zc.e(this.b, this.d) & 0xFFFF);
      this.d += 2;
    }
    if (this.e.c(35))
    {
      localzapr.B = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(36))
    {
      localzapr.C = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(37))
    {
      localzapr.D = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(38))
    {
      localzapr.E = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(39))
    {
      localzapr.F = this.b[this.d];
      this.d += 1;
    }
    int j = 0;
    int k = 0;
    int m = 0;
    if (this.e.c(40))
    {
      this.d += zaj.a(this.d - this.c, 4);
      j = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(16))
    {
      this.d += zaj.a(this.d - this.c, 4);
      k = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(12))
    {
      this.d += zaj.a(this.d - this.c, 4);
      localzapr.l = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(2))
    {
      this.d += zaj.a(this.d - this.c, 4);
      localzapr.e = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(7))
    {
      this.d += zaj.a(this.d - this.c, 4);
      localzapr.f = this.b[this.d];
      this.d += 4;
    }
    if (this.e.c(15))
    {
      this.d += zaj.a(this.d - this.c, 2);
      this.d += 2;
    }
    if (this.e.c(9))
    {
      this.d += zaj.a(this.d - this.c, 2);
      this.d += 2;
    }
    if (this.e.c(0))
    {
      this.d += zaj.a(this.d - this.c, 2);
      localzapr.m = ((char)(zc.e(this.b, this.d) & 0xFFFF));
      this.d += 2;
    }
    if (this.e.c(41))
    {
      this.d += zaj.a(this.d - this.c, 4);
      m = zc.a(this.b, this.d);
      this.d += 4;
    }
    this.d += zaj.a(this.d - this.c, 4);
    if (this.e.c(8))
    {
      localzapr.h = zc.a(this.b, this.d);
      this.d += 4;
      localzapr.i = zc.a(this.b, this.d);
      this.d += 4;
    }
    int[] arrayOfInt;
    if (this.e.c(40))
    {
      arrayOfInt = new int[] { this.d };
      localzapr.G = a(this.b, arrayOfInt, this.c, j);
      this.d = arrayOfInt[0];
    }
    if (this.e.c(16))
    {
      arrayOfInt = new int[] { this.d };
      localzapr.n = a(this.b, arrayOfInt, this.c, k);
      this.d = arrayOfInt[0];
    }
    if (this.e.c(41))
    {
      arrayOfInt = new int[] { this.d };
      localzapr.H = a(this.b, arrayOfInt, this.c, m);
      this.d = arrayOfInt[0];
    }
    this.c += 4 + i;
    if ((!a) && (this.d != this.c)) {
      throw new AssertionError();
    }
    b(this.e);
    a(this.e.getFont());
    if ((this.c < this.b.length) && ((this.e.getType() == 1) || (this.e.getType() == 3)))
    {
      this.d = (this.c + 2);
      i = zc.b(this.b, this.d);
      this.d += 2;
      localzapr.I = zc.a(this.b, this.d);
      this.d += 4;
      if (localzapr.c(42))
      {
        localzapr.J = zc.a(this.b, this.d);
        this.d += 4;
      }
      this.c += 4 + i;
    }
  }
  
  private void d()
  {
    zag localzag = this.e.e;
    this.d = (this.c + 2);
    int i = zc.b(this.b, this.d);
    this.d += 2;
    this.e.d = zc.a(this.b, this.d);
    this.d += 4;
    if (this.e.c(2))
    {
      localzag.e = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(4))
    {
      localzag.c = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(1))
    {
      localzag.d = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(5))
    {
      localzag.g = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(6))
    {
      localzag.o = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(7))
    {
      localzag.f = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(9))
    {
      this.d += zaj.a(this.d - this.c, 2);
      this.d += 2;
    }
    if (this.e.c(10))
    {
      localzag.p = this.b[this.d];
      this.d += 1;
    }
    if (this.e.c(14))
    {
      this.d += zaj.a(this.d - this.c, 4);
      localzag.a = zc.a(this.b, this.d);
      this.d += 4;
    }
    if (this.e.c(15))
    {
      this.d += zaj.a(this.d - this.c, 2);
      this.d += 2;
    }
    this.d += zaj.a(this.d - this.c, 4);
    if (this.e.c(8))
    {
      localzag.h = zc.a(this.b, this.d);
      this.d += 4;
      localzag.i = zc.a(this.b, this.d);
      this.d += 4;
    }
    this.c += 4 + i;
    a(this.e);
  }
  
  private void a(ActiveXControl paramActiveXControl)
  {
    if (paramActiveXControl.c(9)) {
      paramActiveXControl.e.j = e();
    }
    if (paramActiveXControl.c(15)) {
      paramActiveXControl.e.k = e();
    }
  }
  
  private void b(ActiveXControl paramActiveXControl)
  {
    if (paramActiveXControl.c(15)) {
      paramActiveXControl.e.k = e();
    }
    if (paramActiveXControl.c(9)) {
      paramActiveXControl.e.j = e();
    }
  }
  
  private byte[] e()
  {
    this.d = this.c;
    this.d += 20;
    int i = zc.a(this.b, this.d);
    this.d += 4;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(this.b, this.d, arrayOfByte, 0, i);
    this.d += i;
    this.c = this.d;
    return arrayOfByte;
  }
  
  private void a(Font paramFont)
  {
    this.d = (this.c + 2);
    int i = zc.b(this.b, this.d);
    this.d += 2;
    int j = zc.a(this.b, this.d);
    this.d += 4;
    int k = 0;
    if ((j & zaj.b(17)) != 0)
    {
      k = zc.a(this.b, this.d);
      this.d += 4;
    }
    if ((j & zaj.b(18)) != 0)
    {
      int m = zc.a(this.b, this.d);
      this.d += 4;
      paramFont.setBold((m & 0x1) != 0);
      paramFont.setItalic((m & 0x2) != 0);
      if ((m & 0x4) != 0) {
        paramFont.setUnderline(1);
      }
      paramFont.setStrikeout((m & 0x8) != 0);
    }
    if ((j & zaj.b(19)) != 0)
    {
      paramFont.c(zc.a(this.b, this.d));
      this.d += 4;
    }
    if ((j & zaj.b(20)) != 0)
    {
      paramFont.setCharset(this.b[this.d]);
      this.d += 1;
    }
    if ((j & zaj.b(21)) != 0)
    {
      paramFont.a(this.b[this.d]);
      this.d += 1;
    }
    if ((j & zaj.b(22)) != 0)
    {
      this.e.e.q = this.b[this.d];
      this.d += 1;
    }
    if ((j & zaj.b(23)) != 0)
    {
      this.d += zaj.a(this.d - this.c, 2);
      paramFont.b(zc.b(this.b, this.d));
      this.d += 2;
    }
    this.d += zaj.a(this.d - this.c, 4);
    if ((j & zaj.b(17)) != 0)
    {
      int[] arrayOfInt = { this.d };
      paramFont.setName(a(this.b, arrayOfInt, this.c, k));
      this.d = arrayOfInt[0];
    }
    this.c += 4 + i;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */