package com.aspose.cells;

import com.aspose.cells.b.c.a.za;

class zwm
{
  private static final za a = new za(new String[] { "SUM", "COLUMN", "COLUMNS", "COUNT", "COUNTA", "OFFSET", "ROW", "ROWS", "INDEX", "SUMPRODUCT", "LOGEST", "CORREL", "MCORRELS", "REGRESSN", "PEARSON", "RSQ", "FREQUENCY", "FORECAST", "LINEST" });
  
  static Object[][] a(zwr paramzwr, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object[][] arrayOfObject = new Object[paramInt3 - paramInt1 + 1][];
    if ((paramzwr == null) || (!paramzwr.c()))
    {
      for (i = 0; i <= paramInt3 - paramInt1; i++) {
        arrayOfObject[i] = new Object[paramInt4 - paramInt2 + 1];
      }
      return arrayOfObject;
    }
    for (int i = paramInt1; i <= paramInt3; i++)
    {
      zwn localzwn = paramzwr.a(i);
      if (localzwn != null) {
        arrayOfObject[(i - paramInt1)] = localzwn.d(paramInt2, paramInt4);
      }
    }
    for (i = 0; i <= paramInt3 - paramInt1; i++) {
      if (arrayOfObject[i] == null) {
        arrayOfObject[i] = new Object[paramInt4 - paramInt2 + 1];
      }
    }
    return arrayOfObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zwm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */