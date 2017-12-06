package com.aspose.cells;

import java.util.ArrayList;
import java.util.List;

class Product
{
  private List<PricingPlan> pricing_plans = new ArrayList();
  private String name;
  private Long id;
  
  public List<PricingPlan> getPricing_plans()
  {
    return this.pricing_plans;
  }
  
  public void setPricing_plans(List<PricingPlan> pricing_plans)
  {
    this.pricing_plans = pricing_plans;
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


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Product.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */