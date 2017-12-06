package com.aspose.cells;

import com.aspose.cells.a.c.zx;
import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.d.zd;
import com.aspose.cells.b.a.d.ze;
import com.aspose.cells.b.a.d.zh;
import com.aspose.cells.b.a.d.zm;
import java.io.InputStream;
import java.util.ArrayList;

public class PictureCollection
  extends CollectionBase
{
  private ShapeCollection a;
  
  PictureCollection(ShapeCollection shapes)
  {
    this.a = shapes;
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, int lowerRightRow, int lowerRightColumn, InputStream stream)
  {
    zh localzh = zx.a(stream);
    Picture localPicture = this.a.a(upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, localzh);
    return getCount() - 1;
  }
  
  int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, zm paramzm)
  {
    Picture localPicture = this.a.a(paramInt1, paramInt2, paramInt3, paramInt4, paramzm);
    return getCount() - 1;
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, int lowerRightRow, int lowerRightColumn, String fileName)
    throws Exception
  {
    if (!zd.c(fileName)) {
      throw new CellsException(6, "File does not exist.");
    }
    ze localze = zd.b(fileName);
    a(upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, localze);
    localze.a();
    return getCount() - 1;
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, InputStream stream)
  {
    zh localzh = zx.a(stream);
    return a(upperLeftRow, upperLeftColumn, localzh, 100, 100);
  }
  
  int a(int paramInt1, int paramInt2, zm paramzm)
  {
    return a(paramInt1, paramInt2, paramzm, 100, 100);
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, String fileName)
    throws Exception
  {
    if (!zd.c(fileName)) {
      throw new CellsException(6, "File does not exist.");
    }
    ze localze = zd.b(fileName);
    a(upperLeftRow, upperLeftColumn, localze);
    localze.a();
    return getCount() - 1;
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, InputStream stream, int widthScale, int heightScale)
  {
    zh localzh = zx.a(stream);
    Picture localPicture = this.a.a(upperLeftRow, upperLeftColumn, localzh, widthScale, heightScale);
    return getCount() - 1;
  }
  
  int a(int paramInt1, int paramInt2, zm paramzm, int paramInt3, int paramInt4)
  {
    Picture localPicture = this.a.a(paramInt1, paramInt2, paramzm, paramInt3, paramInt4);
    return getCount() - 1;
  }
  
  public int add(int upperLeftRow, int upperLeftColumn, String fileName, int widthScale, int heightScale)
    throws Exception
  {
    if (!zd.c(fileName)) {
      throw new CellsException(6, "File does not exist.");
    }
    ze localze = zd.b(fileName);
    a(upperLeftRow, upperLeftColumn, localze, widthScale, heightScale);
    localze.a();
    return getCount() - 1;
  }
  
  public Picture get(int index)
  {
    return (Picture)this.InnerList.get(index);
  }
  
  public void clear()
  {
    for (int i = 0; i < this.InnerList.size(); i++)
    {
      Picture localPicture = (Picture)this.InnerList.get(i--);
      this.a.b(localPicture);
    }
  }
  
  public void removeAt(int index)
  {
    Picture localPicture = (Picture)this.InnerList.get(index);
    this.a.b(localPicture);
  }
  
  int a(Picture paramPicture)
  {
    zf.a(this.InnerList, paramPicture);
    return getCount() - 1;
  }
  
  void b(Picture paramPicture)
  {
    this.InnerList.remove(paramPicture);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PictureCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */