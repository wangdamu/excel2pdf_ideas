package com.aspose.cells;

import java.util.ArrayList;
import java.util.List;

class PricingPlan
{
  private List<ProductItem> product_items = new ArrayList();
  private String name;
  private Long id;
  
  public List<ProductItem> getProduct_items()
  {
    return this.product_items;
  }
  
  public void setProduct_items(List<ProductItem> product_items)
  {
    this.product_items = product_items;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/PricingPlan.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */