package com.aspose.cells.a.d;

import com.aspose.cells.Color;
import com.aspose.cells.b.a.a.za;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.b.a.zg;
import com.aspose.cells.b.a.b.zc;
import com.aspose.cells.b.a.zm;
import com.aspose.cells.b.a.zs;
import java.util.HashMap;
import java.util.Iterator;

public class zfp
{
  private zdz a;
  private zd b = new zd();
  private zd c = new zd();
  private zd d = new zd();
  private zd e = new zd();
  private zd f = new zd();
  private HashMap g = new HashMap();
  private HashMap h = new HashMap();
  private static HashMap i = new HashMap();
  
  public zfp(zdz paramzdz)
  {
    this.a = paramzdz;
  }
  
  public int a(int paramInt)
    throws Exception
  {
    return d(paramInt).b();
  }
  
  public zep a(String paramString, int paramInt, boolean paramBoolean)
    throws Exception
  {
    String str = b(paramString, paramInt, paramBoolean);
    zd localzd = d(1);
    zep localzep = (zep)localzd.d(str);
    if (localzep == null)
    {
      localzep = zep.a(this.a, paramString, paramInt, paramBoolean);
      localzd.a(str, localzep);
    }
    return localzep;
  }
  
  public zfr a(zc paramzc)
    throws Exception
  {
    zi localzi = (zi)zm.a(paramzc, zi.class);
    zfr localzfr = null;
    if (localzi != null) {
      localzfr = new zfr(this.a, localzi);
    } else {
      return null;
    }
    zd localzd = d(5);
    localzd.a(localzfr.q(), localzfr);
    return localzfr;
  }
  
  public zfl b(zc paramzc)
    throws Exception
  {
    if ((paramzc instanceof zg))
    {
      localObject1 = a((zg)paramzc);
      if (this.h.containsKey(localObject1)) {
        return (zfl)this.h.get(localObject1);
      }
      localObject2 = zfl.a(paramzc, this.a);
      zd localzd = d(2);
      localzd.a(((zfl)localObject2).q(), localObject2);
      this.h.put(localObject1, localObject2);
      return (zfl)localObject2;
    }
    Object localObject1 = zfl.a(paramzc, this.a);
    Object localObject2 = d(2);
    ((zd)localObject2).a(((zfl)localObject1).q(), localObject1);
    return (zfl)localObject1;
  }
  
  public zee a()
    throws Exception
  {
    zee localzee = new zee(this.a);
    zd localzd = d(3);
    localzd.a(localzee.q(), localzee);
    return localzee;
  }
  
  public zew a(zex paramzex)
    throws Exception
  {
    zd localzd = d(4);
    zew localzew = new zew(this.a, paramzex);
    localzd.a(localzew.q(), localzew);
    return localzew;
  }
  
  public zew a(zex paramzex, long paramLong)
    throws Exception
  {
    zd localzd = d(4);
    if (!this.g.containsKey(Long.valueOf(paramLong)))
    {
      zew localzew = new zew(this.a, paramzex);
      this.g.put(Long.valueOf(paramLong), localzew);
      localzd.a(localzew.q(), localzew);
      return localzew;
    }
    return (zew)this.g.get(Long.valueOf(paramLong));
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    a(1, paramzez);
    a(5, paramzez);
    a(2, paramzez);
    a(3, paramzez);
    a(4, paramzez);
  }
  
  public void a(zez paramzez, int paramInt)
    throws Exception
  {
    a(1, paramzez, paramInt);
    a(5, paramzez, paramInt);
    a(2, paramzez, paramInt);
    a(3, paramzez, paramInt);
    a(4, paramzez, paramInt);
  }
  
  public void b(zez paramzez)
    throws Exception
  {
    b(1, paramzez);
    b(5, paramzez);
    b(2, paramzez);
    b(3, paramzez);
    b(4, paramzez);
  }
  
  private void a(int paramInt, zez paramzez)
    throws Exception
  {
    zd localzd = d(paramInt);
    if (localzd.b() == 0) {
      return;
    }
    paramzez.a("/" + b(paramInt));
    paramzez.g();
    Iterator localIterator = localzd.iterator();
    while (localIterator.hasNext())
    {
      za localza = (za)localIterator.next();
      zey localzey = (zey)localza.getValue();
      paramzez.a("/" + localzey.q(), localzey.o());
    }
    paramzez.h();
  }
  
  private void a(int paramInt1, zez paramzez, int paramInt2)
    throws Exception
  {
    zd localzd = d(paramInt1);
    if (localzd.b() == 0) {
      return;
    }
    int j = 0;
    Iterator localIterator = localzd.iterator();
    za localza;
    zey localzey;
    while (localIterator.hasNext())
    {
      localza = (za)localIterator.next();
      localzey = (zey)localza.getValue();
      if (localzey.r() == paramInt2)
      {
        j = 1;
        break;
      }
    }
    if (j == 0) {
      return;
    }
    paramzez.a("/" + b(paramInt1));
    paramzez.g();
    localIterator = localzd.iterator();
    while (localIterator.hasNext())
    {
      localza = (za)localIterator.next();
      localzey = (zey)localza.getValue();
      if (localzey.r() == paramInt2) {
        paramzez.a("/" + localzey.q(), localzey.o());
      }
    }
    paramzez.h();
  }
  
  private void b(int paramInt, zez paramzez)
    throws Exception
  {
    zd localzd = d(paramInt);
    if (localzd.b() == 0) {
      return;
    }
    Iterator localIterator = localzd.iterator();
    while (localIterator.hasNext())
    {
      za localza = (za)localIterator.next();
      zey localzey = (zey)localza.getValue();
      localzey.a(paramzez);
    }
  }
  
  public static String b(int paramInt)
  {
    return ((zfo)i.get(Integer.valueOf(paramInt))).a;
  }
  
  public static String c(int paramInt)
  {
    return ((zfo)i.get(Integer.valueOf(paramInt))).b;
  }
  
  private static String b(String paramString, int paramInt, boolean paramBoolean)
  {
    return paramString + paramInt + paramBoolean;
  }
  
  private zd d(int paramInt)
    throws Exception
  {
    switch (paramInt)
    {
    case 1: 
      return this.b;
    case 2: 
      return this.c;
    case 3: 
      return this.d;
    case 4: 
      return this.e;
    case 5: 
      return this.f;
    }
    throw new Exception("Unknown resource type.");
  }
  
  private static String a(zg paramzg)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramzg.d());
    localStringBuilder.append("_");
    localStringBuilder.append(paramzg.c().toArgb());
    localStringBuilder.append("_");
    localStringBuilder.append(paramzg.b().toArgb());
    return zs.a(localStringBuilder);
  }
  
  static
  {
    i.put(Integer.valueOf(1), new zfo("Font", "F"));
    i.put(Integer.valueOf(2), new zfo("Pattern", "P"));
    i.put(Integer.valueOf(3), new zfo("ExtGState", "GS"));
    i.put(Integer.valueOf(4), new zfo("XObject", "X"));
    i.put(Integer.valueOf(5), new zfo("Shading", "Sh"));
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */