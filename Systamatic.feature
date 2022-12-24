
@tag
Feature: Cart
  @tag1
  Scenario: Product should be successfully add to cart
    
    Given open the browser
    When click on gears and click on demoappskillrary
    When mouse hover on course and click on add to cart  
		When double click on pluse icon and click on addtocart
		Then product should be successfully added to cart  
  