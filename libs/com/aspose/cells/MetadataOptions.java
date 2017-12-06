package com.aspose.cells;

public class MetadataOptions
{
  private int a;
  private String b;
  private int c = 128;
  
  private MetadataOptions() {}
  
  public MetadataOptions(int metadataType)
  {
    this.a = metadataType;
  }
  
  public int getMetadataType()
  {
    return this.a;
  }
  
  public String getPassword()
  {
    return this.b;
  }
  
  public void setPassword(String value)
  {
    this.b = value;
  }
  
  public int getKeyLength()
  {
    return this.c;
  }
  
  public void setKeyLength(int value)
  {
    this.c = value;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/MetadataOptions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */