package com.aspose.cells;

import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;
import java.util.Iterator;

class zawy
{
  private zri a;
  private zawp b;
  
  zawy(zri paramzri)
  {
    this.a = paramzri;
    this.b = paramzri.b;
  }
  
  int a()
  {
    int i = 12;
    switch (this.b.f.c())
    {
    case 1: 
      i += this.a.e[0].a();
      break;
    case 4: 
      i += b();
      break;
    }
    return i;
  }
  
  int b()
  {
    int i = 10;
    zno localzno = (zno)this.b.f;
    for (int j = 0; j < this.a.e.length; j++) {
      i += this.a.e[j].a();
    }
    for (j = 0; j < localzno.b.length; j++) {
      i += 4 + (localzno.b[j].a == null ? 0 : 2 * localzno.b[j].a.length);
    }
    if (localzno.c != null) {
      for (j = 0; j < localzno.c.length; j++)
      {
        int k = localzno.c[j].length;
        i += 6;
        for (int m = 0; m < k; m++) {
          i += 6 + zct.a(localzno.c[j][m]);
        }
      }
    }
    return i;
  }
  
  void a(zrg paramzrg)
    throws Exception
  {
    byte[] arrayOfByte = new byte[a()];
    int i = 0;
    int j = i;
    byte b1 = this.b.f.c();
    i += b(arrayOfByte, i, this.b.b);
    i += a(arrayOfByte, i, b1);
    switch (b1)
    {
    case 1: 
      i += this.a.e[0].a(arrayOfByte, i);
      paramzrg.a(arrayOfByte);
      break;
    case 4: 
      i += a(arrayOfByte, i);
      paramzrg.a(arrayOfByte);
      break;
    default: 
      paramzrg.a(arrayOfByte);
      localObject = (zbxs)this.a.b.f;
      if (((zbxs)localObject).d != null) {
        paramzrg.a(((zbxs)localObject).d);
      }
      return;
    }
    Object localObject = this.b.s;
    if (((zawo)localObject).getCount() > 0) {
      for (int k = 0; k < ((zawo)localObject).getCount(); k++) {
        zbbd.a(paramzrg, (byte[])((zawo)localObject).a(k));
      }
    } else {
      zbbd.a(paramzrg, this.b);
    }
  }
  
  void a(zh paramzh)
    throws Exception
  {
    zrg localzrg = new zrg(paramzh);
    if (this.b.u != null)
    {
      localzrg.a(this.b.u);
      return;
    }
    zbtp localzbtp = new zbtp(this.b);
    localzbtp.a(localzrg);
    zbto localzbto = new zbto(this.b);
    localzbto.a(localzrg);
    Object localObject1;
    if (this.b.m != null)
    {
      Iterator localIterator = this.b.m.iterator();
      while (localIterator.hasNext())
      {
        localObject1 = (zaxa)localIterator.next();
        zbty localzbty = new zbty((zaxa)localObject1);
        localzbty.a(localzrg);
        Object localObject2;
        Object localObject3;
        if (((zaxa)localObject1).e != null) {
          for (int j = 0; j < ((zaxa)localObject1).e.getCount(); j++)
          {
            zbui localzbui = ((zaxa)localObject1).e.a(j);
            localObject2 = new zbum(localzbui);
            ((zbum)localObject2).a(localzrg);
            for (int m = 0; m < localzbui.b().getCount(); m++)
            {
              localObject3 = localzbui.b().a(m);
              zbuk localzbuk = new zbuk((zbuj)localObject3);
              localzbuk.a(localzrg);
            }
          }
        }
        zbus localzbus = new zbus(((zaxa)localObject1).g);
        localzbus.a(localzrg);
        if (((zaxa)localObject1).g.e != null) {
          for (int k = 0; k < ((zaxa)localObject1).g.e.size(); k++)
          {
            localObject2 = (zbtz)((zaxa)localObject1).g.e.get(k);
            zbua localzbua = new zbua((zbtz)localObject2);
            localzbua.a(localzrg);
            localObject3 = new byte[6];
            localObject3[0] = -11;
            localObject3[2] = 2;
            for (int n = 0; n < ((zbtz)localObject2).c.size(); n++)
            {
              System.arraycopy(zc.a(((Integer)((zbtz)localObject2).c.get(n)).intValue()), 0, localObject3, 4, 2);
              localzrg.a((byte[])localObject3);
            }
          }
        }
        zbue localzbue = new zbue((zaxa)localObject1);
        localzbue.a(localzrg);
      }
    }
    if (this.b.i != null) {
      for (int i = 0; i < this.b.i.size(); i++)
      {
        localObject1 = (zbtv)this.b.i.get(i);
        ((zbtv)localObject1).a(localzrg);
      }
    }
    if ((this.b.h != null) && (this.b.h.a != null)) {
      this.b.h.a(localzrg);
    }
    localzrg.a(10);
  }
  
  int a(byte[] paramArrayOfByte, int paramInt)
  {
    zno localzno = (zno)this.b.f;
    int i = paramInt;
    paramInt += a(paramArrayOfByte, paramInt, localzno);
    for (int j = 0; j < this.a.e.length; j++) {
      paramInt += this.a.e[j].a(paramArrayOfByte, paramInt);
    }
    paramInt += b(paramArrayOfByte, paramInt, localzno);
    if (localzno.c != null) {
      paramInt += a(paramArrayOfByte, paramInt, localzno.c);
    }
    return paramInt - i;
  }
  
  int a(byte[] paramArrayOfByte, int paramInt, zno paramzno)
  {
    short s = (short)(paramzno.c.length | (paramzno.a ? 32768 : 0));
    paramArrayOfByte[(paramInt++)] = -48;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = 6;
    paramArrayOfByte[(paramInt++)] = 0;
    System.arraycopy(zc.a((short)paramzno.b.length), 0, paramArrayOfByte, paramInt, 2);
    System.arraycopy(zc.a((short)paramzno.b[0].a.length), 0, paramArrayOfByte, paramInt + 2, 2);
    System.arraycopy(zc.a(s), 0, paramArrayOfByte, paramInt + 4, 2);
    return 10;
  }
  
  int b(byte[] paramArrayOfByte, int paramInt, zno paramzno)
  {
    int i = paramInt;
    for (int j = 0; j < paramzno.b.length; j++)
    {
      paramArrayOfByte[(paramInt++)] = -46;
      paramArrayOfByte[(paramInt++)] = 0;
      if (paramzno.b[j].a == null)
      {
        paramArrayOfByte[(paramInt++)] = 0;
        paramArrayOfByte[(paramInt++)] = 0;
      }
      else
      {
        int k = paramzno.b[j].a.length;
        System.arraycopy(zc.a((short)(k * 2)), 0, paramArrayOfByte, paramInt, 2);
        paramInt += 2;
        for (int m = 0; m < k; m++)
        {
          System.arraycopy(zc.a((short)paramzno.b[j].a[m]), 0, paramArrayOfByte, paramInt, 2);
          paramInt += 2;
        }
      }
    }
    return paramInt - i;
  }
  
  int a(byte[] paramArrayOfByte, int paramInt, String[][] paramArrayOfString)
  {
    int i = paramInt;
    for (int j = 0; j < paramArrayOfString.length; j++)
    {
      int k = paramArrayOfString[j].length;
      paramInt += a(paramArrayOfByte, paramInt, k);
      for (int m = 0; m < k; m++) {
        paramInt += zbtv.a(paramArrayOfByte, paramInt, paramArrayOfString[j][m]);
      }
    }
    return paramInt - i;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1++)] = -47;
    paramArrayOfByte[(paramInt1++)] = 0;
    paramArrayOfByte[(paramInt1++)] = 2;
    paramArrayOfByte[(paramInt1++)] = 0;
    System.arraycopy(zc.a((short)paramInt2), 0, paramArrayOfByte, paramInt1, 2);
    return 6;
  }
  
  static int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramArrayOfByte[(paramInt1++)] = -43;
    paramArrayOfByte[(paramInt1++)] = 0;
    paramArrayOfByte[(paramInt1++)] = 2;
    paramArrayOfByte[(paramInt1++)] = 0;
    System.arraycopy(zc.a((short)paramInt2), 0, paramArrayOfByte, paramInt1, 2);
    return 6;
  }
  
  static int a(byte[] paramArrayOfByte, int paramInt, byte paramByte)
  {
    paramArrayOfByte[(paramInt++)] = -29;
    paramArrayOfByte[(paramInt++)] = 0;
    paramArrayOfByte[(paramInt++)] = 2;
    paramArrayOfByte[(paramInt++)] = 0;
    System.arraycopy(zc.a((short)paramByte), 0, paramArrayOfByte, paramInt, 2);
    return 6;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zawy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */