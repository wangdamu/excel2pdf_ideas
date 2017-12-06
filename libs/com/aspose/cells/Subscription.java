package com.aspose.cells;

import java.util.ArrayList;
import java.util.List;

class Subscription
{
  private List<SubscriptionItem> subscription_items = new ArrayList();
  private Long pricing_plan_id;
  private Long product_id;
  private Long id;
  private Product product;
  private String status;
  
  public List<SubscriptionItem> getSubscription_items()
  {
    return this.subscription_items;
  }
  
  public void setSubscription_items(List<SubscriptionItem> subscription_items)
  {
    this.subscription_items = subscription_items;
  }
  
  public Long getPricing_plan_id()
  {
    return this.pricing_plan_id;
  }
  
  public void setPricing_plan_id(Long pricing_plan_id)
  {
    this.pricing_plan_id = pricing_plan_id;
  }
  
  public Long getProduct_id()
  {
    return this.product_id;
  }
  
  public void setProduct_id(Long product_id)
  {
    this.product_id = product_id;
  }
  
  public Long getId()
  {
    return this.id;
  }
  
  public void setId(Long id)
  {
    this.id = id;
  }
  
  public Product getProduct()
  {
    return this.product;
  }
  
  public void setProduct(Product product)
  {
    this.product = product;
  }
  
  public String getStatus()
  {
    return this.status;
  }
  
  public void setStatus(String status)
  {
    this.status = status;
  }
}


/* Location:              /media/peter/Data/gitworkspace/github/jxls_demo/libs/aspose-cells-17.10.jar!/com/aspose/cells/Subscription.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */