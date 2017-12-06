package com.aspose.cells;

class zdr
  extends zche
{
  zdr(DBConnection paramDBConnection)
    throws Exception
  {
    this.d = 203;
    int i = 5;
    if (paramDBConnection.getConnectionInfo() != null) {
      i += 4 + paramDBConnection.getConnectionInfo().length() * 2;
    }
    int j = 0;
    if (paramDBConnection.getCommand() != null)
    {
      i += 4 + paramDBConnection.getCommand().length() * 2;
      j = (byte)(j | 0x2);
    }
    if (paramDBConnection.b != null)
    {
      i += 4 + paramDBConnection.b.length() * 2;
      j = (byte)(j | 0x1);
    }
    int k = 0;
    this.c = new byte[i];
    switch (paramDBConnection.getCommandType())
    {
    case 1: 
      this.c[k] = 1;
      break;
    case 0: 
      this.c[k] = 0;
      break;
    case 4: 
      this.c[k] = 4;
      break;
    case 2: 
      this.c[k] = 2;
      break;
    case 3: 
      this.c[k] = 3;
      break;
    case 5: 
      this.c[k] = 5;
      break;
    }
    k += 4;
    this.c[k] = j;
    k++;
    k = zcgj.a(this.c, k, paramDBConnection.getConnectionInfo());
    if (paramDBConnection.getCommand() != null) {
      k = zcgj.a(this.c, k, paramDBConnection.getCommand());
    }
    if (paramDBConnection.b != null) {
      k = zcgj.a(this.c, k, paramDBConnection.b);
    }
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/zdr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */