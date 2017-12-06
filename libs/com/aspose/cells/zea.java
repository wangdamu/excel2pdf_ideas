package com.aspose.cells;

import com.aspose.cells.b.a.zc;

class zea
  extends zche
{
  zea(XmlColumnProperty paramXmlColumnProperty)
    throws Exception
  {
    this.d = 349;
    int i = 16 + paramXmlColumnProperty.b().length() * 2;
    this.c = new byte[i];
    int j = 0;
    System.arraycopy(zc.a(paramXmlColumnProperty.a()), 0, this.c, j, 4);
    j += 4;
    if (paramXmlColumnProperty.a) {
      this.c[j] = 2;
    }
    j += 4;
    this.c[j] = ((byte)ztr.b(paramXmlColumnProperty.c()));
    j += 4;
    zcgj.a(this.c, j, paramXmlColumnProperty.b());
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */