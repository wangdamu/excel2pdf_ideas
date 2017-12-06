package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;

public class ErrorCheckOption
{
  ArrayList a = new ArrayList();
  int b;
  
  public boolean isErrorCheck(int errorCheckType)
  {
    return (this.b & errorCheckType) == 0;
  }
  
  public void setErrorCheck(int errorCheckType, boolean isCheck)
  {
    if (isCheck) {
      this.b &= (errorCheckType ^ 0xFFFFFFFF);
    } else {
      this.b |= errorCheckType;
    }
  }
  
  public int getCountOfRange()
  {
    return this.a.size();
  }
  
  public int addRange(CellArea ca)
  {
    zf.a(this.a, ca);
    return this.a.size() - 1;
  }
  
  public CellArea getRange(int index)
  {
    if ((index < 0) || (index >= this.a.size())) {
      throw new CellsException(6, "Invalid range index");
    }
    return (CellArea)this.a.get(index);
  }
  
  public void removeRange(int index)
  {
    if ((index < 0) || (index >= this.a.size())) {
      throw new CellsException(6, "Invalid range index");
    }
    this.a.remove(index);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/ErrorCheckOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */