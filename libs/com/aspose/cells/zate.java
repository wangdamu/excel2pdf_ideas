package com.aspose.cells;

import com.aspose.cells.a.f.zi;
import com.aspose.cells.b.a.zp;
import com.aspose.cells.b.c.a.za;

class zate
{
  private zasg a;
  private Workbook b;
  private zcjy c;
  private static final za d = new za(new String[] { "config-item-set", "name", "view-settings", "config-item", "config-item-map-indexed", "config-item-map-named", "config-item-map-entry", "type", "HorizontalSplitMode", "VerticalSplitMode", "CursorPositionX", "CursorPositionY", "ActiveSplitRange", "HorizontalSplitPosition", "VerticalSplitPosition", "PositionLeft", "PositionRight", "PositionTop", "PositionBottom", "ZoomType", "ZoomValue", "PageViewZoomValue", "ShowGrid", "ShowZeroValues", "AutoCalculate", "VisibleAreaTop", "VisibleAreaLeft", "VisibleAreaWidth", "VisibleAreaHeight", "ActiveTable", "VerticalScrollbarWidth", "HorizontalScrollbarWidth", "GridColor", "HasSheetTabs", "HasColumnRowHeaders", "IsOutlineSymbolsSet" });
  
  zate(zasg paramzasg)
  {
    this.a = paramzasg;
    this.b = this.a.b;
  }
  
  void a(zi paramzi)
    throws Exception
  {
    zug.a(this.b);
    if (paramzi.a("settings.xml", true) == -1) {
      return;
    }
    this.c = zauy.a(paramzi, "settings.xml", false);
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    for (int i = 0; i < 3; i++)
    {
      this.c.d();
      if (!zauz.a(this.c)) {
        return;
      }
    }
    switch (d.a(this.c.q().toLowerCase()))
    {
    case 0: 
      String str = null;
      if (this.c.n())
      {
        while (this.c.m()) {
          switch (d.a(this.c.q()))
          {
          case 1: 
            str = this.c.t();
          }
        }
        this.c.l();
      }
      if (str == null)
      {
        this.c.a();
      }
      else
      {
        if (str.startsWith("ooo:")) {
          str = str.substring(4);
        }
        switch (d.a(str))
        {
        case 2: 
          a();
          break;
        default: 
          this.c.a();
        }
      }
      break;
    default: 
      this.c.a();
    }
  }
  
  private void a()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (d.a(this.c.q()))
      {
      case 3: 
        e();
        break;
      case 4: 
        b();
        break;
      default: 
        this.c.a();
      }
    }
  }
  
  private void b()
    throws Exception
  {
    boolean bool = false;
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (d.a(this.c.q()))
        {
        case 1: 
          bool = "Views".equals(this.c.t());
        }
      }
      this.c.l();
    }
    if ((!bool) || (this.c.o()))
    {
      this.c.a();
      return;
    }
    this.c.d();
    if (!zauz.a(this.c)) {
      return;
    }
    if (!"config-item-map-entry".equals(this.c.q()))
    {
      this.c.a();
      this.c.h();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (d.a(this.c.q()))
      {
      case 3: 
        e();
        break;
      case 5: 
        c();
        break;
      default: 
        this.c.a();
      }
    }
  }
  
  private void c()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    this.c.d();
    while (zauz.a(this.c)) {
      switch (d.a(this.c.q()))
      {
      case 6: 
        d();
        break;
      default: 
        this.c.a();
      }
    }
  }
  
  private void d()
    throws Exception
  {
    Worksheet localWorksheet = null;
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (d.a(this.c.q().toLowerCase()))
        {
        case 1: 
          localWorksheet = this.b.getWorksheets().get(this.c.t());
        }
      }
      this.c.l();
    }
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    String str1 = null;
    String str2 = null;
    String str3 = null;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    int i1 = 0;
    int i2 = 2;
    int i3 = 0;
    int i4 = 100;
    int i5 = 60;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = -1;
    this.c.d();
    while (zauz.a(this.c))
    {
      if (this.c.o())
      {
        this.c.a();
        return;
      }
      switch (d.a(this.c.q()))
      {
      case 3: 
        if (this.c.n())
        {
          while (this.c.m()) {
            switch (d.a(this.c.q().toLowerCase()))
            {
            case 1: 
              str1 = this.c.t();
              break;
            case 7: 
              str3 = this.c.t();
            }
          }
          this.c.l();
        }
        str2 = this.c.j();
        switch (d.a(str1))
        {
        case 8: 
          m = zp.a(str2);
          break;
        case 9: 
          k = zp.a(str2);
          break;
        case 10: 
          i = zp.a(str2);
          break;
        case 11: 
          j = zp.a(str2);
          break;
        case 12: 
          i2 = zp.a(str2);
          break;
        case 13: 
          i1 = zp.a(str2);
          break;
        case 14: 
          n = zp.a(str2);
          break;
        case 15: 
          i6 = zp.a(str2);
          break;
        case 16: 
          i7 = zp.a(str2);
          break;
        case 17: 
          i7 = zp.a(str2);
          break;
        case 18: 
          i9 = zp.a(str2);
          break;
        case 19: 
          i3 = zp.a(str2);
          break;
        case 20: 
          i4 = zp.a(str2);
          break;
        case 21: 
          i5 = i4;
          break;
        case 22: 
          i10 = "true".equals(str2) ? 1 : 0;
        }
        break;
      default: 
        this.c.a();
      }
    }
    if (i10 != -1) {
      localWorksheet.setGridlinesVisible(i10 == 1);
    }
    if (i3 != 0)
    {
      localWorksheet.setPageBreakPreview(true);
      localWorksheet.setZoom(i5);
    }
    else
    {
      localWorksheet.setZoom(i4);
    }
    if ((k == 0) && (m == 0))
    {
      localWorksheet.setActiveCell(CellsHelper.cellIndexToName(j, i));
      localWorksheet.setFirstVisibleRow(i9);
      localWorksheet.setFirstVisibleColumn(i6);
    }
    else
    {
      int i11 = (m == 1) || (k == 1) ? 1 : 0;
      localWorksheet.a(i11 == 0);
      PaneCollection localPaneCollection = localWorksheet.b();
      int i12;
      if (m == 0)
      {
        if (i11 != 0)
        {
          localPaneCollection.a(n * 15, 0, i9, 0);
        }
        else
        {
          i12 = n - i6;
          localPaneCollection.b(n, 0, i12, 0);
        }
        localPaneCollection.f();
        switch (i2)
        {
        case 3: 
          localPaneCollection.a((byte)1);
          break;
        case 2: 
          localPaneCollection.a((byte)3);
        }
      }
      else if (k == 0)
      {
        if (i11 != 0)
        {
          localPaneCollection.a(0, i1 * 15, 0, i7);
        }
        else
        {
          i12 = i1 - i8 + 1;
          localPaneCollection.b(0, i1, 0, i12);
        }
        localPaneCollection.f();
        switch (i2)
        {
        case 2: 
          localPaneCollection.a((byte)2);
          break;
        case 0: 
          localPaneCollection.a((byte)3);
        }
      }
      else
      {
        if (i11 != 0)
        {
          localPaneCollection.a(n * 15, i1 * 15, i9, i7);
        }
        else
        {
          i12 = n - i6;
          int i13 = i1 - i8;
          localPaneCollection.b(n, i1, i12, i13);
        }
        localPaneCollection.f();
        switch (i2)
        {
        case 3: 
          localPaneCollection.a((byte)0);
          break;
        case 1: 
          localPaneCollection.a((byte)1);
          break;
        case 2: 
          localPaneCollection.a((byte)2);
          break;
        case 0: 
          localPaneCollection.a((byte)3);
        }
      }
      localWorksheet.t().a(CellsHelper.cellIndexToName(j, i));
    }
  }
  
  private void e()
    throws Exception
  {
    if (this.c.o())
    {
      this.c.a();
      return;
    }
    String str1 = null;
    String str2 = null;
    if (this.c.n())
    {
      while (this.c.m()) {
        switch (d.a(this.c.q().toLowerCase()))
        {
        case 1: 
          str1 = this.c.t();
          break;
        case 7: 
          str2 = this.c.t();
        }
      }
      this.c.l();
    }
    String str3 = this.c.j();
    int j;
    int k;
    switch (d.a(str1))
    {
    case 23: 
      boolean bool1 = "true".equals(str3);
      if (!bool1) {
        for (int i = 0; i < this.b.getWorksheets().getCount(); i++) {
          this.b.getWorksheets().get(i).setDisplayZeros(false);
        }
      }
      break;
    case 24: 
      this.b.getSettings().setCalcMode("true".equals(str3) ? 0 : 2);
      break;
    case 25: 
      break;
    case 26: 
      break;
    case 27: 
      break;
    case 28: 
      break;
    case 29: 
      Worksheet localWorksheet = this.b.getWorksheets().get(str3);
      if (localWorksheet != null) {
        this.b.getWorksheets().setActiveSheetIndex(localWorksheet.getIndex());
      }
      break;
    case 30: 
      if ("0".equals(str3)) {
        this.b.getSettings().setVScrollBarVisible(false);
      }
      break;
    case 31: 
      if ("0".equals(str3))
      {
        this.b.getSettings().setHScrollBarVisible(false);
      }
      else
      {
        j = zp.a(str3);
        j = j > 1000 ? 1000 : j;
        this.b.getSettings().setSheetTabBarWidth(j);
      }
      break;
    case 32: 
      j = zp.a(str3);
      if (j != 0)
      {
        Color localColor = Color.fromArgb(j);
        for (k = 0; k < this.b.getWorksheets().getCount(); k++) {
          this.b.getWorksheets().get(k).a(localColor);
        }
      }
      break;
    case 33: 
      if (!"true".equals(str3)) {
        this.b.getSettings().setShowTabs(false);
      }
      break;
    case 34: 
      boolean bool2 = "true".equals(str3);
      if (!bool2) {
        for (k = 0; k < this.b.getWorksheets().getCount(); k++) {
          this.b.getWorksheets().get(k).setRowColumnHeadersVisible(false);
        }
      }
      break;
    case 35: 
      boolean bool3 = "true".equals(str3);
      if (!bool3) {
        for (int m = 0; m < this.b.getWorksheets().getCount(); m++) {
          this.b.getWorksheets().get(m).setOutlineShown(false);
        }
      }
      break;
    case 22: 
      boolean bool4 = "true".equals(str3);
      if (!bool4) {
        for (int n = 0; n < this.b.getWorksheets().getCount(); n++) {
          this.b.getWorksheets().get(n).setGridlinesVisible(false);
        }
      }
      break;
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */