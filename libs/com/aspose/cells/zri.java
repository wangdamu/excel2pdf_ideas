package com.aspose.cells;

import java.util.HashMap;

class zri
{
  String a = null;
  zawp b;
  String c = null;
  String d = null;
  zpg[] e;
  
  zri(zawp paramzawp)
  {
    this.b = paramzawp;
  }
  
  zbbs a(boolean paramBoolean)
  {
    boolean bool = this.b.e.a.p().h();
    int i;
    switch (this.b.f.c())
    {
    case 1: 
      this.e = new zpg[1];
      this.e[0] = new zpg((zboy)this.b.f);
      break;
    case 4: 
      localObject = (zno)this.b.f;
      this.e = new zpg[((zno)localObject).b.length];
      for (i = 0; i < this.e.length; i++) {
        this.e[i] = new zpg(localObject.b[i].b);
      }
      break;
    }
    Object localObject = null;
    if ((this.b.w != null) && (this.b.w.size() > 0))
    {
      if (localObject == null) {
        localObject = new zbbs();
      }
      ((zbbs)localObject).a(this.b.w);
    }
    if ((bool) && (this.e != null)) {
      for (i = 0; i < this.e.length; i++) {
        if ((this.e[i].g != null) && (!"".equals(this.e[i].g)))
        {
          if (localObject == null) {
            localObject = new zbbs();
          }
          zrl localzrl = ((zbbs)localObject).b("http://schemas.openxmlformats.org/officeDocument/2006/relationships/externalLinkPath", this.e[i].g, "External");
          this.e[i].b = localzrl.b;
        }
      }
    }
    return (zbbs)localObject;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zri.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */