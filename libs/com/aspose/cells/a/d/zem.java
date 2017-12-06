package com.aspose.cells.a.d;

import com.aspose.cells.b.a.d.zm;
import java.util.zip.DeflaterOutputStream;

class zem
  extends zel
{
  private DeflaterOutputStream b = new DeflaterOutputStream(this.a.j());
  
  zem(zm paramzm)
    throws Exception
  {
    super(paramzm);
  }
  
  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws Exception
  {
    this.b.write(paramArrayOfByte, paramInt1, paramInt2);
    this.b.finish();
  }
  
  public void a()
    throws Exception
  {
    this.b.close();
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/a/d/zem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */