package com.aspose.cells;

import com.aspose.cells.a.f.zj;
import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

class zatf
{
  private zasb a;
  private Workbook b;
  private zcjz c;
  
  zatf(zasb paramzasb)
  {
    this.a = paramzasb;
    this.b = paramzasb.a;
  }
  
  void a(ArrayList paramArrayList, zj paramzj)
    throws Exception
  {
    this.c = zatr.a("settings.xml", paramzj);
    zasr localzasr = new zasr("text/xml", "settings.xml");
    zf.a(paramArrayList, localzasr);
    this.c.c();
    this.c.b("office:document-settings");
    this.c.a("xmlns", "office", null, "urn:oasis:names:tc:opendocument:xmlns:office:1.0");
    this.c.a("xmlns", "xlink", null, "http://www.w3.org/1999/xlink");
    this.c.a("xmlns", "config", null, "urn:oasis:names:tc:opendocument:xmlns:config:1.0");
    this.c.a("xmlns", "ooo", null, "http://openoffice.org/2004/office");
    this.c.a("office", "version", null, this.a.m);
    this.c.b("office:settings");
    a();
    this.c.b();
    this.c.b();
    this.c.d();
    this.c.e();
  }
  
  void a()
    throws Exception
  {
    this.c.b("config:config-item-set");
    this.c.a("config", "name", null, "ooo:view-settings");
    b();
    this.c.b();
  }
  
  void b()
    throws Exception
  {
    this.c.b("config:config-item-map-indexed");
    this.c.a("config", "name", null, "Views");
    c();
    this.c.b();
  }
  
  void c()
    throws Exception
  {
    this.c.b("config:config-item-map-entry");
    a("ViewId", "string", "View1");
    d();
    Worksheet localWorksheet = this.b.getWorksheets().get(this.b.getWorksheets().getActiveSheetIndex());
    a("ActiveTable", "string", localWorksheet.getName());
    a("ShowPageBreakPreview", "boolean", localWorksheet.isPageBreakPreview() ? "true" : "false");
    a("ShowZeroValues", "boolean", localWorksheet.getDisplayZeros() ? "true" : "false");
    a("HasColumnRowHeaders", "boolean", localWorksheet.isRowColumnHeadersVisible() ? "true" : "false");
    a("ShowGrid", "boolean", localWorksheet.isGridlinesVisible() ? "true" : "false");
    if (localWorksheet.A().isEmpty()) {
      a("GridColor", "long", "12632256");
    } else {
      a("GridColor", "long", zasp.a(localWorksheet.A().toArgb() & 0xFFFFFF));
    }
    a("HasSheetTabs", "boolean", this.b.getSettings().getShowTabs() ? "true" : "false");
    a("HorizontalScrollbarWidth", "int", zasp.a(this.b.getSettings().getSheetTabBarWidth()));
    if (localWorksheet.isPageBreakPreview())
    {
      a("ShowPageBreaks", "boolean", "true");
      a("ZoomValue", "int", zasp.a(localWorksheet.getZoom()));
      a("PageViewZoomValue", "int", zasp.a(localWorksheet.getZoom()));
    }
    if (!localWorksheet.isOutlineShown()) {
      a("IsOutlineSymbolsSet", "boolean", "false");
    }
    this.c.b();
  }
  
  void d()
    throws Exception
  {
    this.c.b("config:config-item-map-named");
    this.c.a("config", "name", null, "Tables");
    Iterator localIterator = this.b.getWorksheets().iterator();
    while (localIterator.hasNext())
    {
      Worksheet localWorksheet = (Worksheet)localIterator.next();
      a(localWorksheet);
    }
    this.c.b();
  }
  
  void a(Worksheet paramWorksheet)
    throws Exception
  {
    this.c.b("config:config-item-map-entry");
    this.c.a("config", "name", null, paramWorksheet.getName());
    String str = paramWorksheet.getActiveCell();
    int j;
    if (!"A1".equals(str))
    {
      int i = 0;
      j = 0;
      int[] arrayOfInt1 = { i };
      int[] arrayOfInt2 = { j };
      CellsHelper.a(str, arrayOfInt1, arrayOfInt2);
      i = arrayOfInt1[0];
      j = arrayOfInt2[0];
      a("CursorPositionX", "int", zasp.a(j));
      a("CursorPositionY", "int", zasp.a(i));
    }
    PaneCollection localPaneCollection = paramWorksheet.getPanes();
    if (localPaneCollection != null)
    {
      j = 1;
      if (paramWorksheet.i()) {
        j = 2;
      }
      if (localPaneCollection.d() == 0)
      {
        a("HorizontalSplitMode", "short", zasp.a(j));
        a("VerticalSplitMode", "short", "0");
        if (paramWorksheet.i()) {
          a("HorizontalSplitPosition", "int", zasp.a(localPaneCollection.c()));
        } else {
          a("HorizontalSplitPosition", "int", zasp.a((int)(localPaneCollection.e() * 4 / 60.0F + 0.5D)));
        }
        a("VerticalSplitPosition", "int", "0");
        switch (localPaneCollection.a())
        {
        case 1: 
          a("ActiveSplitRange", "short", "3");
          break;
        case 3: 
          a("ActiveSplitRange", "short", "2");
        }
      }
      else if (localPaneCollection.e() == 0)
      {
        a("HorizontalSplitMode", "short", "0");
        a("VerticalSplitMode", "short", zasp.a(j));
        a("HorizontalSplitPosition", "int", "0");
        if (paramWorksheet.i()) {
          a("VerticalSplitPosition", "int", zasp.a(localPaneCollection.b()));
        } else {
          a("VerticalSplitPosition", "int", zasp.a((int)(localPaneCollection.d() * 4 / 60.0F + 0.5D)));
        }
        switch (localPaneCollection.a())
        {
        case 2: 
          a("ActiveSplitRange", "short", "2");
          break;
        case 3: 
          a("ActiveSplitRange", "short", "0");
        }
      }
      else
      {
        a("HorizontalSplitMode", "short", zasp.a(j));
        a("VerticalSplitMode", "short", zasp.a(j));
        if (paramWorksheet.i())
        {
          a("HorizontalSplitPosition", "int", zasp.a(localPaneCollection.c()));
          a("VerticalSplitPosition", "int", zasp.a(localPaneCollection.b()));
        }
        else
        {
          a("HorizontalSplitPosition", "int", zasp.a((int)(localPaneCollection.e() * 4 / 60.0F + 0.5D)));
          a("VerticalSplitPosition", "int", zasp.a((int)(localPaneCollection.d() * 4 / 60.0F + 0.5D)));
        }
        switch (localPaneCollection.a())
        {
        case 0: 
          a("ActiveSplitRange", "short", "3");
          break;
        case 1: 
          a("ActiveSplitRange", "short", "1");
          break;
        case 2: 
          a("ActiveSplitRange", "short", "2");
          break;
        case 3: 
          a("ActiveSplitRange", "short", "0");
        }
      }
      a("PositionLeft", "int", zasp.a(paramWorksheet.getFirstVisibleColumn()));
      a("PositionTop", "int", zasp.a(paramWorksheet.getFirstVisibleRow()));
      if (paramWorksheet.i())
      {
        a("PositionRight", "int", zasp.a(paramWorksheet.getFirstVisibleColumn() + localPaneCollection.e()));
        a("PositionBottom", "int", zasp.a(paramWorksheet.getFirstVisibleRow() + localPaneCollection.d()));
      }
      else
      {
        a("PositionRight", "int", zasp.a(localPaneCollection.c()));
        a("PositionBottom", "int", zasp.a(localPaneCollection.b()));
      }
    }
    else
    {
      a("PositionLeft", "int", zasp.a(paramWorksheet.getFirstVisibleColumn()));
      a("PositionTop", "int", "0");
      a("PositionRight", "int", "0");
      a("PositionBottom", "int", zasp.a(paramWorksheet.getFirstVisibleRow()));
    }
    a("ZoomType", "short", "0");
    a("ZoomValue", "int", zasp.a(paramWorksheet.getZoom()));
    a("PageViewZoomValue", "int", zasp.a(paramWorksheet.getZoom()));
    a("PageViewZoomValue", "boolean", paramWorksheet.isGridlinesVisible() ? "1" : "0");
    this.c.b();
  }
  
  void a(String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    this.c.b("config:config-item");
    this.c.a("config", "name", null, paramString1);
    this.c.a("config", "type", null, paramString2);
    this.c.a(paramString3);
    this.c.b();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zatf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */