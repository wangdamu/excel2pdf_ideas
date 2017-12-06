package com.aspose.cells;

import com.aspose.cells.b.a.zw;
import java.util.ArrayList;
import java.util.HashMap;

class zpi
{
  Shape a;
  boolean b;
  zps c;
  int d;
  String e;
  String f;
  String g;
  Chart h = null;
  zpu i = null;
  zpt j = null;
  zph k = null;
  boolean l = false;
  
  zpi(zph paramzph, Shape paramShape, boolean paramBoolean)
  {
    this.k = paramzph;
    this.j = paramzph.a();
    this.a = paramShape;
    if (paramzph.g != null)
    {
      this.h = paramzph.g;
      if (paramShape.getPlacement() == 1) {
        this.d = 4;
      } else {
        this.d = 2;
      }
    }
    else
    {
      this.i = paramzph.f;
      int m = paramzph.f.a.getType();
      if (m == 1)
      {
        this.d = 0;
        if ((paramShape.h != null) && ("oneCellAnchor".equals(paramShape.h.g))) {
          this.d = 3;
        }
      }
      else if (m == 2)
      {
        this.d = 1;
      }
    }
    if (paramShape.getMsoDrawingType() == 8)
    {
      Picture localPicture = (Picture)paramShape;
      if (localPicture.d()) {
        this.f = ((String)paramzph.d.get(localPicture.getSourceFullName()));
      }
      int i1 = ((Picture)paramShape).b();
      if ((i1 >= 1) && (paramShape.z == null) && (paramzph.d != null)) {
        this.e = ((String)paramzph.d.get(Integer.valueOf(i1)));
      }
    }
    else if (paramShape.getMsoDrawingType() == 5)
    {
      for (int n = 0; n < paramzph.e.size(); n++)
      {
        zpe localzpe = (zpe)paramzph.e.get(n);
        if (localzpe.a.getChartObject() == paramShape) {
          this.e = localzpe.c;
        }
      }
    }
    this.g = a(paramShape.getHyperlink());
    if (paramBoolean)
    {
      this.c = new zps(paramShape, true);
      this.b = true;
    }
    else if (paramShape.h != null)
    {
      this.b = paramShape.h.n;
    }
  }
  
  String[] a()
  {
    String[] arrayOfString = new String[2];
    if (!zw.b(this.a.o))
    {
      arrayOfString[0] = "application/vnd.ms-office.DrsE2oDoc+xml";
      arrayOfString[1] = "http://schemas.microsoft.com/office/2006/relationships/graphicFrameDoc";
      return arrayOfString;
    }
    if ((this.a.getMsoDrawingType() == 8) || (this.a.getMsoDrawingType() == 24))
    {
      arrayOfString[0] = "application/vnd.ms-office.DrsPicture+xml";
      arrayOfString[1] = "http://schemas.microsoft.com/office/2006/relationships/pictureXml";
      return arrayOfString;
    }
    if (this.a.as())
    {
      arrayOfString[0] = "application/vnd.ms-office.DrsConnector+xml";
      arrayOfString[1] = "http://schemas.microsoft.com/office/2006/relationships/connectorXml";
      return arrayOfString;
    }
    arrayOfString[0] = "application/vnd.ms-office.DrsShape+xml";
    arrayOfString[1] = "http://schemas.microsoft.com/office/2006/relationships/shapeXml";
    return arrayOfString;
  }
  
  private String a(Hyperlink paramHyperlink)
  {
    if (paramHyperlink == null) {
      return null;
    }
    String str1 = null;
    int m = paramHyperlink.a(this.j.a.getWorksheets());
    if ((m == 0) || (m == 1))
    {
      String str2 = zw.a(paramHyperlink.getAddress(), " ", "%20");
      if ((m == 1) && (str2.indexOf(":") != -1)) {
        str2 = "file:///" + str2;
      }
      str1 = this.k.a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", str2, "External");
    }
    else
    {
      str1 = this.k.a("http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", "#" + paramHyperlink.getAddress(), null);
    }
    return str1;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zpi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */