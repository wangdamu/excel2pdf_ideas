package com.aspose.cells;

import com.aspose.cells.b.a.a.zf;
import java.util.ArrayList;
import java.util.Iterator;

public class DigitalSignatureCollection
  implements Iterable
{
  ArrayList a = new ArrayList();
  
  public void add(DigitalSignature digitalSignature)
  {
    zf.a(this.a, digitalSignature);
  }
  
  public Iterator iterator()
  {
    return new zsm(this.a);
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/DigitalSignatureCollection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */