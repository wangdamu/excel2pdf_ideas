package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class OleObjectCollection
  extends CollectionBase
{
  private ShapeCollection a;
  
  OleObjectCollection(ShapeCollection shapes)
  {
    this.a = shapes;
  }
  
  boolean a()
  {
    Iterator localIterator = iterator();
    while (localIterator.hasNext())
    {
      OleObject localOleObject = (OleObject)localIterator.next();
      if (!localOleObject.a()) {
        return false;
      }
    }
    return true;
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, int height, int width, byte[] imageData)
  {
    OleObject localOleObject = this.a.addOleObject(upperLeftRow, 0, upperLeftColumn, 0, height, width, imageData);
    return getCount() - 1;
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, int height, int width, byte[] imageData, String linkedFile)
    throws Exception
  {
    OleObject localOleObject = this.a.addOleObject(upperLeftRow, 0, upperLeftColumn, 0, height, width, imageData);
    localOleObject.setLink(true);
    localOleObject.setObjectSourceFullName(linkedFile);
    localOleObject.setAutoUpdate(true);
    return getCount() - 1;
  }
  
  public OleObject get(int index)
  {
    return (OleObject)this.InnerList.get(index);
  }
  
  public void clear()
  {
    for (int i = 0; i < getCount(); i++) {
      this.a.a(get(i));
    }
    this.InnerList.clear();
  }
  
  public void removeAt(int index)
  {
    this.a.a(get(index));
    this.InnerList.remove(index);
  }
  
  void a(OleObject paramOleObject)
  {
    zf.a(this.InnerList, paramOleObject);
  }
  
  void b(OleObject paramOleObject)
  {
    this.InnerList.remove(paramOleObject);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/OleObjectCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */