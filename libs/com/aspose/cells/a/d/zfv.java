package com.aspose.cells.a.d;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class zfv
  extends zey
{
  private String a;
  private String b;
  private String c;
  private ArrayList d;
  
  public zfv(zdz paramzdz, String paramString)
  {
    super(paramzdz);
    this.a = paramString;
    this.d = new ArrayList();
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[ ");
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if ((localObject instanceof zey))
      {
        zey localzey = (zey)localObject;
        localStringBuilder.append(localzey.o());
        localStringBuilder.append(" ");
      }
      else
      {
        localStringBuilder.append(localObject);
        localStringBuilder.append(" ");
      }
    }
    localStringBuilder.append("]");
    paramzez.a("/K", zs.a(localStringBuilder));
    paramzez.a("/P", this.b);
    if (!zw.b(this.c)) {
      paramzez.a("/Pg", this.c);
    }
    paramzez.a("/S", this.a);
    paramzez.a("/Type", "/StructElem");
    paramzez.h();
    paramzez.b();
    b(paramzez);
  }
  
  private void b(zez paramzez)
    throws Exception
  {
    Iterator localIterator = this.d.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      if ((localObject instanceof zey))
      {
        zey localzey = (zey)localObject;
        localzey.a(paramzez);
      }
    }
  }
  
  public int a(zfv paramzfv)
  {
    paramzfv.a(o());
    return zf.a(this.d, paramzfv);
  }
  
  public void a(int paramInt, zfv paramzfv)
  {
    paramzfv.a(o());
    this.d.add(paramInt, paramzfv);
  }
  
  public int a(int paramInt)
  {
    return zf.a(this.d, zp.a(paramInt));
  }
  
  public int a(zey paramzey)
  {
    return zf.a(this.d, paramzey);
  }
  
  public ArrayList c()
  {
    return this.d;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */