package com.aspose.cells;

import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zchk
  extends zcfo
{
  private zpt c;
  private zbcj d;
  private zbci e;
  
  zchk(zpt paramzpt, zbcj paramzbcj, zbci paramzbci)
  {
    this.c = paramzpt;
    this.d = paramzbcj;
    this.e = paramzbci;
  }
  
  void d()
    throws Exception
  {
    Iterator localIterator = this.e.c.iterator();
    while (localIterator.hasNext())
    {
      zbbu localzbbu = (zbbu)localIterator.next();
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
    zche.a(403, this.b);
  }
  
  private void a(zbcm paramzbcm)
    throws Exception
  {
    zcee localzcee = new zcee(paramzbcm, this.c.a);
    localzcee.a(this.b);
  }
  
  private void a(zbbv paramzbbv)
    throws Exception
  {
    zcdu localzcdu = new zcdu(paramzbbv, this.c.a);
    localzcdu.a(this.b);
  }
  
  private void a(zbbx paramzbbx)
    throws Exception
  {
    zcec localzcec = new zcec(paramzbbx, this.c.a);
    localzcec.a(this.b);
  }
  
  private void a(zbcc paramzbcc)
    throws Exception
  {
    zcdw localzcdw = new zcdw(paramzbcc, this.c.a);
    localzcdw.a(this.b);
  }
  
  private void a(zbbz paramzbbz)
    throws Exception
  {
    zceb localzceb = new zceb(paramzbbz, this.c.a);
    localzceb.a(this.b);
    if ((paramzbbz.i != null) && (paramzbbz.i.getCount() > 0))
    {
      Iterator localIterator = paramzbbz.i.iterator();
      while (localIterator.hasNext())
      {
        zbbu localzbbu = (zbbu)localIterator.next();
        switch (localzbbu.a())
        {
        case 2: 
          zbbw localzbbw = (zbbw)localzbbu;
          a(localzbbw);
          break;
        case 6: 
          zbcd localzbcd = (zbcd)localzbbu;
          a(localzbcd);
        }
      }
    }
    zche.a(408, this.b);
  }
  
  private void a(zbcb paramzbcb)
    throws Exception
  {
    zcef localzcef = new zcef(paramzbcb, this.c.a);
    localzcef.a(this.b);
  }
  
  private void a(zbch paramzbch)
    throws Exception
  {
    zcea localzcea = new zcea(paramzbch, this.c.a);
    localzcea.a(this.b);
  }
  
  private void a(zbco paramzbco)
    throws Exception
  {
    zced localzced = new zced(paramzbco, this.c.a);
    localzced.a(this.b);
  }
  
  private void a(zbcg paramzbcg)
    throws Exception
  {
    zcdz localzcdz = new zcdz(paramzbcg, this.c.a);
    localzcdz.a(this.b);
    if ((paramzbcg.j != null) && (paramzbcg.j.getCount() > 0))
    {
      Iterator localIterator = paramzbcg.j.iterator();
      while (localIterator.hasNext())
      {
        zbbu localzbbu = (zbbu)localIterator.next();
        switch (localzbbu.a())
        {
        case 2: 
          zbbw localzbbw = (zbbw)localzbbu;
          a(localzbbw);
          break;
        case 6: 
          zbcd localzbcd = (zbcd)localzbbu;
          a(localzbcd);
        }
      }
    }
    zche.a(406, this.b);
  }
  
  private void a(zbcd paramzbcd)
    throws Exception
  {
    zcdx localzcdx = new zcdx(paramzbcd, this.c.a);
    localzcdx.a(this.b);
    if (paramzbcd.b != null) {
      a(paramzbcd.b);
    }
    zche.a(420, this.b);
  }
  
  private void a(zbbw paramzbbw)
    throws Exception
  {
    zcdv localzcdv = new zcdv(paramzbbw, this.c.a);
    localzcdv.a(this.b);
    if (localzcdv.a != null) {
      localzcdv.a.a(this.b);
    }
    if (localzcdv.b != null) {
      localzcdv.b.a(this.b);
    }
    if (paramzbbw.r != null) {
      a(paramzbbw.r);
    }
    if (paramzbbw.s != null) {
      a(paramzbbw.s);
    }
    zche.a(410, this.b);
  }
  
  private void a(zbcp paramzbcp)
    throws Exception
  {
    zche.a(505, 1, 4, this.b);
    zcfm localzcfm = new zcfm();
    localzcfm.a(paramzbcp.c, paramzbcp.b, this.d.o);
    localzcfm.a(this.b);
    zche.a(506, this.b);
  }
  
  static int a(zbby paramzbby)
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
      return 2;
    case 5: 
      return 3;
    }
    return 0;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, Font[] paramArrayOfFont)
  {
    int i = 0;
    if ((paramArrayOfFont == null) || (paramArrayOfFont.length == 0)) {
      return i;
    }
    System.arraycopy(zc.a(paramArrayOfFont.length * 100), 0, paramArrayOfByte, i, 4);
    i += 4;
    for (int j = 0; j < paramArrayOfFont.length; j++)
    {
      Font localFont = paramArrayOfFont[j];
      System.arraycopy(zc.a(localFont.getName().length()), 0, paramArrayOfByte, i, 2);
      i += 2;
      System.arraycopy(Encoding.getUnicode().a(localFont.getName()), 0, paramArrayOfByte, i, localFont.getName().length() * 2);
      i += 62;
      System.arraycopy(zc.a(localFont.j()), 0, paramArrayOfByte, i, 4);
      i += 4;
      int k = 0;
      if (localFont.isItalic()) {
        k |= 0x2;
      }
      if (localFont.isStrikeout()) {
        k |= 0x80;
      }
      System.arraycopy(zc.a(k), 0, paramArrayOfByte, i, 4);
      i += 4;
      System.arraycopy(zc.a(localFont.g()), 0, paramArrayOfByte, i, 2);
      i += 2;
      paramArrayOfByte[i] = localFont.e();
      i += 2;
      switch (localFont.getUnderline())
      {
      case 0: 
        paramArrayOfByte[i] = 0;
        break;
      case 1: 
        paramArrayOfByte[i] = 1;
        break;
      case 3: 
        paramArrayOfByte[i] = 33;
        break;
      case 2: 
        paramArrayOfByte[i] = 2;
        break;
      case 4: 
        paramArrayOfByte[i] = 34;
        break;
      }
      i++;
      paramArrayOfByte[i] = localFont.e;
      i++;
      paramArrayOfByte[i] = localFont.a;
      i += 2;
      i += 8;
      switch (localFont.n())
      {
      case 1: 
        paramArrayOfByte[i] = 1;
        break;
      case 2: 
        paramArrayOfByte[i] = 2;
        break;
      }
      i += 4;
      zche.a(paramArrayOfByte, i, localFont.b(), 32767, localFont.c.p());
    }
    return paramInt + paramArrayOfFont.length * 100;
  }
  
  static void a(ArrayList paramArrayList, byte[] paramArrayOfByte, int paramInt)
  {
    int i = paramInt;
    if ((paramArrayList == null) || (paramArrayList.size() == 0))
    {
      System.arraycopy(zc.a(-1), 0, paramArrayOfByte, i, 4);
      return;
    }
    int j = paramArrayList.size();
    j = j / 16 * 16 + (j % 16 == 0 ? 0 : 16);
    System.arraycopy(zc.a(j), 0, paramArrayOfByte, i, 4);
    i += 4;
    for (int k = 0; k < paramArrayList.size(); k++)
    {
      CellArea localCellArea = (CellArea)paramArrayList.get(k);
      a(localCellArea, paramArrayOfByte, i);
      i += 16;
    }
  }
  
  static void a(CellArea paramCellArea, byte[] paramArrayOfByte, int paramInt)
  {
    System.arraycopy(zc.a(paramCellArea.StartRow), 0, paramArrayOfByte, paramInt, 4);
    System.arraycopy(zc.a(paramCellArea.EndRow), 0, paramArrayOfByte, paramInt + 4, 4);
    System.arraycopy(zc.a(paramCellArea.StartColumn), 0, paramArrayOfByte, paramInt + 8, 4);
    System.arraycopy(zc.a(paramCellArea.EndColumn), 0, paramArrayOfByte, paramInt + 12, 4);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zchk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */