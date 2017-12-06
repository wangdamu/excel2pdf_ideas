package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class GroupBox
  extends Shape
{
  GroupBox(ShapeCollection shapes)
  {
    super(shapes, 19, shapes);
    this.x = new FontSettingCollection(shapes.j(), this);
  }
  
  public boolean getShadow()
  {
    return this.B;
  }
  
  public void setShadow(boolean value)
  {
    this.B = value;
  }
  
  ArrayList a()
  {
    ArrayList localArrayList = new ArrayList();
    int i = getPlacement();
    setPlacement(2);
    int j = getUpperLeftRow();
    int k = getTop();
    int m = getUpperLeftColumn();
    int n = getLeft();
    int i1 = getLowerRightRow();
    int i2 = getBottom();
    int i3 = getLowerRightColumn();
    int i4 = getRight();
    setPlacement(i);
    int i5 = -1;
    int i6 = -1;
    int i7 = -1;
    int i8 = -1;
    Iterator localIterator = N().iterator();
    while (localIterator.hasNext())
    {
      Shape localShape = (Shape)localIterator.next();
      if ((localShape != this) && (!localShape.W()))
      {
        int i9 = 0;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (localShape.getPlacement())
        {
        case 0: 
          if (i5 == -1)
          {
            i5 = getTopToCorner();
            i6 = getLeftToCorner();
            i7 = i6 + getWidth();
            i8 = i5 + getHeight();
          }
          i10 = localShape.getTopToCorner();
          i11 = localShape.getLeftToCorner();
          i12 = i11 + localShape.getWidth();
          i13 = i10 + localShape.getHeight();
          if ((i10 >= i5) && (i13 <= i8) && (i11 >= i6) && (i12 <= i7)) {
            i9 = 1;
          }
          break;
        case 1: 
        case 2: 
          i10 = localShape.getUpperLeftRow();
          i11 = localShape.getTop();
          i12 = localShape.getUpperLeftColumn();
          i13 = localShape.getLeft();
          if (((i10 > j) || ((i10 == j) && (i11 >= k))) && ((i12 > m) || ((i12 == m) && (i13 >= n))))
          {
            i = localShape.getPlacement();
            localShape.setPlacement(2);
            int i14 = localShape.getLowerRightRow();
            int i15 = localShape.getBottom();
            int i16 = localShape.getLowerRightColumn();
            int i17 = localShape.getRight();
            if (((i14 < i1) || ((i14 == i1) && (i15 <= i2))) && ((i16 < i3) || ((i16 == i3) && (i17 <= i4)))) {
              i9 = 1;
            }
            localShape.setPlacement(i);
          }
          break;
        }
        if (i9 != 0)
        {
          zf.a(localArrayList, localShape);
          if (localShape.isGroup()) {
            zf.b(localArrayList, ((GroupShape)localShape).getGroupedShapes());
          }
        }
      }
    }
    return localArrayList;
  }
  
  void a(GroupBox paramGroupBox, CopyOptions paramCopyOptions)
  {
    super.a(paramGroupBox, paramCopyOptions);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/GroupBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */