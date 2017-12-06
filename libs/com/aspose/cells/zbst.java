package com.aspose.cells;

import com.aspose.cells.a.e.ze;
import com.aspose.cells.b.a.a.zd;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.HashMap;

class zbst
  implements zajl
{
  private HashMap b = new HashMap();
  zbbj[] a = new zbbj[16];
  private zami c = new zami();
  private int d = 0;
  
  HashMap e()
  {
    return this.b;
  }
  
  public zbbj a(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public zbbj b(String paramString)
  {
    return (zbbj)this.b.get(paramString);
  }
  
  public void a(zbbj paramzbbj)
  {
    paramzbbj.d += 1;
    if (paramzbbj.e()) {
      this.b.put(paramzbbj.c, paramzbbj);
    }
    if (this.c.a() != 0)
    {
      int i = this.c.b();
      this.a[i] = paramzbbj;
      paramzbbj.e = i;
    }
    else if (this.d < this.a.length)
    {
      this.a[this.d] = paramzbbj;
      paramzbbj.e = this.d;
    }
    else
    {
      c(1);
      this.a[this.d] = paramzbbj;
      paramzbbj.e = this.d;
    }
    this.d += 1;
  }
  
  public void b(zbbj paramzbbj)
  {
    if (paramzbbj.e())
    {
      if (this.a[paramzbbj.e] != null)
      {
        this.a[paramzbbj.e].d += 1;
      }
      else
      {
        c(1);
        this.b.put(paramzbbj.c, paramzbbj);
        this.a[paramzbbj.e] = paramzbbj;
        this.d += 1;
      }
    }
    else
    {
      c(1);
      this.a[paramzbbj.e] = paramzbbj;
      this.d += 1;
    }
  }
  
  public zbbj a(String paramString)
  {
    zbbj localzbbj = (zbbj)this.b.get(paramString);
    if (localzbbj != null)
    {
      localzbbj.d += 1;
    }
    else
    {
      localzbbj = new zbbj(paramString, 0);
      a(localzbbj);
    }
    return localzbbj;
  }
  
  public int a()
  {
    return this.a.length;
  }
  
  public long b()
  {
    long l = 0L;
    for (int i = 0; i < this.a.length; i++) {
      if (this.a[i] != null) {
        l = (l & 0xFFFFFFFF) + (this.a[i].d & 0xFFFFFFFF);
      }
    }
    return l;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return true;
  }
  
  public void d(zbbj paramzbbj)
  {
    paramzbbj.d -= 1;
    if (paramzbbj.d <= 0)
    {
      this.a[paramzbbj.e] = null;
      if (paramzbbj.e()) {
        this.b.remove(paramzbbj.c);
      }
      this.d -= 1;
      this.c.a(paramzbbj.e);
    }
  }
  
  public void b(int paramInt)
  {
    zbbj localzbbj = this.a[paramInt];
    localzbbj.d -= 1;
    if (localzbbj.d <= 0)
    {
      int i = localzbbj.e;
      this.a[i] = null;
      this.c.a(i);
      if (localzbbj.e()) {
        this.b.remove(localzbbj.c);
      }
      this.d -= 1;
    }
  }
  
  boolean f()
  {
    if (this.d < 1) {
      return false;
    }
    if (this.c.a() > 1) {
      return true;
    }
    if (this.c.a() == 1)
    {
      int i = this.c.b(0);
      if (i < this.d) {
        return true;
      }
      i++;
      while (i < this.a.length)
      {
        if (this.a[i] != null) {
          return true;
        }
        i++;
      }
    }
    for (int j = 0; j < this.a.length; j++)
    {
      zbbj localzbbj = this.a[j];
      if (localzbbj == null) {
        return j < this.d;
      }
      if ((localzbbj.f()) && (!((zbdd)localzbbj).j())) {
        return true;
      }
    }
    return false;
  }
  
  int a(int[] paramArrayOfInt1, int[] paramArrayOfInt2, zajl paramzajl)
  {
    this.d = 0;
    int i = 0;
    zbbj localzbbj;
    if ((paramzajl != null) && (paramzajl != this))
    {
      this.b = new HashMap();
      this.c = new zami();
      ArrayList localArrayList = new ArrayList();
      for (int k = 0; k < paramArrayOfInt1.length; k++) {
        if (paramArrayOfInt1[k] > 0)
        {
          localzbbj = paramzajl.a(k);
          zf.a(localArrayList, localzbbj);
          localzbbj.d = paramArrayOfInt1[k];
          localzbbj.e = this.d;
          paramArrayOfInt2[k] = this.d;
          this.d += 1;
          if (this.d != k) {
            i += localzbbj.d;
          }
        }
      }
      zbbj[] arrayOfzbbj = new zbbj[localArrayList.size() + 16];
      zf.a(localArrayList, arrayOfzbbj);
      this.a = arrayOfzbbj;
      return i;
    }
    this.c.c();
    int j = 0;
    for (int m = 0; m < paramArrayOfInt1.length; m++)
    {
      localzbbj = this.a[m];
      if (paramArrayOfInt1[m] > 0)
      {
        this.d += 1;
        localzbbj.d = paramArrayOfInt1[m];
        if (m != j)
        {
          i += localzbbj.d;
          paramArrayOfInt2[m] = j;
          localzbbj.e = j;
          this.a[j] = localzbbj;
          this.a[m] = null;
        }
        else
        {
          paramArrayOfInt2[m] = m;
        }
        j++;
      }
      else if (localzbbj != null)
      {
        if (localzbbj.e()) {
          this.b.remove(localzbbj.c);
        }
        this.a[m] = null;
      }
    }
    if (this.a.length > paramArrayOfInt1.length) {
      for (m = paramArrayOfInt1.length; m < this.a.length; m++)
      {
        localzbbj = this.a[m];
        if (localzbbj != null)
        {
          if (m != j) {
            i += localzbbj.d;
          }
          this.d += 1;
          paramArrayOfInt2[m] = j;
          localzbbj.e = j;
          this.a[j] = localzbbj;
          this.a[m] = null;
          j++;
        }
      }
    }
    return i;
  }
  
  private void c(int paramInt)
  {
    if (this.d + paramInt >= this.a.length)
    {
      zbbj[] arrayOfzbbj = new zbbj[this.a.length * 2];
      for (int i = 0; i < this.a.length; i++) {
        arrayOfzbbj[i] = this.a[i];
      }
      this.a = arrayOfzbbj;
    }
  }
  
  public zbbj c(zbbj paramzbbj)
  {
    Object localObject;
    if (paramzbbj.e())
    {
      localObject = (zbbj)this.b.get(paramzbbj.c);
      if (localObject != null)
      {
        localObject.d += 1;
        return (zbbj)localObject;
      }
    }
    else if (!paramzbbj.g())
    {
      localObject = (zbdd)paramzbbj;
      for (int i = 0; i < this.a.length; i++)
      {
        zbbj localzbbj = this.a[i];
        if ((localzbbj != null) && (!localzbbj.g()) && (localzbbj.f()) && (((zbdd)localzbbj).a((zbdd)localObject)))
        {
          localzbbj.d += 1;
          return localzbbj;
        }
      }
    }
    a(paramzbbj);
    return paramzbbj;
  }
  
  zbbj a(String paramString, byte[] paramArrayOfByte)
  {
    Object localObject = null;
    for (int i = 0; i < this.a.length; i++)
    {
      localObject = this.a[i];
      if ((localObject != null) && (!((zbbj)localObject).g()) && (((zbbj)localObject).f()) && (((zbdd)localObject).a(paramString, paramArrayOfByte)))
      {
        localObject.d += 1;
        return (zbbj)localObject;
      }
    }
    localObject = new zbdd(paramString, paramArrayOfByte, 1);
    if (this.c.a() == 0)
    {
      c(1);
      this.a[this.d] = localObject;
      ((zbbj)localObject).e = (this.d++);
    }
    else
    {
      i = this.c.b();
      this.a[i] = localObject;
      ((zbbj)localObject).e = i;
      this.d += 1;
    }
    return (zbbj)localObject;
  }
  
  zbbj a(zbdd paramzbdd, int paramInt, WorksheetCollection paramWorksheetCollection)
  {
    zbdf.a(paramzbdd.i(), paramzbdd.c.length(), paramWorksheetCollection.j(paramInt), false);
    FontSetting[] arrayOfFontSetting = new FontSetting[paramzbdd.i().size()];
    for (int i = 0; i < arrayOfFontSetting.length; i++) {
      arrayOfFontSetting[i] = ((FontSetting)paramzbdd.i().get(i));
    }
    String str = paramzbdd.c;
    int j = paramzbdd.e;
    byte[] arrayOfByte = zbdf.a(paramInt, str, arrayOfFontSetting, paramWorksheetCollection);
    if (arrayOfByte == null)
    {
      this.c.a(j);
      this.a[j] = null;
      this.d -= 1;
      return a(str);
    }
    for (int k = 0; k < j; k++)
    {
      zbbj localzbbj = this.a[k];
      if ((localzbbj != null) && (localzbbj.f()))
      {
        zbdd localzbdd = (zbdd)localzbbj;
        if (localzbdd.a(str, arrayOfByte))
        {
          localzbbj.d += 1;
          this.c.a(j);
          this.a[j] = null;
          this.d -= 1;
          return localzbdd;
        }
      }
    }
    paramzbdd.a(arrayOfByte);
    paramzbdd.a(null);
    return paramzbdd;
  }
  
  String[] g()
  {
    zd localzd = new zd();
    for (int i = 0; i < this.a.length; i++) {
      if ((this.a[i] != null) && (this.a[i].c.startsWith("&="))) {
        localzd.b(this.a[i].c, Boolean.valueOf(true));
      }
    }
    String[] arrayOfString = new String[localzd.b()];
    ze.a(localzd.c(), arrayOfString, 0);
    return arrayOfString;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbst.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */