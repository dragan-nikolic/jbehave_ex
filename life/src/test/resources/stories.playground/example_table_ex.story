Meta:

Narrative:
As a user
I want to perform an action
So that I can achieve a business goal

Scenario: Pass the example table to step
Given an example table is defined
When the example table is saved to the context: testdata/MyAddress.table
Then the subsequent step can read the address from the context