package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.za;
import com.aspose.cells.b.a.d.zb;
import com.aspose.cells.b.a.d.zm;
import com.aspose.cells.b.a.ze;
import com.aspose.cells.b.a.zw;
import java.util.HashMap;

class zaxz
{
  private com.aspose.cells.b.a.zh d;
  private zaxw e = new zaxw();
  static com.aspose.cells.b.a.zh a = new com.aspose.cells.b.a.zh("F29F85E0-4FF9-1068-AB91-08002B27B3D9");
  static com.aspose.cells.b.a.zh b = new com.aspose.cells.b.a.zh("D5CDD502-2E9C-101B-9397-08002B2CF9AE");
  static com.aspose.cells.b.a.zh c = new com.aspose.cells.b.a.zh("D5CDD505-2E9C-101B-9397-08002B2CF9AE");
  
  zaxz(com.aspose.cells.b.a.zh paramzh)
  {
    this.d = paramzh;
  }
  
  zaxz(com.aspose.cells.b.a.zh paramzh, za paramza)
    throws Exception
  {
    this.d = paramzh;
    long l = paramza.k().i();
    int i = paramza.q();
    int j = paramza.q();
    zaxu localzaxu = new zaxu();
    for (int k = 0; k < j; k++) {
      zf.a(localzaxu, new zaxt(paramza));
    }
    k = 1252;
    int m = localzaxu.a(1);
    if (m != -1)
    {
      paramza.k().b(l + m);
      int n = ((Short)a(paramza, 0)).shortValue();
      k = n & 0xFFFF;
    }
    HashMap localHashMap = new HashMap();
    int i1 = localzaxu.a(0);
    if (i1 != -1)
    {
      paramza.k().b(l + i1);
      a(paramza, localHashMap, k);
    }
    for (int i2 = 0; i2 < localzaxu.size(); i2++)
    {
      int i3 = localzaxu.b(i2).a;
      if ((i3 != 0) && (i3 != 1))
      {
        paramza.k().b(l + localzaxu.b(i2).b);
        Object localObject = a(paramza, k);
        if (localObject != null)
        {
          String str = (String)localHashMap.get(Integer.valueOf(i3));
          zf.a(this.e, new zaxv(i3, str, localObject));
        }
      }
    }
  }
  
  byte[] a()
    throws Exception
  {
    com.aspose.cells.b.a.d.zh localzh = new com.aspose.cells.b.a.d.zh();
    zb localzb = new zb(localzh, Encoding.getUnicode());
    int i = 8 + 8 * this.e.size();
    if (this.e.a()) {
      i += 8;
    }
    i += 8;
    localzh.b(i);
    zaxu localzaxu = new zaxu();
    if (this.e.a())
    {
      zf.a(localzaxu, new zaxt(0, (int)localzh.i()));
      a(localzb, this.e);
    }
    zf.a(localzaxu, new zaxt(1, (int)localzh.i()));
    a(localzb, Short.valueOf((short)1200));
    for (int j = 0; j < this.e.size(); j++)
    {
      zaxv localzaxv = this.e.a(j);
      zf.a(localzaxu, new zaxt(localzaxv.a, (int)localzh.i()));
      a(localzb, localzaxv.c);
    }
    localzh.b(0L);
    localzb.b((int)localzh.h());
    localzb.b(localzaxu.size());
    for (j = 0; j < localzaxu.size(); j++) {
      localzaxu.b(j).a(localzb);
    }
    return localzh.o();
  }
  
  zaxw b()
  {
    return this.e;
  }
  
  com.aspose.cells.b.a.zh c()
  {
    return this.d;
  }
  
  private static void a(za paramza, HashMap paramHashMap, int paramInt)
    throws Exception
  {
    int i = paramza.q();
    for (int j = 0; j < i; j++)
    {
      int k = paramza.q();
      String str;
      if (paramInt == 1200)
      {
        str = a(paramza);
        zbrg.a(paramza.k(), 4);
      }
      else
      {
        str = b(paramza, paramInt);
      }
      if (paramHashMap.get(Integer.valueOf(k)) == null) {
        paramHashMap.put(Integer.valueOf(k), str);
      } else {
        paramHashMap.put(Integer.valueOf(k), str);
      }
    }
  }
  
  private static void a(zb paramzb, zaxw paramzaxw)
    throws Exception
  {
    paramzb.b(paramzaxw.b());
    for (int i = 0; i < paramzaxw.size(); i++)
    {
      zaxv localzaxv = paramzaxw.a(i);
      if (localzaxv.a())
      {
        paramzb.b(localzaxv.a);
        a(paramzb, localzaxv.b);
        zbrg.a(paramzb.a(), 4);
      }
    }
  }
  
  private static Object a(za paramza, int paramInt)
    throws Exception
  {
    int i = paramza.q();
    switch (i)
    {
    case 30: 
      return b(paramza, paramInt);
    case 31: 
      return a(paramza);
    case 64: 
      try
      {
        long l = paramza.s();
        if (l == 0L) {
          return DateTime.a;
        }
        return zbrg.a(l, "FileTime");
      }
      catch (Exception localException)
      {
        return DateTime.getNow();
      }
    case 19: 
      return Long.valueOf(paramza.r());
    case 3: 
      return Integer.valueOf(paramza.q());
    case 2: 
      return Short.valueOf(paramza.n());
    case 11: 
      return Boolean.valueOf(paramza.n() != 0);
    case 5: 
      return Double.valueOf(paramza.u());
    case 65: 
      int j = paramza.q();
      byte[] arrayOfByte = paramza.f(j);
      return arrayOfByte;
    }
    return null;
  }
  
  private static void a(zb paramzb, Object paramObject)
    throws Exception
  {
    if ((paramObject instanceof String))
    {
      paramzb.b(31);
      a(paramzb, ze.e(paramObject));
    }
    else if ((paramObject instanceof Short))
    {
      paramzb.b(2);
      paramzb.a(ze.d(paramObject));
    }
    else if ((paramObject instanceof Integer))
    {
      paramzb.b(3);
      paramzb.b(ze.f(paramObject));
    }
    else if ((paramObject instanceof Long))
    {
      paramzb.b(19);
      paramzb.a(ze.b(paramObject));
    }
    else if ((paramObject instanceof Double))
    {
      paramzb.b(5);
      paramzb.a(ze.g(paramObject));
    }
    else if ((paramObject instanceof Boolean))
    {
      paramzb.b(11);
      boolean bool = ((Boolean)paramObject).booleanValue();
      paramzb.a((short)(bool ? -1 : 0));
    }
    else
    {
      Object localObject;
      if ((paramObject instanceof DateTime))
      {
        paramzb.b(64);
        localObject = ze.h(paramObject);
        if (!DateTime.a((DateTime)localObject, DateTime.a)) {
          paramzb.b(zbrg.a((DateTime)localObject, "FileTime"));
        } else {
          paramzb.b(0L);
        }
      }
      else if ((paramObject instanceof byte[]))
      {
        paramzb.b(65);
        localObject = (byte[])paramObject;
        paramzb.b(localObject.length);
        paramzb.a((byte[])localObject);
      }
      else
      {
        throw new UnsupportedOperationException("Do not know how to write a property value of this type.");
      }
    }
    zbrg.a(paramzb.a(), 4);
  }
  
  private static String b(za paramza, int paramInt)
    throws Exception
  {
    int i = paramza.q();
    zm localzm = paramza.k();
    if (i + localzm.i() > localzm.h()) {
      i = (int)(localzm.h() - localzm.i());
    }
    byte[] arrayOfByte = paramza.f(i);
    return zw.a(Encoding.getEncoding(paramInt).a(arrayOfByte, 0, i), "\000", "");
  }
  
  private static String a(za paramza)
    throws Exception
  {
    int i = paramza.q() * 2;
    byte[] arrayOfByte = paramza.f(i);
    return Encoding.getUnicode().a(arrayOfByte, 0, i - 2);
  }
  
  private static void a(zb paramzb, String paramString)
    throws Exception
  {
    paramzb.b(paramString.length() + 1);
    paramzb.a(Encoding.getUnicode().a(paramString));
    paramzb.a((short)0);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zaxz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */