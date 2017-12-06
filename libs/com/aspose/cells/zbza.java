package com.aspose.cells;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zbza
{
  private int a;
  private int b;
  private int c;
  private zbpf d;
  private zbpf e;
  private HashMap f;
  
  public zbza(int paramInt)
  {
    this.a = paramInt;
    this.b = 0;
    this.c = 0;
    this.d = new zbpf();
    this.f = new HashMap(8);
    this.f.put(zabb.a, this.d);
    this.f.put(zabg.a, new zbpf());
    this.f.put(zaba.a, new zbpf());
    this.f.put(zaba.b, new zbpf());
    this.f.put(zabc.g, new zbpf());
  }
  
  public boolean a()
  {
    return this.b >= this.a;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public zaie a(zaie paramzaie)
  {
    this.e = ((zbpf)this.f.get(paramzaie));
    if (this.e != null)
    {
      this.c = -1;
    }
    else if ((paramzaie.b() == 3) && (((zabb)paramzaie).q()))
    {
      this.e = this.d;
      return zabb.a;
    }
    return paramzaie;
  }
  
  public void c()
  {
    this.b += 1;
    if (this.c < 0) {
      this.e.a += 1;
    } else {
      this.c += 1;
    }
  }
  
  public void a(int paramInt)
  {
    this.b += paramInt;
    if (this.c < 0) {
      this.e.a += paramInt;
    } else {
      this.c += paramInt;
    }
  }
  
  public zaie b(zaie paramzaie)
  {
    this.b += 1;
    Object localObject = this.f.get(paramzaie);
    if (localObject != null)
    {
      ((zbpf)localObject).a += 1;
    }
    else if ((paramzaie.b() == 3) && (((zabb)paramzaie).q()))
    {
      this.d.a += 1;
      return zabb.a;
    }
    return paramzaie;
  }
  
  public int c(zaie paramzaie)
  {
    Object localObject = this.f.get(paramzaie);
    if (localObject != null) {
      return ((zbpf)localObject).a;
    }
    return 0;
  }
  
  public zaie d()
  {
    Object localObject1 = null;
    Object localObject2;
    if (this.c < 0)
    {
      localObject2 = this.e;
    }
    else
    {
      localObject1 = zabg.a;
      localObject2 = (zbpf)this.f.get(localObject1);
    }
    Iterator localIterator = this.f.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject3 = localIterator.next();
      zbpf localzbpf = (zbpf)this.f.get(localObject3);
      if (localzbpf.a > ((zbpf)localObject2).a)
      {
        localObject1 = (zaie)localObject3;
        localObject2 = localzbpf;
      }
    }
    return (zaie)localObject1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */