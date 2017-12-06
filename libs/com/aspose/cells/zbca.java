package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zbca
  extends CollectionBase
{
  Object a;
  
  zbca(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public zbbu a(int paramInt)
  {
    return (zbbu)this.InnerList.get(paramInt);
  }
  
  void a(zbcl paramzbcl)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zbbu localzbbu = (zbbu)localIterator.next();
      Object localObject;
      switch (localzbbu.a())
      {
      case 2: 
        localObject = (zbbw)localzbbu;
        paramzbcl.a(((zbbw)localObject).m, ((zbbw)localObject).p);
        paramzbcl.a(((zbbw)localObject).m, ((zbbw)localObject).q);
        break;
      case 1: 
        localObject = (zbcc)localzbbu;
        paramzbcl.a((zbcc)localObject);
        break;
      case 8: 
        localObject = (zbbz)localzbbu;
        if ((((zbbz)localObject).i != null) && (((zbbz)localObject).i.getCount() > 0)) {
          ((zbbz)localObject).i.a(paramzbcl);
        }
        break;
      case 11: 
        localObject = (zbcg)localzbbu;
        if ((((zbcg)localObject).j != null) && (((zbcg)localObject).j.getCount() > 0)) {
          ((zbcg)localObject).j.a(paramzbcl);
        }
        break;
      }
    }
  }
  
  public int a(zbbu paramzbbu)
  {
    paramzbbu.a = this;
    zf.a(this.InnerList, paramzbbu);
    return this.InnerList.size() - 1;
  }
  
  void a(zcw paramzcw, zbcq paramzbcq)
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      zbbu localzbbu = (zbbu)localIterator.next();
      switch (localzbbu.a())
      {
      case 2: 
        zbbw localzbbw = (zbbw)localzbbu;
        if ((localzbbw.q != null) && (localzbbw.q.h != null)) {
          if (paramzcw != null) {
            localzbbw.q.h = paramzcw.a(localzbbw.q.h, -1);
          } else {
            localzbbw.q.h = zcv.a(localzbbw.q.h, -1, 0, 0, false, paramzbcq);
          }
        }
        if ((localzbbw.p != null) && (localzbbw.p.h != null)) {
          if (paramzcw != null) {
            localzbbw.p.h = paramzcw.a(localzbbw.p.h, -1);
          } else {
            localzbbw.p.h = zcv.a(localzbbw.p.h, -1, 0, 0, false, paramzbcq);
          }
        }
        break;
      case 1: 
        zbcc localzbcc = (zbcc)localzbbu;
        if (localzbcc.d != null) {
          if (paramzcw != null) {
            localzbcc.d = paramzcw.a(localzbcc.d, -1);
          } else {
            localzbcc.d = zcv.a(localzbcc.d, -1, 0, 0, false, paramzbcq);
          }
        }
        break;
      case 11: 
        zbcg localzbcg = (zbcg)localzbbu;
        if (localzbcg.j != null) {
          localzbcg.j.a(paramzcw, paramzbcq);
        }
        break;
      case 8: 
        zbbz localzbbz = (zbbz)localzbbu;
        if (localzbbz.i != null) {
          localzbbz.i.a(paramzcw, paramzbcq);
        }
        break;
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */