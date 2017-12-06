package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class PaneCollection
{
  private Worksheet b;
  boolean a = false;
  private byte c = 3;
  private int d;
  private short e;
  private int f;
  private int g;
  
  PaneCollection(Worksheet sheet)
  {
    this.b = sheet;
  }
  
  public int getFirstVisibleRowOfBottomPane()
  {
    return this.d;
  }
  
  public void setFirstVisibleRowOfBottomPane(int value)
  {
    this.d = value;
  }
  
  public int getFirstVisibleColumnOfRightPane()
  {
    return this.e;
  }
  
  public void setFirstVisibleColumnOfRightPane(int value)
  {
    this.e = ((short)value);
  }
  
  public int getAcitvePaneType()
  {
    if (this.g == 0)
    {
      if (this.f == 0) {
        return 3;
      }
      switch (this.c)
      {
      case 2: 
        return 0;
      }
      return 6;
    }
    if (this.f == 0)
    {
      switch (this.c)
      {
      case 1: 
        return 5;
      }
      return 4;
    }
    switch (this.c)
    {
    case 1: 
      return 8;
    case 2: 
      return 1;
    case 0: 
      return 2;
    }
    return 7;
  }
  
  public void setAcitvePaneType(int value)
  {
    if (this.g == 0)
    {
      if (this.f == 0) {
        this.c = 3;
      } else {
        switch (value)
        {
        case 6: 
          this.c = 3;
          break;
        case 0: 
          this.c = 2;
          break;
        }
      }
    }
    else if (this.f == 0) {
      switch (value)
      {
      case 4: 
        this.c = 3;
        break;
      case 5: 
        this.c = 1;
        break;
      }
    } else {
      switch (value)
      {
      case 7: 
        this.c = 3;
        break;
      case 8: 
        this.c = 1;
        break;
      case 1: 
        this.c = 2;
        break;
      case 2: 
        this.c = 0;
        break;
      }
    }
  }
  
  byte a()
  {
    return this.c;
  }
  
  void a(byte paramByte)
  {
    this.c = paramByte;
  }
  
  void a(int paramInt1, int paramInt2)
  {
    if ((this.e <= paramInt1) || ((this.g <= 1) && (paramInt2 < 0))) {
      return;
    }
    int i = this.b.getFirstVisibleColumn();
    if ((paramInt1 >= i) && (paramInt1 < i + this.g))
    {
      int j = this.g + paramInt2;
      if (j <= 0)
      {
        paramInt2 = -this.g + 1;
        this.g = 1;
      }
      else
      {
        this.g = j;
      }
      zbew localzbew = this.b.t();
      int k = 0;
      this.e = ((short)(this.e + (short)paramInt2));
      for (int m = 0; m < localzbew.size(); m++)
      {
        zbev localzbev = (zbev)localzbew.get(m);
        for (int n = 0; n < localzbev.b().size(); n++)
        {
          k = 0;
          CellArea localCellArea = (CellArea)localzbev.b().get(n);
          boolean[] arrayOfBoolean = { k };
          localCellArea = zban.b(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
          k = arrayOfBoolean[0];
          if (k == 0) {
            localzbev.b().set(n, localCellArea);
          }
        }
        if (localzbev.d() >= paramInt1)
        {
          localzbev.b(localzbev.d() + paramInt2);
          if (localzbev.d() < 0) {
            localzbev.b(0);
          }
        }
      }
    }
  }
  
  void b(int paramInt1, int paramInt2)
  {
    if ((this.d <= paramInt1) || ((this.f <= 1) && (paramInt2 < 0))) {
      return;
    }
    int i = this.b.getFirstVisibleRow();
    int j = 0;
    if ((paramInt1 >= i) && (paramInt1 < i + this.f))
    {
      int k = this.f + paramInt2;
      if (k <= 0)
      {
        paramInt2 = -this.f + 1;
        this.f = 1;
      }
      else
      {
        this.f = k;
      }
      this.d += paramInt2;
      zbew localzbew = this.b.t();
      int m = 0;
      for (int n = 0; n < localzbew.size(); n++)
      {
        zbev localzbev = (zbev)localzbew.get(n);
        for (int i1 = 0; i1 < localzbev.b().size(); i1++)
        {
          m = 0;
          CellArea localCellArea = (CellArea)localzbev.b().get(i1);
          boolean[] arrayOfBoolean = { m };
          localCellArea = zban.a(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
          m = arrayOfBoolean[0];
          if (m == 0) {
            localzbev.b().set(i1, localCellArea);
          } else {
            localzbev.b().remove(i1--);
          }
        }
        if (localzbev.b().size() == 0)
        {
          j = 1;
          break;
        }
        if (localzbev.c() >= paramInt1)
        {
          localzbev.a(localzbev.c() + paramInt2);
          if (localzbev.c() < paramInt1) {
            localzbev.a(paramInt1);
          }
        }
      }
    }
    if (j != 0) {
      this.b.freezePanes(this.d, this.e, this.f, this.g);
    }
  }
  
  void a(PaneCollection paramPaneCollection)
  {
    this.d = paramPaneCollection.d;
    this.e = paramPaneCollection.e;
    this.f = paramPaneCollection.f;
    this.g = paramPaneCollection.g;
    this.c = paramPaneCollection.c;
  }
  
  int b()
  {
    return this.d;
  }
  
  void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  int c()
  {
    return this.e;
  }
  
  void b(int paramInt)
  {
    this.e = ((short)paramInt);
  }
  
  int d()
  {
    return this.f;
  }
  
  void c(int paramInt)
  {
    this.f = paramInt;
  }
  
  int e()
  {
    return this.g;
  }
  
  void d(int paramInt)
  {
    this.g = paramInt;
  }
  
  void a(String paramString)
  {
    int i = 0;
    int j = 0;
    int[] arrayOfInt1 = { i };
    int[] arrayOfInt2 = { j };
    CellsHelper.a(paramString, arrayOfInt1, arrayOfInt2);
    i = arrayOfInt1[0];
    j = arrayOfInt2[0];
    Cells localCells;
    int k;
    if (i == 0)
    {
      if (j == 0)
      {
        this.g = 8070;
        this.f = 4275;
        this.d = 15;
        this.e = 8;
      }
      else
      {
        this.f = 0;
        if (j < 8)
        {
          localCells = this.b.getCells();
          for (k = 0; k < j; k++) {
            this.g += localCells.getColumnWidthPixel(k);
          }
          this.g = ((int)(this.g * 72.0F * 20.0F / zbxp.a() + 0.5D));
        }
        this.e = ((short)j);
        this.d = 0;
      }
    }
    else if (j == 0)
    {
      this.g = 0;
      if (i < 15)
      {
        localCells = this.b.getCells();
        for (k = 0; k < i; k++) {
          this.f += (int)(localCells.getRowHeight(k) * 20.0D + 0.5D);
        }
      }
      else
      {
        this.f = 4275;
      }
      this.d = i;
      this.e = 0;
    }
    else
    {
      if (i < 15)
      {
        localCells = this.b.getCells();
        for (k = 0; k < i; k++) {
          this.f += (int)(localCells.getRowHeight(k) * 20.0D + 0.5D);
        }
      }
      else
      {
        this.f = 4275;
      }
      if (j < 8)
      {
        localCells = this.b.getCells();
        for (k = 0; k < j; k++) {
          this.g += localCells.getColumnWidthPixel(k);
        }
        this.g = ((int)(this.g * 72.0F * 20.0F / zbxp.a() + 0.5D));
      }
      else
      {
        this.g = 8070;
      }
      this.d = i;
      this.e = ((short)j);
    }
    this.b.setFirstVisibleRow(i - 15 > 0 ? i - 15 : 0);
    this.b.setFirstVisibleColumn(j - 8 > 0 ? j - 8 : 0);
    f();
  }
  
  void f()
  {
    zbew localzbew = new zbew(this.b);
    this.b.a(localzbew);
    zbev localzbev = null;
    if (this.d == 0)
    {
      localzbev = new zbev(3);
      localzbev.a(this.b.getFirstVisibleRow(), this.b.getFirstVisibleColumn());
      zf.a(localzbew, localzbev);
      localzbev = new zbev(1);
      this.c = 1;
      localzbev.a(this.d, this.e);
      zf.a(localzbew, localzbev);
    }
    else if (this.e == 0)
    {
      localzbev = new zbev(3);
      localzbev.a(this.b.getFirstVisibleRow(), this.b.getFirstVisibleColumn());
      zf.a(localzbew, localzbev);
      localzbev = new zbev(2);
      this.c = 2;
      localzbev.a(this.d, this.e);
      zf.a(localzbew, localzbev);
    }
    else
    {
      localzbev = new zbev(3);
      localzbev.a(this.b.getFirstVisibleRow(), this.b.getFirstVisibleColumn());
      zf.a(localzbew, localzbev);
      localzbev = new zbev(2);
      localzbev.a(this.d, this.b.getFirstVisibleColumn());
      zf.a(localzbew, localzbev);
      localzbev = new zbev(1);
      localzbev.a(this.b.getFirstVisibleRow(), this.e);
      zf.a(localzbew, localzbev);
      localzbev = new zbev(0);
      this.c = 0;
      localzbev.a(this.d, this.e);
      zf.a(localzbew, localzbev);
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.f = paramInt1;
    this.g = paramInt2;
    this.d = paramInt3;
    this.e = ((short)paramInt4);
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.f = paramInt3;
    this.g = paramInt4;
    this.d = paramInt1;
    this.e = ((short)paramInt2);
  }
  
  void c(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt3 == 0) {
      paramInt1 = 0;
    }
    if (paramInt4 == 0) {
      paramInt2 = 0;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      throw new IllegalArgumentException();
    }
    this.d = paramInt1;
    this.e = ((short)paramInt2);
    this.f = paramInt3;
    this.g = paramInt4;
    int i = 0;
    int j = 0;
    if (paramInt1 == 0)
    {
      this.c = 1;
      this.f = 0;
      i = 0;
      if (paramInt4 > paramInt2)
      {
        this.g = paramInt2;
        j = 0;
      }
      else
      {
        j = paramInt2 - paramInt4;
      }
    }
    else if (paramInt2 == 0)
    {
      j = 0;
      this.c = 2;
      this.g = 0;
      if (paramInt3 > paramInt1)
      {
        this.f = paramInt1;
        i = 0;
      }
      else
      {
        i = paramInt1 - paramInt3;
      }
    }
    else
    {
      this.c = 0;
      if (paramInt4 > paramInt2)
      {
        this.g = paramInt2;
        j = 0;
      }
      else
      {
        j = paramInt2 - paramInt4;
      }
      if (paramInt3 > paramInt1)
      {
        this.f = paramInt1;
        i = 0;
      }
      else
      {
        i = paramInt1 - paramInt3;
      }
    }
    Cells localCells = this.b.getCells();
    int k;
    Object localObject;
    if (i != 0) {
      while (i >= 0)
      {
        k = localCells.getRows().d(i);
        if (k == -1) {
          break;
        }
        localObject = localCells.getRows().getRowByIndex(k);
        if (!((Row)localObject).isHidden()) {
          break;
        }
        i--;
      }
    }
    if (j != 0)
    {
      while (j >= 0)
      {
        k = localCells.getColumns().e(j);
        if (k <= -1) {
          break;
        }
        localObject = localCells.getColumns().getColumnByIndex(k);
        if (!((Column)localObject).isHidden()) {
          break;
        }
        j--;
      }
      if (j < 0) {
        j = 0;
      }
    }
    this.b.setFirstVisibleRow(i);
    this.b.setFirstVisibleColumn(j);
    f();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PaneCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */