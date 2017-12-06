package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zg;
import java.util.ArrayList;
import java.util.HashMap;

class zape
{
  private int a;
  private int b;
  private byte[] c = null;
  private byte[] d = null;
  private Workbook e = null;
  private ArrayList f = new ArrayList();
  private ArrayList g = new ArrayList();
  private ArrayList h = new ArrayList();
  private ArrayList i = new ArrayList();
  private ArrayList j = new ArrayList();
  private SaveOptions k = new XlsSaveOptions();
  
  public zape()
  {
    this.e.getWorksheets().clear();
    this.e.getWorksheets().r().a(0, 0);
  }
  
  public void a(String[] paramArrayOfString, String paramString1, String paramString2)
    throws Exception
  {
    ze localze = null;
    try
    {
      a(paramArrayOfString);
      localze = b(paramArrayOfString, paramString1, paramString2);
      localze.a(0L, 0);
      zg.a();
      zg.b();
      zxf localzxf = new zxf(zaej.n);
      localzxf.a().a("Workbook", localze);
      localzxf.a(paramString2);
      return;
    }
    finally
    {
      if (localze != null) {
        localze.a();
      }
      try
      {
        zd.d(paramString1);
      }
      catch (Exception localException2) {}
    }
  }
  
  private void a()
  {
    zug.b(this.e.getWorksheets());
  }
  
  private ze b(String[] paramArrayOfString, String paramString1, String paramString2)
    throws Exception
  {
    boolean bool = zug.a(this.e.getWorksheets());
    ze localze = zd.a(paramString1);
    zrg localzrg = new zrg(localze);
    if (bool) {
      a();
    }
    zadm localzadm = this.e.getWorksheets().a(this.k);
    zg.a();
    zg.b();
    zcac localzcac = new zcac(localzadm, this.e, this.k);
    int[] arrayOfInt = new int[this.e.getWorksheets().getCount()];
    zcb localzcb = new zcb(this.e, localzcac);
    localzcb.a(localzrg, arrayOfInt);
    zg.a();
    zg.b();
    a(paramArrayOfString, localze, paramString2, arrayOfInt);
    if (bool)
    {
      long l1 = localze.i();
      long l2 = arrayOfInt[(arrayOfInt.length - 1)];
      localze.a(l2, 0);
      localze.b(zc.a(l1), 0, 4);
      localze.a(l1, 0);
      Worksheet localWorksheet = this.e.getWorksheets().get(this.e.getWorksheets().getCount() - 1);
      zcan localzcan = new zcan(localWorksheet, new zcaa(localzcac, this.e.getWorksheets().getCount() - 1), this.k);
      localzcan.a(localzrg);
    }
    return localze;
  }
  
  private void a(String[] paramArrayOfString)
    throws Exception
  {
    for (int m = 0; m < paramArrayOfString.length; m++)
    {
      zg.a();
      zg.b();
      Workbook localWorkbook = new Workbook();
      zxf localzxf = new zxf(paramArrayOfString[m]);
      zcal localzcal = new zcal(localWorkbook, null);
      zh localzh = localzxf.a().a("Workbook");
      if (localzh == null)
      {
        localzh = localzxf.a().a("WORKBOOK");
        localzxf.a().g("WORKBOOK");
      }
      else
      {
        localzxf.a().g("Workbook");
      }
      zqj localzqj = new zqj(localzh);
      localWorkbook.getWorksheets().u();
      localzcal.b(localzqj);
      zf.a(this.f, Long.valueOf(localzh.i()));
      localzqj = null;
      localzxf = null;
      localzcal = null;
      localzh.a();
      localzh = null;
      zg.a();
      zg.b();
      a(localWorkbook);
      if (m == 0) {
        this.e.getWorksheets().setActiveSheetIndex(localWorkbook.getWorksheets().getActiveSheetIndex());
      }
      localWorkbook = null;
    }
  }
  
  private void a(Workbook paramWorkbook)
  {
    CopyOptions localCopyOptions = new CopyOptions(3, paramWorkbook, this.e.getWorksheets().p());
    int m = this.e.getWorksheets().getCount();
    int n = this.e.getWorksheets().getNames().getCount();
    HashMap localHashMap1 = new HashMap();
    zf.a(this.j, localHashMap1);
    for (int i1 = 0; i1 < paramWorkbook.getWorksheets().getCount(); i1++)
    {
      if (this.e.getWorksheets().get(paramWorkbook.getWorksheets().get(i1).getName()) != null) {
        this.e.getWorksheets().add();
      } else {
        this.e.getWorksheets().add(paramWorkbook.getWorksheets().get(i1).getName());
      }
      i2 = paramWorkbook.getWorksheets().r().f(paramWorkbook.getWorksheets().v(), i1, i1);
      if (i2 != -1)
      {
        int i3 = this.e.getWorksheets().r().f(this.e.getWorksheets().v(), this.e.getWorksheets().getCount() - 1, this.e.getWorksheets().getCount() - 1);
        if (localHashMap1.get(Integer.valueOf(i2)) == null) {
          localHashMap1.put(Integer.valueOf(i2), Integer.valueOf(i3));
        }
      }
    }
    HashMap localHashMap2 = new HashMap();
    zf.a(this.i, localHashMap2);
    for (int i2 = 0; i2 < paramWorkbook.getWorksheets().getNames().getCount(); i2++)
    {
      localObject1 = paramWorkbook.getWorksheets().getNames().get(i2);
      Name localName = new Name(this.e.getWorksheets());
      localName.a((Name)localObject1, localCopyOptions);
      if (((Name)localObject1).getSheetIndex() == 0)
      {
        if (this.e.getWorksheets().getNames().get(((Name)localObject1).k()) != null) {
          localName.setSheetIndex(((Name)localObject1).s() + 1 + m);
        }
      }
      else {
        localName.setSheetIndex(((Name)localObject1).getSheetIndex() + m);
      }
      int i5 = this.e.getWorksheets().getNames().a(localName, true);
      localHashMap2.put(Integer.valueOf(i2), Integer.valueOf(i5));
    }
    for (i2 = 0; i2 < paramWorkbook.getWorksheets().getNames().getCount(); i2++)
    {
      localObject1 = this.e.getWorksheets().getNames().get(i2 + n);
      if (((Name)localObject1).b() != null) {
        zcae.a(((Name)localObject1).b(), -1, -1, localHashMap1, localHashMap2);
      }
    }
    HashMap localHashMap3 = new HashMap();
    zf.a(this.h, localHashMap3);
    Object localObject1 = new HashMap();
    for (int i4 = 0; i4 < paramWorkbook.getWorksheets().A().size(); i4++)
    {
      Font localFont = (Font)paramWorkbook.getWorksheets().A().get(i4);
      int i7 = this.e.getWorksheets().b(localFont);
      if (i4 < 4) {
        ((HashMap)localObject1).put(Integer.valueOf(i4), Integer.valueOf(i7));
      } else {
        ((HashMap)localObject1).put(Integer.valueOf(i4 + 1), Integer.valueOf(i7));
      }
    }
    zajm localzajm = paramWorkbook.getWorksheets().C();
    for (int i6 = localzajm.b() - 1; i6 > 15; i6--)
    {
      localObject2 = localzajm.a(i6);
      if ((localObject2 != null) && (((Style)localObject2).c() == null))
      {
        ((Style)localObject2).a(-1);
        i8 = this.e.getWorksheets().a((Style)localObject2);
        localHashMap3.put(Integer.valueOf(i6), Integer.valueOf(i8));
      }
    }
    HashMap localHashMap4 = new HashMap();
    zf.a(this.g, localHashMap4);
    Object localObject2 = paramWorkbook.getWorksheets().g;
    int i8 = ((zajl)localObject2).a();
    for (int i9 = 0; i9 < i8; i9++)
    {
      zbbj localzbbj = ((zajl)localObject2).a(i9);
      if (localzbbj != null) {
        if (localzbbj.f())
        {
          zbdd localzbdd = (zbdd)localzbbj;
          int i10 = a(localzbdd, (HashMap)localObject1);
          localHashMap4.put(Integer.valueOf(i9), Integer.valueOf(i10));
        }
        else
        {
          localzbbj = this.e.getWorksheets().g.a(localzbbj.c);
          localHashMap4.put(Integer.valueOf(i9), Integer.valueOf(localzbbj.e));
        }
      }
    }
  }
  
  private int a(zbdd paramzbdd, HashMap paramHashMap)
  {
    byte[] arrayOfByte = paramzbdd.h();
    for (int m = 0; m < arrayOfByte.length; m += 4)
    {
      int n = zc.e(arrayOfByte, m + 2) & 0xFFFF;
      Object localObject = paramHashMap.get(Integer.valueOf(n));
      if (localObject != null)
      {
        int i1 = ((Integer)localObject).intValue();
        if (i1 != n) {
          System.arraycopy(zc.a(i1), 0, arrayOfByte, m + 2, 2);
        }
      }
    }
    return ((zbst)this.e.getWorksheets().g).a(paramzbdd.c, arrayOfByte).e;
  }
  
  private void a(zm paramzm1, zm paramzm2)
    throws Exception
  {
    paramzm1.a(this.c, 0, 2);
    this.b = ((zc.e(this.c, 0) & 0xFFFF) + 4);
    this.d = new byte[this.b];
    paramzm1.a(-4L, 1);
    paramzm1.a(this.d, 0, this.b);
    paramzm2.b(this.d, 0, this.b);
  }
  
  private void a(zm paramzm)
    throws Exception
  {
    paramzm.a(this.c, 0, 2);
    this.b = ((zc.e(this.c, 0) & 0xFFFF) + 4);
    this.d = new byte[this.b];
    paramzm.a(-4L, 1);
    paramzm.a(this.d, 0, this.b);
  }
  
  private void a(String[] paramArrayOfString, zm paramzm, String paramString, int[] paramArrayOfInt)
    throws Exception
  {
    int m = 0;
    long l1 = 0L;
    int n = 0;
    long l2 = 0L;
    for (int i1 = 0; i1 < paramArrayOfString.length; i1++)
    {
      zxf localzxf = new zxf(paramArrayOfString[i1]);
      zh localzh = localzxf.a().a("Workbook");
      if (localzh == null)
      {
        localzh = localzxf.a().a("WORKBOOK");
        localzxf.a().g("WORKBOOK");
      }
      else
      {
        localzxf.a().g("Workbook");
      }
      localzxf = null;
      localzh.a(((Long)this.f.get(i1)).longValue(), 0);
      zg.a();
      zg.b();
      int i2 = 0;
      HashMap localHashMap1 = (HashMap)this.g.get(i1);
      HashMap localHashMap2 = (HashMap)this.h.get(i1);
      HashMap localHashMap3 = (HashMap)this.j.get(i1);
      HashMap localHashMap4 = (HashMap)this.i.get(i1);
      while (localzh.i() < localzh.h())
      {
        localzh.a(this.c, 0, 2);
        this.a = (zc.e(this.c, 0) & 0xFFFF);
        int i3;
        int i4;
        byte[] arrayOfByte;
        int i5;
        int i6;
        switch (this.a)
        {
        case 2057: 
          if (i2 == 0)
          {
            l2 = paramzm.i();
            long l3 = paramArrayOfInt[(m++)];
            paramzm.a(l3, 0);
            paramzm.b(zc.a(l2), 0, 4);
            paramzm.a(l2, 0);
            n = 0;
          }
          i2++;
          a(localzh, paramzm);
          break;
        case 523: 
          l1 = paramzm.i();
          a(localzh, paramzm);
          break;
        case 85: 
          if (l1 != 0L)
          {
            l2 = paramzm.i();
            paramzm.a(l1 + 16L, 0);
            paramzm.b(zc.a(l2), 0, 4);
            paramzm.a(l2, 0);
          }
          a(localzh, paramzm);
          break;
        case 215: 
          n++;
          if (l1 != 0L)
          {
            l2 = paramzm.i();
            paramzm.a(l1 + 16L + 4 * n, 0);
            paramzm.b(zc.a(l2), 0, 4);
            paramzm.a(l2, 0);
          }
          a(localzh, paramzm);
          break;
        case 520: 
          a(localzh);
          if ((this.d[16] & 0xFF & 0x80) != 0)
          {
            i3 = zc.e(this.d, 18) & 0xFFFF & 0xFFF;
            if (i3 != 15)
            {
              i4 = ((Integer)localHashMap2.get(Integer.valueOf(i3))).intValue();
              arrayOfByte = zc.a(i4);
              int tmp659_658 = 1;
              byte[] tmp659_656 = arrayOfByte;
              tmp659_656[tmp659_658] = ((byte)(tmp659_656[tmp659_658] | (byte)(this.d[19] & 0xFF & 0xF0)));
              System.arraycopy(arrayOfByte, 0, this.d, 18, 2);
            }
          }
          paramzm.b(this.d, 0, this.d.length);
          break;
        case 513: 
        case 515: 
        case 516: 
        case 517: 
        case 638: 
          a(localzh);
          i3 = zc.e(this.d, 8) & 0xFFFF;
          if (i3 != 15)
          {
            i4 = ((Integer)localHashMap2.get(Integer.valueOf(i3))).intValue();
            System.arraycopy(zc.a(i4), 0, this.d, 8, 2);
          }
          paramzm.b(this.d, 0, this.d.length);
          break;
        case 6: 
        case 518: 
          a(localzh);
          i3 = zc.e(this.d, 8) & 0xFFFF;
          if (i3 != 15)
          {
            i4 = ((Integer)localHashMap2.get(Integer.valueOf(i3))).intValue();
            System.arraycopy(zc.a(i4), 0, this.d, 8, 2);
          }
          i4 = this.d.length - 24;
          arrayOfByte = new byte[i4];
          System.arraycopy(this.d, 24, arrayOfByte, 0, i4);
          zcae.a(arrayOfByte, -1, -1, localHashMap3, localHashMap4);
          System.arraycopy(arrayOfByte, 0, this.d, 24, i4);
          paramzm.b(this.d, 0, this.d.length);
          break;
        case 189: 
          a(localzh);
          i3 = (zc.e(this.d, this.d.length - 2) & 0xFFFF) - (zc.e(this.d, 6) & 0xFFFF) + 1;
          for (i4 = 0; i4 < i3; i4++)
          {
            i5 = zc.e(this.d, 8 + 6 * i4) & 0xFFFF;
            if (i5 != 15)
            {
              i6 = ((Integer)localHashMap2.get(Integer.valueOf(i5))).intValue();
              System.arraycopy(zc.a(i6), 0, this.d, 8 + 6 * i4, 2);
            }
          }
          paramzm.b(this.d, 0, this.d.length);
          break;
        case 190: 
          a(localzh);
          i3 = (zc.e(this.d, this.d.length - 2) & 0xFFFF) - (zc.e(this.d, 6) & 0xFFFF) + 1;
          for (i4 = 0; i4 < i3; i4++)
          {
            i5 = zc.e(this.d, 8 + 2 * i4) & 0xFFFF;
            if (i5 != 15)
            {
              i6 = ((Integer)localHashMap2.get(Integer.valueOf(i5))).intValue();
              System.arraycopy(zc.a(i6), 0, this.d, 8 + 2 * i4, 2);
            }
          }
          paramzm.b(this.d, 0, this.d.length);
          break;
        case 253: 
          a(localzh);
          i3 = zc.e(this.d, 8) & 0xFFFF;
          if (i3 != 15)
          {
            i4 = ((Integer)localHashMap2.get(Integer.valueOf(i3))).intValue();
            System.arraycopy(zc.a(i4), 0, this.d, 8, 2);
          }
          i4 = zc.a(this.d, 10);
          Object localObject = localHashMap1.get(Integer.valueOf(i4));
          i6 = 0;
          if (localObject == null) {
            i6 = 0;
          } else {
            i6 = ((Integer)localObject).intValue();
          }
          this.e.getWorksheets().g.a(i6).d += 1;
          System.arraycopy(zc.a(i6), 0, this.d, 10, 4);
          paramzm.b(this.d, 0, this.d.length);
          break;
        case 10: 
          i2--;
          a(localzh, paramzm);
          break;
        case 176: 
        case 236: 
          while (this.a != 574)
          {
            localzh.a(this.c, 0, 2);
            this.b = (zc.e(this.c, 0) & 0xFFFF);
            localzh.a(this.b, 1);
            localzh.a(this.c, 0, 2);
            this.a = (zc.e(this.c, 0) & 0xFFFF);
          }
          localzh.a(-2L, 1);
          break;
        case 574: 
          a(localzh);
          if (m - 1 == this.e.getWorksheets().getActiveSheetIndex())
          {
            int tmp1499_1498 = 5;
            byte[] tmp1499_1495 = this.d;
            tmp1499_1495[tmp1499_1498] = ((byte)(tmp1499_1495[tmp1499_1498] | 0x6));
          }
          else
          {
            int tmp1514_1513 = 5;
            byte[] tmp1514_1510 = this.d;
            tmp1514_1510[tmp1514_1513] = ((byte)(tmp1514_1510[tmp1514_1513] & 0xF9));
          }
          paramzm.b(this.d, 0, this.d.length);
          break;
        default: 
          a(localzh, paramzm);
        }
      }
      paramzm.b();
      localzxf = null;
      localzh.a();
      localzh = null;
      zg.a();
      zg.b();
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */