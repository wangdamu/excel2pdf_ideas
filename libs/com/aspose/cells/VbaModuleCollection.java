package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class VbaModuleCollection
  extends CollectionBase
{
  short a;
  VbaProject b;
  
  VbaModuleCollection(VbaProject p)
  {
    this.b = p;
    this.a = -1;
  }
  
  void a(VbaModule paramVbaModule)
  {
    zf.a(this.InnerList, paramVbaModule);
  }
  
  public void addDesignerStorage(String name, byte[] data)
    throws Exception
  {
    zxf localzxf = new zxf(new zh(data));
    if (this.b.q == null) {
      this.b.q = new zaoz();
    }
    this.b.q.a(name, localzxf.a());
  }
  
  public byte[] getDesignerStorage(String name)
    throws Exception
  {
    if (this.b.q == null) {
      return null;
    }
    zaoz localzaoz = this.b.q.b(name);
    if (localzaoz == null) {
      return null;
    }
    zxf localzxf = new zxf(localzaoz);
    zh localzh = new zh();
    localzxf.a(localzh);
    return localzh.o();
  }
  
  public int add(Worksheet sheet)
  {
    String str = sheet.getCodeName();
    if ((sheet.C() == null) || ("".equals(sheet.C()))) {
      sheet.c(str);
    }
    for (int i = 0; i < getCount(); i++)
    {
      VbaModule localVbaModule2 = get(i);
      if (zw.a(localVbaModule2.a, str, true) == 0) {
        return i;
      }
    }
    VbaModule localVbaModule1 = new VbaModule(this.b, 1, str);
    zf.a(this.InnerList, localVbaModule1);
    return this.InnerList.size() - 1;
  }
  
  public int add(int type, String name)
  {
    VbaModule localVbaModule = new VbaModule(this.b, type, name);
    zf.a(this.InnerList, localVbaModule);
    return this.InnerList.size() - 1;
  }
  
  public VbaModule get(int index)
  {
    return (VbaModule)this.InnerList.get(index);
  }
  
  public void remove(Worksheet sheet)
  {
    String str = sheet.getCodeName();
    for (int i = 0; i < getCount(); i++)
    {
      VbaModule localVbaModule = get(i);
      if (zw.a(localVbaModule.a, str, true) == 0)
      {
        this.InnerList.remove(i);
        return;
      }
    }
  }
  
  public void remove(String name)
  {
    for (int i = 0; i < getCount(); i++)
    {
      VbaModule localVbaModule = get(i);
      if (zw.a(localVbaModule.a, name, true) == 0)
      {
        this.InnerList.remove(i);
        return;
      }
    }
  }
  
  public VbaModule get(String name)
  {
    for (int i = 0; i < getCount(); i++)
    {
      VbaModule localVbaModule = get(i);
      if (zw.a(localVbaModule.a, name, true) == 0) {
        return localVbaModule;
      }
    }
    return null;
  }
  
  boolean a()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      VbaModule localVbaModule = (VbaModule)localIterator.next();
      if (localVbaModule.m != null) {
        return true;
      }
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/VbaModuleCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */