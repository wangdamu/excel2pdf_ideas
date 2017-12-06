package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class GroupShape
  extends Shape
{
  private ArrayList a = new ArrayList();
  private zbrf b;
  private int c;
  
  GroupShape(ShapeCollection shapes)
  {
    super(shapes, 0, shapes);
    R().j().d(513);
    this.b = new zbrf();
  }
  
  zbrf a()
  {
    return this.b;
  }
  
  void a(zbrf paramzbrf)
  {
    this.b = paramzbrf;
  }
  
  int b()
  {
    return this.c;
  }
  
  void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  int c()
  {
    int i = X() - 8;
    if (!isGroup()) {
      return i;
    }
    if ((this.a != null) && (this.a.size() != 0))
    {
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
      {
        Shape localShape = (Shape)localIterator.next();
        if (localShape.isGroup()) {
          i += ((GroupShape)localShape).c() + 8;
        } else {
          i += localShape.X();
        }
      }
    }
    return i;
  }
  
  public Shape get(int index)
  {
    return (Shape)this.a.get(index);
  }
  
  ArrayList d()
  {
    return this.a;
  }
  
  public Shape[] getGroupedShapes()
  {
    if (this.a == null) {
      return null;
    }
    Shape[] arrayOfShape = new Shape[this.a.size()];
    for (int i = 0; i < this.a.size(); i++) {
      arrayOfShape[i] = ((Shape)this.a.get(i));
    }
    return arrayOfShape;
  }
  
  void e()
  {
    this.a = null;
  }
  
  void f()
  {
    this.a = new ArrayList();
  }
  
  void a(Shape paramShape)
  {
    paramShape.a(this);
    paramShape.R().j().b(true);
    zf.a(this.a, paramShape);
  }
  
  void a(GroupShape paramGroupShape, CopyOptions paramCopyOptions)
  {
    super.a(paramGroupShape, paramCopyOptions);
    if (paramGroupShape.b != null)
    {
      this.b = new zbrf();
      this.b.a(paramGroupShape.b);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/GroupShape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */