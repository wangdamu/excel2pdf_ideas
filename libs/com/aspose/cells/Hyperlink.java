package com.aspose.cells;

import com.aspose.cells.b.a.g.a.zc;
import com.aspose.cells.b.a.g.a.ze;
import com.aspose.cells.b.a.zw;

public class Hyperlink
{
  private HyperlinkCollection d;
  private boolean e;
  private boolean f;
  String a;
  String b;
  CellArea c;
  private String g;
  
  Hyperlink(HyperlinkCollection parent, CellArea area)
  {
    this.d = parent;
    this.c = area;
  }
  
  Hyperlink() {}
  
  void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public String getAddress()
  {
    return this.a;
  }
  
  public void setAddress(String value)
  {
    this.a = value;
  }
  
  public String getTextToDisplay()
  {
    Worksheet localWorksheet = this.d == null ? null : this.d.a();
    if (localWorksheet != null)
    {
      Cells localCells = localWorksheet.getCells();
      Cell localCell = localCells.a(this.c.StartRow, this.c.StartColumn, true);
      if ((localCell != null) && (localCell.c.c == 4)) {
        this.b = localCell.getStringValue();
      }
    }
    return this.b;
  }
  
  public void setTextToDisplay(String value)
  {
    this.b = value;
    Worksheet localWorksheet = this.d == null ? null : this.d.a();
    if (localWorksheet != null)
    {
      Cells localCells = localWorksheet.getCells();
      Cell localCell = localCells.a(this.c.StartRow, this.c.StartColumn, false);
      if ((localCell.c.c == 0) || (localCell.c.c == 4)) {
        localCell.putValue(value);
      }
      Font localFont = localWorksheet.c().T();
      Style localStyle = localCell.o();
      localStyle.setName("Hyperlink");
      localStyle.getFont().a(localFont.getName(), true, localFont.n());
      localStyle.getFont().setSize(localFont.getSize());
      localStyle.getFont().setBold(false);
      localStyle.getFont().setItalic(false);
      localStyle.getFont().setColor(Color.getBlue());
      localStyle.getFont().setUnderline(1);
      localCell.a(localStyle);
    }
  }
  
  void a(String paramString)
  {
    Worksheet localWorksheet = this.d == null ? null : this.d.a();
    if (localWorksheet != null)
    {
      Cells localCells = localWorksheet.getCells();
      Cell localCell = localCells.a(this.c.StartRow, this.c.StartColumn, false);
      switch (localCell.c.c)
      {
      case 0: 
        localCell.putValue(paramString);
        this.b = paramString;
        break;
      case 4: 
        this.b = ((zbbj)localCell.c.d).c;
      }
      Font localFont = localWorksheet.c().T();
      Style localStyle = localCell.o();
      localStyle.setName("Hyperlink");
      localStyle.getFont().a(localFont.getName(), true, localFont.n());
      localStyle.getFont().setSize(localFont.getSize());
      localStyle.getFont().setBold(false);
      localStyle.getFont().setItalic(false);
      localStyle.getFont().setColor(Color.getBlue());
      localStyle.getFont().setUnderline(1);
      localCell.a(localStyle);
    }
  }
  
  void b(String paramString)
  {
    this.b = paramString;
  }
  
  public CellArea getArea()
  {
    return this.c;
  }
  
  void a(CellArea paramCellArea)
  {
    this.c = paramCellArea;
  }
  
  public String getScreenTip()
  {
    return this.g;
  }
  
  public void setScreenTip(String value)
  {
    this.g = value;
  }
  
  void a(Hyperlink paramHyperlink, CopyOptions paramCopyOptions)
  {
    this.c = CellArea.d(paramHyperlink.c);
    this.a = paramHyperlink.a;
    this.g = paramHyperlink.g;
    this.b = paramHyperlink.b;
  }
  
  void b(Hyperlink paramHyperlink, CopyOptions paramCopyOptions)
  {
    this.a = paramHyperlink.a;
    this.g = paramHyperlink.g;
    this.b = paramHyperlink.b;
    if ((paramCopyOptions != null) && (!paramCopyOptions.a()) && (!paramCopyOptions.b()) && (paramCopyOptions.e == 2))
    {
      Name localName = paramHyperlink.d.a().c().getNames().get(paramHyperlink.a);
      if ((localName != null) && (this.d.a().c().getNames().get(paramHyperlink.a) == null)) {
        this.d.a().c().getNames().add(paramHyperlink.a);
      }
    }
  }
  
  boolean a(Hyperlink paramHyperlink)
  {
    return (zw.b(this.a, paramHyperlink.a)) && (zw.b(this.g, paramHyperlink.g)) && (zw.b(this.b, paramHyperlink.b));
  }
  
  int a(WorksheetCollection paramWorksheetCollection)
  {
    if ((this.a == null) || ("".equals(this.a))) {
      return -1;
    }
    String str1 = this.a.toLowerCase();
    if ((str1.startsWith("http:")) || (str1.startsWith("www.")) || (str1.startsWith("https:")) || (str1.startsWith("mailto:"))) {
      return 0;
    }
    if (((str1.length() > 1) && (str1.charAt(1) == ':')) || (str1.startsWith("\\\\"))) {
      return 1;
    }
    zc localzc = ze.a(str1, "^\\w+:", 66);
    if (localzc.c()) {
      return 0;
    }
    if (this.a.indexOf("!") != -1)
    {
      String[] arrayOfString = zw.d(this.a, '!');
      if (arrayOfString.length == 2)
      {
        String str2 = arrayOfString[0];
        if ((str2.indexOf('\\') == -1) && (str2.indexOf('/') == -1) && (str2.indexOf("file:///") == -1)) {
          return 2;
        }
        str2 = zw.c(str2, '\'');
        if (paramWorksheetCollection.get(str2) != null) {
          return 2;
        }
      }
    }
    else
    {
      this.a = zw.c(this.a, '\'');
      if (paramWorksheetCollection.getNames().a(this.a, -1, true) != -1) {
        return 2;
      }
    }
    return 1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Hyperlink.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */