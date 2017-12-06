package com.aspose.cells;

import com.aspose.cells.b.a.zs;
import com.aspose.cells.b.a.zw;

class zbtg
{
  private CellArea a;
  private int b;
  private int[] c;
  private boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private int h;
  private int i;
  private Cells j;
  private RowCollection k;
  private int l;
  private String[] m;
  private String n = "Total";
  private String o = "Grand Total";
  
  zbtg(Cells paramCells)
  {
    this.j = paramCells;
    this.k = paramCells.getRows();
    this.g = true;
  }
  
  void a(CellArea paramCellArea, int paramInt1, int paramInt2, int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.a = paramCellArea;
    this.i = paramInt1;
    this.b = paramInt2;
    this.c = paramArrayOfInt;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramBoolean3;
    GlobalizationSettings localGlobalizationSettings = this.j.p().p().getSettings().getGlobalizationSettings();
    this.n = localGlobalizationSettings.getTotalName(paramInt2);
    this.o = localGlobalizationSettings.getGrandTotalName(paramInt2);
    this.l = (paramCellArea.StartColumn + paramInt1);
    int i1 = 0;
    for (int i2 = paramArrayOfInt.length - 1; i2 >= 0; i2--) {
      if (paramArrayOfInt[i2] == paramInt1) {
        i1 = 1;
      }
    }
    if (i1 != 0)
    {
      i1 = 0;
      for (i2 = paramInt1 - 1; i2 >= 0; i2--)
      {
        i1 = 1;
        for (int i3 = paramArrayOfInt.length - 1; i3 >= 0; i3--) {
          if (paramArrayOfInt[i3] == i2)
          {
            i1 = 0;
            break;
          }
        }
        if (i1 != 0)
        {
          this.l = (paramCellArea.StartColumn + i2);
          break;
        }
      }
      if (i1 == 0)
      {
        this.l = paramCellArea.StartColumn;
        this.j.insertColumn(paramCellArea.StartColumn);
        paramCellArea.StartColumn += 1;
        paramCellArea.EndColumn += 1;
      }
    }
    this.m = new String[paramArrayOfInt.length];
    for (i2 = 0; i2 < paramArrayOfInt.length; i2++)
    {
      this.m[i2] = CellsHelper.columnIndexToName(paramArrayOfInt[i2] + paramCellArea.StartColumn);
      paramArrayOfInt[i2] += paramCellArea.StartColumn;
    }
    this.h = paramCellArea.StartRow;
    for (this.h = paramCellArea.StartRow; this.h <= paramCellArea.EndRow; this.h += 1)
    {
      i2 = this.j.b().a(this.h + 1);
      if (i2 != -1) {
        this.j.b().removeAt(i2);
      }
    }
    this.i = (paramCellArea.StartColumn + paramInt1);
    if (paramBoolean1)
    {
      i2 = 0;
      int i5;
      Object localObject;
      for (this.h = paramCellArea.StartRow; this.h <= paramCellArea.EndRow; this.h += 1)
      {
        Row localRow = this.k.a(this.h, true, false, false);
        if (localRow != null)
        {
          if (localRow.i() != 0)
          {
            localRow.a((byte)0);
            i2 = 1;
          }
          for (i5 = 0; i5 < paramArrayOfInt.length; i5++)
          {
            localObject = localRow.getCellOrNull(paramArrayOfInt[i5]);
            if ((localObject != null) && (((Cell)localObject).g()) && (((Cell)localObject).getFormula().startsWith("=SUBTOTAL(")))
            {
              this.j.deleteRow(this.h--);
              paramCellArea.EndRow -= 1;
              break;
            }
          }
        }
      }
      if (i2 != 0)
      {
        int i4 = 0;
        for (i5 = 0; i5 < this.k.getCount(); i5++)
        {
          localObject = this.k.getRowByIndex(i5);
          if (((Row)localObject).getIndex() >= paramCellArea.StartRow)
          {
            if (((Row)localObject).getIndex() > paramCellArea.EndRow) {
              break;
            }
            if ((((Row)localObject).i() & 0xFF) > i4) {
              i4 = ((Row)localObject).i() & 0xFF;
            }
          }
        }
        this.j.c((byte)i4);
      }
    }
    else if (b(paramCellArea.StartRow))
    {
      paramBoolean3 = false;
    }
    if (paramBoolean3) {
      b();
    } else {
      c();
    }
  }
  
  private boolean a(Row paramRow)
  {
    for (int i1 = this.a.StartColumn; i1 <= this.a.EndColumn; i1++)
    {
      Cell localCell = paramRow.getCellOrNull(i1);
      if ((localCell != null) && (localCell.g()) && (localCell.getFormula().startsWith("=SUBTOTAL("))) {
        return true;
      }
    }
    return false;
  }
  
  private boolean b(int paramInt)
  {
    Row localRow = this.j.getRows().a(paramInt, true, false, false);
    if (localRow == null) {
      return false;
    }
    for (int i1 = this.a.StartColumn; i1 <= this.a.EndColumn; i1++)
    {
      Cell localCell = localRow.getCellOrNull(i1);
      if ((localCell != null) && (localCell.g()) && (localCell.getFormula().startsWith("=SUBTOTAL("))) {
        return true;
      }
    }
    return false;
  }
  
  private void a()
  {
    for (this.h = this.a.EndRow; this.h >= this.a.StartRow; this.h -= 1)
    {
      boolean bool = b(this.h);
      if (bool)
      {
        this.j.deleteRow(this.h);
        this.a.EndRow -= 1;
      }
    }
  }
  
  private void b()
  {
    int i1 = 0;
    int i2 = -1;
    Object localObject1 = "";
    int i3 = -1;
    boolean bool1 = a(this.b);
    int i4 = ztt.i(this.b);
    String str1 = "=SUBTOTAL(" + i4 + ",";
    Cell localCell1 = null;
    Style localStyle = new Style(this.j.p());
    localStyle.getFont().setBold(true);
    localStyle.setTextWrapped(true);
    int i5 = this.j.p().a(localStyle);
    if (this.d) {
      a();
    }
    int i6 = 0;
    int[] arrayOfInt = null;
    for (this.h = this.a.StartRow; this.h <= this.a.EndRow; this.h += 1)
    {
      i6 = 0;
      Row localRow = this.k.a(this.h, true, false, false);
      if (localRow != null)
      {
        int i8 = 0;
        boolean bool2 = a(localRow);
        String str2 = "";
        if (bool2)
        {
          i8 = 1;
        }
        else
        {
          Cell localCell3 = localRow.getCellOrNull(this.i);
          if ((localCell3 != null) && (localCell3.getType() != 3)) {
            str2 = localCell3.k();
          }
          if ("".equals(str2))
          {
            if ((i3 == -1) || ("".equals(localObject1))) {
              continue;
            }
            i8 = 1;
          }
          else
          {
            if (i3 == -1)
            {
              if ("".equals(str2)) {
                continue;
              }
              localObject1 = str2;
              i3 = this.h;
              continue;
            }
            if (zw.a(str2, (String)localObject1, true) == 0)
            {
              localObject1 = str2;
              continue;
            }
            i8 = 1;
          }
        }
        if (i8 != 0)
        {
          int i9;
          Object localObject2;
          if ((!"".equals(localObject1)) && (i3 != -1))
          {
            this.j.insertRow(this.h);
            this.a.EndRow += 1;
            for (i9 = 0; i9 < this.c.length; i9++)
            {
              localObject2 = new StringBuilder(str1);
              ((StringBuilder)localObject2).append(this.m[i9]);
              ((StringBuilder)localObject2).append(i3 + 1);
              ((StringBuilder)localObject2).append(':');
              ((StringBuilder)localObject2).append(this.m[i9]);
              ((StringBuilder)localObject2).append(this.h);
              ((StringBuilder)localObject2).append(')');
              Cell localCell4 = this.j.a(this.h, this.c[i9], false);
              localCell4.setFormula(zs.a(localObject2));
              a(bool1, localCell4);
            }
            localCell1 = this.j.a(this.h, this.l, false);
            localCell1.putValue((String)localObject1 + " " + this.n);
            localCell1.b(i5);
            if (this.g) {
              if (i2 != -1) {
                this.j.groupRows(i3, i2 - 1, false);
              } else if ((i3 != -1) && (i3 < this.h)) {
                this.j.groupRows(i3, this.h - 1, false);
              }
            }
            i2 = -1;
            if ((this.e) && (i1 == 0)) {
              this.j.b().add(this.h + 1, 0);
            }
            localObject1 = str2;
            this.h += 1;
          }
          if (bool2)
          {
            arrayOfInt = new int[this.c.length];
            for (i9 = 0; i9 < this.c.length; i9++)
            {
              localObject2 = this.j.get(this.h - 1, this.c[i9]);
              arrayOfInt[i9] = ((Cell)localObject2).s();
            }
            i6 = 1;
            for (this.h += 1; this.h <= this.a.EndRow; this.h += 1)
            {
              localRow = this.k.a(this.h, true, false, false);
              if ((localRow == null) || (!a(localRow))) {
                break;
              }
              i6++;
            }
            if (this.h > this.a.EndRow)
            {
              i1 = 1;
              this.h -= i6 / 2;
              break;
            }
            this.h -= 1;
            i3 = -1;
          }
          else if (!"".equals(str2))
          {
            i3 = this.h;
          }
        }
      }
    }
    StringBuilder localStringBuilder;
    Cell localCell2;
    if ((i1 == 0) && (i3 != -1) && (!"".equals(localObject1)))
    {
      this.j.insertRows(this.h, 1);
      localCell1 = this.j.a(this.h, this.l, false);
      localCell1.putValue((String)localObject1 + " " + this.n);
      localCell1.b(i5);
      if (this.g) {
        this.j.groupRows(i3, this.h - 1, false);
      }
      for (i7 = 0; i7 < this.c.length; i7++)
      {
        localStringBuilder = new StringBuilder(str1);
        localStringBuilder.append(this.m[i7]);
        localStringBuilder.append(i3 + 1);
        localStringBuilder.append(':');
        localStringBuilder.append(this.m[i7]);
        localStringBuilder.append(this.h);
        localStringBuilder.append(')');
        localCell2 = this.j.a(this.h, this.c[i7], false);
        localCell2.setFormula(zs.a(localStringBuilder));
        a(bool1, localCell2);
      }
      this.h += 1;
    }
    this.j.insertRows(this.h, 1);
    localCell1 = this.j.a(this.h, this.l, false);
    localCell1.putValue(this.o);
    localCell1.b(i5);
    for (int i7 = 0; i7 < this.c.length; i7++)
    {
      localStringBuilder = new StringBuilder(str1);
      localStringBuilder.append(this.m[i7]);
      localStringBuilder.append(this.a.StartRow + 1);
      localStringBuilder.append(':');
      localStringBuilder.append(this.m[i7]);
      localStringBuilder.append(this.h - i6 / 2 - 1);
      localStringBuilder.append(')');
      localCell2 = this.j.a(this.h, this.c[i7], false);
      localCell2.setFormula(zs.a(localStringBuilder));
      a(bool1, localCell2);
      if (arrayOfInt != null) {
        localCell2.b(arrayOfInt[i7]);
      }
    }
    if ((this.g) && (i1 == 0)) {
      this.j.groupRows(this.a.StartRow, this.h - 1, false);
    }
    this.j.b().add(this.h + 1, 0);
  }
  
  private void c()
  {
    int i1 = 0;
    int i2 = -1;
    Object localObject1 = "";
    int i3 = -1;
    int i4 = ztt.i(this.b);
    String str = "=SUBTOTAL(" + i4 + ",";
    Cell localCell1 = null;
    Style localStyle = new Style(this.j.p());
    localStyle.getFont().setBold(true);
    localStyle.setTextWrapped(true);
    int i5 = this.j.p().a(localStyle);
    Object localObject2;
    for (this.h = this.a.EndRow; this.h >= this.a.StartRow; this.h -= 1)
    {
      Cell localCell2 = this.j.getRows().a(this.h, this.i, true, false, false);
      if ((localCell2 != null) && (localCell2.getType() != 3))
      {
        localObject2 = localCell2.k();
        if (i3 == -1)
        {
          localObject1 = localObject2;
          i3 = this.h < this.a.EndRow ? this.a.EndRow : this.h;
        }
        else if (!zw.b((String)localObject2, (String)localObject1))
        {
          if (!this.d)
          {
            Row localRow = this.j.getRows().a(this.h, true, false, false);
            i8 = 0;
            for (int i9 = 0; i9 < this.c.length; i9++)
            {
              localCell2 = localRow.getCellOrNull(this.c[i9]);
              if ((localCell2 != null) && (localCell2.g()) && (localCell2.getFormula().startsWith("=SUBTOTAL(")))
              {
                i8 = 1;
                break;
              }
            }
            if (i8 != 0)
            {
              if (i2 == -1) {
                i2 = this.h;
              }
              if ((this.f) || (this.h != this.a.StartRow)) {
                continue;
              }
              i1 = 1;
            }
          }
          int i7 = this.h + 1;
          i3++;
          this.j.insertRow(i7);
          this.a.EndRow += 1;
          for (int i8 = 0; i8 < this.c.length; i8++)
          {
            StringBuilder localStringBuilder = new StringBuilder(str);
            localStringBuilder.append(this.m[i8]);
            localStringBuilder.append(i7 + 2);
            localStringBuilder.append(':');
            localStringBuilder.append(this.m[i8]);
            localStringBuilder.append(i3 + 1);
            localStringBuilder.append(')');
            this.j.a(i7, this.c[i8], false).setFormula(zs.a(localStringBuilder));
          }
          localCell1 = this.j.a(i7, this.l, false);
          localCell1.putValue((String)localObject1 + " " + this.n);
          localCell1.b(i5);
          if (this.g) {
            if (i2 != -1) {
              this.j.groupRows(i2 + 2, i3, false);
            } else {
              this.j.groupRows(i7 + 1, i3, false);
            }
          }
          i2 = -1;
          if ((this.e) && (i1 == 0)) {
            this.j.b().add(i3 + 1, 0);
          }
          localObject1 = localObject2;
          i3 = this.h;
          if (i1 != 0) {
            break;
          }
        }
      }
    }
    this.h += 1;
    if (i1 == 0)
    {
      i3++;
      this.j.insertRows(this.h, 1);
      this.a.EndRow += 1;
      localCell1 = this.j.a(this.h, this.l, false);
      localCell1.putValue((String)localObject1 + " " + this.n);
      localCell1.b(i5);
      if (this.g) {
        this.j.groupRows(this.h + 1, i3, false);
      }
      for (int i6 = 0; i6 < this.c.length; i6++)
      {
        localObject2 = new StringBuilder(str);
        ((StringBuilder)localObject2).append(this.m[i6]);
        ((StringBuilder)localObject2).append(this.h + 2);
        ((StringBuilder)localObject2).append(':');
        ((StringBuilder)localObject2).append(this.m[i6]);
        ((StringBuilder)localObject2).append(i3 + 1);
        ((StringBuilder)localObject2).append(')');
        this.j.a(this.h, this.c[i6], false).setFormula(zs.a(localObject2));
      }
      if (this.d)
      {
        this.j.insertRows(this.h, 1);
        this.a.EndRow += 1;
        localCell1 = this.j.a(this.h, this.l, false);
        localCell1.putValue(this.o);
        localCell1.b(i5);
        for (i6 = 0; i6 < this.c.length; i6++)
        {
          localObject2 = new StringBuilder(str);
          ((StringBuilder)localObject2).append(this.m[i6]);
          ((StringBuilder)localObject2).append(this.a.StartRow + 2);
          ((StringBuilder)localObject2).append(':');
          ((StringBuilder)localObject2).append(this.m[i6]);
          ((StringBuilder)localObject2).append(this.a.EndRow + 1);
          ((StringBuilder)localObject2).append(')');
          this.j.a(this.h, this.c[i6], false).setFormula(zs.a(localObject2));
        }
      }
    }
    if (this.g) {
      this.j.groupRows(this.a.StartRow + 1, this.a.EndRow, false);
    }
    this.j.b().add(i3 + 1, 0);
  }
  
  private void a(boolean paramBoolean, Cell paramCell)
  {
    if (paramBoolean)
    {
      Style localStyle = paramCell.o();
      localStyle.setNumber(0);
      localStyle.b(null);
      paramCell.a(localStyle);
    }
  }
  
  static boolean a(int paramInt)
  {
    switch (paramInt)
    {
    case 1: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      return true;
    }
    return false;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zbtg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */