package com.aspose.cells;

class zlt
  implements zahp
{
  private int a;
  private int b = -1;
  private int[] c;
  
  zlt(Cells paramCells, int paramInt)
  {
    ColumnCollection localColumnCollection = paramCells.getColumns();
    Column localColumn1 = paramCells.getColumns().a;
    if ((localColumn1 != null) && (localColumn1.e()))
    {
      this.a = localColumn1.getIndex();
      this.b = localColumn1.c();
    }
    else
    {
      this.a = (paramInt + 1);
    }
    int i = localColumnCollection.getCount();
    if (i > 0)
    {
      i = Math.min(localColumnCollection.getColumnByIndex(i - 1).getIndex(), paramInt) + 1;
      this.c = new int[i];
      for (int j = 0; j < this.c.length; j++) {
        if (j < this.a) {
          this.c[j] = 15;
        } else {
          this.c[j] = this.b;
        }
      }
      for (j = localColumnCollection.getCount() - 1; j > -1; j--)
      {
        Column localColumn2 = localColumnCollection.getColumnByIndex(j);
        if (localColumn2.getIndex() < i) {
          break;
        }
      }
      j++;
      for (int k = 0; k < j; k++)
      {
        Column localColumn3 = localColumnCollection.getColumnByIndex(k);
        if (localColumn3.c() != -1) {
          this.c[localColumn3.getIndex()] = localColumn3.c();
        }
      }
    }
  }
  
  public int a(int paramInt)
  {
    if ((this.c != null) && (paramInt < this.c.length)) {
      return this.c[paramInt];
    }
    if (paramInt >= this.a) {
      return this.b;
    }
    return -1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zlt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */