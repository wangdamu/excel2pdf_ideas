package com.aspose.cells.a.d;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;
import java.util.Iterator;

public class zfw
  extends zey
{
  private ArrayList a = new ArrayList();
  private ArrayList b = new ArrayList();
  
  public zfw(zdz paramzdz)
  {
    super(paramzdz);
  }
  
  public ArrayList b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.b.size();
  }
  
  public void a(zez paramzez)
    throws Exception
  {
    paramzez.a(this);
    paramzez.g();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[ ");
    Iterator localIterator1 = this.a.iterator();
    Object localObject1;
    Object localObject2;
    while (localIterator1.hasNext())
    {
      localObject1 = localIterator1.next();
      if ((localObject1 instanceof zey))
      {
        localObject2 = (zey)localObject1;
        localStringBuilder.append(((zey)localObject2).o());
        localStringBuilder.append(" ");
      }
      else
      {
        localStringBuilder.append(localObject1);
        localStringBuilder.append(" ");
      }
    }
    localStringBuilder.append("]");
    paramzez.a("/K", zs.a(localStringBuilder));
    localStringBuilder = new StringBuilder();
    localStringBuilder.append("[ ");
    for (int i = 0; i < this.b.size(); i++)
    {
      localStringBuilder.append(i);
      localStringBuilder.append(" ");
      localObject1 = this.b.get(i);
      if ((localObject1 instanceof ArrayList))
      {
        localObject2 = (ArrayList)localObject1;
        localStringBuilder.append("[ ");
        Iterator localIterator2 = ((Iterable)localObject2).iterator();
        while (localIterator2.hasNext())
        {
          String str = (String)localIterator2.next();
          localStringBuilder.append(str);
          localStringBuilder.append(" ");
        }
        localStringBuilder.append("] ");
      }
      else
      {
        localStringBuilder.append(localObject1);
        localStringBuilder.append(" ");
      }
    }
    localStringBuilder.append(" ]");
    paramzez.a("/Nums", zs.a(localStringBuilder));
    paramzez.a("/ParentTreeNextKey", c());
    paramzez.a("/Type", "/StructTreeRoot");
    paramzez.a("/RoleMap");
    a(paramzez);
    paramzez.h();
    paramzez.b();
    b(paramzez);
  }
  
  private void b(zez paramzez)
    throws Exception
  {
    Iterator localIterator = this.a.iterator();
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
  
  private static void a(zgd paramzgd)
    throws Exception
  {
    paramzgd.g();
    paramzgd.a("/Workbook", "/Document");
    paramzgd.a("/Worksheet", "/Part");
    paramzgd.a("/Header", "/Sect");
    paramzgd.a("/Footer", "/Sect");
    paramzgd.a("/Footnote", "/Note");
    paramzgd.a("/EndNote", "/Note");
    paramzgd.a("/Chart", "/Sect");
    paramzgd.a("/Chartsheet", "/Part");
    paramzgd.a("/Textbox", "/Sect");
    paramzgd.a("/Annotation", "/Sect");
    paramzgd.a("/Artifact", "/Sect");
    paramzgd.a("/Shape", "/Sect");
    paramzgd.h();
  }
  
  public int a(zfv paramzfv)
  {
    paramzfv.a(o());
    return zf.a(this.a, paramzfv);
  }
  
  public ArrayList d()
  {
    return this.a;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zfw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */