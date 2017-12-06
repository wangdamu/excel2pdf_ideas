package com.aspose.cells;

import com.aspose.cells.b.a.b.zj;
import com.aspose.cells.b.a.d.zh;

public class DrawObject
{
  private Cell a;
  private zj b;
  private byte[] c;
  private int d;
  private int e;
  private int f;
  private int g;
  
  public Cell getCell()
  {
    return this.a;
  }
  
  public byte[] getImageBytes()
  {
    return this.c;
  }
  
  public int getType()
  {
    return this.d;
  }
  
  public int getCurrentPage()
  {
    return this.e;
  }
  
  public int getTotalPages()
  {
    return this.f;
  }
  
  public int getSheetIndex()
  {
    return this.g;
  }
  
  DrawObject(Cell cell, int currentIndex, int totalPages, int sheetIndex)
  {
    this.d = 1;
    this.a = cell;
    this.e = currentIndex;
    this.f = totalPages;
    this.g = sheetIndex;
  }
  
  DrawObject(byte[] imageBytes, int currentIndex, int totalPages, int sheetIndex)
    throws Exception
  {
    this.d = 0;
    this.c = imageBytes;
    this.b = zj.a(new zh(imageBytes));
    this.e = currentIndex;
    this.f = totalPages;
    this.g = sheetIndex;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DrawObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */