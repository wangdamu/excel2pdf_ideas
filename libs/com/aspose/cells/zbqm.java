package com.aspose.cells;

import com.aspose.cells.b.a.zo;
import java.util.Comparator;

class zbqm
  implements Comparator
{
  private zrr a;
  private Cells b;
  
  zbqm(zrr paramzrr, Cells paramCells)
  {
    this.a = paramzrr;
    this.b = paramCells;
  }
  
  public int compare(Object x, Object y)
  {
    int i = this.a.b() == 0 ? 1 : 0;
    switch (this.a.d())
    {
    case 0: 
      zbqn localzbqn1 = (zbqn)x;
      zbqn localzbqn2 = (zbqn)y;
      if (localzbqn2.d > 0)
      {
        if (localzbqn1.d == localzbqn2.d) {
          return 0;
        }
        if (localzbqn1.d < 0) {
          return i != 0 ? 1 : -1;
        }
        if (localzbqn1.d < localzbqn2.d) {
          return i != 0 ? -1 : 1;
        }
        return i != 0 ? 1 : -1;
      }
      if (localzbqn1.d > 0) {
        return i != 0 ? -1 : 1;
      }
      if (localzbqn1.c == localzbqn2.c)
      {
        switch (localzbqn1.a)
        {
        case 0: 
          if ((Boolean)localzbqn1.b == (Boolean)localzbqn2.b) {
            return 0;
          }
          if (((Boolean)localzbqn1.b).booleanValue()) {
            return i != 0 ? 1 : -1;
          }
          return i != 0 ? -1 : 1;
        case 4: 
          return i != 0 ? zo.a(((Double)localzbqn1.b).doubleValue(), ((Double)localzbqn2.b).doubleValue()) : zo.a(((Double)localzbqn2.b).doubleValue(), ((Double)localzbqn1.b).doubleValue());
        case 5: 
          return i != 0 ? ((String)localzbqn1.b).compareTo((String)localzbqn2.b) : ((String)localzbqn2.b).compareTo((String)localzbqn1.b);
        case 2: 
          return 0;
        }
      }
      else
      {
        if (localzbqn1.c < localzbqn2.c) {
          return i != 0 ? -1 : 1;
        }
        return i != 0 ? 1 : -1;
      }
      break;
    default: 
      return 0;
    }
    return 0;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbqm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */