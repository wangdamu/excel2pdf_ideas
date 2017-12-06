package com.aspose.cells;

public class InterruptMonitor
{
  volatile boolean a;
  
  public void interrupt()
  {
    this.a = true;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/InterruptMonitor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */