package com.aspose.cells;

import java.util.Date;

public class LightCell
{
  Cell a;
  int b;
  short c;
  int d;
  Object e;
  String f;
  byte g = -1;
  
  void a(Cell paramCell)
  {
    if (this.a != paramCell)
    {
      this.a = paramCell;
      this.d = 6;
      this.e = null;
      this.f = null;
      this.g = -1;
    }
  }
  
  public int getRowIndex()
  {
    return this.b;
  }
  
  public short getColumnIndex()
  {
    if (this.a == null) {
      return this.c;
    }
    return (short)this.a.getColumn();
  }
  
  public int getValueType()
  {
    if ((this.d == 6) && (this.a != null)) {
      this.d = this.a.getType();
    }
    return this.d;
  }
  
  public Object getValue()
  {
    if ((this.e == null) && (this.a != null))
    {
      this.e = this.a.getValue();
      if ((this.e != null) && ((this.e instanceof DateTime))) {
        this.e = Long.valueOf(((DateTime)this.e).toDate().getTime());
      }
    }
    return this.e;
  }
  
  public String getFormula()
  {
    if ((this.f == null) && (this.a != null) && (this.a.isFormula()))
    {
      zaai localzaai = this.a.h();
      if ((localzaai.a() != null) || (localzaai.b() != null) || ((!localzaai.d()) && (!localzaai.b(this.a.getWorksheet().getCells())) && (!localzaai.a(this.a.getWorksheet().getCells())))) {
        this.f = this.a.getFormula();
      }
    }
    return this.f;
  }
  
  public String getFormulaRange()
  {
    if (this.a == null) {
      return null;
    }
    if (this.a.isFormula())
    {
      zaai localzaai = this.a.h();
      zbf localzbf = localzaai.a();
      if (localzbf != null)
      {
        localObject = localzbf.a();
        return CellsHelper.cellIndexToName(((CellArea)localObject).StartRow, ((CellArea)localObject).StartColumn) + ":" + CellsHelper.cellIndexToName(((CellArea)localObject).EndRow, ((CellArea)localObject).EndColumn);
      }
      Object localObject = localzaai.b();
      if (localObject != null)
      {
        CellArea localCellArea = ((zacb)localObject).a;
        return CellsHelper.cellIndexToName(localCellArea.StartRow, localCellArea.StartColumn) + ":" + CellsHelper.cellIndexToName(localCellArea.EndRow, localCellArea.EndColumn);
      }
    }
    return null;
  }
  
  public byte getFormulaType()
  {
    if ((this.g == -1) && (this.a != null) && (this.a.isFormula())) {
      if (this.a.isInArray()) {
        this.g = 1;
      } else if (this.a.A()) {
        this.g = 2;
      } else if (this.a.isInTable()) {
        this.g = 3;
      } else {
        this.g = 0;
      }
    }
    return this.g;
  }
  
  public LightCell copy()
  {
    LightCell localLightCell = new LightCell();
    localLightCell.b = this.b;
    localLightCell.c = ((short)this.a.getColumn());
    localLightCell.e = getValue();
    localLightCell.d = getValueType();
    localLightCell.f = getFormula();
    return localLightCell;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/LightCell.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */