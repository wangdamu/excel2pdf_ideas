package com.aspose.cells;

import com.aspose.cells.b.a.b.zo;
import java.util.ArrayList;

public class PdfBookmarkEntry
{
  private String c;
  private Cell d;
  private String e;
  private ArrayList f;
  int a = -1;
  zo b = new zo();
  private boolean g = false;
  
  public String getText()
  {
    return this.c;
  }
  
  public void setText(String value)
  {
    this.c = value;
  }
  
  public Cell getDestination()
  {
    return this.d;
  }
  
  public void setDestination(Cell value)
  {
    this.d = value;
  }
  
  public String getDestinationName()
  {
    return this.e;
  }
  
  public void setDestinationName(String value)
  {
    this.e = value;
  }
  
  public ArrayList getSubEntry()
  {
    return this.f;
  }
  
  public void setSubEntry(ArrayList value)
  {
    this.f = value;
  }
  
  void a(int paramInt, zo paramzo)
  {
    this.a = paramInt;
    this.b = paramzo;
  }
  
  boolean a()
  {
    return this.a != -1;
  }
  
  public boolean isOpen()
  {
    return this.g;
  }
  
  public void setOpen(boolean value)
  {
    this.g = value;
  }
  
  public boolean isCollapse()
  {
    return !this.g;
  }
  
  public void setCollapse(boolean value)
  {
    this.g = (!value);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PdfBookmarkEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */