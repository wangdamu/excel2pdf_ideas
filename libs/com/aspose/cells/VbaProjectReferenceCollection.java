package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zh;
import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.Iterator;

public class VbaProjectReferenceCollection
  extends CollectionBase
{
  private VbaProject a;
  
  VbaProjectReferenceCollection(VbaProject p)
  {
    this.a = p;
  }
  
  public VbaProjectReference get(int i)
  {
    return (VbaProjectReference)this.InnerList.get(i);
  }
  
  int a(VbaProjectReference paramVbaProjectReference)
  {
    for (int i = 0; i < getCount(); i++)
    {
      VbaProjectReference localVbaProjectReference = get(i);
      if ((localVbaProjectReference.getType() == paramVbaProjectReference.getType()) && (zw.b(localVbaProjectReference.getName(), paramVbaProjectReference.getName())))
      {
        this.InnerList.set(i, paramVbaProjectReference);
        return i;
      }
    }
    zf.a(this.InnerList, paramVbaProjectReference);
    return this.InnerList.size() - 1;
  }
  
  public int addRegisteredReference(String name, String libid)
  {
    VbaProjectReference localVbaProjectReference = new VbaProjectReference(0, name, libid, null, null);
    int i = a(localVbaProjectReference);
    return i;
  }
  
  public int addControlRefrernce(String name, String libid, String twiddledlibid, String extendedLibid)
  {
    VbaProjectReference localVbaProjectReference = new VbaProjectReference(1, name, libid, twiddledlibid, extendedLibid);
    int i = a(localVbaProjectReference);
    localVbaProjectReference.f = zh.b().a();
    localVbaProjectReference.g = i;
    return i;
  }
  
  public int addProjectRefrernce(String name, String absoluteLibid, String relativeLibid)
  {
    VbaProjectReference localVbaProjectReference = new VbaProjectReference(2, name, absoluteLibid, relativeLibid, null);
    int i = a(localVbaProjectReference);
    return i;
  }
  
  void a(VbaProjectReferenceCollection paramVbaProjectReferenceCollection)
  {
    clear();
    Iterator localIterator = paramVbaProjectReferenceCollection.iterator();
    while (localIterator.hasNext())
    {
      VbaProjectReference localVbaProjectReference1 = (VbaProjectReference)localIterator.next();
      VbaProjectReference localVbaProjectReference2 = new VbaProjectReference();
      localVbaProjectReference2.a(localVbaProjectReference1);
      zf.a(this.InnerList, localVbaProjectReference2);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/VbaProjectReferenceCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */