package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.List;

class zkg
  extends CollectionBase
  implements zaho
{
  private zbfc a;
  private zje b;
  
  zkg(zje paramzje, zbfc paramzbfc)
  {
    this.b = paramzje;
    this.a = paramzbfc;
  }
  
  public zbfc a()
  {
    return this.a;
  }
  
  public zahn a(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > getCount() - 1)) {
      return null;
    }
    return (zke)this.InnerList.get(paramInt);
  }
  
  public zke b(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > getCount() - 1)) {
      return null;
    }
    return (zke)this.InnerList.get(paramInt);
  }
  
  public zje b()
  {
    return this.b;
  }
  
  private int a(zke paramzke)
  {
    zf.a(this.InnerList, paramzke);
    paramzke.a(this);
    paramzke.f();
    return this.InnerList.size() - 1;
  }
  
  public zahn a(double paramDouble)
  {
    zke localzke = new zke(this.b, paramDouble);
    a(localzke);
    return localzke;
  }
  
  List c()
  {
    return this.InnerList;
  }
  
  ArrayList d()
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject = null;
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      zke localzke1 = b(i);
      if (i == 0)
      {
        zf.a(localArrayList, localzke1);
      }
      else
      {
        int j = 0;
        for (int k = 0; k < localArrayList.size(); k++)
        {
          zke localzke2 = (zke)localArrayList.get(k);
          if (localzke2.q() > localzke1.q())
          {
            localArrayList.add(k, localzke1);
            j = 1;
            break;
          }
        }
        if (j == 0) {
          zf.a(localArrayList, localzke1);
        }
      }
      localObject = localzke1;
    }
    return localArrayList;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */