package com.aspose.cells;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class zarz
{
  int a;
  int b;
  double c;
  boolean d;
  String e;
  int f = -1;
  HashMap g = new HashMap();
  int h;
  String i;
  
  void a(zarz paramzarz)
  {
    this.c = paramzarz.c;
    this.d = paramzarz.d;
    this.e = paramzarz.e;
    this.f = paramzarz.f;
    this.h = paramzarz.h;
    this.i = paramzarz.i;
  }
  
  void a(zasg paramzasg, int paramInt)
  {
    int j = 0;
    Object localObject1 = null;
    if ((this.g == null) || (this.g.size() == 0))
    {
      this.h = -1;
      this.i = null;
    }
    else
    {
      int k = 0;
      Object localObject2 = this.g.keySet().iterator();
      Object localObject3;
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        int m = ((Integer)this.g.get(localObject3)).intValue();
        if ("default".equals(((String)localObject3).toLowerCase()))
        {
          m += 65535 - paramInt + 1;
          k = 1;
        }
        if (j < m)
        {
          localObject1 = localObject3;
          j = m;
        }
      }
      if ((k == 0) && (j < 65535 - paramInt + 1)) {
        localObject1 = paramzasg.p;
      }
      if (localObject1 != null)
      {
        if ("default".equals(((String)localObject1).toLowerCase())) {
          localObject1 = paramzasg.p;
        }
        if (paramzasg.c.get(localObject1) != null)
        {
          localObject2 = paramzasg.c.get(localObject1);
          localObject3 = (zbzv)paramzasg.b.getWorksheets().C();
          Style localStyle = ((zbzv)localObject3).a(((Integer)localObject2).intValue());
          if ((localStyle.getName() != null) && (!"".equals(localStyle.getName()))) {
            this.h = ((zbzv)localObject3).a(localStyle, ((Integer)localObject2).intValue());
          } else {
            this.h = ((Integer)localObject2).intValue();
          }
          this.i = ((String)localObject1);
        }
        else
        {
          this.h = -1;
          this.i = null;
        }
      }
      else
      {
        this.h = -1;
        this.i = null;
      }
    }
    this.g = null;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zarz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */