package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import com.aspose.cells.b.a.zs;
import java.util.ArrayList;

public class Validation
{
  boolean a = false;
  ArrayList b = new ArrayList();
  byte[] c;
  byte[] d;
  ValidationCollection e;
  private boolean f = true;
  private int g = 6;
  private int h = 1;
  private int i = 0;
  private String j;
  private String k;
  private String l;
  private String m;
  private boolean n = true;
  private boolean o = true;
  private boolean p = true;
  private boolean q = true;
  private int r = 0;
  
  Validation(ValidationCollection dvs)
  {
    this.e = dvs;
  }
  
  boolean a()
  {
    return this.f;
  }
  
  public int getOperator()
  {
    return this.g;
  }
  
  public void setOperator(int value)
  {
    this.g = value;
    if (this.g != 6) {
      this.f = false;
    }
  }
  
  public int getAlertStyle()
  {
    return this.h;
  }
  
  public void setAlertStyle(int value)
  {
    this.h = value;
    if (this.h != 1) {
      this.f = false;
    }
  }
  
  public int getType()
  {
    return this.i;
  }
  
  public void setType(int value)
  {
    this.i = value;
    if (this.i != 0) {
      this.f = false;
    }
  }
  
  public String getInputMessage()
  {
    return this.j;
  }
  
  public void setInputMessage(String value)
  {
    this.j = value;
    if ((this.j != null) && (!"".equals(this.j))) {
      this.f = false;
    }
  }
  
  public String getInputTitle()
  {
    return this.k;
  }
  
  public void setInputTitle(String value)
  {
    this.k = value;
    if ((this.k != null) && (!"".equals(this.k))) {
      this.f = false;
    }
  }
  
  public String getErrorMessage()
  {
    return this.l;
  }
  
  public void setErrorMessage(String value)
  {
    this.l = value;
    if ((this.l != null) && (!"".equals(this.l))) {
      this.f = false;
    }
  }
  
  public String getErrorTitle()
  {
    return this.m;
  }
  
  public void setErrorTitle(String value)
  {
    this.m = value;
    if ((this.m != null) && (!"".equals(this.m))) {
      this.f = false;
    }
  }
  
  public boolean getShowInput()
  {
    return this.n;
  }
  
  public void setShowInput(boolean value)
  {
    this.n = value;
    if (!value) {
      this.f = false;
    }
  }
  
  public boolean getShowError()
  {
    return this.o;
  }
  
  public void setShowError(boolean value)
  {
    this.o = value;
    if (!value) {
      this.f = false;
    }
  }
  
  public boolean getIgnoreBlank()
  {
    return this.p;
  }
  
  public void setIgnoreBlank(boolean value)
  {
    this.p = value;
    if (!value) {
      this.f = false;
    }
  }
  
  public String getFormula1()
  {
    return zbyi.a(this, this.c);
  }
  
  public void setFormula1(String value)
  {
    this.c = zbyi.b(this, value);
    this.f = false;
  }
  
  public String getFormula2()
  {
    return zbyi.a(this, this.d);
  }
  
  public void setFormula2(String value)
  {
    this.d = zbyi.b(this, value);
    this.f = false;
  }
  
  public Object getValue1()
  {
    byte[] arrayOfByte = this.c;
    if (arrayOfByte != null)
    {
      Object localObject = zbyi.a(this, this.e.a().c(), arrayOfByte, 0, getType());
      if (localObject != null) {
        return localObject;
      }
    }
    return getFormula1();
  }
  
  public void setValue1(Object value)
  {
    this.c = a(value);
    if (this.c == null) {
      setFormula1(zs.a(value));
    }
  }
  
  public Object getValue2()
  {
    byte[] arrayOfByte = this.d;
    if (arrayOfByte != null)
    {
      Object localObject = zbyi.a(this, this.e.a().c(), arrayOfByte, 0, getType());
      if (localObject != null) {
        return localObject;
      }
    }
    return getFormula2();
  }
  
  public void setValue2(Object value)
  {
    this.d = a(value);
    if (this.d == null) {
      setFormula2(zs.a(value));
    }
  }
  
  byte[] a(Object paramObject)
  {
    paramObject = zarb.a(paramObject, this.e.a().c().p().getSettings().getDate1904());
    double d1 = 0.0D;
    if (paramObject != null) {
      d1 = ((Double)paramObject).doubleValue();
    } else {
      return null;
    }
    byte[] arrayOfByte = null;
    switch (getType())
    {
    case 1: 
    case 2: 
    case 4: 
    case 5: 
    case 6: 
      if (Math.abs(d1 - (int)d1) < Double.MIN_VALUE)
      {
        int i1 = (int)d1;
        if ((i1 <= 65535) && (i1 >= 0))
        {
          arrayOfByte = new byte[3];
          arrayOfByte[0] = 30;
          System.arraycopy(zc.a(i1), 0, arrayOfByte, 1, 2);
        }
        else
        {
          arrayOfByte = new byte[9];
          arrayOfByte[0] = 31;
          System.arraycopy(zc.a(d1), 0, arrayOfByte, 1, 8);
        }
      }
      else
      {
        arrayOfByte = new byte[9];
        arrayOfByte[0] = 31;
        System.arraycopy(zc.a(d1), 0, arrayOfByte, 1, 8);
      }
      return arrayOfByte;
    }
    return null;
  }
  
  public boolean getInCellDropDown()
  {
    return this.q;
  }
  
  public void setInCellDropDown(boolean value)
  {
    this.q = value;
    if (!value) {
      this.f = false;
    }
  }
  
  int[] b()
  {
    if ((this.b == null) || (this.b.size() == 0)) {
      return null;
    }
    CellArea localCellArea = (CellArea)this.b.get(0);
    return new int[] { localCellArea.StartRow, localCellArea.StartColumn };
  }
  
  /**
   * @deprecated
   */
  public ArrayList getAreaList()
  {
    return this.b;
  }
  
  public CellArea[] getAreas()
  {
    if (this.b == null) {
      return null;
    }
    CellArea[] arrayOfCellArea = new CellArea[this.b.size()];
    for (int i1 = 0; i1 < this.b.size(); i1++) {
      arrayOfCellArea[i1] = ((CellArea)this.b.get(i1));
    }
    return arrayOfCellArea;
  }
  
  public void addArea(CellArea cellArea)
  {
    this.e.a(cellArea, this);
    String str1 = null;
    String str2 = null;
    if (this.b.size() == 0)
    {
      str1 = getFormula1();
      str2 = getFormula2();
    }
    zf.a(this.b, cellArea);
    if (str1 != null) {
      setFormula1(str1);
    }
    if (str2 != null) {
      setFormula2(str2);
    }
  }
  
  public void removeArea(CellArea cellArea)
  {
    if ((this.b == null) || (this.b.size() == 0)) {
      return;
    }
    for (int i1 = this.b.size() - 1; i1 >= 0; i1--)
    {
      CellArea localCellArea1 = (CellArea)this.b.get(i1);
      int i2 = 0;
      boolean[] arrayOfBoolean = { i2 };
      CellArea localCellArea2 = a(cellArea, localCellArea1, arrayOfBoolean);
      i2 = arrayOfBoolean[0];
      if (i2 == 0)
      {
        CellArea localCellArea3;
        if (localCellArea2.StartRow > localCellArea1.StartRow)
        {
          localCellArea3 = new CellArea();
          localCellArea3.StartRow = localCellArea1.StartRow;
          localCellArea3.EndRow = (localCellArea2.StartRow - 1);
          localCellArea3.StartColumn = localCellArea1.StartColumn;
          localCellArea3.EndColumn = localCellArea1.EndColumn;
          zf.a(this.b, localCellArea3);
        }
        if (localCellArea2.EndRow < localCellArea1.EndRow)
        {
          localCellArea3 = new CellArea();
          localCellArea3.StartRow = (localCellArea2.EndRow + 1);
          localCellArea3.EndRow = localCellArea1.EndRow;
          localCellArea3.StartColumn = localCellArea1.StartColumn;
          localCellArea3.EndColumn = localCellArea1.EndColumn;
          zf.a(this.b, localCellArea3);
        }
        localCellArea1.StartRow = localCellArea2.StartRow;
        localCellArea1.EndRow = localCellArea2.EndRow;
        if (localCellArea2.StartColumn > localCellArea1.StartColumn)
        {
          localCellArea3 = new CellArea();
          localCellArea3.StartRow = localCellArea1.StartRow;
          localCellArea3.EndRow = localCellArea1.EndRow;
          localCellArea3.StartColumn = localCellArea1.StartColumn;
          localCellArea3.EndColumn = (localCellArea2.StartColumn - 1);
          zf.a(this.b, localCellArea3);
        }
        if (localCellArea2.EndColumn < localCellArea1.EndColumn)
        {
          localCellArea3 = new CellArea();
          localCellArea3.StartRow = localCellArea1.StartRow;
          localCellArea3.EndRow = localCellArea1.EndRow;
          localCellArea3.StartColumn = (localCellArea2.EndColumn + 1);
          localCellArea3.EndColumn = localCellArea1.EndColumn;
          zf.a(this.b, localCellArea3);
        }
        this.b.remove(i1);
      }
    }
  }
  
  static CellArea a(CellArea paramCellArea1, CellArea paramCellArea2, boolean[] paramArrayOfBoolean)
  {
    CellArea localCellArea = new CellArea();
    localCellArea.StartRow = (paramCellArea1.StartRow < paramCellArea2.StartRow ? paramCellArea2.StartRow : paramCellArea1.StartRow);
    localCellArea.StartColumn = (paramCellArea1.StartColumn < paramCellArea2.StartColumn ? paramCellArea2.StartColumn : paramCellArea1.StartColumn);
    localCellArea.EndRow = (paramCellArea1.EndRow < paramCellArea2.EndRow ? paramCellArea1.EndRow : paramCellArea2.EndRow);
    localCellArea.EndColumn = (paramCellArea1.EndColumn < paramCellArea2.EndColumn ? paramCellArea1.EndColumn : paramCellArea2.EndColumn);
    paramArrayOfBoolean[0] = ((localCellArea.StartRow > localCellArea.EndRow) || (localCellArea.StartColumn > localCellArea.EndColumn) ? 1 : false);
    return localCellArea;
  }
  
  public void removeACell(int row, int column)
  {
    if ((this.b == null) || (this.b.size() == 0)) {
      return;
    }
    int i1 = this.b.size();
    for (int i2 = i1 - 1; i2 >= 0; i2--)
    {
      CellArea localCellArea1 = (CellArea)this.b.get(i2);
      if ((row >= localCellArea1.StartRow) && (row <= localCellArea1.EndRow) && (column >= localCellArea1.StartColumn) && (column <= localCellArea1.EndColumn))
      {
        CellArea localCellArea2;
        if (row > localCellArea1.StartRow)
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartRow = localCellArea1.StartRow;
          localCellArea2.EndRow = (row - 1);
          localCellArea2.StartColumn = localCellArea1.StartColumn;
          localCellArea2.EndColumn = localCellArea1.EndColumn;
          zf.a(this.b, localCellArea2);
        }
        if (row < localCellArea1.EndRow)
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartRow = (row + 1);
          localCellArea2.EndRow = localCellArea1.EndRow;
          localCellArea2.StartColumn = localCellArea1.StartColumn;
          localCellArea2.EndColumn = localCellArea1.EndColumn;
          zf.a(this.b, localCellArea2);
        }
        localCellArea1.StartRow = row;
        localCellArea1.EndRow = row;
        if (column > localCellArea1.StartColumn)
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartRow = row;
          localCellArea2.EndRow = row;
          localCellArea2.StartColumn = localCellArea1.StartColumn;
          localCellArea2.EndColumn = (column - 1);
          zf.a(this.b, localCellArea2);
        }
        if (column < localCellArea1.EndColumn)
        {
          localCellArea2 = new CellArea();
          localCellArea2.StartRow = row;
          localCellArea2.EndRow = row;
          localCellArea2.StartColumn = (column + 1);
          localCellArea2.EndColumn = localCellArea1.EndColumn;
          zf.a(this.b, localCellArea2);
        }
        this.b.remove(i2);
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    if ((this.b == null) || (this.b.size() == 0)) {
      return;
    }
    int i1 = 0;
    int[] arrayOfInt = b();
    if (arrayOfInt != null) {
      i1 = arrayOfInt[1];
    }
    int i2 = 1048575;
    int i3 = 0;
    for (int i4 = this.b.size() - 1; i4 >= 0; i4--)
    {
      CellArea localCellArea1 = (CellArea)this.b.get(i4);
      if ((localCellArea1.EndColumn + 1 == paramInt1) && (paramInt2 > 0))
      {
        localCellArea1.EndColumn += paramInt2;
        this.b.set(i4, localCellArea1);
      }
      else
      {
        int i5 = 0;
        boolean[] arrayOfBoolean = { i5 };
        CellArea localCellArea2 = zban.b(localCellArea1, paramInt1, paramInt2, arrayOfBoolean);
        i5 = arrayOfBoolean[0];
        if (i5 != 0)
        {
          this.b.remove(i4);
        }
        else
        {
          this.b.set(i4, localCellArea2);
          if (localCellArea2.StartRow < i2)
          {
            i2 = localCellArea2.StartRow;
            i3 = localCellArea2.StartColumn;
          }
        }
      }
    }
    if (this.b.size() == 0) {
      return;
    }
    byte[] arrayOfByte = this.c;
    if (arrayOfByte != null) {
      zaaq.b(paramWorksheet, true, paramInt1, paramInt2, i1, i3, 0, arrayOfByte.length - 1, arrayOfByte);
    }
    arrayOfByte = this.d;
    if (arrayOfByte != null) {
      zaaq.b(paramWorksheet, true, paramInt1, paramInt2, i1, i3, 0, arrayOfByte.length - 1, arrayOfByte);
    }
  }
  
  void b(int paramInt1, int paramInt2, Worksheet paramWorksheet)
  {
    if ((this.b == null) || (this.b.size() == 0)) {
      return;
    }
    int i1 = 0;
    int i2 = 0;
    int[] arrayOfInt = b();
    if (arrayOfInt != null)
    {
      i1 = arrayOfInt[0];
      i2 = arrayOfInt[1];
    }
    int i3 = 1048575;
    int i4 = 0;
    for (int i5 = this.b.size() - 1; i5 >= 0; i5--)
    {
      CellArea localCellArea = (CellArea)this.b.get(i5);
      int i6 = 0;
      if ((paramInt2 > 0) && (paramInt1 == localCellArea.EndRow + 1))
      {
        localCellArea.EndRow = (paramInt1 + paramInt2 - 1);
      }
      else
      {
        boolean[] arrayOfBoolean = { i6 };
        localCellArea = zban.a(localCellArea, paramInt1, paramInt2, arrayOfBoolean);
        i6 = arrayOfBoolean[0];
      }
      if (i6 != 0)
      {
        this.b.remove(i5);
      }
      else
      {
        this.b.set(i5, localCellArea);
        if (localCellArea.StartRow < i3)
        {
          i3 = localCellArea.StartRow;
          i4 = localCellArea.StartColumn;
        }
      }
    }
    if (this.b.size() == 0) {
      return;
    }
    byte[] arrayOfByte = this.c;
    if (arrayOfByte != null) {
      zaaq.a(paramWorksheet, true, paramInt1, paramInt2, i1, i3, 0, arrayOfByte.length - 1, arrayOfByte);
    }
    arrayOfByte = this.d;
    if (arrayOfByte != null) {
      zaaq.a(paramWorksheet, true, paramInt1, paramInt2, i1, i3, 0, arrayOfByte.length - 1, arrayOfByte);
    }
  }
  
  int c()
  {
    return this.r;
  }
  
  void a(int paramInt)
  {
    this.r = paramInt;
  }
  
  void a(Validation paramValidation)
  {
    this.h = paramValidation.h;
    this.l = paramValidation.l;
    this.m = paramValidation.m;
    this.p = paramValidation.p;
    this.r = paramValidation.r;
    this.q = paramValidation.q;
    this.j = paramValidation.j;
    this.k = paramValidation.k;
    this.f = paramValidation.f;
    this.g = paramValidation.g;
    this.o = paramValidation.o;
    this.n = paramValidation.n;
    this.i = paramValidation.i;
    this.b.clear();
    if (paramValidation.c != null)
    {
      this.c = new byte[paramValidation.c.length];
      System.arraycopy(paramValidation.c, 0, this.c, 0, this.c.length);
    }
    if (paramValidation.d != null)
    {
      this.d = new byte[paramValidation.d.length];
      System.arraycopy(paramValidation.d, 0, this.d, 0, this.d.length);
    }
  }
  
  void a(Validation paramValidation, CopyOptions paramCopyOptions)
  {
    this.h = paramValidation.h;
    this.l = paramValidation.l;
    this.m = paramValidation.m;
    this.p = paramValidation.p;
    this.r = paramValidation.r;
    this.q = paramValidation.q;
    this.j = paramValidation.j;
    this.k = paramValidation.k;
    this.f = paramValidation.f;
    this.g = paramValidation.g;
    this.o = paramValidation.o;
    this.n = paramValidation.n;
    this.i = paramValidation.i;
    this.b.clear();
    for (int i1 = 0; i1 < paramValidation.b.size(); i1++)
    {
      CellArea localCellArea = (CellArea)paramValidation.b.get(i1);
      zf.a(this.b, CellArea.d(localCellArea));
    }
    i1 = 0;
    int i2 = 0;
    int[] arrayOfInt = b();
    if (arrayOfInt != null)
    {
      i1 = arrayOfInt[0];
      i2 = arrayOfInt[1];
    }
    if (paramValidation.c != null) {
      this.c = zaam.a(paramValidation.c, 0, i1, i2, paramCopyOptions);
    }
    if (paramValidation.d != null) {
      this.d = zaam.a(paramValidation.d, 0, i1, i2, paramCopyOptions);
    }
  }
  
  void a(Validation paramValidation, CellArea paramCellArea, Worksheet paramWorksheet, CopyOptions paramCopyOptions)
  {
    this.h = paramValidation.h;
    this.l = paramValidation.l;
    this.m = paramValidation.m;
    this.p = paramValidation.p;
    this.r = paramValidation.r;
    this.q = paramValidation.q;
    this.j = paramValidation.j;
    this.k = paramValidation.k;
    this.f = paramValidation.f;
    this.g = paramValidation.g;
    this.o = paramValidation.o;
    this.n = paramValidation.n;
    this.i = paramValidation.i;
    this.b.clear();
    zf.a(this.b, paramCellArea);
    WorksheetCollection localWorksheetCollection1 = paramValidation.e.a().c();
    WorksheetCollection localWorksheetCollection2 = this.e.a().c();
    if (paramValidation.c != null) {
      this.c = zaam.a(paramValidation.c, 0, paramCellArea.StartRow, paramCellArea.StartColumn, paramCopyOptions);
    }
    if (paramValidation.d != null) {
      this.d = zaam.a(paramValidation.d, 0, paramCellArea.StartRow, paramCellArea.StartColumn, paramCopyOptions);
    }
  }
  
  boolean d()
  {
    WorksheetCollection localWorksheetCollection = this.e.a().c();
    byte[] arrayOfByte = this.c;
    if ((arrayOfByte != null) && (zaaq.a(localWorksheetCollection, arrayOfByte, 0, arrayOfByte.length - 1))) {
      return true;
    }
    if (((getOperator() == 0) || (getOperator() == 7)) && (this.d != null))
    {
      arrayOfByte = this.d;
      if ((arrayOfByte != null) && (zaaq.a(localWorksheetCollection, arrayOfByte, 0, arrayOfByte.length - 1))) {
        return true;
      }
    }
    return false;
  }
  
  void a(String paramString1, String paramString2)
  {
    Worksheet localWorksheet = this.e.a();
    this.c = zbyi.b(this, paramString1);
    if ((this.g == 0) || (this.g == 7)) {
      this.d = zbyi.b(this, paramString2);
    }
  }
  
  String e()
  {
    Worksheet localWorksheet = this.e.a();
    if ((this.c != null) && (zaar.a(localWorksheet.c(), this.c, 0)))
    {
      Object localObject = zaaq.a(localWorksheet.c(), this.c, 0);
      return (String)localObject;
    }
    return getFormula1();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Validation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */