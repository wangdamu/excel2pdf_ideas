package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import com.aspose.cells.b.a.zc;
import java.util.ArrayList;

class zcfd
{
  private zchd a;
  private Workbook b;
  private zqh c;
  private zcbw d;
  private int e;
  private byte[] f;
  private int g;
  private ArrayList h;
  private zqi i;
  private Worksheet j;
  
  zcfd(zchd paramzchd)
  {
    this.a = paramzchd;
    this.b = paramzchd.a;
    this.c = paramzchd.b;
    this.h = new ArrayList();
  }
  
  void a(zqi paramzqi, zcbw paramzcbw)
    throws Exception
  {
    this.d = paramzcbw;
    this.i = paramzqi;
    this.j = paramzqi.d;
    Comment localComment = null;
    for (;;)
    {
      this.e = this.d.a();
      switch (this.e)
      {
      case 629: 
        this.d.a(1L);
        return;
      case 635: 
        this.f = this.a.a(this.d);
        int k = zc.a(this.f, 0);
        CellArea localCellArea = zcgj.a(this.f, 4);
        int m = this.j.getComments().add(localCellArea.StartRow, localCellArea.StartColumn);
        localComment = this.j.getComments().get(m);
        if ((k < this.h.size()) && (k >= 0)) {
          localComment.setAuthor((String)this.h.get(k));
        }
        break;
      case 637: 
        this.f = this.a.a(this.d);
        zcgj.a(this.b.getWorksheets(), this.c.c(), localComment.b(), this.f, 0);
        break;
      case 632: 
        this.f = this.a.a(this.d);
        String str = zcgj.d(this.f, 0);
        zf.a(this.h, str);
        break;
      case 630: 
      case 631: 
      case 633: 
      case 634: 
      case 636: 
      default: 
        this.g = this.d.b();
        this.d.a(this.g);
      }
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zcfd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */