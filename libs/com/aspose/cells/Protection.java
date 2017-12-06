package com.aspose.cells;

public class Protection
{
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private boolean i;
  private boolean j;
  private boolean k;
  private boolean l;
  private boolean m = true;
  private boolean n = true;
  private boolean o = true;
  private boolean p = true;
  private boolean q = true;
  private String r;
  ztm a;
  
  ztm a()
  {
    if (this.a == null) {
      this.a = new ztm();
    }
    return this.a;
  }
  
  public void copy(Protection source)
  {
    this.b = source.b;
    this.c = source.c;
    this.m = source.m;
    this.n = source.n;
    this.o = source.o;
    this.d = source.d;
    this.e = source.e;
    this.f = source.f;
    this.g = source.g;
    this.h = source.h;
    this.i = source.i;
    this.j = source.j;
    this.k = source.k;
    this.l = source.l;
    this.r = source.r;
    if (source.a != null)
    {
      this.a = new ztm();
      this.a.a(source.a);
    }
    else
    {
      this.a = null;
    }
    this.q = source.q;
    this.p = source.p;
  }
  
  void a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length < 23) {
      return;
    }
    int i1 = paramArrayOfByte[20] & 0xFF & 0x40;
    if (i1 == 0) {
      this.p = false;
    } else {
      this.p = true;
    }
    i1 = paramArrayOfByte[20] & 0xFF & 0x4;
    if (i1 == 0)
    {
      this.q = false;
    }
    else
    {
      this.q = true;
      this.p = true;
    }
    i1 = paramArrayOfByte[19] & 0xFF & 0x4;
    if (i1 == 0) {
      this.e = false;
    } else {
      this.e = true;
    }
    i1 = paramArrayOfByte[19] & 0xFF & 0x8;
    if (i1 == 0) {
      this.f = false;
    } else {
      this.f = true;
    }
    i1 = paramArrayOfByte[19] & 0xFF & 0x10;
    if (i1 == 0) {
      this.g = false;
    } else {
      this.g = true;
    }
    i1 = paramArrayOfByte[19] & 0xFF & 0x20;
    if (i1 == 0) {
      this.h = false;
    } else {
      this.h = true;
    }
    i1 = paramArrayOfByte[19] & 0xFF & 0x40;
    if (i1 == 0) {
      this.j = false;
    } else {
      this.j = true;
    }
    i1 = paramArrayOfByte[19] & 0xFF & 0x80;
    if (i1 == 0) {
      this.i = false;
    } else {
      this.i = true;
    }
    i1 = paramArrayOfByte[20] & 0xFF & 0x1;
    if (i1 == 0) {
      this.b = false;
    } else {
      this.b = true;
    }
    i1 = paramArrayOfByte[20] & 0xFF & 0x2;
    if (i1 == 0) {
      this.c = false;
    } else {
      this.c = true;
    }
    i1 = paramArrayOfByte[20] & 0xFF & 0x8;
    if (i1 == 0) {
      this.k = false;
    } else {
      this.k = true;
    }
    i1 = paramArrayOfByte[20] & 0xFF & 0x10;
    if (i1 == 0) {
      this.d = false;
    } else {
      this.d = true;
    }
    this.l = ((paramArrayOfByte[20] & 0xFF & 0x20) != 0);
  }
  
  public boolean getAllowDeletingColumn()
  {
    return this.b;
  }
  
  public void setAllowDeletingColumn(boolean value)
  {
    this.b = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isDeletingColumnsAllowed()
  {
    return this.b;
  }
  
  /**
   * @deprecated
   */
  public void setDeletingColumnsAllowed(boolean value)
  {
    this.b = value;
  }
  
  public boolean getAllowDeletingRow()
  {
    return this.c;
  }
  
  public void setAllowDeletingRow(boolean value)
  {
    this.c = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isDeletingRowsAllowed()
  {
    return this.c;
  }
  
  /**
   * @deprecated
   */
  public void setDeletingRowsAllowed(boolean value)
  {
    this.c = value;
  }
  
  public boolean getAllowFiltering()
  {
    return this.d;
  }
  
  public void setAllowFiltering(boolean value)
  {
    this.d = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isFilteringAllowed()
  {
    return this.d;
  }
  
  /**
   * @deprecated
   */
  public void setFilteringAllowed(boolean value)
  {
    this.d = value;
  }
  
  public boolean getAllowFormattingCell()
  {
    return this.e;
  }
  
  public void setAllowFormattingCell(boolean value)
  {
    this.e = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isFormattingCellsAllowed()
  {
    return this.e;
  }
  
  /**
   * @deprecated
   */
  public void setFormattingCellsAllowed(boolean value)
  {
    this.e = value;
  }
  
  public boolean getAllowFormattingColumn()
  {
    return this.f;
  }
  
  public void setAllowFormattingColumn(boolean value)
  {
    this.f = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isFormattingColumnsAllowed()
  {
    return this.f;
  }
  
  /**
   * @deprecated
   */
  public void setFormattingColumnsAllowed(boolean value)
  {
    this.f = value;
  }
  
  public boolean getAllowFormattingRow()
  {
    return this.g;
  }
  
  public void setAllowFormattingRow(boolean value)
  {
    this.g = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isFormattingRowsAllowed()
  {
    return this.g;
  }
  
  /**
   * @deprecated
   */
  public void setFormattingRowsAllowed(boolean value)
  {
    this.g = value;
  }
  
  public boolean getAllowInsertingColumn()
  {
    return this.h;
  }
  
  public void setAllowInsertingColumn(boolean value)
  {
    this.h = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isInsertingColumnsAllowed()
  {
    return this.h;
  }
  
  /**
   * @deprecated
   */
  public void setInsertingColumnsAllowed(boolean value)
  {
    this.h = value;
  }
  
  public boolean getAllowInsertingHyperlink()
  {
    return this.i;
  }
  
  public void setAllowInsertingHyperlink(boolean value)
  {
    this.i = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isInsertingHyperlinksAllowed()
  {
    return this.i;
  }
  
  /**
   * @deprecated
   */
  public void setInsertingHyperlinksAllowed(boolean value)
  {
    this.i = value;
  }
  
  public boolean getAllowInsertingRow()
  {
    return this.j;
  }
  
  public void setAllowInsertingRow(boolean value)
  {
    this.j = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isInsertingRowsAllowed()
  {
    return this.j;
  }
  
  /**
   * @deprecated
   */
  public void setInsertingRowsAllowed(boolean value)
  {
    this.j = value;
  }
  
  public boolean getAllowSorting()
  {
    return this.k;
  }
  
  public void setAllowSorting(boolean value)
  {
    this.k = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isSortingAllowed()
  {
    return this.k;
  }
  
  /**
   * @deprecated
   */
  public void setSortingAllowed(boolean value)
  {
    this.k = value;
  }
  
  public boolean getAllowUsingPivotTable()
  {
    return this.l;
  }
  
  public void setAllowUsingPivotTable(boolean value)
  {
    this.l = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isUsingPivotTablesAllowed()
  {
    return this.l;
  }
  
  /**
   * @deprecated
   */
  public void setUsingPivotTablesAllowed(boolean value)
  {
    this.l = value;
  }
  
  public boolean getAllowEditingContent()
  {
    return this.m;
  }
  
  public void setAllowEditingContent(boolean value)
  {
    this.m = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isEditingContentsAllowed()
  {
    return this.m;
  }
  
  /**
   * @deprecated
   */
  public void setEditingContentsAllowed(boolean value)
  {
    this.m = value;
  }
  
  public boolean getAllowEditingObject()
  {
    return this.n;
  }
  
  public void setAllowEditingObject(boolean value)
  {
    this.n = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isEditingObjectsAllowed()
  {
    return this.n;
  }
  
  /**
   * @deprecated
   */
  public void setEditingObjectsAllowed(boolean value)
  {
    this.n = value;
  }
  
  public boolean getAllowEditingScenario()
  {
    return this.o;
  }
  
  public void setAllowEditingScenario(boolean value)
  {
    this.o = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isEditingScenariosAllowed()
  {
    return this.o;
  }
  
  /**
   * @deprecated
   */
  public void setEditingScenariosAllowed(boolean value)
  {
    this.o = value;
  }
  
  public String getPassword()
  {
    return this.r;
  }
  
  public void setPassword(String value)
  {
    this.r = value;
    a(zui.a(value));
  }
  
  int b()
  {
    if (this.a == null) {
      return 0;
    }
    return this.a.b();
  }
  
  void a(int paramInt)
  {
    if (this.a == null) {
      this.a = new ztm();
    }
    this.a.a(paramInt);
  }
  
  public int getPasswordHash()
  {
    if (this.a != null) {
      return this.a.b();
    }
    return 0;
  }
  
  public boolean isProtectedWithPassword()
  {
    if (this.a != null) {
      return (this.a.a != null) || (this.a.b != null);
    }
    return false;
  }
  
  public boolean verifyPassword(String password)
  {
    if (this.a != null) {
      return this.a.a(password);
    }
    return (password == null) || ("".equals(password));
  }
  
  public boolean getAllowSelectingLockedCell()
  {
    return this.q;
  }
  
  public void setAllowSelectingLockedCell(boolean value)
  {
    this.q = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isSelectingLockedCellsAllowed()
  {
    return this.q;
  }
  
  /**
   * @deprecated
   */
  public void setSelectingLockedCellsAllowed(boolean value)
  {
    this.q = value;
  }
  
  public boolean getAllowSelectingUnlockedCell()
  {
    return this.p;
  }
  
  public void setAllowSelectingUnlockedCell(boolean value)
  {
    this.p = value;
  }
  
  /**
   * @deprecated
   */
  public boolean isSelectingUnlockedCellsAllowed()
  {
    return this.p;
  }
  
  /**
   * @deprecated
   */
  public void setSelectingUnlockedCellsAllowed(boolean value)
  {
    this.p = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Protection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */